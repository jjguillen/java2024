package tema6.src.menu.interfaces;

public interface Cocinable {

	//Constantes
	public static final int CRUDA  = 0;
	public static final int FRITA  = 1;
	public static final int COCIDA = 2;
	public static final int ASADA  = 3;
	
	//Métodos
	public void freir();
	public void cocer();
	public void asar();
	
}