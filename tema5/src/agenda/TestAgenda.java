package agenda;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {
        String nombre;
        Agenda miAgenda = new Agenda();
        miAgenda.addContacto(new ContactoPersona("Jose Manuel", "66554433", "Pepe"));
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Listar contactos");
            System.out.println("2. Añadir contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    miAgenda.listarContactos();
                    break;
                case 2:
                    System.out.println("1. Empresa o 2. Persona");
                    int tipo = Integer.parseInt(sc.nextLine());
                    if (tipo==1) {
                        System.out.println("Nombre:");
                        nombre = sc.nextLine();
                        System.out.println("Teléfono:");
                        String telefono = sc.nextLine();
                        System.out.println("Cif:");
                        String cif = sc.nextLine();
                        System.out.println("Email:");
                        String email = sc.nextLine();
                        //Creo el objeto ContactoEmpresa con los datos introducidos
                        ContactoEmpresa ce = new ContactoEmpresa(nombre,telefono,cif,email);
                        //Añadirlo a la agenda
                        miAgenda.addContacto(ce);
                    } else {
                        System.out.println("Nombre:");
                        nombre = sc.nextLine();
                        System.out.println("Teléfono:");
                        String telefono = sc.nextLine();
                        System.out.println("Apodo:");
                        String apodo = sc.nextLine();
                        //Creo el objeto ContactoPersona
                        ContactoPersona cp = new ContactoPersona(nombre,telefono,apodo);
                        //Añadirlo a la agenda
                        miAgenda.addContacto(cp);
                    }
                    break;
                case 3:
                    //Como el equals es por nombre, solo hace falta pedir un nombre
                    System.out.println("Escribe el nombre del contacto a borrar");
                    nombre = sc.nextLine();
                    Contacto conctEliminar = new Contacto(nombre, null);
                    //Elimina el objeto con el mismo nombre
                    miAgenda.eliminarContacto(conctEliminar);
                    break;
                case 4:
                    System.out.println("Escribe el nombre del contacto a buscar");
                    nombre = sc.nextLine();
                    Contacto contBuscar = new Contacto(nombre, null);
                    System.out.println(miAgenda.buscarContacto(contBuscar));
                    break;
                case 5:
                    System.out.println("Gracias por usar mi agenda");
                    break;
                default:
                    System.out.println("Opción incorrecta");

            }

        }




    }

}
