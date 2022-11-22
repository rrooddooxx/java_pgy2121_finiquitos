/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author jgval
 */
public class FormularioFiniquito {
    
    private LocalDate fechaInicioTrabajo;
    private LocalDate fechaFinTrabajo;
    private String artCausalFinContrato;
    private DatosEntradaMes mesUno;
    private DatosEntradaMes mesDos;
    private DatosEntradaMes mesTres;
    private int diasTomadosVacaciones = 0;
    boolean salarioFijo;

    public boolean isSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(boolean salarioFijo) {
        this.salarioFijo = salarioFijo;
    }
    
    

    public FormularioFiniquito() {
    }

    public FormularioFiniquito(LocalDate fechaInicioTrabajo, LocalDate fechaFinTrabajo, int diasTomadosVacaciones, String artCausalFinContrato, DatosEntradaMes mesUno, DatosEntradaMes mesDos, DatosEntradaMes mesTres, boolean salarioFijo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.artCausalFinContrato = artCausalFinContrato;
        this.mesUno = mesUno;
        this.mesDos = mesDos;
        this.mesTres = mesTres;
        this.diasTomadosVacaciones = diasTomadosVacaciones;
        this.salarioFijo = salarioFijo;
    }
    
    public FormularioFiniquito(LocalDate fechaInicioTrabajo, LocalDate fechaFinTrabajo, int diasTomadosVacaciones, String artCausalFinContrato, DatosEntradaMes mesUno, boolean salarioFijo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.artCausalFinContrato = artCausalFinContrato;
        this.mesUno = mesUno;
        this.salarioFijo = salarioFijo;
        this.diasTomadosVacaciones = diasTomadosVacaciones;
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

    public String getArtCausalFinContrato() {
        return artCausalFinContrato;
    }

    public void setArtCausalFinContrato(String artCausalFinContrato) {
        this.artCausalFinContrato = artCausalFinContrato;
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
        StringBuilder sb = new StringBuilder();
        sb.append("FormularioFiniquito{");
        sb.append("fechaInicioTrabajo=").append(fechaInicioTrabajo);
        sb.append(", fechaFinTrabajo=").append(fechaFinTrabajo);
        sb.append(", artCausalFinContrato=").append(artCausalFinContrato);
        sb.append(", mesUno=").append(mesUno);
        sb.append(", mesDos=").append(mesDos);
        sb.append(", mesTres=").append(mesTres);
        sb.append(", diasTomadosVacaciones=").append(diasTomadosVacaciones);
        sb.append('}');
        return sb.toString();
    }
    
    
    


    
    
    
}
