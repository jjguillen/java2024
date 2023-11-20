package tema3.Matrices;

public class TresDimensiones {
    
    public static void main(String[] args) {
        
        int cubo[][][] = new int[4][4][4];

        for(int i=0; i<cubo.length; i++) {
            for(int j=0; j<cubo[i].length; j++) {
                for(int k=0; k<cubo[i][j].length; k++) {
                    cubo[i][j][k] = i+j+k;
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            
        }


    }
}
