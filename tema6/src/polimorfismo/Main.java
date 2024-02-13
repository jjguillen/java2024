package polimorfismo;

import logistica.entidades.NivelFragil;
import logistica.entidades.NivelRefrigeracion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Producto pr1 = new ProductoFragil("prfragil",5, NivelFragil.N2);
        Producto pr2 = new ProductoRefrigerado("prfragil",5, NivelRefrigeracion.N2);
        ((ProductoRefrigerado) pr2).getNivelRefrigeracion();  //Casting


        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new ProductoFragil("prfragil",5, NivelFragil.N2));
        productos.add(pr2);
        for(Producto pr : productos) {
            //No me deja llamar a métodos de la clase producto.
            if ( pr instanceof ProductoFragil ) //Puristas de la POO dicen que esto no se hace
                ((ProductoFragil) pr).getNivelFragilidad();
        }

    }
}
