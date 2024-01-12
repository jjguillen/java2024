package ejerciciosintroPOO;

public class TestPersona {

    public static void main(String[] args) {

        Persona per1 = new Persona();
        Persona per2 = new Persona("Manuel", "López Díaz", 20,
                1.90, "Mojácar", "manolo@gmail.com");

        //No ponemos delante ningún objeto, sino el nombre de la clase
        //Pintará el valor 2, pues se han creado dos objetos persona
        System.out.println( Persona.numPersonas );

        //Así no se accede, pero para que veáis que da el mismo valor
        System.out.println( per1.numPersonas );
        System.out.println( per2.numPersonas );





    }

}
