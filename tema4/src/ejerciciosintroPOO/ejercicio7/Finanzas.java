package ejerciciosintroPOO.ejercicio7;

public class Finanzas {

    private static double cambioEuroDolar;



    public static double getCambioEuroDolar() {
        return Finanzas.cambioEuroDolar;
    }

    public static void setCambioEuroDolar(double cambioEuroDolar) {
        Finanzas.cambioEuroDolar = cambioEuroDolar;
    }

    public static double dolaresToEuros(double dolares) {
        return dolares / Finanzas.cambioEuroDolar;
    }

    public static double eurosToDolares(double euros) {
        return euros * Finanzas.cambioEuroDolar;
    }
}
