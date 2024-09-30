/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistasPanel;

import java.awt.Color;
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
        return butEnviarBusCliente;
    }

    public void setLabelViewNombre(String msj) {
        this.labelViewNombre.setText(msj);
    }

    public void setLabelViewApllPat(String msj) {
        this.labelViewApllPat.setText(msj);
    }

    public void setLabelViewApllMat(String msj) {
        this.labelViewApllMat.setText(msj);
    }

    public void setLabelViewRut(String msj) {
        this.labelViewRut.setText(msj);
    }

    public void setLabelViewTieneContr(String msj) {
        this.labelViewTieneContr.setText(msj);
    }

    public void setLabelViewSeEncontroClie(String msj,int SeEncontro) {
        this.labelViewSeEncontroClie.setText(msj);
        if(SeEncontro == 0)
            this.labelViewSeEncontroClie.setForeground(Color.red);
        else if(SeEncontro == 1)
            this.labelViewSeEncontroClie.setForeground(Color.green);
        else
            this.labelViewSeEncontroClie.setForeground(Color.black);
        
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
        butEnviarBusCliente = new javax.swing.JButton();
        labelViewSeEncontroClie = new javax.swing.JLabel();
        labelViewNombre = new javax.swing.JLabel();
        labelViewApllPat = new javax.swing.JLabel();
        labelViewApllMat = new javax.swing.JLabel();
        labelViewRut = new javax.swing.JLabel();
        labelViewTieneContr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jlabel1.setText("Ingrese el nombre del usuario que desea buscar :");

        TextFieldRutBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRutBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("(SIN PUNTO NI GUION)");

        butEnviarBusCliente.setText("Buscar");
        butEnviarBusCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEnviarBusClienteActionPerformed(evt);
            }
        });

        labelViewSeEncontroClie.setText("El cliente:");

        labelViewNombre.setText("Nombre:");

        labelViewApllPat.setText("Apellido Paterno:");

        labelViewApllMat.setText("Apellido Materno:");

        labelViewRut.setText("Rut:");

        labelViewTieneContr.setText("Tiene un contrato activo:");

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
                        .addComponent(butEnviarBusCliente)
                        .addGap(153, 153, 153))))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelViewNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelViewApllPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelViewApllMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelViewRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelViewTieneContr, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(labelViewSeEncontroClie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(butEnviarBusCliente)))
                .addGap(42, 42, 42)
                .addComponent(labelViewNombre)
                .addGap(18, 18, 18)
                .addComponent(labelViewApllPat)
                .addGap(18, 18, 18)
                .addComponent(labelViewApllMat)
                .addGap(18, 18, 18)
                .addComponent(labelViewRut)
                .addGap(18, 18, 18)
                .addComponent(labelViewTieneContr)
                .addGap(18, 18, 18)
                .addComponent(labelViewSeEncontroClie)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldRutBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRutBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRutBuscarActionPerformed

    private void butEnviarBusClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEnviarBusClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butEnviarBusClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldRutBuscar;
    private javax.swing.JButton butEnviarBusCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel labelViewApllMat;
    private javax.swing.JLabel labelViewApllPat;
    private javax.swing.JLabel labelViewNombre;
    private javax.swing.JLabel labelViewRut;
    private javax.swing.JLabel labelViewSeEncontroClie;
    private javax.swing.JLabel labelViewTieneContr;
    // End of variables declaration//GEN-END:variables
}
