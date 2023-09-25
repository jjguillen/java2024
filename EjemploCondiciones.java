public class EjemploCondiciones {
    public static void main(String[] args) {
        
        boolean mayorEdad = false;
        boolean jubilado = false;

        int edad = 66;

        mayorEdad = (edad >= 18);  

        System.out.println(mayorEdad);

        jubilado = (edad == 67);

        System.out.println(jubilado);

        ///////////////////////////////////////////

        String asignatura = "Programacion";

        boolean aprobada = false;

        aprobada = (asignatura != "Programación");

        System.out.println(aprobada);




    }
}
