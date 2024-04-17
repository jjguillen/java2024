package tema7_parte3.ejemplobasicoficheros.models;

import java.util.Objects;

public class Gamer {

    private Long id;
    private String nick;
    private String email;
    private String game;
    private Level level;

    public Gamer() {
    }

    public Gamer(Long id, String nick, String email, String game, Level level) {
        this.id = id;
        this.nick = nick;
        this.email = email;
        this.game = game;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gamer{");
        sb.append("id=").append(id);
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", game='").append(game).append('\'');
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gamer gamer = (Gamer) o;
        return Objects.equals(email, gamer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
