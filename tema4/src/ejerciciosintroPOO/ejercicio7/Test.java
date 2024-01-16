package ejerciciosintroPOO.ejercicio7;

public class Test {

    public static void main(String[] args) {
        Finanzas.setCambioEuroDolar(1.36);
        System.out.println(Finanzas.dolaresToEuros(100));
        Finanzas.setCambioEuroDolar(1.10);
        System.out.println(Finanzas.dolaresToEuros(100));
    }


}
