package tema6.src.menu.principal;

import tema6.src.menu.dominio.*;

public class Principal {

	public static void main(String[] args) {

		// ***************************************************************
		// Crear ingredientes
		// ***************************************************************

		Hamburguesa h1 = new Hamburguesa("26/04/2022");
		Hamburguesa h2 = new Hamburguesa("27/04/2022");
		Hamburguesa h3 = new Hamburguesa("07/05/2022");

		Patata p1 = new Patata();
		Patata p2 = new Patata();
		Patata p3 = new Patata();
		Patata p4 = new Patata();

		Agua a1 = new Agua();
		Agua a2 = new Agua();
		Agua a3 = new Agua();

		Cola c1 = new Cola();
		Cola c2 = new Cola();
		Cola c3 = new Cola();

		// ***************************************************************
		// Menú 1
		// ***************************************************************

		Menu m1 = new Menu();

		// Cocinar ingredientes
		a1.meterEnNevera();
		c1.meterEnNevera();
		h1.cocinar();
		p1.freir();
		a1.sacarDeNevera();

		// Anyadir ingredientes
		m1.anyadirBebida(a1);
		m1.anyadirBebida(c1);

		m1.anyadirComida(h1);
		m1.anyadirComida(p1);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m1);

		// ***************************************************************
		// Menú 2
		// ***************************************************************

		Menu m2 = new Menu();

		// Cocinar ingredientes
		a2.meterEnNevera();
		c2.meterEnNevera();
		h2.cocinar();
		p2.asar();

		// Anyadir ingredientes
		m2.anyadirBebida(a2);
		m2.anyadirBebida(c2);

		m2.anyadirComida(h2);
		m2.anyadirComida(p2);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m2);

		// ***************************************************************
		// Menú 3
		// ***************************************************************

		Menu m3 = new Menu();

		// Cocinar ingredientes
		p3.cocer();
		a3.sacarDeNevera();
		c3.meterEnNevera();

		// Anyadir ingredientes
		m3.anyadirBebida(a3);
		m3.anyadirBebida(c3);

		m3.anyadirComida(h3);
		m3.anyadirComida(p3);
		m3.anyadirComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m3);

		// ***************************************************************
		// Menú 4
		// ***************************************************************

		Menu m4 = new Menu();

		// Cocinar ingredientes
		p3.cocer();
		a3.sacarDeNevera();
		c3.meterEnNevera();
		p4.freir();
		h3.cocinar();

		// Anyadir ingredientes
		m4.anyadirBebida(a2);
		m4.anyadirBebida(a3);
		m4.anyadirBebida(c3);

		m4.anyadirComida(h3);
		m4.anyadirComida(p3);
		m4.anyadirComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m4);

		// ***************************************************************
		// Menú 5
		// ***************************************************************

		Menu m5 = new Menu();

		// Anyadir ingredientes

		m5.anyadirComida(h3);
		m5.anyadirComida(p3);
		m5.anyadirComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m5);

		// Imprimir total menús
		System.out.println("****************************");
		System.out.println("Total menús: " + Menu.numeroMenus);
		System.out.println("****************************");
	}

	private static void imprimirTicket(Menu m) {

		double precioMenu = 0.0;

		System.out.println("****************************");
		System.out.printf("** Menú (%2d ingredientes) **\n", m.getNumeroIngredientes());
		System.out.println("****************************");

		precioMenu = m.obtenerPrecioMenu();

		// Imprimir ingredientes menú
		m.imprimirMenu();

		// Imprimir precio total
		System.out.printf("\nPrecio Total.......... %3.2f€\n", precioMenu);

		System.out.println("");
	}

}