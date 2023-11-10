package tema3;

import java.util.Arrays;

public class DadosPoker {
    
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void pintarTiradaPoker(int tiradas[]) {
        for(int i=0; i < tiradas.length; i++) {
            switch (tiradas[i]) {
                case 1:
                    System.out.print(" AS ");
                    break;
                case 2:
                    System.out.print(" J ");
                    break;
                case 3:
                    System.out.print(" Q ");
                    break;
                case 4:
                    System.out.print(" K ");
                    break;
                case 5:
                    System.out.print(" N ");
                    break;
                case 6:
                    System.out.print(" R ");
                    break;
            
                default:
                    break;
            }
            
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int tiradas[] = new int[5];

        for(int j=0; j < 100; j++) {

            for(int i=0; i < tiradas.length; i++) {
                tiradas[i] = generarNumero(1, 6);
            }

            Arrays.sort(tiradas);
            pintarTiradaPoker(tiradas);


            if ( (tiradas[0] == tiradas[1] && tiradas[0] == tiradas[2] && tiradas[0] == tiradas[3]) || 
                (tiradas[1] == tiradas[2] && tiradas[1] == tiradas[3] && tiradas[1] == tiradas[4]) ) {
                    System.out.println("Póker");

                    switch (tiradas[2]) {
                    case 1:
                        System.out.print(" Ases ");
                        break;
                    case 2:
                        System.out.print(" Jotas ");
                        break;
                    case 3:
                        System.out.print(" Reinas ");
                        break;
                    case 4:
                        System.out.print(" Reyes ");
                        break;
                    case 5:
                        System.out.print(" Negros ");
                        break;
                    case 6:
                        System.out.print(" Rojos ");
                        break;
                
                    default:
                        break;
                }

                break;
            }
        }
    }
}
