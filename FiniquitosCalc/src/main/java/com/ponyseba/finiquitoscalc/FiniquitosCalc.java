package com.ponyseba.finiquitoscalc;

import com.ponyseba.finiquitoscalc.controller.FiniquitoCalcController;
import com.ponyseba.finiquitoscalc.controller.UsuarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.PasswordView;
import model.Finiquito;
import model.Usuario;

/**
 *
 * @author sebastiankravetz
 */
public class FiniquitosCalc {

    public static void main(String[] args) throws SQLException{
        // todo: call methods from controller and test to console
        
        UsuarioController usuarioController = new UsuarioController();
        
        List<Usuario> listaUsuarios = usuarioController.listarUsuarios();
        
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        }
        
        
        // listar finiquitos
        FiniquitoCalcController finiquitoCalcController = new FiniquitoCalcController();
        List<Finiquito> listaFiniquitos = new ArrayList<>();
        listaFiniquitos = finiquitoCalcController.listarFiniquitos();
       
        for (Finiquito finiquito : listaFiniquitos) {
            System.out.println(finiquito.toString());
               
        }
       
    }
}
