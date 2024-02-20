package entidades;

import java.util.ArrayList;

public class Usuario {

    private static Long contadorId = 1l;

    private Long id;
    private String dni;
    private String nombre;
    private Integer limitePrestamos;
    private Integer limitePlazoPrestamos; //En días
    private ArrayList<Documento> documentosEnPrestamo = new ArrayList<>();

    public Usuario(String dni, String nombre, Integer limitePrestamos, Integer limitePlazoPrestamos) {
        this.id = Usuario.contadorId++;
        this.dni = dni;
        this.nombre = nombre;
        this.limitePrestamos = limitePrestamos;
        this.limitePlazoPrestamos = limitePlazoPrestamos;
    }

    public Long getId() {
        return id;
    }

    public ArrayList<Documento> getDocumentosEnPrestamo() {
        return documentosEnPrestamo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLimitePrestamos() {
        return limitePrestamos;
    }

    public void setLimitePrestamos(Integer limitePrestamos) {
        this.limitePrestamos = limitePrestamos;
    }

    public Integer getLimitePlazoPrestamos() {
        return limitePlazoPrestamos;
    }

    public void setLimitePlazoPrestamos(Integer limitePlazoPrestamos) {
        this.limitePlazoPrestamos = limitePlazoPrestamos;
    }

    /**
     * Añade un documento a la colección de documentos prestados
     * @param documento
     */
    public void addDocumento(Documento documento) {
        this.documentosEnPrestamo.add(documento);
    }

    /**
     * Eliminar un documento de la colección de documentos prestados
     * @param documento
     */
    public void delDocumento(Documento documento) {
        this.documentosEnPrestamo.remove(documento);
    }

    /**
     * Nos dice si el usuario ha alcanzado su límite de libros prestados
     * @return true -> si el tamaño de la colección de libros prestado es mayor o igual que el
     * límite que tiene el usuario para documentos que puede tener prestados
     */
    public boolean alcanzadoLimitePrestamos() {
        //Si el ArrayList de documentos en préstamo es igual o mayor que el límite que tengo
        //devuelve true, sino false
        if (this.limitePrestamos < this.documentosEnPrestamo.size())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
