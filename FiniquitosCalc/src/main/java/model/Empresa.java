/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sebastiankravetz
 */
public class Empresa {
    private int idEmpresa;
    private String nombre;
    private int rut;
    private int dvRut;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String nombre, int rut, int dvRut) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.rut = rut;
        this.dvRut = dvRut;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getDvRut() {
        return dvRut;
    }

    public void setDvRut(int dvRut) {
        this.dvRut = dvRut;
    }

    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", rut=" + rut + ", dvRut=" + dvRut + '}';
    }
    
    
}
