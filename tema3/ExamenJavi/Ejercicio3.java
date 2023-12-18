package tema3.ExamenJavi;

public class Ejercicio3 {
    
    public static int buscar(String caracter, String dicc[]) {

        for(int i=0; i<dicc.length; i++) {
            if (dicc[i].equals( caracter ) )
                return i;
        }

        return -1;
    }

    public static String traducirAMorse(String cadena, String spanish[], String morse[]) {
        StringBuffer sb = new StringBuffer();
        cadena = cadena.toLowerCase();

        //Recorrer la cadena
        Character caracter;
        int posicion=0;
        for(int i=0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            
            //Buscar ese caracter en qué posición está en el array spanish
            posicion = buscar(caracter.toString(), spanish);

            if (posicion != -1) {
                //Añadir al resultado el caracter en el array morse en la misma posición que el buscado antes
                sb.append(morse[posicion]);
                sb.append(" ");
            }
        }


        return sb.toString();
    }

    public static String traducirDeMorse(String cadena, String spanish[], String morse[]) {

        StringBuffer sb = new StringBuffer();

        //Separar las palabras con #
        String palabras[] = cadena.split("#");
        /*
        for(int i=0; i<palabras.length; i++)
            System.out.println(palabras[i]);
        */

        int posicion = -1;
        for(String palabra: palabras) {  //forEach para separar las palabras
            
            //Separar las letras con " "
            String letras[] = palabra.split(" ");
            for(String letra: letras) { //forEach para separar las letras

                //Buscamos el caracter morse en el array morse
                posicion = buscar(letra, morse);

                if (posicion != -1) {
                    //Añadir al resultado el caracter en el array spanish en la misma posición que el buscado antes
                    sb.append(spanish[posicion]);
                 }

            }
            //Tras cada palabra añado un espacio
            sb.append(" ");

        }


        return sb.toString();
    }

    public static String traducirDeMorse2(String cadena, String spanish[], String morse[]) {

        StringBuffer sb = new StringBuffer();

        //Separar las palabras con #
        
        int inicio = 0;
        int fin = cadena.length();
        String palabra;
        while (fin != -1) {
            fin  = cadena.indexOf("#", inicio);

            //System.out.println(inicio + " - " + fin);
            if (fin != -1)
                palabra = cadena.substring(inicio, fin);
            else
                palabra = cadena.substring(inicio, cadena.length());

            inicio = fin + 1;

            //System.out.println(palabra);

            int iniLetra=0;
            int finLetra = palabra.length();
            String letra;
            while (finLetra != -1) {
                finLetra = palabra.indexOf(" ", iniLetra);
                if (finLetra != -1) {
                    letra = palabra.substring(iniLetra, finLetra);
                } else {
                    letra = palabra.substring(iniLetra, palabra.length());
                }

                iniLetra = finLetra + 1;
                //Buscamos el caracter morse en el array morse
                int posicion = buscar(letra, morse);

                if (posicion != -1) {
                    //Añadir al resultado el caracter en el array spanish en la misma posición que el buscado antes
                    sb.append(spanish[posicion]);
                 }
            }

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

        String original = traducirDeMorse2(resultado, spanish, morse);
        System.out.println(original);


    }
}
