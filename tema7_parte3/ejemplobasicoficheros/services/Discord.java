package tema7_parte3.ejemplobasicoficheros.services;

import tema7_parte3.ejemplobasicoficheros.models.Gamer;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

public class Discord {

    private HashSet<Gamer> gamers;

    public Discord() {
        this.gamers = new HashSet<>();
    }

    public Discord(List<Gamer> gamers) {
        this.gamers = new HashSet<>(gamers);
    }

    public HashSet<Gamer> getGamers() {
        return gamers;
    }

    public void addGamer(Gamer g) {
        this.gamers.add(g);
    }

    public void removeGamer(Gamer g) {
        this.gamers.remove(g);
    }

    public void setGamers(HashSet<Gamer> gamers) {
        this.gamers = gamers;
    }

    public Gamer findGamer(String nick) throws NoSuchElementException {
        return gamers.stream()
                .filter( gamer -> gamer.getNick().equals(nick))
                .findFirst()
                .orElseThrow();
    }

    public void listGamers() {
        gamers.stream()
                .sorted(Comparator.comparing(Gamer::getId))
                .forEach(System.out::println);
    }

    public Long getMaxId() {
        return gamers.stream()
                .mapToLong(Gamer::getId)
                .max()
                .orElse(1000000);
    }


}
