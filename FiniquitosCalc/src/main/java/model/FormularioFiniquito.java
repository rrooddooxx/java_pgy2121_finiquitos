/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author jgval
 */
public class FormularioFiniquito {
    
    private LocalDate fechaInicioTrabajo;
    private LocalDate fechaFinTrabajo;
    private int artCausalFinContrato;
    private int numArtCausalFinContrato;
    private boolean salarioFijo;
    private DatosEntradaMes mesUno;
    private DatosEntradaMes mesDos;
    private DatosEntradaMes mesTres;
    private int diasTomadosVacaciones = 0;

    public FormularioFiniquito() {
    }

    public FormularioFiniquito(LocalDate fechaInicioTrabajo, LocalDate fechaFinTrabajo, int artCausalFinContrato, int numArtCausalFinContrato, DatosEntradaMes mesUno, DatosEntradaMes mesDos, DatosEntradaMes mesTres) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.artCausalFinContrato = artCausalFinContrato;
        this.numArtCausalFinContrato = numArtCausalFinContrato;
        this.mesUno = mesUno;
        this.mesDos = mesDos;
        this.mesTres = mesTres;
    }

    public LocalDate getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }

    public void setFechaInicioTrabajo(LocalDate fechaInicioTrabajo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
    }

    public LocalDate getFechaFinTrabajo() {
        return fechaFinTrabajo;
    }

    public void setFechaFinTrabajo(LocalDate fechaFinTrabajo) {
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

    public boolean isSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(boolean salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return "FormularioFiniquito{" + "fechaInicioTrabajo=" + fechaInicioTrabajo + ", fechaFinTrabajo=" + fechaFinTrabajo + ", artCausalFinContrato=" + artCausalFinContrato + ", numArtCausalFinContrato=" + numArtCausalFinContrato + ", salarioFijo=" + salarioFijo + ", mesUno=" + mesUno + ", mesDos=" + mesDos + ", mesTres=" + mesTres + ", diasTomadosVacaciones=" + diasTomadosVacaciones + '}';
    }
    
    
    

    
    
    
}
