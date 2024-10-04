/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistasPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author melis
 */
public class PlanOpPanel4 extends javax.swing.JPanel {

    public JButton getBtnModificarPlan() {
        return btnModificarPlan;
    }

    public JButton getBtnModificarPlanInicial() {
        return btnModificarPlanInicial;
    }

    public JButton getBtnModificarPlanPro() {
        return btnModificarPlanPro;
    }

    public JButton getBtnModificarPlanUltra() {
        return btnModificarPlanUltra;
    }

    public JLabel getJlbCambiadoInicial() {
        return jlbCambiadoInicial;
    }

    public JLabel getJlbCambiadoPro() {
        return jlbCambiadoPro;
    }

    public JLabel getJlbCambiadoUltra() {
        return jlbCambiadoUltra;
    }

    public JLabel getJlbPlanInicialActual() {
        return jlbPlanInicialActual;
    }

    public JLabel getJlbPlanProActual() {
        return jlbPlanProActual;
    }

    public JLabel getJlbPlanUltraActual() {
        return jlbPlanUltraActual;
    }

    public String getTxtModificarPlan() {
        return txtModificarPlan.getText();
    }

    public JLabel getJlbNumeroNoEncontrado() {
        return jlbNumeroNoEncontrado;
    }

    public JLabel getJlbGigasInicial() {
        return jlbGigasInicial;
    }

    public JLabel getJlbGigasPro() {
        return jlbGigasPro;
    }

    public JLabel getJlbGigasUltra() {
        return jlbGigasUltra;
    }

    public JLabel getJlbMinutosInicial() {
        return jlbMinutosInicial;
    }

    public JLabel getJlbMinutosPro() {
        return jlbMinutosPro;
    }

    public JLabel getJlbMinutosUltra() {
        return jlbMinutosUltra;
    }

    public JLabel getJlbNombreInicial() {
        return jlbNombreInicial;
    }

    public JLabel getJlbNombrePro() {
        return jlbNombrePro;
    }

    public JLabel getJlbNombreUltra() {
        return jlbNombreUltra;
    }

    public JLabel getJlbPrecioInicial() {
        return jlbPrecioInicial;
    }

    public JLabel getJlbPrecioPro() {
        return jlbPrecioPro;
    }

    public JLabel getJlbPrecioUltra() {
        return jlbPrecioUltra;
    }
    

    
    
