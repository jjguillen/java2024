package ejemploClone;

public class TestCasilla {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Casilla n1 = new Casilla(1, "Calle Alcalá", 10000, 1000);
        Casilla n2 = (Casilla) n1.clone();  //CLONACIÓN
        Casilla n3 = new Casilla(n1);       //CONSTRUCTOR COPIA
        Casilla n4 = n3;                    //MISMA REFERENCIA, SON EL MISMO OBJETO

        n2.setPrecio(20000);
        //n3.setPrecio(5000);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        if (n1.equals(n2)) {
            System.out.println("n1 y n2 son iguales");
        } else {
            System.out.println("n1 y n2 son diferentes");
        }

        if (n1.equals(n3)) {
            System.out.println("n1 y n3 son iguales");
        } else {
            System.out.println("n1 y n3 son diferentes");
        }

        if (n4 == n3) {
            System.out.println("Iguales");
        }

        n4 = null; //Destruir un objeto

        System.out.println("Fin de programa");

    }
}
