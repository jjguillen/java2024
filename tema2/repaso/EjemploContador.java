package tema2.repaso;

class EjemploContador {

    public static void main(String[] args) {
        

        //Iniciar el contador
        int contador=0;
        int inicio=0, fin=200;

        //Bucle donde incremento el contador cuando me interese
        for(int i=inicio; i<fin; i++) {

            //Condición números pares
            if (i%2 == 0) {
                //System.out.println(i);
                contador++;
            }
            
              
        }

        System.out.println("Hay " + contador + " números pares");





    }


}