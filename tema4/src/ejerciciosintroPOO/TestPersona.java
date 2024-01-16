package ejerciciosintroPOO;

public class TestPersona {

    public static void main(String[] args) {

        Persona per1 = new Persona();
        Persona per2 = new Persona("Manuel", "López Díaz", 20,
                1.90, "Mojácar", "manolo@gmail.com");

        System.out.println(per1);
        System.out.println(per2);


    }

}
