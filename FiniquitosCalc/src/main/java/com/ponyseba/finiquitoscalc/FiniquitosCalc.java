package com.ponyseba.finiquitoscalc;

import com.ponyseba.finiquitoscalc.controller.FiniquitoCalcController;
import com.ponyseba.finiquitoscalc.controller.FormularioFiniquitoController;
import com.ponyseba.finiquitoscalc.controller.UsuarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.text.PasswordView;
import model.DatosEntradaMes;
import model.Finiquito;
import model.FormularioFiniquito;
import model.Usuario;

/**
 *
 * @author sebastiankravetz
 */
public class FiniquitosCalc {

    public static void main(String[] args) throws SQLException{
        // todo: call methods from controller and test to console
        
        FormularioFiniquito form = new FormularioFiniquito();
        Date fecha1 = new Date(2022,11,20);
        Date fecha2 = new Date(2022,11,10);
        form.setFechaFinTrabajo(fecha1);
        form.setFechaInicioTrabajo(fecha2);
        
        FormularioFiniquitoController ffc = new FormularioFiniquitoController();
        int dias = ffc.calcFeriadoLegal(form);
        System.out.println(dias);
        
        
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
