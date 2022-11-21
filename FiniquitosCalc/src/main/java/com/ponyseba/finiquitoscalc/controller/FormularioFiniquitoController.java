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
    
    /*Método que calcula el Salario para Indemnización de un mes. En el caso de los salarios fijos, este será un
    resultado estable. En el caso de los salarios variables habrá que utilizar este método en los 3 últimos meses
    de salario del trabajador y tomar un promedio. Los valores que no se toman en cada uno de los casos siempre estarán
    inicializados como 0, por lo que no habría problema.
    */
    public int calcSalarioIndemnizacion(DatosEntradaMes datos){
        
        int salarioIndemnizacion = datos.getSueldoBase()+datos.getGratificacion()+datos.getColacion()
                +datos.getBonoImponible()+datos.getMovilizacion()+datos.getSemanaCorrida()+datos.getComision();
        
        return salarioIndemnizacion;
    }
    
    /*Método que calcula el Salario para Vacaciones de un mes. En el caso de los salarios fijos, este será un
    resultado estable. En el caso de los salarios variables habrá que utilizar este método en los 3 últimos meses
    de salario del trabajador y tomar un promedio.
    */
    public int calcSalarioVacaciones(DatosEntradaMes datos){
        
        int salarioVacaciones = datos.getSueldoBase()+datos.getGratificacion()+datos.getComision();
        
        return salarioVacaciones;
    }
    
    public int calcFeriadoLegal(FormularioFiniquito datos){
        
        long diff = datos.getFechaFinTrabajo().getTime() - datos.getFechaInicioTrabajo().getTime();
        int diasTrabajados = (int)(diff/1000/60/60/24);
        
        return diasTrabajados;
        
    }
    
}
