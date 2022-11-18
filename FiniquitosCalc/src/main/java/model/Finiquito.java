/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author sebastiankravetz
 */
public class Finiquito {
    private int idFiniquito;
    private Date fechaInicioTrabajo;
    private Date fechaFinTrabajo;
    private int mesesTrabajadosTotal;
    private Date fechaPagoFiniquito;
    private int salarioIndemnizacion;
    private int salarioVacaciones;
    private int feriadoLegalHabil;
    private int indeminizacionAniosServicio;
    private int indemnizacionVacaciones;
    private int idUsuario;

    public Finiquito() {
    }

    public Finiquito(int idFiniquito, Date fechaInicioTrabajo, Date fechaFinTrabajo, int mesesTrabajadosTotal, Date fechaPagoFiniquito, int salarioIndemnizacion, int salarioVacaciones, int feriadoLegalHabil, int indeminizacionAniosServicio, int indemnizacionVacaciones, int idUsuario) {
        this.idFiniquito = idFiniquito;
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.fechaFinTrabajo = fechaFinTrabajo;
        this.mesesTrabajadosTotal = mesesTrabajadosTotal;
        this.fechaPagoFiniquito = fechaPagoFiniquito;
        this.salarioIndemnizacion = salarioIndemnizacion;
        this.salarioVacaciones = salarioVacaciones;
        this.feriadoLegalHabil = feriadoLegalHabil;
        this.indeminizacionAniosServicio = indeminizacionAniosServicio;
        this.indemnizacionVacaciones = indemnizacionVacaciones;
        this.idUsuario = idUsuario;
    }

    public int getIdFiniquito() {
        return idFiniquito;
    }

    public void setIdFiniquito(int idFiniquito) {
        this.idFiniquito = idFiniquito;
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

    public int getMesesTrabajadosTotal() {
        return mesesTrabajadosTotal;
    }

    public void setMesesTrabajadosTotal(int mesesTrabajadosTotal) {
        this.mesesTrabajadosTotal = mesesTrabajadosTotal;
    }

    public Date getFechaPagoFiniquito() {
        return fechaPagoFiniquito;
    }

    public void setFechaPagoFiniquito(Date fechaPagoFiniquito) {
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

    public int getFeriadoLegalHabil() {
        return feriadoLegalHabil;
    }

    public void setFeriadoLegalHabil(int feriadoLegalHabil) {
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

    @Override
    public String toString() {
        return "Finiquito{" + "idFiniquito=" + idFiniquito + ", fechaInicioTrabajo=" + fechaInicioTrabajo + ", fechaFinTrabajo=" + fechaFinTrabajo + ", mesesTrabajadosTotal=" + mesesTrabajadosTotal + ", fechaPagoFiniquito=" + fechaPagoFiniquito + ", salarioIndemnizacion=" + salarioIndemnizacion + ", salarioVacaciones=" + salarioVacaciones + ", feriadoLegalHabil=" + feriadoLegalHabil + ", indeminizacionAniosServicio=" + indeminizacionAniosServicio + ", indemnizacionVacaciones=" + indemnizacionVacaciones + ", idUsuario=" + idUsuario + '}';
    }


 
    
    
}
