package Lingo;

import java.util.ArrayList;

/**
 * Clase para implementar un juego, en el que tienes que adivinar una palabra de 5 letras.
 * Generamos una aleatoria de un diccionario de palabras
 * Le pedimos al usuario que intente adivinarla.
 * Tras el intento le indicamos el número de aciertos.
 */
public class Lingo {

    private ArrayList<String> palabras = new ArrayList<String>();
    private String palabraAcertar;
    private StringBuffer palabraIntento;

    private static int partidasGanadas=0;

    public Lingo() {
        palabras.add("lunes");
        palabras.add("ringo");
        palabras.add("bingo");
        palabras.add("perro");
        palabras.add("cerro");
        palabras.add("pedal");
        palabras.add("arroz");
        palabras.add("censo");

        //Obtenemos una aleatoria, que es la que tienes que averiguar
        int posicion = (int) (Math.random() * (palabras.size() ));
        this.palabraAcertar = palabras.get(posicion);

        //Ponemos con guiones la palabra con los intentos del jugador
        this.palabraIntento = new StringBuffer();
        for(int i=0; i < this.palabraAcertar.length(); i++) {
            this.palabraIntento.append("-");
        }
    }

    public String getPalabraAcertar() {
        return palabraAcertar;
    }

    public void setPalabraAcertar(String palabraAcertar) {
        this.palabraAcertar = palabraAcertar;
    }

    public static int getPartidasGanadas() {
        return partidasGanadas;
    }

    public static void setPartidasGanadas(int partidasGanadas) {
        Lingo.partidasGanadas = partidasGanadas;
    }

    /**
     * Comprueba caracter a caracter la palabra introducida y la palabra a acertar
     * Calcula el número de letras que están en la misma posición
     * @param palabra
     * @return El número de letras en la misma posición
     */
    public int comprobar(String palabra) {
        if (palabra.length() != 5) {
            System.out.println("La palabra no tiene 5 letras");
            return 0;
        }

        int aciertos = 0;
        for(int i=0; i < this.palabraAcertar.length(); i++) {
            if (this.palabraAcertar.charAt(i) == palabra.charAt(i)) {
                aciertos++;
                this.palabraIntento.setCharAt(i, this.palabraAcertar.charAt(i));
            }
        }
        System.out.println(this.palabraIntento);

        //Volver a poner this.palabraIntento con -----

        return aciertos;
    }
}
