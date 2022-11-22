/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ponyseba.finiquitoscalc.utils;

import java.util.HashMap;

/**
 *
 * @author sebastiankravetz
 */
public class ConstantesCausales {
    
   public static final String ART159N1_VALUE = "Art.169 num.1: Acuerdo entre las partes de ponerle término.";
   public static final String ART159N1_KEY = "169_1";
   public static final String ART159N2_VALUE = "Art.159 num.2: Renuncia del trabajador.";
   public static final String ART159N2_KEY = "159_2";
   public static final String ART159N3_VALUE = "Art.159 num.3: Muerte del trabajador.";
   public static final String ART159N3_KEY = "159_3";
   public static final String ART159N4_VALUE = "Art.159 num.4: Vencimiento del plazo del contrato.";
   public static final String ART159N4_KEY = "159_4";
   public static final String ART159N5_VALUE = "Art.159 num.5: Término del trabajo acordado.";
   public static final String ART159N5_KEY = "159_5";
   public static final String ART159N6_VALUE = "Art.159 num.6: Caso fortuito o fuerza mayor.";
   public static final String ART159N6_KEY = "159_6";
   public static final String ART160N1_VALUE = "Art.160 num.1: Conductas indebidas y graves del trabajador.";
   public static final String ART160N1_KEY = "160_1";
   public static final String ART160N2_VALUE = "Art.160 num.2: Realizar actividades prohibidas en el contrato de trabajo.";
   public static final String ART160N2_KEY = "160_2";
   public static final String ART160N3_VALUE = "Art.160 num.3: Inasistencia injustificada.";
   public static final String ART160N3_KEY = "160_3";
   public static final String ART160N4_VALUE = "Art.160 num.4: Abandono del trabajo.";
   public static final String ART160N4_KEY = "160_4";
   public static final String ART160N5_VALUE = "Art.160 num.5: Actos, omisiones o imprudencias temerarias que afecten a la seguridad o al funcionamiento del establecimiento, a la seguridad o a la actividad de los trabajadores, o a la salud de éstos.";
   public static final String ART160N5_KEY = "160_5";
   public static final String ART160N6_VALUE = "Art.160 num.6: El perjuicio material causado intencionalmente en las instalaciones, maquinarias, herramientas, útiles de trabajo, productos o mercaderías.";
   public static final String ART160N6_KEY = "160_6";
   public static final String ART160N7_VALUE = "Art.160 num.7: Incumplimiento grave de las obligaciones que impone el contrato.";
   public static final String ART160N7_KEY = "160_7";
   public static final String ART161N1_VALUE = "Art.161 num.1: Necesidades de la empresa, establecimiento o servicio.";
   public static final String ART161N1_KEY = "161_1";
   public static final String ART161N2_VALUE = "Art.161 num.2: Desahucio escrito del empleador.";
   public static final String ART161N2_KEY = "161_2";
   public static final String ART163BIS_VALUE = "Art.163 bis: Por haber sido sometido el empleador, mediante resolución judicial, a un procedimiento concursal de liquidación de sus bienes.";
   public static final String ART163BIS_KEY = "163_bis";
   public static final String ART171N1_VALUE = "Art.171 num.1: Autodespido por Incumplimiento grave de las obligaciones del empleador.";
   public static final String ART171N1_KEY = "171_1";
   public static final String ART171N2_VALUE = "Art.171 num.2: Autodespido por otras causales distintas al Incumplimiento grave de las obligaciones del empleador.";
   public static final String ART171N2_KEY = "171_2";
   public static final String PLACEHOLDER_VALUE = "Seleccione causal de despido";
   public static final String PLACEHOLDER_KEY = "00_0";

    public ConstantesCausales() {
    }
   
   

   public static HashMap<String, String> causalesHashMap() {
       HashMap<String, String> mapCausales = new HashMap<>();
       mapCausales.put(ConstantesCausales.ART159N1_KEY, ConstantesCausales.ART159N1_VALUE);
       mapCausales.put(ConstantesCausales.ART159N2_KEY, ConstantesCausales.ART159N2_VALUE);
       mapCausales.put(ConstantesCausales.ART159N3_KEY, ConstantesCausales.ART159N3_VALUE);
       mapCausales.put(ConstantesCausales.ART159N4_KEY, ConstantesCausales.ART159N4_VALUE);
       mapCausales.put(ConstantesCausales.ART159N5_KEY, ConstantesCausales.ART159N5_VALUE);
       mapCausales.put(ConstantesCausales.ART159N6_KEY, ConstantesCausales.ART159N6_VALUE);
       mapCausales.put(ConstantesCausales.ART160N1_KEY, ConstantesCausales.ART160N1_VALUE);
       mapCausales.put(ConstantesCausales.ART160N2_KEY, ConstantesCausales.ART160N2_VALUE);
       mapCausales.put(ConstantesCausales.ART160N3_KEY, ConstantesCausales.ART160N3_VALUE);
       mapCausales.put(ConstantesCausales.ART160N4_KEY, ConstantesCausales.ART160N4_VALUE);
       mapCausales.put(ConstantesCausales.ART160N5_KEY, ConstantesCausales.ART160N5_VALUE);
       mapCausales.put(ConstantesCausales.ART160N6_KEY, ConstantesCausales.ART160N6_VALUE);
       mapCausales.put(ConstantesCausales.ART160N7_KEY, ConstantesCausales.ART160N7_VALUE);
       mapCausales.put(ConstantesCausales.ART161N1_KEY, ConstantesCausales.ART161N1_VALUE);
       mapCausales.put(ConstantesCausales.ART161N2_KEY, ConstantesCausales.ART161N2_VALUE);
       mapCausales.put(ConstantesCausales.ART163BIS_KEY, ConstantesCausales.ART163BIS_VALUE);
       mapCausales.put(ConstantesCausales.ART171N1_KEY, ConstantesCausales.ART171N1_VALUE);
       mapCausales.put(ConstantesCausales.ART171N2_KEY, ConstantesCausales.ART171N2_VALUE);
       mapCausales.put(ConstantesCausales.PLACEHOLDER_KEY, ConstantesCausales.PLACEHOLDER_VALUE);

       return mapCausales;
   }
    
}
