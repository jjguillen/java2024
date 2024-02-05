package agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        this.contactos.remove(contacto);  //Utiliza equals para buscarlo
    }

    public void listarContactos() {
        for(Contacto contacto : contactos) {
            contacto.pintar();
        }
    }

    public boolean existeContacto(Contacto contacto) {
        return contactos.contains(contacto);
    }

    public Contacto buscarContacto(Contacto contacto) {
        //indexOf

        int posicion = contactos.indexOf(contacto);

        if (posicion < 0) {
            return null; //No encontrado
        } else {
            return contactos.get(posicion); //Encontrado
        }

    }

}
