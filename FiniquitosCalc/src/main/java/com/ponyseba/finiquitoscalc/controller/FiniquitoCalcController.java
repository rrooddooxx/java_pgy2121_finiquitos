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
import model.Finiquito;

/**
 *
 * @author sebastiankravetz
 */
public class FiniquitoCalcController {
    

    public List<Finiquito> listarFiniquitos(){
        List<Finiquito> listaFiniquitos = new ArrayList<>();
        try{

            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "SELECT * FROM Finiquito";

            PreparedStatement stmt = bdconnect.prepareStatement(query);

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
                listaFiniquitos.add(finiquito);
            }

            stmt.close();
            bdconnect.close();

        } catch(SQLException e){
            System.out.println("Error en ejecución de query Listar Finiquitos");
            System.out.println(e.getMessage());
        }

        return listaFiniquitos;
    }
    
    public List<Finiquito> listarFiniquitosPorIdUsuario(int userId) {
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
        }
    
    
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

       
    
}
