/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Finiquito;
import org.jxls.template.SimpleExporter;

/**
 *
 * @author sebastiankravetz
 */
public class ExcelController {
    
    public void generarFiniquitoXls(Finiquito finiquito) throws IOException{
          
        try(OutputStream os1 = new FileOutputStream("target/informe_finiquito_individual.xls")) {
        List<Finiquito> finiquitos = new ArrayList<>();
        finiquitos.add(finiquito);
        List<String> headers = Arrays.asList("Nombre del Trabajador/a", "Fecha Inicio Trabajo", "Fecha Fin Trabajo", "Tiempo Total Trabajado", "Fecha Pago Finiquito","Salario Indemnizacion", "Salario Vacaciones", "Feriado Legal Habil", "Indemnización por Años de Servicio", "Indemnización por Vacaciones", "Total Indemnizacion");
         SimpleExporter exporter = new SimpleExporter();
        exporter.gridExport(headers, finiquitos, "nombreTrabajador, fechaInicioTrabajo, fechaFinTrabajo, mesesTrabajadosTotal, fechaPagoFiniquito, salarioIndemnizacion, salarioVacaciones, feriadoLegalHabil, indeminizacionAniosServicio, indemnizacionVacaciones, totalIndemnizacion", os1);

//        // now let's show how to register custom template
//        try (InputStream is = SimpleExporter.class.getResourceAsStream(template)) {
//            try (OutputStream os2 = new FileOutputStream("target/simple_export_output2.xlsx")) {
//                exporter.registerGridTemplate(is);
//                headers = Arrays.asList("Name", "Payment", "Birth Date");
//                exporter.gridExport(headers, employees, "name,payment, birthDate,", os2);
//            }
//        }
    }
    };
        
        public void generarFiniquitosXls(List<Finiquito> listaFiniquitos) throws IOException{
          
        try(OutputStream os1 = new FileOutputStream("target/reporte_lista_finiquitos.xls")) {
        List<Finiquito> finiquitos = listaFiniquitos;
        List<String> headers = Arrays.asList("Nombre del Trabajador/a", "Tiempo Total Trabajado", "Feriado Legal Habil", "Indemnización por Años de Servicio", "Indemnización por Vacaciones", "Total Indemnizacion");
         SimpleExporter exporter = new SimpleExporter();
        exporter.gridExport(headers, finiquitos, "nombreTrabajador, mesesTrabajadosTotal, feriadoLegalHabil, indeminizacionAniosServicio, indemnizacionVacaciones, totalIndemnizacion", os1);

//        // now let's show how to register custom template
//        try (InputStream is = SimpleExporter.class.getResourceAsStream(template)) {
//            try (OutputStream os2 = new FileOutputStream("target/simple_export_output2.xlsx")) {
//                exporter.registerGridTemplate(is);
//                headers = Arrays.asList("Name", "Payment", "Birth Date");
//                exporter.gridExport(headers, employees, "name,payment, birthDate,", os2);
//            }
//        }
    }

        
        
    }
    
}
