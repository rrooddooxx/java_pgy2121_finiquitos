/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ponyseba.finiquitoscalc.db.MySqlConnector;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;
import model.Empresa;
import model.Finiquito;
import model.FormularioFiniquito;

/**
 *
 * @author sebastiankravetz
 */
public class FiniquitoCalcController {
    

    // todo: un usuario admin sólo debe ver los finiquitos creados por el mismo usuario admin.
    public List<Finiquito> listarFiniquitos(){
        List<Finiquito> listaFiniquitos = new ArrayList<>();
        try{

            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "SELECT f.id_finiquito, f.fecha_ini, f.fecha_fin, f.meses_trabajados_total, f.fecha_pago_finiquito, f.monto_salario_indemnizacion, f.monto_salario_vacaciones, f.dias_feriado_legal, f.indem_anios_servicio, f.indem_vacaciones, f.id_usuario, e.nombre  FROM Finiquito f JOIN Empresa e ON f.id_empresa=e.id_empresa";

            PreparedStatement stmt = bdconnect.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
       
            while(rs.next()){
                Finiquito finiquito = new Finiquito();
                finiquito.setFechaInicioTrabajo(rs.getDate("fecha_ini").toLocalDate());
                finiquito.setFechaFinTrabajo(rs.getDate("fecha_fin").toLocalDate());
                finiquito.setMesesTrabajadosTotal(rs.getInt("meses_trabajados_total"));
                finiquito.setFechaPagoFiniquito(rs.getDate("fecha_pago_finiquito").toLocalDate());
                finiquito.setSalarioIndemnizacion(rs.getInt("monto_salario_indemnizacion"));
                finiquito.setSalarioVacaciones(rs.getInt("monto_salario_vacaciones"));
                finiquito.setFeriadoLegalHabil(rs.getInt("dias_feriado_legal"));
                finiquito.setIndeminizacionAniosServicio(rs.getInt("indem_anios_servicio"));
                finiquito.setIndemnizacionVacaciones(rs.getInt("indem_vacaciones"));
                finiquito.setNombreEmpresa(rs.getString("nombre"));
                listaFiniquitos.add(finiquito);
            }

            stmt.close();
            bdconnect.close();
            
            if(listaFiniquitos.size() == 0) {
                System.out.println("Lista finiquitos no retornó registros");
            }

        } catch(SQLException e){
            System.out.println("Error en ejecución de query Listar Finiquitos");
            System.out.println(e.getMessage());
        }

        return listaFiniquitos;
    }
    
    
    /*public List<Finiquito> listarFiniquitosPorIdUsuario(int rutTrabajador) {
        List<Finiquito> listaFiniquitosPorId = new ArrayList<>();
        try{

            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "SELECT * FROM Finiquito WHERE id_usuario = ?";

            PreparedStatement stmt = bdconnect.prepareStatement(query);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                Finiquito finiquito = new Finiquito();
                finiquito.setFechaInicioTrabajo(rs.getDate("fecha_ini"));
                finiquito.setFechaFinTrabajo(rs.getDate("fecha_fin"));
                finiquito.setMesesTrabajadosTotal(rs.getInt("meses_trabajados_total"));
                finiquito.setFechaPagoFiniquito(rs.getDate("fecha_pago_finiquito"));
                finiquito.setSalarioIndemnizacion(rs.getInt("monto_salario_indemnizacion"));
                finiquito.setSalarioVacaciones(rs.getInt("monto_salario_vacaciones"));
                finiquito.setFeriadoLegalHabil(rs.getInt("dias_feriado_legal"));
                finiquito.setIndeminizacionAniosServicio(rs.getInt("indem_anios_servicio"));
                finiquito.setIndemnizacionVacaciones(rs.getInt("indem_vacaciones"));
                listaFiniquitosPorId.add(finiquito);
            }

            stmt.close();
            bdconnect.close();

        } catch(SQLException e){
            System.out.println("Error en ejecución de query Listar Finiquitos por Id");
            System.out.println(e.getMessage());
        }

        return listaFiniquitosPorId;
        }*/
    
    
    public void editarFiniquito() {
        //
    }
    
    public boolean borrarFiniquitoPorIdFiniquito(int idFiniquito) {
            try{

                MySqlConnector connector = new MySqlConnector();

                Connection bdconnect = connector.createConnection();

                String query = "DELETE * FROM Finiquito WHERE id_finiquito = ?";

                PreparedStatement stmt = bdconnect.prepareStatement(query);
                stmt.setInt(1, idFiniquito);
                stmt.executeQuery();

                stmt.close();
                bdconnect.close();

            } catch(SQLException e){
                System.out.println("Error en ejecución de query Borrar Finiquito por Id");
                System.out.println(e.getMessage());
                return false;
            }

            return true;
        }
    
    public String tiempoTrabajado(Finiquito datos){
        long aniosTrabajados = YEARS.between(datos.getFechaInicioTrabajo(), datos.getFechaFinTrabajo());
        int aniosTotal = (int)aniosTrabajados;
        String aniosFrase = "";
        if(aniosTotal==1){
            aniosFrase = " año, ";
        }else{
            aniosFrase = " años, ";
        }
        
        long mesesTrabajados = MONTHS.between(datos.getFechaInicioTrabajo(),datos.getFechaFinTrabajo());
        int mesesTotal = (int)mesesTrabajados - ((int)aniosTrabajados*12);
        String mesesFrase = "";
        if(mesesTotal==1){
            mesesFrase = " mes, ";
        }else{
            mesesFrase = " meses, ";
        }
        
        long diasTrabajados = DAYS.between(datos.getFechaInicioTrabajo(), datos.getFechaFinTrabajo());
        int diasTotal = (int)diasTrabajados - (((int)mesesTrabajados*30)+((int)aniosTrabajados*5));
        String diasFrase = "";
        if(diasTotal==1){
            diasFrase = " día";
        }else{
            diasFrase = " días";
        }
        
        String fraseFinal = aniosTotal + aniosFrase + mesesTotal + mesesFrase + diasTotal + diasFrase;
        
        return fraseFinal;
        
    }

    
       
    
}
