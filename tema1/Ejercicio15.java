public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        double interesMeQueda=0;
        double loDeHacienda=0;
        double cantidad = 2000;

        interesMeQueda = 2000 * 2.75 / 100; // 2000 * 0.0275

        //Multiplico por 0.82 para restar el 18% de hacienda (1 - 0,18)
        System.out.println(  interesMeQueda * 0.82 );

        //Restar el 18% de hacienda
        loDeHacienda = interesMeQueda * 18 / 100;
        System.out.println(interesMeQueda - loDeHacienda);


    }
}
