/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import ch.qos.logback.core.Context;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Finiquito;
import org.jxls.util.JxlsHelper;

/**
 *
 * @author sebastiankravetz
 */
public class ExcelController {
    
    public void generarArchivoXls(Finiquito finiquito){
           List<Finiquito> listaFiniquitos = new ArrayList<>();
           listaFiniquitos.add(finiquito)
    try(InputStream is = ObjectCollectionDemo.class.getResourceAsStream("object_collection_template.xls")) {
        try (OutputStream os = new FileOutputStream("target/object_collection_output.xls")) {
            Context context = new Context();
            context.putVar("employees", employees);
            JxlsHelper.getInstance().processTemplate(is, os, context);
        }
    }
    }
    
}
