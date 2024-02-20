public class Main {

    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void main(String[] args) {
        System.out.println("Generando contraseña ...");

        /*
        //Hacer un programa que genere 8 caracteres entre el ASCII 48 y 122
        StringBuffer sb = new StringBuffer();
        char ejemplo;
        for(int i = 0; i < 8; i++) {
            ejemplo = (char) generarNumero(48, 122);
            sb.append(ejemplo);
        }

        System.out.println(sb.toString());
        */

        Coche micoche = new Coche("Mercedes", "GLA", "Gris");
        Coche tucoche = new Coche("Audi", "A5", "Rojo");

        System.out.println(tucoche.marca);
        System.out.println(micoche.marca);

        tucoche.pintar("azul");

        System.out.println(tucoche.marca + " " + tucoche.color);
        System.out.println(micoche.marca + " " + micoche.color);






    }
}