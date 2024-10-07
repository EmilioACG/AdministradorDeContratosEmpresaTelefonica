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

    // -----------------------------------------------------------------------------------------------
    // Lectura de campos de texto
    // -----------------------------------------------------------------------------------------------
    public String getRutClienteModificado() {
        return txtRutClienteModificado.getText();
    }

    public String getNuevoNombre() {
        return txtNuevoNombre.getText();
    }

    public String getNuevoApellidoPaterno() {
        return txtNuevoApellidoPaterno.getText();
    }

    public String getNuevoApellidoMaterno() {
        return txtNuevoApellidoMaterno.getText();
    }
    
    // -----------------------------------------------------------------------------------------------
    // Getters de botones
    // -----------------------------------------------------------------------------------------------
    public JButton getBtnConfirmModN() {
        return btnConfirmModN;
    }

    public JButton getBtnConfirmModApAm() {
        return btnConfirmModApAm;
    }

    public JButton getBtnConfirmModNApAm() {
        return btnConfirmModNApAm;
    }

    public JButton getBtnModificarApellidos() {
        return btnModificarApellidos;
    }

    public JButton getBtnModificarNombre() {
        return btnModificarNombre;
    }

    public JButton getBtnModificarNombreApellidos() {
        return btnModificarNombreApellidos;
    }

    public JButton getBtnRutClienteModificar() {
        return btnRutClienteModificar;
    }
    
    // -----------------------------------------------------------------------------------------------
    // Setters para visualizar pre y post modificaciones o errores
    // -----------------------------------------------------------------------------------------------

    public void setJlbClienteNoEncontrado(String msg,Color color) {
        this.jlbClienteNoEncontrado.setText(msg);
        this.jlbClienteNoEncontrado.setForeground(color);
    }

    public void setJlbErrorModificacion(String msg,Color color) {
        this.jlbErrorModificacion.setText(msg);
        this.jlbErrorModificacion.setForeground(color);
    }

    public void setJlbPostApellidoMaterno(String msg) {
        this.jlbPostApellidoMaterno.setText(msg);
    }

    public void setJlbPostApellidoPaterno(String msg) {
        this.jlbPostApellidoPaterno.setText(msg);
    }

    public void setJlbPostNombre(String msg) {
        this.jlbPostNombre.setText(msg);
    }

    public void setJlbPreApellidoMaterno(String msg) {
        this.jlbPreApellidoMaterno.setText(msg);
    }

    public void setJlbPreApellidoPaterno(String msg) {
        this.jlbPreApellidoPaterno.setText(msg);
    }

    public void setJlbPreNombre(String msg) {
        this.jlbPreNombre.setText(msg);
    }

    // -----------------------------------------------------------------------------------------------
    // Getters para visualizar Campos y su Intrucciones
    // -----------------------------------------------------------------------------------------------    

    public JLabel getJlbClientePretModificacion() {
        return jlbClientePretModificacion;
    }

    public JLabel getJlbPreApellidoMaterno() {
        return jlbPreApellidoMaterno;
    }

    public JLabel getJlbPreApellidoPaterno() {
        return jlbPreApellidoPaterno;
    }

    public JLabel getJlbPreNombre() {
        return jlbPreNombre;
    }

    public JLabel getJlbQueDeseaModificar() {
        return jlbQueDeseaModificar;
    }

    public JLabel getJlbIngresarApellidoMaterno() {
        return jlbIngresarApellidoMaterno;
    }

    public JLabel getJlbIngresarApellidoPaterno() {
        return jlbIngresarApellidoPaterno;
    }

    public JLabel getJlbIngresarNombre() {
        return jlbIngresarNombre;
    }
    
    public JTextField getTxtNuevoNombre() {
        return txtNuevoNombre;
    }

    public JTextField getTxtNuevoApellidoMaterno() {
        return txtNuevoApellidoMaterno;
    }

    public JTextField getTxtNuevoApellidoPaterno() {
        return txtNuevoApellidoPaterno;
    }

    public JLabel getJlbClientePostModificacion() {
        return jlbClientePostModificacion;
    }

    public JLabel getJlbPostApellidoMaterno() {
        return jlbPostApellidoMaterno;
    }

    public JLabel getJlbPostApellidoPaterno() {
        return jlbPostApellidoPaterno;
    }

    public JLabel getJlbPostNombre() {
        return jlbPostNombre;
    }

    public JLabel getJlbClienteNoEncontrado() {
        return jlbClienteNoEncontrado;
    }

    public JLabel getJlbErrorModificacion() {
        return jlbErrorModificacion;
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
        jlbIngresarRut = new javax.swing.JLabel();
        txtRutClienteModificado = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoApellidoPaterno = new javax.swing.JTextField();
        txtNuevoApellidoMaterno = new javax.swing.JTextField();
        jlbIngresarNombre = new javax.swing.JLabel();
        jlbIngresarApellidoPaterno = new javax.swing.JLabel();
        jlbIngresarApellidoMaterno = new javax.swing.JLabel();
        btnRutClienteModificar = new javax.swing.JButton();
        btnConfirmModN = new javax.swing.JButton();
        btnModificarNombre = new javax.swing.JButton();
        btnModificarApellidos = new javax.swing.JButton();
        btnModificarNombreApellidos = new javax.swing.JButton();
        jlbClientePretModificacion = new javax.swing.JLabel();
        jlbPreNombre = new javax.swing.JLabel();
        jlbPreApellidoPaterno = new javax.swing.JLabel();
        jlbPreApellidoMaterno = new javax.swing.JLabel();
        jlbQueDeseaModificar = new javax.swing.JLabel();
        jlbClientePostModificacion = new javax.swing.JLabel();
        jlbPostNombre = new javax.swing.JLabel();
        jlbPostApellidoPaterno = new javax.swing.JLabel();
        jlbPostApellidoMaterno = new javax.swing.JLabel();
        jlbClienteNoEncontrado = new javax.swing.JLabel();
        jlbErrorModificacion = new javax.swing.JLabel();
        btnConfirmModApAm = new javax.swing.JButton();
        btnConfirmModNApAm = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(530, 577));

        jlbIngresarRut.setText("Ingrese el RUT del cliente que desea modificar :");

        txtRutClienteModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutClienteModificadoActionPerformed(evt);
            }
        });

        jlbIngresarNombre.setText("Ingrese nuevo nombre :");

        jlbIngresarApellidoPaterno.setText("Ingrese nuevo apellido paterno :");

        jlbIngresarApellidoMaterno.setText("Ingrese nuevo apellido materno :");

        btnRutClienteModificar.setText("Buscar");
        btnRutClienteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutClienteModificarActionPerformed(evt);
            }
        });

        btnConfirmModN.setText("Modificar Nombre");

        btnModificarNombre.setText("Nombre");
        btnModificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNombreActionPerformed(evt);
            }
        });

        btnModificarApellidos.setText("Apellidos");

        btnModificarNombreApellidos.setText("Nombre y Apellido");

        jlbClientePretModificacion.setText("Cliente pre modificacion:");

        jlbPreNombre.setText("Nombre");

        jlbPreApellidoPaterno.setText("Apellido Paterno");

        jlbPreApellidoMaterno.setText("Apellido Materno");

        jlbQueDeseaModificar.setText("¿Que desea modificar?");

        jlbClientePostModificacion.setText("Cliente post Modificacion");

        jlbPostNombre.setText("Nuevo nombre");

        jlbPostApellidoPaterno.setText("Nuevo Apellido p");

        jlbPostApellidoMaterno.setText("Nuevo Apellido m");

        jlbClienteNoEncontrado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbClienteNoEncontrado.setText("jLabel1");

        jlbErrorModificacion.setText("jLabel1");

        btnConfirmModApAm.setText("Modificar Apellidos");

        btnConfirmModNApAm.setText("Modificar Nombre y Apellidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbQueDeseaModificar)
                    .addComponent(jlbClientePostModificacion)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jlbPostNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPostApellidoPaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPostApellidoMaterno))
                    .addComponent(jlbClientePretModificacion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificarNombre)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarApellidos)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarNombreApellidos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbIngresarRut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRutClienteModificado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRutClienteModificar))
                    .addComponent(jlbClienteNoEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jlbPreNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPreApellidoPaterno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbPreApellidoMaterno))
                    .addComponent(jlbErrorModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnConfirmModN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmModApAm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmModNApAm))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jlbIngresarApellidoMaterno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNuevoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jlbIngresarApellidoPaterno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNuevoApellidoPaterno))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jlbIngresarNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIngresarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRutClienteModificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutClienteModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbClienteNoEncontrado)
                .addGap(8, 8, 8)
                .addComponent(jlbClientePretModificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPreNombre)
                    .addComponent(jlbPreApellidoPaterno)
                    .addComponent(jlbPreApellidoMaterno))
                .addGap(49, 49, 49)
                .addComponent(jlbQueDeseaModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarNombre)
                    .addComponent(btnModificarApellidos)
                    .addComponent(btnModificarNombreApellidos))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIngresarNombre)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIngresarApellidoPaterno)
                    .addComponent(txtNuevoApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIngresarApellidoMaterno)
                    .addComponent(txtNuevoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmModN)
                    .addComponent(btnConfirmModApAm)
                    .addComponent(btnConfirmModNApAm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbErrorModificacion)
                .addGap(38, 38, 38)
                .addComponent(jlbClientePostModificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPostNombre)
                    .addComponent(jlbPostApellidoPaterno)
                    .addComponent(jlbPostApellidoMaterno))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutClienteModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutClienteModificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutClienteModificadoActionPerformed

    private void btnRutClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutClienteModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRutClienteModificarActionPerformed

    private void btnModificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmModApAm;
    private javax.swing.JButton btnConfirmModN;
    private javax.swing.JButton btnConfirmModNApAm;
    private javax.swing.JButton btnModificarApellidos;
    private javax.swing.JButton btnModificarNombre;
    private javax.swing.JButton btnModificarNombreApellidos;
    private javax.swing.JButton btnRutClienteModificar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlbClienteNoEncontrado;
    private javax.swing.JLabel jlbClientePostModificacion;
    private javax.swing.JLabel jlbClientePretModificacion;
    private javax.swing.JLabel jlbErrorModificacion;
    private javax.swing.JLabel jlbIngresarApellidoMaterno;
    private javax.swing.JLabel jlbIngresarApellidoPaterno;
    private javax.swing.JLabel jlbIngresarNombre;
    private javax.swing.JLabel jlbIngresarRut;
    private javax.swing.JLabel jlbPostApellidoMaterno;
    private javax.swing.JLabel jlbPostApellidoPaterno;
    private javax.swing.JLabel jlbPostNombre;
    private javax.swing.JLabel jlbPreApellidoMaterno;
    private javax.swing.JLabel jlbPreApellidoPaterno;
    private javax.swing.JLabel jlbPreNombre;
    private javax.swing.JLabel jlbQueDeseaModificar;
    private javax.swing.JTextField txtNuevoApellidoMaterno;
    private javax.swing.JTextField txtNuevoApellidoPaterno;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtRutClienteModificado;
    // End of variables declaration//GEN-END:variables
}
