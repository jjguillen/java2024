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

    public void addDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public void delDocumento(Documento documento) {
        this.documentos.remove(documento);
    }

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void delUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    /**
     * Busca un usuario por dni en la colección de usuarios de la biblioteca
     * @param dni
     * @return
     */
    private Usuario buscarUsuario(String dni) {
        for(Usuario usuario: this.usuarios) {
            if (usuario.getDni().equals(dni)) {
                return usuario;
            }
        }
        return null;
    }

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

    public Documento buscarDocumento(String titulo) {
        for(Documento doc: this.documentos) {
            if (doc.getTitulo().equals(titulo)) {
                return doc;
            }
        }
        return null;
    }

    public List<Documento> buscarDocumentos(String texto) {
        ArrayList<Documento> docsEncontrados = new ArrayList<>();
        for(Documento doc: this.documentos) {
            if (doc.getTitulo().contains(texto)) {
                docsEncontrados.add(doc);
            }
        }
        return docsEncontrados;
    }

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
