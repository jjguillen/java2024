package tema3;

public class PorReferencia {
    
    public static void sumarUno(int notass[], int valor) {
        for(int i=0; i<notass.length; i++)
            notass[i] = notass[i] + valor;

        valor = 3;

    }

    public static void main(String[] args) {
        

        int notas[] = { 5, 4, 6, 2, 9, 3 };

        for(int i=0; i<notas.length; i++)
            System.out.print(notas[i] + ", ");

        System.out.println();

        int valor = 2;

        sumarUno(notas,valor);

        System.out.println(valor);

        for(int i=0; i<notas.length; i++)
            System.out.print(notas[i] + ", ");



    }
}
