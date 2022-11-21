/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.controller;

import com.ponyseba.finiquitoscalc.db.MySqlConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

/**
 *
 * @author sebastiankravetz
 */
public class SesionController {
    
    private Usuario usuario = new Usuario();
    private boolean estaLogueado = false;
    
    public boolean iniciarSesion() {
        //
        
        String email, password = "";
        
        boolean esValido = this.validarUsuario(email, password);
        
        Usuario usuarioLogueado = UsuarioController.obtenerUsuario(id);
        usuario = usuarioLogueado;
        return false;
    }
    
    public static boolean cerrarSesion() {
        //
        return false;
    }
    
    public static int obtenerUsuario(){
        
    }
    
    private boolean validarUsuario (String email, String password){
        // se llama a la bbdd para validar el usuario...
        // retorna true ó false
        
        boolean usuarioValido = false;
        
        try {
            
            MySqlConnector connector = new MySqlConnector();
            Connection bdconnect = connector.createConnection();

            String query = "SELECT id_usuario, email, password FROM Usuario WHERE email=?";
        
            PreparedStatement stmt = bdconnect.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            
            rs.next() ? "d" : "f";
            
            if () {
                
            }
            
        } catch (Exception e) {
        }
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
