
package com.ponyseba.finiquitoscalc.view;

import com.ponyseba.finiquitoscalc.controller.FiniquitoCalcController;
import com.ponyseba.finiquitoscalc.controller.FormularioFiniquitoController;
import com.ponyseba.finiquitoscalc.utils.ConstantesCausales;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import model.DatosEntradaMes;
import model.Finiquito;
import model.FormularioFiniquito;
import model.SesionUsuario;

/**
 *
 * @author sebastiankravetz
 */
public class FormFormularioSueldoFijo extends javax.swing.JFrame {

    SesionUsuario sesionUsuario;
    
    HashMap<String, String> listaCausales = ConstantesCausales.causalesHashMap();
    
    public void llenarComboBox() {
        for(Map.Entry causal : listaCausales.entrySet()) {
            this.jComboBox_causalesLista.addItem((String) causal.getValue());
        }
    }
    
    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
    return map.entrySet()
              .stream()
              .filter(entry -> Objects.equals(entry.getValue(), value))
              .map(Map.Entry::getKey)
              .collect(Collectors.toSet());
    }   

    public FormFormularioSueldoFijo(SesionUsuario sesionUsuario) {
        initComponents();
        this.sesionUsuario = sesionUsuario;
        llenarComboBox();
        this.jComboBox_causalesLista.setSelectedItem(ConstantesCausales.PLACEHOLDER_VALUE);
        
    }

    public FormFormularioSueldoFijo() {
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        datePicker_fechaIngresoFijo = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datePicker_fechaEgresoFijo = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_causalesLista = new javax.swing.JComboBox<>();
        jCheckBox_zonaExtremaFijo = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTextField_sueldoBaseFijo = new javax.swing.JTextField();
        jTextField_gratificacionFijo = new javax.swing.JTextField();
        jTextField_bonoImponibleFijo = new javax.swing.JTextField();
        jTextField_colacionFijo = new javax.swing.JTextField();
        jTextField_movilizacionFijo = new javax.swing.JTextField();
        jTextField_chequeRestaurant = new javax.swing.JTextField();
        jTextField_desgasteHerramientas = new javax.swing.JTextField();
        jTextField_viaticosFijo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_diasVacacionesTomados = new javax.swing.JTextPane();
        jButton_limpiarCamposFiniquitoFijo = new javax.swing.JButton();
        jButton_calcularFiniquitoSalarioFijo1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora de Finiquitos: Salario Fijo");
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fechas"));

        jLabel2.setText("Fecha de Ingreso:");

        jLabel3.setText("Seleccione causal de término:");

        jLabel4.setText("Fecha de Egreso:");

        jLabel5.setText("Zona Extrema:");

        jComboBox_causalesLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_causalesListaActionPerformed(evt);
            }
        });

        jCheckBox_zonaExtremaFijo.setText("Sí");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_zonaExtremaFijo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(datePicker_fechaIngresoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datePicker_fechaEgresoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_causalesLista, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePicker_fechaIngresoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePicker_fechaEgresoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox_causalesLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_zonaExtremaFijo)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Salario"));

        jLabel8.setText("Sueldo Base(*):");

        jLabel9.setText("Gratificación:");

        jLabel10.setText("Bono Imponible:");

        jLabel11.setText("Colación:");

        jLabel12.setText("Movilización:");

        jLabel13.setText("Cheque Restaurant:");

        jLabel14.setText("Desgaste de Herramientas");

        jLabel15.setText("Viáticos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_sueldoBaseFijo))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_gratificacionFijo)
                            .addComponent(jTextField_movilizacionFijo)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(290, 295, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_colacionFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_desgasteHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_bonoImponibleFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_chequeRestaurant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addComponent(jTextField_viaticosFijo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_sueldoBaseFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_gratificacionFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_bonoImponibleFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_colacionFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_movilizacionFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_chequeRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_viaticosFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_desgasteHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Vacaciones Disfrutadas"));

        jLabel7.setText("Número de días de vacaciones tomados:");

        jScrollPane1.setViewportView(jTextPane_diasVacacionesTomados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jButton_limpiarCamposFiniquitoFijo.setText("Limpiar todos los campos");
        jButton_limpiarCamposFiniquitoFijo.setBackground(new java.awt.Color(204, 204, 204));
        jButton_limpiarCamposFiniquitoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarCamposFiniquitoFijoActionPerformed(evt);
            }
        });

        jButton_calcularFiniquitoSalarioFijo1.setText("Calcular Finiquito");
        jButton_calcularFiniquitoSalarioFijo1.setBackground(new java.awt.Color(204, 204, 204));
        jButton_calcularFiniquitoSalarioFijo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcularFiniquitoSalarioFijo1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        jMenuItem1.setText("Panel Central");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Calcular Finiquito Salario Variable");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu_salir.setText("Salir");
        jMenu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_salirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_limpiarCamposFiniquitoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(jButton_calcularFiniquitoSalarioFijo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_limpiarCamposFiniquitoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_calcularFiniquitoSalarioFijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_causalesListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_causalesListaActionPerformed
        // TODO add your handling code here:
        String itemName = (String) this.jComboBox_causalesLista.getSelectedItem();
    }//GEN-LAST:event_jComboBox_causalesListaActionPerformed

    private void jButton_limpiarCamposFiniquitoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarCamposFiniquitoFijoActionPerformed
        // TODO add your handling code here:
        this.jTextField_sueldoBaseFijo.setText("");
        this.jTextField_gratificacionFijo.setText("");
        this.jTextField_bonoImponibleFijo.setText("");
        this.jTextField_colacionFijo.setText("");
        this.jTextField_movilizacionFijo.setText("");
        this.jTextField_chequeRestaurant.setText("");
        this.jTextField_desgasteHerramientas.setText("");
        this.jTextField_viaticosFijo.setText("");
        datePicker_fechaIngresoFijo.clear();
        datePicker_fechaEgresoFijo.clear();
        this.jCheckBox_zonaExtremaFijo.setSelected(false);
        jTextPane_diasVacacionesTomados.setText("");
        this.jComboBox_causalesLista.setSelectedItem(ConstantesCausales.PLACEHOLDER_VALUE);
        
    }//GEN-LAST:event_jButton_limpiarCamposFiniquitoFijoActionPerformed

    private void jButton_calcularFiniquitoSalarioFijo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcularFiniquitoSalarioFijo1ActionPerformed
        // TODO add your handling code here:
        int montoSueldoFijo = Integer.parseInt(this.jTextField_sueldoBaseFijo.getText());
        int montoGratificacion = Integer.parseInt(this.jTextField_gratificacionFijo.getText());
        int montoBonoImponible = Integer.parseInt(this.jTextField_bonoImponibleFijo.getText());
        int montoColacion = Integer.parseInt(this.jTextField_colacionFijo.getText());
        int montoMovilizacion = Integer.parseInt(this.jTextField_movilizacionFijo.getText());
        int montoChequeRestaurant = Integer.parseInt(this.jTextField_chequeRestaurant.getText());
        int montoDesgasteHerramientas = Integer.parseInt(this.jTextField_desgasteHerramientas.getText());
        int montoViaticos = Integer.parseInt(this.jTextField_viaticosFijo.getText());
        LocalDate fechaIngresoFijo = datePicker_fechaIngresoFijo.getDate();
        LocalDate fechaEgresoFijo = datePicker_fechaEgresoFijo.getDate();
        boolean esZonaExtrema = this.jCheckBox_zonaExtremaFijo.isEnabled();
        Set<String> causalDespido = FormFormularioSueldoFijo.getKeysByValue(listaCausales, (String) jComboBox_causalesLista.getSelectedItem());
        String artCausalDespido = (String) causalDespido.toArray()[0];
        
        int diasTomadosVacaciones = Integer.parseInt(jTextPane_diasVacacionesTomados.getText());
        
        DatosEntradaMes mesUno = new DatosEntradaMes(montoSueldoFijo, montoGratificacion, montoColacion, montoMovilizacion, montoBonoImponible, montoChequeRestaurant, montoDesgasteHerramientas, montoViaticos);

        FormularioFiniquito formularioFiniquitoSueldoFijo = new FormularioFiniquito(fechaIngresoFijo, fechaEgresoFijo, diasTomadosVacaciones, artCausalDespido, mesUno, true);

        
        
        
        // mandar a llamar todos los métodos que tienen que calcular algo para guardar en el informe
        // guardar el retorno de cada método en una variable
        FormularioFiniquitoController formularioFiniquitoController = new FormularioFiniquitoController();
        
        FiniquitoCalcController finiquitoCalcController = new FiniquitoCalcController();
        
        int salarioIndemnizacion = formularioFiniquitoController.calcSalarioIndemnizacion(formularioFiniquitoSueldoFijo);
        int salarioVacaciones = formularioFiniquitoController.calcSalarioVacaciones(formularioFiniquitoSueldoFijo);
        double feriadoLegal = formularioFiniquitoController.calcFeriadoLegal(formularioFiniquitoSueldoFijo);
        int indemnizacionAniosServicio = formularioFiniquitoController.calcIndemnizacionAniosServicio(formularioFiniquitoSueldoFijo);
        int indemnizacionVacaciones = formularioFiniquitoController.calcIndemnizacionVacaciones(formularioFiniquitoSueldoFijo);
        LocalDate fechaPagoFiniquito = formularioFiniquitoController.calcFechaPagoFiniquito(formularioFiniquitoSueldoFijo);
        int totalIndemnizacion = formularioFiniquitoController.calcTotalIndemnizacion(formularioFiniquitoSueldoFijo);
        
        
        // instanciar Finiquito(informe)
        Finiquito nuevoFiniquito = new Finiquito();
        nuevoFiniquito.setFechaInicioTrabajo(fechaIngresoFijo);
        nuevoFiniquito.setFechaFinTrabajo(fechaEgresoFijo);
        
        String diasTrabajados = finiquitoCalcController.tiempoTrabajado(nuevoFiniquito);
        nuevoFiniquito.setMesesTrabajadosTotal(diasTrabajados);
        
        nuevoFiniquito.setSalarioIndemnizacion(salarioIndemnizacion);
        nuevoFiniquito.setSalarioVacaciones(salarioVacaciones);
        nuevoFiniquito.setFeriadoLegalHabil(feriadoLegal);
        nuevoFiniquito.setIndeminizacionAniosServicio(indemnizacionAniosServicio);
        nuevoFiniquito.setIndemnizacionVacaciones(indemnizacionVacaciones);
        nuevoFiniquito.setFechaPagoFiniquito(fechaPagoFiniquito);
        nuevoFiniquito.setTotalIndemnizacion(totalIndemnizacion);
        if(sesionUsuario.isSesionValida()){
            nuevoFiniquito.setIdUsuario(sesionUsuario.getUsuarioLogueado().getIdUsuario());
        }
        
        FormInformeFiniquito formInformeFinal = new FormInformeFiniquito(nuevoFiniquito, sesionUsuario);
        formInformeFinal.setVisible(true);
        formInformeFinal.setAlwaysOnTop(true);
        dispose();
        
        
        // guardar las variables con setters al finiquito
    }//GEN-LAST:event_jButton_calcularFiniquitoSalarioFijo1ActionPerformed

    private void jMenu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_salirActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jMenu_salirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FormPanelCentral formPanelCentral = new FormPanelCentral(sesionUsuario);
        formPanelCentral.setVisible(true);
        formPanelCentral.setAlwaysOnTop(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        FormFormularioSueldoVariable formFormularioSueldoVariable = new FormFormularioSueldoVariable();
        formFormularioSueldoVariable.setVisible(true);
        formFormularioSueldoVariable.setAlwaysOnTop(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPanelCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPanelCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPanelCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPanelCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFormularioSueldoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker_fechaEgresoFijo;
    private com.github.lgooddatepicker.components.DatePicker datePicker_fechaIngresoFijo;
    private javax.swing.JButton jButton_calcularFiniquitoSalarioFijo1;
    private javax.swing.JButton jButton_limpiarCamposFiniquitoFijo;
    private javax.swing.JCheckBox jCheckBox_zonaExtremaFijo;
    private javax.swing.JComboBox<String> jComboBox_causalesLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenu_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_bonoImponibleFijo;
    private javax.swing.JTextField jTextField_chequeRestaurant;
    private javax.swing.JTextField jTextField_colacionFijo;
    private javax.swing.JTextField jTextField_desgasteHerramientas;
    private javax.swing.JTextField jTextField_gratificacionFijo;
    private javax.swing.JTextField jTextField_movilizacionFijo;
    private javax.swing.JTextField jTextField_sueldoBaseFijo;
    private javax.swing.JTextField jTextField_viaticosFijo;
    private javax.swing.JTextPane jTextPane_diasVacacionesTomados;
    // End of variables declaration//GEN-END:variables
}
