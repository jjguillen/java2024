package biblioteca;

public interface Prestable {
    public void prestaAUsuario(Usuario user);
    public void devuelve();
    public boolean estaPrestado();
}
