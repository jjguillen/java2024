package tema7_parte3.ejemplobasicoficheros;

import tema7_parte3.ejemplobasicoficheros.io.DAOGamer;
import tema7_parte3.ejemplobasicoficheros.models.Gamer;
import tema7_parte3.ejemplobasicoficheros.services.Discord;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import tema7_parte3.ejemplobasicoficheros.models.Level;

public class App {

    public static void main(String[] args) throws IOException {

        List<Gamer> gamers = DAOGamer.loadGamers();
        Discord discord = new Discord(gamers);

        //Menu
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. List gamers");
            System.out.println("2. Add gamer");
            System.out.println("3. Remove gamer");
            System.out.println("4. Find gamer");
            System.out.println("5. Exit");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    discord.listGamers();
                    break;
                case 2:
                    System.out.println("Dime nick");
                    String nick = sc.nextLine();
                    System.out.println("Dime email");
                    String email = sc.nextLine();
                    System.out.println("Dime juego");
                    String juego = sc.nextLine();
                    System.out.println("Dime nivel ( DIOS, MÁQUINA, BUENO, NORMAL, REGULAR, MALILLO, PAQUETE)");
                    Level level = Level.valueOf(sc.nextLine());

                    Gamer gamer = new Gamer(discord.getMaxId()+1, nick, email, juego, level);
                    discord.addGamer(gamer);
                    break;
                case 3:
                    System.out.println("Dime email");
                    String emailRemove = sc.nextLine();
                    Gamer gamerRemove = new Gamer(1L, "", emailRemove, "", null);
                    discord.removeGamer(gamerRemove);
                    break;
                case 4:
                    System.out.println("Dime nick");
                    String nick2 = sc.nextLine();
                    try {
                        System.out.println(discord.findGamer(nick2));
                    } catch (NoSuchElementException ex) {
                        System.out.println("Gamer not found");
                    }
                    break;
                case 5:
                    DAOGamer.saveGamers(discord.getGamers().stream().toList());
                    break;
            }

        }
    }

}
