package com.ponyseba.finiquitoscalc.controller;

import com.ponyseba.finiquitoscalc.db.MySqlConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author sebastiankravetz
 */
public class UsuarioController {
    
    public List<Usuario> listarUsuarios() {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
    
        try {
                
        MySqlConnector connector = new MySqlConnector();
        Connection bdconnect = connector.createConnection();
        
        PreparedStatement stmt = bdconnect.prepareStatement("SELECT * FROM Usuario");
        ResultSet rs = stmt.executeQuery();
        
        
            while (rs.next()) {
               Usuario usuario = new Usuario();
               usuario.setIdUsuario(rs.getInt("id_usuario"));
               usuario.setEmail(rs.getString("email"));
               usuario.setPassword(rs.getString("password"));
               listaUsuarios.add(usuario);
            }
            
          if(listaUsuarios.size() == 0){
              System.out.println("No hay resultados en la tabla Usuario");
          }
            
        rs.close();
        stmt.close();
            
        } catch (Exception e) {
            System.out.println("Error trayendo lista usuarios");
            System.out.println(e.getMessage());
        }
        
        return listaUsuarios;
         
    }
   
    
    public void crearUsuario() {
        //
    }
    
    public void borrarUsuario() {
        
    }

}
