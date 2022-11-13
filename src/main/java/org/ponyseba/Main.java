package org.ponyseba;

import org.ponyseba.controller.FiniquitoController;
import org.ponyseba.model.Finiquito;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FiniquitoController finiquitoController = new FiniquitoController();
        List<Finiquito> listaFiniquitos = finiquitoController.listarFiniquito();

        for (Finiquito finiquito : listaFiniquitos
             ) {
            StringBuilder str = new StringBuilder().append("Finiquito: \n").append("Id: ").append(finiquito.getId()).append("\nNombre: ").append(finiquito.getNombre());
            System.out.println(str);
        }

    }
}