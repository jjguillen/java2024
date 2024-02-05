package tienda;

public class PruebaMayuscula {

    public static void main(String[] args) {
        int contNumeros=0;
        int contMayusculas=0;

        String password = "HoLA123abc";

        for(int i=0; i<password.length(); i++) {
            int letra = password.charAt(i);
            //System.out.println(letra);

            if (letra >= 48 && letra <= 57) {
                contNumeros++;
            }
            if (letra >= 65 && letra <= 90) {
                contMayusculas++;
            }
        }

        System.out.println(contNumeros);
        System.out.println(contMayusculas);
    }
}
