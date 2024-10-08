/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Emilio
 */
public class MenuContrato extends javax.swing.JFrame {

    /**
     * Creates new form MenuContrato
     */
    public MenuContrato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public JButton getBtnMostrarContratoCliente(){
        return btnMostrarContratoCliente;
    }
    
    public JButton getBtnMostrarContratos(){
        return btnMostrarContratos;
    }
    
    public JButton getBtnVolver(){
        return btnVolver;
    }
    
     public void mostrarPanel(JPanel p){
        p.setSize(465, 600);
        p.setLocation(0,0);
        jpnlPanelesOpciones.removeAll();
        jpnlPanelesOpciones.add(p,BorderLayout.CENTER);
        jpnlPanelesOpciones.revalidate();
        jpnlPanelesOpciones.repaint();
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTituloOpciones = new javax.swing.JLabel();
        btnMostrarContratoCliente = new javax.swing.JButton();
        btnMostrarContratos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jpnlPanelesOpciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTituloOpciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbTituloOpciones.setText("Eliga la opción que desea realizar:");

        btnMostrarContratoCliente.setText("1.- Mostrar el contrato de un cliente");
        btnMostrarContratoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMostrarContratoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnMostrarContratos.setText("2.- Mostrar todos los contratos");
        btnMostrarContratos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMostrarContratos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jpnlPanelesOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPanelesOpciones.setToolTipText("");

        javax.swing.GroupLayout jpnlPanelesOpcionesLayout = new javax.swing.GroupLayout(jpnlPanelesOpciones);
        jpnlPanelesOpciones.setLayout(jpnlPanelesOpcionesLayout);
        jpnlPanelesOpcionesLayout.setHorizontalGroup(
            jpnlPanelesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(jlbTituloOpciones)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMostrarContratos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarContratoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jpnlPanelesOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jlbTituloOpciones)
                .addGap(32, 32, 32)
                .addComponent(btnMostrarContratoCliente)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarContratos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(65, 65, 65))
            .addComponent(jpnlPanelesOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(MenuContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarContratoCliente;
    private javax.swing.JButton btnMostrarContratos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jlbTituloOpciones;
    private javax.swing.JPanel jpnlPanelesOpciones;
    // End of variables declaration//GEN-END:variables

}
