package tema2.funciones;

import java.util.Scanner;

public class Ejercicio23 {
    
    public static boolean fechaCorrecta(int dia, int mes, int anio) {
        boolean fechaC = true;

        switch (mes) {
            case 1,3,5,7,8,10,12:  //31 días
                if (dia < 1 || dia > 31)
                    fechaC = false;
                break;
            case 4,6,9,11:
                if (dia < 1 || dia > 30)
                    fechaC = false;
                break;
            case 2:
                if (dia < 1 || dia > 28)
                    fechaC = false;
                break;
            default:
                fechaC = false;
        }

        return fechaC;
    }

    public static void main(String[] args) {
        int dia=0, mes=0, anio=0;
        
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Dime el día");
            dia = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el mes");
            mes = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el año");
            anio = Integer.parseInt(sc.nextLine());

            if (fechaCorrecta(dia, mes, anio)) {
                //Día siguiente
                switch (mes) {
                    case 1,3,5,7,8,10: 
                        if (dia == 31) {
                            dia = 1;
                            mes++;
                        } else {
                            dia++;
                        }
                        break;
                    case 4,6,9,11:
                        if (dia == 30) {
                            dia = 1;
                            mes++;
                        }  else {
                            dia++;
                        }
                        break;
                    case 2:
                        if (dia == 28) {
                            dia = 1;
                            mes++;
                        }  else {
                            dia++;
                        }
                        break;
                    case 12:
                        if (dia == 31) {
                            dia = 1;
                            mes = 1;
                            anio++;
                        }  else {
                            dia++;
                        }
                        break;
                    default:
                        break;
                }

                System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);
            } else {
                System.out.println("Error en la fecha introducida");
            }





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        


        
    }
}
