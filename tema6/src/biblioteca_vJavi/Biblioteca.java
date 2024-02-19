package biblioteca_vJavi;

import java.util.ArrayList;

public class Biblioteca {

	protected ArrayList<Usuario> usuarios;
	protected ArrayList<Documento> documentos;
	
	Biblioteca() {
		this.usuarios = new ArrayList<>();
		this.documentos = new ArrayList<>();
	}
	
	public void prestaDocumento(Documento doc, String dniUsuario) {
		//Comprobar que existe usuario con ese dni
		int index = usuarios.indexOf(new Usuario(dniUsuario,""));
		if ( index >= 0) {
			Usuario user = usuarios.get(index);
			//Comprobar que el usuario no está en su límite de prestados
			if (user.alcanzadoLimitePrestamos()) {
				System.out.println("No se le pueden prestar más libros");
			} else {
				//Comprobar que el documento no esté ya prestado
				if (doc.estaPrestado()) {
					System.out.println("Ese libro no se puede prestar, ya está prestado");
				} else {
					doc.prestaAUsuario(user);
					user.addDocumento(doc);
				}
			}
		} else {
			System.out.println("Ese usuario no está registrado en el sistema");
		}
	}
	
	
	public void devuelveDocumento(Documento doc) {
		//Si no está prestado se indica
		if (! doc.estaPrestado()) {
			System.out.println("Ese libro no está prestado, no se puede devolver");
		} else {
			//Quitar el libro del usuario
			doc.getPrestadoA().delDocumento(doc);
			doc.devuelve();
		}
		
	}
	
	public Documento buscaDocumento(String codigo) {
		for(Documento doc : documentos) {
			if (doc.getIsbn().equals(codigo))
				return doc;
		}
		
		return null;
	}
	
	public ArrayList<Documento> buscaDocumentos(String texto) {
		ArrayList<Documento> docs=new ArrayList<>();
		for(Documento doc:documentos) {
			if(doc.getTitulo().contains(texto)) {
				docs.add(doc);
			}
		}
		return docs;	
	}

	public ArrayList<Documento> buscaDocumentos(Autor autor) {
		ArrayList<Documento> docs=new ArrayList<>();
		for(Documento doc:documentos) {
			if(doc.getAutores().contains(autor)) {
				docs.add(doc);
			}
		}
		return docs;
	}
	
	public void muestraInformePrestamos() {
		for(Documento doc : documentos) {
			System.out.println(doc);
		}
	}
	
	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}
	
	public void addDocumento(Documento d) {
		documentos.add(d);
	}
	
	
	
	
}
