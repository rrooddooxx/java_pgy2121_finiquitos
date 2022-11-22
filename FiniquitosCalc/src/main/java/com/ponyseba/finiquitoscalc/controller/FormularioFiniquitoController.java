/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.function.Predicate;
import model.FormularioFiniquito;

/**
 *
 * @author jgval
 */
public class FormularioFiniquitoController {
    
    
    public int calcSalarioIndemnizacion(FormularioFiniquito datos){
        
        int salarioIndemnizacion = 0;
        
        if(datos.isSalarioFijo()){
            salarioIndemnizacion = datos.getMesUno().getSueldoBase()+datos.getMesUno().getGratificacion()+
                    datos.getMesUno().getColacion()+datos.getMesUno().getBonoImponible()+datos.getMesUno().getMovilizacion();
            
        }else{
            int mesUno = datos.getMesUno().getSueldoBase()+datos.getMesUno().getGratificacion()+datos.getMesUno().getColacion()+
                    datos.getMesUno().getBonoImponible()+datos.getMesUno().getMovilizacion()+datos.getMesUno().getSemanaCorrida()+
                    datos.getMesUno().getComision();
            int mesDos = datos.getMesDos().getSueldoBase()+datos.getMesDos().getGratificacion()+datos.getMesDos().getColacion()+
                    datos.getMesDos().getBonoImponible()+datos.getMesDos().getMovilizacion()+datos.getMesDos().getSemanaCorrida()+
                    datos.getMesDos().getComision();
            int mesTres = datos.getMesTres().getSueldoBase()+datos.getMesTres().getGratificacion()+datos.getMesTres().getColacion()+
                    datos.getMesTres().getBonoImponible()+datos.getMesTres().getMovilizacion()+datos.getMesTres().getSemanaCorrida()+
                    datos.getMesTres().getComision();
            
            salarioIndemnizacion = (mesUno+mesDos+mesTres) / 3;
        }
        
        return salarioIndemnizacion;      
        
    }
    
    public LocalDate calcDiasHabiles(FormularioFiniquito datos){
        
        LocalDate fecha = datos.getFechaFinTrabajo();
        int dias = this.calcVacacionesDisponibles(datos);
        
        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek()==DayOfWeek.SATURDAY || date.getDayOfWeek()==DayOfWeek.SUNDAY;
        
        LocalDate fechaFinal = fecha;
        while(dias>0){
            fechaFinal = fechaFinal.plusDays(1);
            if(isWeekend.negate().test(fechaFinal)){
                dias--;
            }
        }
        
        return fechaFinal;
    }
    
    public int calcSalarioVacaciones(FormularioFiniquito datos){
        
        int salarioVacaciones = 0;
        
        if(datos.isSalarioFijo()){
            salarioVacaciones = datos.getMesUno().getSueldoBase()+datos.getMesUno().getGratificacion();
            
        }else{
            int mesUno = datos.getMesUno().getSueldoBase()+datos.getMesUno().getGratificacion()+
                    datos.getMesUno().getComision();
            int mesDos = datos.getMesDos().getSueldoBase()+datos.getMesDos().getGratificacion()+
                    datos.getMesDos().getComision();
            int mesTres = datos.getMesTres().getSueldoBase()+datos.getMesTres().getGratificacion()+
                    datos.getMesTres().getComision();
            salarioVacaciones = (mesUno+mesDos+mesTres)/3;
        }
        
        return salarioVacaciones;
        
    }
    
    public double calcFeriadoLegalTotal(FormularioFiniquito datos){
        
        long daysBetween = DAYS.between(datos.getFechaInicioTrabajo(), datos.getFechaFinTrabajo());
        double diasVacaciones = (daysBetween/365f)*15;
        
        return diasVacaciones;       
        
    }
    
    public int calcVacacionesDisponibles(FormularioFiniquito datos){
        
        int vacacionesDisponibles = (int)Math.floor(this.calcFeriadoLegalTotal(datos)) - datos.getDiasTomadosVacaciones();
        return vacacionesDisponibles;
    }
    
    public double calcFeriadoLegal(FormularioFiniquito datos){
        
        long diasTotales = DAYS.between(datos.getFechaFinTrabajo(), this.calcDiasHabiles(datos));
        int diasExtra = (int)diasTotales - this.calcVacacionesDisponibles(datos);
        double feriadoLegalPre = this.calcFeriadoLegalTotal(datos) - datos.getDiasTomadosVacaciones() + diasExtra;
        double feriadoLegal = feriadoLegalPre*Math.pow(10,3);
        feriadoLegal = Math.floor(feriadoLegal);
        feriadoLegal = feriadoLegal/Math.pow(10,3);
        return feriadoLegal;
        
    }
            
    
    public int calcIndemnizacionVacaciones(FormularioFiniquito datos){
        
        double salarioVacaciones = this.calcSalarioVacaciones(datos)/30;
        double indemnizacion = this.calcFeriadoLegal(datos) * salarioVacaciones;
        int indemnizacionVacaciones = (int)Math.round(indemnizacion);
        
        return indemnizacionVacaciones;
    }
    
    public int calcIndemnizacionAniosServicio(FormularioFiniquito datos){
        
        long diff = DAYS.between(datos.getFechaInicioTrabajo(), datos.getFechaFinTrabajo());
        int diasTrabajados = (int)(diff);
        int aniosServicio = Math.round(diasTrabajados/365);
        
        int indemnizacionAniosServicio = aniosServicio * this.calcSalarioIndemnizacion(datos);
        
        return indemnizacionAniosServicio;
        
    }
    
    public int calcTotalIndemnizacion(FormularioFiniquito datos){
        
        /*Validar el preaviso*/
        int totalIndemnizacion = this.calcIndemnizacionAniosServicio(datos) + this.calcIndemnizacionVacaciones(datos);
        
        return totalIndemnizacion;
    }
    
    public LocalDate calcFechaPagoFiniquito(FormularioFiniquito datos){
        
        LocalDate fecha = datos.getFechaFinTrabajo();
        int dias = 10;
        
        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek()==DayOfWeek.SATURDAY || date.getDayOfWeek()==DayOfWeek.SUNDAY;
        
        LocalDate fechaFinal = fecha;
        while(dias>0){
            fechaFinal = fechaFinal.plusDays(1);
            if(isWeekend.negate().test(fechaFinal)){
                dias--;
            }
        }
        
        return fechaFinal;
    }
    
    
}
