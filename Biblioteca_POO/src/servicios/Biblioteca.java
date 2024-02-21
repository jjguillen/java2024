package servicios;

import entidades.Autor;
import entidades.Documento;
import entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private ArrayList<Documento> documentos;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.documentos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Añade documento a la lista de documentos de la biblioteca
     * @param documento
     */
    public void addDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    /**
     * Elimina documento de la lista de documentos de la biblioteca
     * @param documento
     */
    public void delDocumento(Documento documento) {
        this.documentos.remove(documento);
    }

    /**
     * Añade usuario a la lista de usuario de la biblioteca
     * @param usuario
     */
    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    /**
     * Elimina usuario de la lista de usuario de la biblioteca
     * @param usuario
     */
    public void delUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    /**
     * Busca un usuario por dni en la colección de usuarios de la biblioteca
     * @param dni
     * @return Usuario o null (no encontrado)
     */
    private Usuario buscarUsuario(String dni) {
        for(Usuario usuario: this.usuarios) {
            if (usuario.getDni().equals(dni)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Si el dni es un dni de un usuario registrado, ese usuario no ha superado su límite de prestados, el
     * libro no está prestado previamente, pues hacemos que el documento esté prestado a ese usuario
     * @param documento
     * @param dni
     * @return true o false si se ha podido prestar o no el documento
     */
    public boolean prestaDocumento(Documento documento, String dni) {
        Usuario usuario = buscarUsuario(dni);
        //No encontrado
        if (usuario == null) {
            return false;
        } else {
            // 2. El usuario no ha superado su límite de documentos en préstamo
            if (usuario.alcanzadoLimitePrestamos()) {
                return false;
            } else {
                // 3. El libro no está prestado previamente
                if (documento.estaPrestado()) {
                    return false;
                } else {
                    // 4. Si lo anterior no pasa, le prestamos el documento a ese usuario
                    documento.prestaAUsuario(usuario);
                    usuario.addDocumento(documento); //También que añadir el documento a los prestados del usuario
                    return true;
                }
            }
        }

    }

    /**
     * Hace que el documento deje de estar prestado al usuario indicado, siempre que
     * el usuario con ese dni exista en la biblioteca, el documento esté en la biblioteca,
     * el documento esté prestado, y el documento esté prestado a ese usuario
     * @param documento
     * @param dni
     * @return true si se ha podido devolver, false en cualquier otro caso
     */
    public boolean devuelveDocumento(Documento documento, String dni) {
        //Comprobar que el usuario con ese dni existe en mi registro
        Usuario usuario = buscarUsuario(dni);
        //No encontrado
        if (usuario == null) {
            return false;
        } else {
            //Comprobar que está en la colección de documento
            int posicion = documentos.indexOf(documento);
            if (posicion < 0) {
                return false;
            } else {
                //Comprobar que está prestado
                if (!documento.estaPrestado()) {
                    return false;
                } else {
                    //Comprobar que el documento está prestado a ese usuario
                    if (!documento.getPrestadoA().equals(usuario)) {
                        return false;
                    } else {
                        //Devolver el documento
                        documento.devuelve(usuario);
                        usuario.delDocumento(documento);
                        return true;
                    }
                }
            }
        }
    }

    /**
     * Busca un documento en la biblioteca con ese título y lo devuelve
     * @param titulo
     * @return Documento si lo encuentra, null en otro caso
     */
    public Documento buscarDocumento(String titulo) {
        for(Documento doc: this.documentos) {
            if (doc.getTitulo().equals(titulo)) {
                return doc;
            }
        }
        return null;
    }

    /**
     * Busca el texto en el título de los documentos de la biblioteca y devuelve una lista con todos
     * los documentos que tengan ese texto en su título
     * @param texto
     * @return Colección de Documento, vacía si no hay ninguno
     */
    public List<Documento> buscarDocumentos(String texto) {
        ArrayList<Documento> docsEncontrados = new ArrayList<>();
        for(Documento doc: this.documentos) {
            if (doc.getTitulo().contains(texto)) {
                docsEncontrados.add(doc);
            }
        }
        return docsEncontrados;
    }

    /**
     * Buscar en todos los documentos de la bibilioteca todos aquellos en los que aparezca
     * el autor como uno de los autores del documento
     * @param autor
     * @return Lista de documentos de ese autor, o vacía si no hay ninguno
     */
    public List<Documento> buscarDocumentos(Autor autor) {
        //Recorrerme todos los documentos de la biblioteca
        //Para cada documento buscar si el autor está en su lista de autores
        //Si está, añado el documento a la lista de encontrados
        ArrayList<Documento> docsEncontrados = new ArrayList<>();
        for(Documento doc: this.documentos) {
            if (doc.getAutores().contains(autor)) {
                docsEncontrados.add(doc);
            }
        }
        return docsEncontrados;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{\n");
        sb.append("documentos=\n");
        for(Documento doc: this.documentos) {
            sb.append(" - ");
            sb.append(doc.getTitulo());
            sb.append("\n");
        }
        sb.append("usuarios=\n");
        for(Usuario user: this.usuarios) {
            sb.append(" - ");
            sb.append(user.getNombre());
            sb.append("\n");
        }

        sb.append('}');
        return sb.toString();
    }
}
