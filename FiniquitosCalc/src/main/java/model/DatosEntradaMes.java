/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jgval
 */
public class DatosEntradaMes {
    private int sueldoBase, gratificacion, colacion, movilizacion, bonoImponible, chequeRestaurant, 
            desgasteHerramientas, viaticos, semanaCorrida, comision, diasTomadosVacaciones = 0;

    public DatosEntradaMes() {
    }

    public DatosEntradaMes(int sueldoBase, int gratificacion, int colacion, int movilizacion, int bonoImponible, int chequeRestaurant, int desgasteHerramientas) {
        this.sueldoBase = sueldoBase;
        this.gratificacion = gratificacion;
        this.colacion = colacion;
        this.movilizacion = movilizacion;
        this.bonoImponible = bonoImponible;
        this.chequeRestaurant = chequeRestaurant;
        this.desgasteHerramientas = desgasteHerramientas;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getGratificacion() {
        return gratificacion;
    }

    public void setGratificacion(int gratificacion) {
        this.gratificacion = gratificacion;
    }

    public int getColacion() {
        return colacion;
    }

    public void setColacion(int colacion) {
        this.colacion = colacion;
    }

    public int getMovilizacion() {
        return movilizacion;
    }

    public void setMovilizacion(int movilizacion) {
        this.movilizacion = movilizacion;
    }

    public int getBonoImponible() {
        return bonoImponible;
    }

    public void setBonoImponible(int bonoImponible) {
        this.bonoImponible = bonoImponible;
    }

    public int getChequeRestaurant() {
        return chequeRestaurant;
    }

    public void setChequeRestaurant(int chequeRestaurant) {
        this.chequeRestaurant = chequeRestaurant;
    }

    public int getDesgasteHerramientas() {
        return desgasteHerramientas;
    }

    public void setDesgasteHerramientas(int desgasteHerramientas) {
        this.desgasteHerramientas = desgasteHerramientas;
    }

    public int getViaticos() {
        return viaticos;
    }

    public void setViaticos(int viaticos) {
        this.viaticos = viaticos;
    }
    
    
    
}
