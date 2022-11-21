/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author jgval
 */
public class FormularioFiniquito {
    private Date fechaInicioTrabajo;
    private Date fechaFinTrabajo;
    private int artCausalFinContrato;
    private int numArtCausalFinContrato;
    private DatosEntradaMes mesUno;
    private DatosEntradaMes mesDos;
    private DatosEntradaMes mesTres;
    private int diasTomadosVacaciones = 0;

    public FormularioFiniquito() {
    }

    public FormularioFiniquito(Date fechaInicioTrabajo, Date fechaFinTrabajo, int artCausalFinContrato, int numArtCausalFinContrato, DatosEntradaMes mesUno, DatosEntradaMes mesDos, DatosEntradaMes mesTres) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.artCausalFinContrato = artCausalFinContrato;
        this.numArtCausalFinContrato = numArtCausalFinContrato;
        this.mesUno = mesUno;
        this.mesDos = mesDos;
        this.mesTres = mesTres;
    }

    public Date getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }

    public void setFechaInicioTrabajo(Date fechaInicioTrabajo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
    }

    public Date getFechaFinTrabajo() {
        return fechaFinTrabajo;
    }

    public void setFechaFinTrabajo(Date fechaFinTrabajo) {
        this.fechaFinTrabajo = fechaFinTrabajo;
    }

    public int getArtCausalFinContrato() {
        return artCausalFinContrato;
    }

    public void setArtCausalFinContrato(int artCausalFinContrato) {
        this.artCausalFinContrato = artCausalFinContrato;
    }

    public int getNumArtCausalFinContrato() {
        return numArtCausalFinContrato;
    }

    public void setNumArtCausalFinContrato(int numArtCausalFinContrato) {
        this.numArtCausalFinContrato = numArtCausalFinContrato;
    }

    public DatosEntradaMes getMesUno() {
        return mesUno;
    }

    public void setMesUno(DatosEntradaMes mesUno) {
        this.mesUno = mesUno;
    }

    public DatosEntradaMes getMesDos() {
        return mesDos;
    }

    public void setMesDos(DatosEntradaMes mesDos) {
        this.mesDos = mesDos;
    }

    public DatosEntradaMes getMesTres() {
        return mesTres;
    }

    public void setMesTres(DatosEntradaMes mesTres) {
        this.mesTres = mesTres;
    }

    public int getDiasTomadosVacaciones() {
        return diasTomadosVacaciones;
    }

    public void setDiasTomadosVacaciones(int diasTomadosVacaciones) {
        this.diasTomadosVacaciones = diasTomadosVacaciones;
    }
    
    

    @Override
    public String toString() {
        return "FormularioFiniquito{" + "fechaInicioTrabajo=" + fechaInicioTrabajo + ", fechaFinTrabajo=" + fechaFinTrabajo + ", artCausalFinContrato=" + artCausalFinContrato + ", numArtCausalFinContrato=" + numArtCausalFinContrato + ", mesUno=" + mesUno + ", mesDos=" + mesDos + ", mesTres=" + mesTres + '}';
    }
    
    
    
}
