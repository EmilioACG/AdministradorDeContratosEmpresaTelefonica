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
public class ClienteOpPanel3 extends javax.swing.JPanel {

    /**
     * Creates new form ClienteOpPanel3
     */
    public ClienteOpPanel3() {
        initComponents();
    }

    public String getTextRutMod() {
        return textRutMod.getText();
    }

    public String getTextOpMod() {
        return textOpMod.getText();
    }

    public String getTextNombreMod() {
        return textNombreMod.getText();
    }

    public String getTextApellPatMod() {
        return textApellPatMod.getText();
    }

    public String getTextApellMatMod() {
        return textApellMatMod.getText();
    }
    
    public JButton getButBuscarMod() {
        return butBuscarMod;
    }

    public JButton getButCambiar() {
        return butCambiar;
    }

    public void setLabelConfirmacionMod(String msj, int SeEncontro) {
        this.labelConfirmacionMod.setText(msj);
        if(SeEncontro == 0)
            this.labelConfirmacionMod.setForeground(Color.red);
        else if(SeEncontro == 1)
            this.labelConfirmacionMod.setForeground(Color.green);
        else
            this.labelConfirmacionMod.setForeground(Color.black);
    }
    
    public void setViewLabelNomMod(int num) {
        if(num == 0)
            this.labelNomMod.setVisible(false);
        else
            this.labelNomMod.setVisible(true);
    }

    public void setViewLabelNomApPat(int num) {
        if(num == 0)
            this.labelNomApPat.setVisible(false);
        else
            this.labelNomApPat.setVisible(true);
    }

    public void setViewLabelApMat(int num) {
        if(num == 0)
            this.labelApMat.setVisible(false);
        else
            this.labelApMat.setVisible(true);
    }

    public void setViewTextNombreMod(int num) {
        if(num == 0)
            this.textNombreMod.setVisible(false);
        else
            this.textNombreMod.setVisible(true);
    }

    public void setViewTextApellPatMod(int num) {
        if(num == 0)
            this.textApellPatMod.setVisible(false);
        else
            this.textApellPatMod.setVisible(true);
    }

    public void setViewTextApellMatMod(int num) {
        if(num == 0)
            this.textApellMatMod.setVisible(false);
        else
            this.textApellMatMod.setVisible(true); 
    }

    public void setViewButCambiar(int num) {
        if(num == 0)
            this.butCambiar.setVisible(false);
        else
            this.butCambiar.setVisible(true);
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabelPregunta = new javax.swing.JLabel();
        jlabelModificar = new javax.swing.JLabel();
        textRutMod = new javax.swing.JTextField();
        textOpMod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelConfirmacionMod = new javax.swing.JLabel();
        textNombreMod = new javax.swing.JTextField();
        textApellPatMod = new javax.swing.JTextField();
        textApellMatMod = new javax.swing.JTextField();
        labelNomMod = new javax.swing.JLabel();
        labelNomApPat = new javax.swing.JLabel();
        labelApMat = new javax.swing.JLabel();
        butBuscarMod = new javax.swing.JButton();
        butCambiar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(530, 577));

        jLabelPregunta.setText("Que desea modificar?           ingrese su opcion aqui :");

        jlabelModificar.setText("Ingrese el nombre del usuario que desea modificar :");

        textRutMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRutModActionPerformed(evt);
            }
        });

        textOpMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOpModActionPerformed(evt);
            }
        });

        jLabel1.setText("1.- Nombre del cliente");

        jLabel2.setText("2.- Apellidos");

        jLabel3.setText("3.- Nombre y apellidos");

        labelConfirmacionMod.setText("El cliente :");

        labelNomMod.setText("Ingrese nuevo nombre :");

        labelNomApPat.setText("Ingrese nuevo apellido paterno :");

        labelApMat.setText("Ingrese nuevo apellido materno :");

        butBuscarMod.setText("Buscar");
        butBuscarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBuscarModActionPerformed(evt);
            }
        });

        butCambiar.setText("Cambiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlabelModificar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabelPregunta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textOpMod)
                            .addComponent(textRutMod, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(160, 160, 160)
                                .addComponent(butBuscarMod))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomMod)
                                    .addComponent(labelNomApPat))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textApellPatMod, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelApMat)
                                .addGap(18, 18, 18)
                                .addComponent(textApellMatMod, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(butCambiar))
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelConfirmacionMod, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRutMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPregunta)
                    .addComponent(textOpMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(butBuscarMod))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomMod))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomApPat)
                    .addComponent(textApellPatMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApMat)
                    .addComponent(textApellMatMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(butCambiar)
                .addGap(18, 18, 18)
                .addComponent(labelConfirmacionMod)
                .addGap(156, 156, 156))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textOpModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOpModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOpModActionPerformed

    private void textRutModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRutModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRutModActionPerformed

    private void butBuscarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBuscarModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butBuscarModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butBuscarMod;
    private javax.swing.JButton butCambiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JLabel jlabelModificar;
    private javax.swing.JLabel labelApMat;
    private javax.swing.JLabel labelConfirmacionMod;
    private javax.swing.JLabel labelNomApPat;
    private javax.swing.JLabel labelNomMod;
    private javax.swing.JTextField textApellMatMod;
    private javax.swing.JTextField textApellPatMod;
    private javax.swing.JTextField textNombreMod;
    private javax.swing.JTextField textOpMod;
    private javax.swing.JTextField textRutMod;
    // End of variables declaration//GEN-END:variables
}
