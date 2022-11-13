package org.ponyseba.model;

public class Finiquito {
    private int id;
    private String nombre;

    public Finiquito(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Finiquito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
