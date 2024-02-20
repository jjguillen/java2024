package aplicacion;

import entidades.*;
import servicios.Biblioteca;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //BIBLIOTECA
        Biblioteca miBiblioteca = new Biblioteca();

        //AUTORES
        Autor a1 = new Autor("J.R.R", "Tolkien", -1, " Bloemfontein", null, null);
        Autor a2 = new Autor("Juan", "Gómez Jurado", 45, "Madrid", "Sucasa", "jgj@gmail.com");
        Autor a3 = new Autor("Arturo", "Pérez Reverte", 68, "Cartagena", "Sucasa", null);
        Autor a4 = new Autor("Autor4", "Apellidos4", 33, null, null, null);

        //LIBROS
        Libro l1 = new Libro(1l, "0-2345-5678", "El señor de los anillos", 1000, 1955);
        l1.addAutor(a1);
        Libro l2 = new Libro(2l, "0-2345-5679", "Reina Roja", 500, 2016);
        l2.addAutor(a2);
        Libro l3 = new Libro(3l, "0-2345-5680", "El club Dumas", 600, 2000);
        l3.addAutor(a3);
        l3.addAutor(a4);

        miBiblioteca.addDocumento(l1);
        miBiblioteca.addDocumento(l2);
        miBiblioteca.addDocumento(l3);

        //REVISTAS
        for(int i=0; i<3; i++) {
            Revista r = new Revista(10l+i, "0-2345-5680"+"-"+i, "Mi revista de coches", 300, i, "Titulo"+i);
            r.addAutor(a4);
            miBiblioteca.addDocumento(r);
        }

        //USUARIOS
        Usuario u1 = new Usuario("47478541A", "Manolo", 5, 30);
        Usuario u2 = new Usuario("45568541L", "Laura", 2, 15);
        miBiblioteca.addUsuario(u1);
        miBiblioteca.addUsuario(u2);

        System.out.println(miBiblioteca);

        /*
        System.out.println( miBiblioteca.prestaDocumento(l1, "47478541A") );
        System.out.println( miBiblioteca.prestaDocumento(l2, "45568541L") );
        System.out.println( miBiblioteca.prestaDocumento(l3, "45568541L") );
        System.out.println( miBiblioteca.prestaDocumento(miBiblioteca.buscarDocumento("Mi revista de coches"), "45568541L") );
        System.out.println( miBiblioteca.devuelveDocumento(l2, "45568541L"));
        System.out.println(u2.getDocumentosEnPrestamo());
        */

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        while (opcion != 4) {
            System.out.println("1.Prestar");
            System.out.println("2.Devolver");
            System.out.println("3.Buscar");
            System.out.println("4.Salir");

            String titulo = "";
            String dni = "";
            Documento doc = null;
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    //Prestar
                    System.out.println("Dime título de libro");
                    titulo = sc.nextLine();
                    System.out.println("Dime dni de usuario");
                    dni = sc.nextLine();
                    doc = miBiblioteca.buscarDocumento(titulo);
                    if (doc != null) {
                        if (miBiblioteca.prestaDocumento(doc, dni)) {
                            System.out.println("Prestado");
                        } else {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Documento no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Dime título de libro");
                    titulo = sc.nextLine();
                    System.out.println("Dime dni de usuario");
                    dni = sc.nextLine();
                    doc = miBiblioteca.buscarDocumento(titulo);
                    if (doc != null) {
                        if (miBiblioteca.devuelveDocumento(doc, dni)) {
                            System.out.println("Devuelto");
                        } else {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Documento no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Dime texto del título de libro");
                    String texto = sc.nextLine();
                    List<Documento> docs = miBiblioteca.buscarDocumentos(texto);
                    System.out.println(docs);
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }




    }
}
