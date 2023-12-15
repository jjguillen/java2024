package tema3.Examen;

public class Ejercicio3 {
    
    public static int buscar(char caracter, String spanish[]) {

        for(int i=0; i<spanish.length; i++) {
            if (spanish[i].equals( Character.toString(caracter)) )
                return i;
        }

        return -1;
    }

    public static String traducirAMorse(String cadena, String spanish[], String morse[]) {
        StringBuffer sb = new StringBuffer();
        cadena = cadena.toLowerCase();

        //Recorrer la cadena
        char caracter;
        int posicion=0;
        for(int i=0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            
            posicion = buscar(caracter, spanish);

            sb.append(morse[posicion]);
            sb.append(" ");
        }


        return sb.toString();
    }



    public static void main(String[] args) {
        
        String spanish[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "#" };

        String cadena = "estoy con Morse";

        String resultado = traducirAMorse(cadena, spanish, morse);
        System.out.println(resultado);


    }
}
