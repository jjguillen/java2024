package clasesutiles;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String cadena = "192.168.1.2";
        StringTokenizer strk = new StringTokenizer(cadena, "[.]");
        while(strk.hasMoreTokens()) {
            System.out.println(strk.nextToken());
        }

        System.out.println(cadena);
        String[] digitos = cadena.split("[.]");
        for(int i=0; i<digitos.length; i++) {
            System.out.println(digitos[i]);
        }
    }
}