    /**
     * Creates new form PlanOpPanel4
     */
    public PlanOpPanel4() {
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

        jLabel16 = new javax.swing.JLabel();
        txtModificarPlan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModificarPlan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlbNombreInicial = new javax.swing.JLabel();
        jlbGigasInicial = new javax.swing.JLabel();
        jlbMinutosInicial = new javax.swing.JLabel();
        jlbPrecioInicial = new javax.swing.JLabel();
        jlbNombrePro = new javax.swing.JLabel();
        jlbGigasPro = new javax.swing.JLabel();
        jlbMinutosPro = new javax.swing.JLabel();
        jlbPrecioPro = new javax.swing.JLabel();
        jlbNombreUltra = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlbGigasUltra = new javax.swing.JLabel();
        jlbMinutosUltra = new javax.swing.JLabel();
        jlbPrecioUltra = new javax.swing.JLabel();
        jlbPlanInicialActual = new javax.swing.JLabel();
        btnModificarPlanInicial = new javax.swing.JButton();
        btnModificarPlanPro = new javax.swing.JButton();
        btnModificarPlanUltra = new javax.swing.JButton();
        jlbPlanProActual = new javax.swing.JLabel();
        jlbPlanUltraActual = new javax.swing.JLabel();
        jlbCambiadoInicial = new javax.swing.JLabel();
        jlbCambiadoUltra = new javax.swing.JLabel();
        jlbCambiadoPro = new javax.swing.JLabel();
        jlbNumeroNoEncontrado = new javax.swing.JLabel();

        jLabel16.setText("jLabel16");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el numero de telefono del plan que desea modificar:");

        btnModificarPlan.setText("Modificar");

        jlbNombreInicial.setText("Plan Inicial");

        jlbGigasInicial.setText("100 GB libres");

        jlbMinutosInicial.setText("1000 Minutos libres");

        jlbPrecioInicial.setText("$8.792");

        jlbNombrePro.setText("Plan Pro");

        jlbGigasPro.setText("200 GB libres");

        jlbMinutosPro.setText("1000 Minutos libres");

        jlbPrecioPro.setText("$11.192");

        jlbNombreUltra.setText("Plan Ultra");

        jlbGigasUltra.setText("300 GB libres");

        jlbMinutosUltra.setText("1000 Minutos libres");

        jlbPrecioUltra.setText("$13.592");

        jlbPlanInicialActual.setForeground(new java.awt.Color(102, 102, 102));
        jlbPlanInicialActual.setText("(Plan actual)");

        btnModificarPlanInicial.setText("Cambiar");
        btnModificarPlanInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPlanInicialActionPerformed(evt);
            }
        });

        btnModificarPlanPro.setText("Cambiar");

        btnModificarPlanUltra.setText("Cambiar");

        jlbPlanProActual.setForeground(new java.awt.Color(102, 102, 102));
        jlbPlanProActual.setText("(Plan actual)");

        jlbPlanUltraActual.setForeground(new java.awt.Color(102, 102, 102));
        jlbPlanUltraActual.setText("(Plan actual)");

        jlbCambiadoInicial.setForeground(new java.awt.Color(51, 204, 0));
        jlbCambiadoInicial.setText("Cambiado con exito");

        jlbCambiadoUltra.setForeground(new java.awt.Color(51, 204, 0));
        jlbCambiadoUltra.setText("Cambiado con exito");

        jlbCambiadoPro.setForeground(new java.awt.Color(51, 204, 0));
        jlbCambiadoPro.setText("Cambiado con exito");

        jlbNumeroNoEncontrado.setForeground(new java.awt.Color(204, 0, 0));
        jlbNumeroNoEncontrado.setText("numero no encontrado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarPlan)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbNombreUltra)
                                .addGap(18, 18, 18)
                                .addComponent(jlbPlanUltraActual))
                            .addComponent(jlbPrecioPro)
                            .addComponent(jlbGigasPro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbNombrePro)
                                .addGap(18, 18, 18)
                                .addComponent(jlbPlanProActual))
                            .addComponent(jlbMinutosPro)
                            .addComponent(jlbGigasUltra)
                            .addComponent(jlbMinutosUltra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificarPlanInicial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbCambiadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificarPlanPro)
                                .addGap(18, 18, 18)
                                .addComponent(jlbCambiadoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbPrecioInicial)
                            .addComponent(jlbMinutosInicial)
                            .addComponent(jlbPrecioUltra)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlbNombreInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbGigasInicial))
                                .addGap(18, 18, 18)
                                .addComponent(jlbPlanInicialActual))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificarPlanUltra)
                                .addGap(18, 18, 18)
                                .addComponent(jlbCambiadoUltra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtModificarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbNumeroNoEncontrado)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModificarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNumeroNoEncontrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombreInicial)
                            .addComponent(jlbPlanInicialActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbGigasInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbMinutosInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPrecioInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarPlanInicial)
                            .addComponent(jlbCambiadoInicial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombrePro)
                            .addComponent(jlbPlanProActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbGigasPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbMinutosPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPrecioPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarPlanPro)
                            .addComponent(jlbCambiadoPro))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombreUltra)
                            .addComponent(jlbPlanUltraActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbGigasUltra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbMinutosUltra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPrecioUltra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarPlanUltra)
                            .addComponent(jlbCambiadoUltra))
                        .addGap(45, 45, 45))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarPlanInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPlanInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarPlanInicialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarPlan;
    private javax.swing.JButton btnModificarPlanInicial;
    private javax.swing.JButton btnModificarPlanPro;
    private javax.swing.JButton btnModificarPlanUltra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbCambiadoInicial;
    private javax.swing.JLabel jlbCambiadoPro;
    private javax.swing.JLabel jlbCambiadoUltra;
    private javax.swing.JLabel jlbGigasInicial;
    private javax.swing.JLabel jlbGigasPro;
    private javax.swing.JLabel jlbGigasUltra;
    private javax.swing.JLabel jlbMinutosInicial;
    private javax.swing.JLabel jlbMinutosPro;
    private javax.swing.JLabel jlbMinutosUltra;
    private javax.swing.JLabel jlbNombreInicial;
    private javax.swing.JLabel jlbNombrePro;
    private javax.swing.JLabel jlbNombreUltra;
    private javax.swing.JLabel jlbNumeroNoEncontrado;
    private javax.swing.JLabel jlbPlanInicialActual;
    private javax.swing.JLabel jlbPlanProActual;
    private javax.swing.JLabel jlbPlanUltraActual;
    private javax.swing.JLabel jlbPrecioInicial;
    private javax.swing.JLabel jlbPrecioPro;
    private javax.swing.JLabel jlbPrecioUltra;
    private javax.swing.JTextField txtModificarPlan;
    // End of variables declaration//GEN-END:variables
}
