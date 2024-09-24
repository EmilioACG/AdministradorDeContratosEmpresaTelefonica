/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package vistas;

import com.mycompany.administradordecontratosempresatelefonica.Clases.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;

public class MenuPlan extends javax.swing.JFrame {
    
    private static ArrayList<Cliente> clientesList;
    private static HashMap<Integer,Cliente> clientesMap;
    private static HashMap<String, Cliente> telefonosMap;

    public MenuPlan(ArrayList<Cliente> clientesList, HashMap<Integer,Cliente> clientesMap, 
              HashMap<String, Cliente> telefonosMap) {
        MenuPlan.clientesList = clientesList;
        MenuPlan.clientesMap = clientesMap;
        MenuPlan.telefonosMap = telefonosMap;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jlbTituloPlanes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpValidarRut = new javax.swing.JTextPane();
        jlbTituloOpciones = new javax.swing.JLabel();
        btnAgregarPlan = new javax.swing.JButton();
        btnMostrarPlanes = new javax.swing.JButton();
        btnEliminarPlan = new javax.swing.JButton();
        btnEliminarPlanes = new javax.swing.JButton();
        btnBuscarRutValido = new javax.swing.JButton();
        jlbValidacionRut = new javax.swing.JLabel();
        jpnlPanelesOpciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(824, 600));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jlbTituloPlanes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbTituloPlanes.setText("Ingrese el rut del cliente a operar :");

        jScrollPane1.setToolTipText("sin guion, digito verificiador ni puntos");
        jScrollPane1.setViewportView(txtpValidarRut);

        jlbTituloOpciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbTituloOpciones.setText("Opciones planes:");

        btnAgregarPlan.setText("1.- Agregar un plan");
        btnAgregarPlan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlanActionPerformed(evt);
            }
        });

        btnMostrarPlanes.setText("2.- Mostrar planes");
        btnMostrarPlanes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEliminarPlan.setText("3.- Eliminar un plan");
        btnEliminarPlan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnEliminarPlanes.setText("4.- Eliminar todos los planes");
        btnEliminarPlanes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnBuscarRutValido.setText("Buscar...");
        btnBuscarRutValido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutValidoActionPerformed(evt);
            }
        });

        jlbValidacionRut.setText("Ingrese un rut sin puntos, ni guion ni digito verificador");

        jpnlPanelesOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPanelesOpciones.setToolTipText("");

        javax.swing.GroupLayout jpnlPanelesOpcionesLayout = new javax.swing.GroupLayout(jpnlPanelesOpciones);
        jpnlPanelesOpciones.setLayout(jpnlPanelesOpcionesLayout);
        jpnlPanelesOpcionesLayout.setHorizontalGroup(
            jpnlPanelesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jpnlPanelesOpcionesLayout.setVerticalGroup(
            jpnlPanelesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTituloPlanes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBuscarRutValido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbValidacionRut))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbTituloOpciones)
                            .addComponent(btnAgregarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPlanes))))
                .addGap(18, 18, 18)
                .addComponent(jpnlPanelesOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbTituloPlanes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRutValido)
                    .addComponent(jlbValidacionRut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTituloOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarPlan)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarPlanes)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPlan)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPlanes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(44, 44, 44))
            .addComponent(jpnlPanelesOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuGeneral vv = new MenuGeneral(clientesList, clientesMap, telefonosMap);
        
        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarRutValidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutValidoActionPerformed
        int validarRut;
        validarRut = Integer.parseInt(txtpValidarRut.getText());
        
        if(clientesMap.get(validarRut) == null){
            jlbValidacionRut.setText("Rut encontrado");
            jlbValidacionRut.setForeground(Color.GREEN);
            btnAgregarPlan.setVisible(true);
        }
        else{
            jlbValidacionRut.setText("Rut no encontrado");
            jlbValidacionRut.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnBuscarRutValidoActionPerformed

    private void btnAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPlanActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPlan(clientesList,clientesMap,telefonosMap).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPlan;
    private javax.swing.JButton btnBuscarRutValido;
    private javax.swing.JButton btnEliminarPlan;
    private javax.swing.JButton btnEliminarPlanes;
    private javax.swing.JButton btnMostrarPlanes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTituloOpciones;
    private javax.swing.JLabel jlbTituloPlanes;
    private javax.swing.JLabel jlbValidacionRut;
    private javax.swing.JPanel jpnlPanelesOpciones;
    private javax.swing.JTextPane txtpValidarRut;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnBuscarRutValido(){
        return btnBuscarRutValido;
    }
}
