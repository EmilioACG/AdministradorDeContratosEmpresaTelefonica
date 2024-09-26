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
 * @author Emilio
 */
public class ClienteOpPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form ClienteOpPanel2
     */
    
    public ClienteOpPanel2() {
        initComponents();
    }

    public String getTextFieldRutBuscar() {
        return TextFieldRutBuscar.getText();
    }

    public JButton getButEnviarBusCliente() {
        return ButEnviarBusCliente;
    }

    public void setLabelViewNombre(String msj) {
        this.LabelViewNombre.setText(msj);
    }

    public void setLabelViewApllPat(String msj) {
        this.LabelViewApllPat.setText(msj);
    }

    public void setLabelViewApllMat(String msj) {
        this.LabelViewApllMat.setText(msj);
    }

    public void setLabelViewRut(String msj) {
        this.LabelViewRut.setText(msj);
    }

    public void setLabelViewTieneContr(String msj) {
        this.LabelViewTieneContr.setText(msj);
    }

    public void setLabelViewSeEncontroClie(String msj) {
        this.LabelViewSeEncontroClie.setText(msj);
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1 = new javax.swing.JLabel();
        TextFieldRutBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ButEnviarBusCliente = new javax.swing.JButton();
        LabelViewSeEncontroClie = new javax.swing.JLabel();
        LabelViewNombre = new javax.swing.JLabel();
        LabelViewApllPat = new javax.swing.JLabel();
        LabelViewApllMat = new javax.swing.JLabel();
        LabelViewRut = new javax.swing.JLabel();
        LabelViewTieneContr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jlabel1.setText("Ingrese el nombre del usuario que desea buscar :");

        TextFieldRutBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRutBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("(SIN PUNTO NI GUION)");

        ButEnviarBusCliente.setText("Buscar");
        ButEnviarBusCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEnviarBusClienteActionPerformed(evt);
            }
        });

        LabelViewSeEncontroClie.setText("El cliente:");

        LabelViewNombre.setText("Nombre:");

        LabelViewApllPat.setText("Apellido Paterno:");

        LabelViewApllMat.setText("Apellido Materno:");

        LabelViewRut.setText("Rut:");

        LabelViewTieneContr.setText("Tiene un contrato activo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldRutBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButEnviarBusCliente)
                        .addGap(153, 153, 153))))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelViewNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelViewApllPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelViewApllMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelViewRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelViewTieneContr, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(LabelViewSeEncontroClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldRutBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButEnviarBusCliente)))
                .addGap(42, 42, 42)
                .addComponent(LabelViewNombre)
                .addGap(18, 18, 18)
                .addComponent(LabelViewApllPat)
                .addGap(18, 18, 18)
                .addComponent(LabelViewApllMat)
                .addGap(18, 18, 18)
                .addComponent(LabelViewRut)
                .addGap(18, 18, 18)
                .addComponent(LabelViewTieneContr)
                .addGap(18, 18, 18)
                .addComponent(LabelViewSeEncontroClie)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldRutBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRutBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRutBuscarActionPerformed

    private void ButEnviarBusClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEnviarBusClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButEnviarBusClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEnviarBusCliente;
    private javax.swing.JLabel LabelViewApllMat;
    private javax.swing.JLabel LabelViewApllPat;
    private javax.swing.JLabel LabelViewNombre;
    private javax.swing.JLabel LabelViewRut;
    private javax.swing.JLabel LabelViewSeEncontroClie;
    private javax.swing.JLabel LabelViewTieneContr;
    private javax.swing.JTextField TextFieldRutBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabel1;
    // End of variables declaration//GEN-END:variables
}
