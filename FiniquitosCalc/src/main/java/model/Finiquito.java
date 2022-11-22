/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author sebastiankravetz
 */
public class Finiquito {
    private int idFiniquito;
    private String nombreTrabajador = "";
    private LocalDate fechaInicioTrabajo;
    private LocalDate fechaFinTrabajo;
    private String mesesTrabajadosTotal;
    private LocalDate fechaPagoFiniquito;
    private int salarioIndemnizacion;
    private int salarioVacaciones;
    private double feriadoLegalHabil;
    private int indeminizacionAniosServicio;
    private int indemnizacionVacaciones;
    private int totalIndemnizacion;
    private int idUsuario;
    private String nombreEmpresa;

    public Finiquito() {
    }

    public Finiquito(int idFiniquito, String nombreTrabajador, LocalDate fechaInicioTrabajo, LocalDate fechaFinTrabajo, String mesesTrabajadosTotal, LocalDate fechaPagoFiniquito, int salarioIndemnizacion, int salarioVacaciones, double feriadoLegalHabil, int indeminizacionAniosServicio, int indemnizacionVacaciones, int totalIndemnizacion, int idUsuario, String nombreEmpresa) {
        this.idFiniquito = idFiniquito;
        this.nombreTrabajador = nombreTrabajador;
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.mesesTrabajadosTotal = mesesTrabajadosTotal;
        this.fechaPagoFiniquito = fechaPagoFiniquito;
        this.salarioIndemnizacion = salarioIndemnizacion;
        this.salarioVacaciones = salarioVacaciones;
        this.feriadoLegalHabil = feriadoLegalHabil;
        this.indeminizacionAniosServicio = indeminizacionAniosServicio;
        this.indemnizacionVacaciones = indemnizacionVacaciones;
        this.totalIndemnizacion = totalIndemnizacion;
        this.idUsuario = idUsuario;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdFiniquito() {
        return idFiniquito;
    }

    public void setIdFiniquito(int idFiniquito) {
        this.idFiniquito = idFiniquito;
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

    public String getMesesTrabajadosTotal() {
        return mesesTrabajadosTotal;
    }

    public void setMesesTrabajadosTotal(String mesesTrabajadosTotal) {
        this.mesesTrabajadosTotal = mesesTrabajadosTotal;
    }

    public LocalDate getFechaPagoFiniquito() {
        return fechaPagoFiniquito;
    }

    public void setFechaPagoFiniquito(LocalDate fechaPagoFiniquito) {
        this.fechaPagoFiniquito = fechaPagoFiniquito;
    }

    public int getSalarioIndemnizacion() {
        return salarioIndemnizacion;
    }

    public void setSalarioIndemnizacion(int salarioIndemnizacion) {
        this.salarioIndemnizacion = salarioIndemnizacion;
    }

    public int getSalarioVacaciones() {
        return salarioVacaciones;
    }

    public void setSalarioVacaciones(int salarioVacaciones) {
        this.salarioVacaciones = salarioVacaciones;
    }

    public double getFeriadoLegalHabil() {
        return feriadoLegalHabil;
    }

    public void setFeriadoLegalHabil(double feriadoLegalHabil) {
        this.feriadoLegalHabil = feriadoLegalHabil;
    }

    public int getIndeminizacionAniosServicio() {
        return indeminizacionAniosServicio;
    }

    public void setIndeminizacionAniosServicio(int indeminizacionAniosServicio) {
        this.indeminizacionAniosServicio = indeminizacionAniosServicio;
    }

    public int getIndemnizacionVacaciones() {
        return indemnizacionVacaciones;
    }

    public void setIndemnizacionVacaciones(int indemnizacionVacaciones) {
        this.indemnizacionVacaciones = indemnizacionVacaciones;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTotalIndemnizacion() {
        return totalIndemnizacion;
    }

    public void setTotalIndemnizacion(int totalIndemnizacion) {
        this.totalIndemnizacion = totalIndemnizacion;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }
    
    

    @Override
    public String toString() {
        return "Finiquito{" + "idFiniquito=" + idFiniquito + ", fechaInicioTrabajo=" + fechaInicioTrabajo + ", fechaFinTrabajo=" + fechaFinTrabajo + ", mesesTrabajadosTotal=" + mesesTrabajadosTotal + ", fechaPagoFiniquito=" + fechaPagoFiniquito + ", salarioIndemnizacion=" + salarioIndemnizacion + ", salarioVacaciones=" + salarioVacaciones + ", feriadoLegalHabil=" + feriadoLegalHabil + ", indeminizacionAniosServicio=" + indeminizacionAniosServicio + ", indemnizacionVacaciones=" + indemnizacionVacaciones + ", totalIndemnizacion=" + totalIndemnizacion + ", idUsuario=" + idUsuario + ", nombreEmpresa=" + nombreEmpresa + '}';
    }
    
    

    

    
    

 
    
    
}
