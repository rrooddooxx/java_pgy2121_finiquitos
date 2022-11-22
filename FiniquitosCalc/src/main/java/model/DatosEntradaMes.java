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
            desgasteHerramientas, viaticos, semanaCorrida, comision = 0;

    public DatosEntradaMes() {
    }

    public DatosEntradaMes(int sueldoBase, int gratificacion, int colacion, int movilizacion, int bonoImponible, int chequeRestaurant, int desgasteHerramientas, int viaticos, int semanaCorrida, int comision) {
        this.sueldoBase = sueldoBase;
        this.gratificacion = gratificacion;
        this.colacion = colacion;
        this.movilizacion = movilizacion;
        this.bonoImponible = bonoImponible;
        this.chequeRestaurant = chequeRestaurant;
        this.desgasteHerramientas = desgasteHerramientas;
        this.viaticos = viaticos;
        this.semanaCorrida = semanaCorrida;
        this.comision = comision;
    }
    
    public DatosEntradaMes(int sueldoBase, int gratificacion, int colacion, int movilizacion, int bonoImponible, int chequeRestaurant, int desgasteHerramientas, int viaticos) {
        this.sueldoBase = sueldoBase;
        this.gratificacion = gratificacion;
        this.colacion = colacion;
        this.movilizacion = movilizacion;
        this.bonoImponible = bonoImponible;
        this.chequeRestaurant = chequeRestaurant;
        this.desgasteHerramientas = desgasteHerramientas;
        this.viaticos = viaticos;
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

    public int getSemanaCorrida() {
        return semanaCorrida;
    }

    public void setSemanaCorrida(int semanaCorrida) {
        this.semanaCorrida = semanaCorrida;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DatosEntradaMes{");
        sb.append("sueldoBase=").append(sueldoBase);
        sb.append(", gratificacion=").append(gratificacion);
        sb.append(", colacion=").append(colacion);
        sb.append(", movilizacion=").append(movilizacion);
        sb.append(", bonoImponible=").append(bonoImponible);
        sb.append(", chequeRestaurant=").append(chequeRestaurant);
        sb.append(", desgasteHerramientas=").append(desgasteHerramientas);
        sb.append(", viaticos=").append(viaticos);
        sb.append(", semanaCorrida=").append(semanaCorrida);
        sb.append(", comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }

    

    
    
}
