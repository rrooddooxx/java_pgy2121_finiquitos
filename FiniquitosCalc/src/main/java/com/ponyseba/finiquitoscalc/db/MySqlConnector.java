/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebastiankravetz
 */
public class MySqlConnector {
    

    public Connection createConnection() {

        Connection cnx = null;
        
        try{
            cnx = DriverManager.getConnection("jdbc:mysql://ls-11bc3631fabc4bd53a9f7fc0d59e70b6d17b7a38.cffay8eryyqs.us-west-2.rds.amazonaws.com:3306/dbmaster",
                    "dbmasteruser", "J$_ey8#ovM[h{E=eTG,Akg(a^U8af5L5");
            System.out.println("Conexión establecida a la base de datos.");
        }catch(SQLException e) {
            System.out.println("Error al conectar a la base de datos "+e.getMessage() );
        }
        
        return cnx;
    }
    
    
    
}
