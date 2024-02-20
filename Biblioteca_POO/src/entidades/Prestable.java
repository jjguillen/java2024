package entidades;

public interface Prestable {

    void prestaAUsuario(Usuario user);
    void devuelve(Usuario user);
    boolean estaPrestado();

}
