package org.ponyseba.controller;

import org.ponyseba.database.MySQLConnection;
import org.ponyseba.model.Finiquito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FiniquitoController {

    public List<Finiquito> listarFiniquito(){
        List<Finiquito> listaFiniquitos = new ArrayList<>();
        try{

            MySQLConnection cnt = new MySQLConnection();

            Connection cnx = cnt.createConnection();

            String query = "SELECT * FROM Finiquitos";

            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Finiquito finiquito = new Finiquito();
                finiquito.setNombre(rs.getString("nombre"));
                listaFiniquitos.add(finiquito);
            }

            stmt.close();
            cnx.close();

        } catch(SQLException e){
            System.out.println("Error en ejecución de query Listar Finiquitos");
            System.out.println(e.getMessage());
        }

        return listaFiniquitos;
    }

}
