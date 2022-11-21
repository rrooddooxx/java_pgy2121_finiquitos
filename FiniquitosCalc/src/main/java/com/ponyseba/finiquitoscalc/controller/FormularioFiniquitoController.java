/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import java.util.Date;
import model.DatosEntradaMes;
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
    
    public int calcFeriadoLegal(FormularioFiniquito datos){
        
        long diff = datos.getFechaFinTrabajo().getTime() - datos.getFechaInicioTrabajo().getTime();
        int diasTrabajados = (int)(diff/1000/60/60/24);
        int diasVacacionesCorrespondientes = (diasTrabajados/365)*15;
        int feriadoLegal = diasVacacionesCorrespondientes - datos.getDiasTomadosVacaciones();
        
        return feriadoLegal;       
        
    }
    
    public int calcIndemnizacionVacaciones(FormularioFiniquito datos){
        
        int indemnizacionVacaciones = this.calcFeriadoLegal(datos) * this.calcSalarioVacaciones(datos);
        
        return indemnizacionVacaciones;
    }
    
    public int calcIndemnizacionAniosServicio(FormularioFiniquito datos){
        
        long diff = datos.getFechaFinTrabajo().getTime() - datos.getFechaInicioTrabajo().getTime();
        int diasTrabajados = (int)(diff/1000/60/60/24);
        int aniosServicio = Math.round(diasTrabajados/365);
        
        int indemnizacionAniosServicio = aniosServicio * this.calcSalarioIndemnizacion(datos);
        
        return indemnizacionAniosServicio;
        
    }
    
    public int calcTotalIndemnizacion(FormularioFiniquito datos){
        
        /*Validar el preaviso*/
        int totalIndemnizacion = this.calcIndemnizacionAniosServicio(datos) + this.calcIndemnizacionVacaciones(datos);
        
        return totalIndemnizacion;
    }
    
}
