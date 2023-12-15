package tema3.Examen;

public class Ejercicio2 {

    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static int tirarDosDados() {
        int dado1 = generarNumero(1,6);
        int dado2 = generarNumero(1, 6);

        return dado1+dado2;
    }

    public static boolean jugarRonda() {

        int tirada = tirarDosDados();
        
        System.out.println("Tirada " + tirada);
        switch (tirada) {
            case 7,11:
                System.out.println("Gana");
                return true;

            case 2,3,12:
                System.out.println("Pierde");
                return false;
    
            default:
                //Tirar los dados otra vez
                int nuevaTirada=0;
                do {
                    nuevaTirada = tirarDosDados();
                    System.out.println("Intermedias: " + nuevaTirada);
                } while (nuevaTirada != 7 && nuevaTirada != tirada);

                //Gano o pierdo
                if (nuevaTirada == 7) {
                    return false;                   
                } else {
                    return true;
                }

        }
    }

    public static void main(String[] args) {
        
        int jugador1=0, jugador2=0;
        boolean ronda1=false, ronda2=false;
        
        for(int i=0; i<100; i++) {
            ronda1 = jugarRonda();
            ronda2 = jugarRonda();

            if (ronda1 == true && ronda2 == false) {
                jugador1++;
            }
            if (ronda1 == false && ronda2 == true) {
                jugador2++;
            }
        }
        
        System.out.println("PartidasJ1 " +  jugador1);
        System.out.println("PartidasJ2 " +  jugador2);

    }
}
