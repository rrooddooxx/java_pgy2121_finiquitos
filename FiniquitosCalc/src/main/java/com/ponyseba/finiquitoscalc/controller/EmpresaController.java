/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import com.ponyseba.finiquitoscalc.db.MySqlConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;

/**
 *
 * @author ponyta
 */
public class EmpresaController {
    
    public List<Empresa> listarEmpresasPorIdUsuario(int idUsuario){
        List<Empresa> listaEmpresas = new ArrayList<>();
        
        try{
            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "SELECT e.id_empresa, e.nombre FROM Empresa e JOIN Finiquito f ON f.id_empresa = e.id_empresa AND f.id_usuario = ? GROUP BY e.id_empresa ORDER BY e.nombre;";

            PreparedStatement stmt = bdconnect.prepareStatement(query);
            
            stmt.setInt(1, idUsuario);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Empresa empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("id_empresa"));
                empresa.setNombre(rs.getString("nombre"));

                listaEmpresas.add(empresa);
            }

            stmt.close();
            bdconnect.close();
        }catch(SQLException e){
            System.out.println("Error en ejecución de query Listar Empresas");
            System.out.println(e.getMessage());
        }
        
        return listaEmpresas;           
        
        
    }
}
