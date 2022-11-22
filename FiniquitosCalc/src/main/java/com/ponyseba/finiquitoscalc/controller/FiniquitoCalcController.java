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
import java.sql.Date;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;
import model.Finiquito;
import model.SesionUsuario;

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
                finiquito.setMesesTrabajadosTotal(rs.getString("meses_trabajados_total"));
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
    
    public boolean crearFiniquito(Finiquito nuevoFiniquto){
        
        boolean returnFlag = false;
        
        try{

            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "INSERT INTO Finiquito (fecha_ini, fecha_fin, meses_trabajados_total, fecha_pago_finiquito, monto_salario_indemnizacion, monto_salario_vacaciones, dias_feriado_legal, indem_anios_servicio, indem_vacaciones, id_usuario, id_empresa, totalIndemnizacion, nombre_trabajador) VALUES (?,?,?,?,?,?,?,?,?,?,?,?, ?)";

            PreparedStatement stmt = bdconnect.prepareStatement(query);
            stmt.setDate(1, Date.valueOf(nuevoFiniquto.getFechaInicioTrabajo()));
            stmt.setDate(2, Date.valueOf(nuevoFiniquto.getFechaFinTrabajo()));
            stmt.setString(3, nuevoFiniquto.getMesesTrabajadosTotal());
            stmt.setDate(4, Date.valueOf(nuevoFiniquto.getFechaPagoFiniquito()));
            stmt.setInt(5, nuevoFiniquto.getSalarioIndemnizacion());
            stmt.setInt(6, nuevoFiniquto.getSalarioVacaciones());
            stmt.setDouble(7, nuevoFiniquto.getFeriadoLegalHabil());
            stmt.setInt(8, nuevoFiniquto.getIndeminizacionAniosServicio());
            stmt.setInt(9, nuevoFiniquto.getIndemnizacionVacaciones());
            stmt.setInt(10, nuevoFiniquto.getIdUsuario());
            stmt.setInt(11, 1);
            stmt.setInt(12, nuevoFiniquto.getTotalIndemnizacion());
            stmt.setString(13, nuevoFiniquto.getNombreTrabajador());
            
            int esEjecutadaCorrectamente = stmt.executeUpdate();
            
            if(esEjecutadaCorrectamente > 0) {
                returnFlag = true;
            } 

            stmt.close();
            bdconnect.close();
            
           

        } catch(SQLException e){
            System.out.println("Error en ejecución de query crear Finiquitos");
            System.out.println(e.getMessage());
            returnFlag = false;
        }

        return returnFlag;
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
