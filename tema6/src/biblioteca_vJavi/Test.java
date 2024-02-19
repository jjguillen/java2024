package biblioteca_vJavi;

public class Test {

	
	public static void main(String[] args) {
		Biblioteca bb = new Biblioteca();
		for(int i=0; i<10; i++) {
			bb.addUsuario(new Usuario(String.valueOf(i),"Javier"+i));
		}

		Autor a1 = new Autor("Arturo", "Pérez Reverte", 65,
				"Cartagena", "Sucasa", "reverte@gmail.com");
		Autor a2 = new Autor("Juan", "Gómez Jurado", 44,
				"Madrid", "Sucasa", "agjurado@gmail.com");



		for(int i=0; i<10; i++) {
			Libro l = new Libro("Titulo "+String.valueOf(i),"0-4675-34" + String.valueOf(i), 500,2022);
			if (i % 2 == 0) {
				l.addAutor(a1);
			} else {
				l.addAutor(a2);
			}
			bb.addDocumento(l);
		}
		
		bb.prestaDocumento(bb.documentos.get(3), bb.usuarios.get(5).getDni());
		bb.prestaDocumento(bb.documentos.get(3), bb.usuarios.get(6).getDni());
		bb.prestaDocumento(bb.documentos.get(4), bb.usuarios.get(8).getDni());
		
		System.out.println("Informe");
		bb.muestraInformePrestamos();

		//Buscar documentos por autor, sobrecargado
		System.out.println("Libros de Gómez Jurado:");
		bb.buscaDocumentos(
			new Autor("Juan", "Gómez Jurado", 0, null, null, null)
		).stream().forEach( a -> System.out.println("  - " + a.getTitulo()));

		
	}
}
