/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package vistas;

import com.mycompany.administradordecontratosempresatelefonica.Clases.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vistasPanel.ClienteOpPanel1;
import vistasPanel.ClienteOpPanel2;

/**
 *
 * @author Emilio
 */
public class MenuCliente extends javax.swing.JFrame {

    private ArrayList<Cliente> clientesList;
    private HashMap<Integer,Cliente> clientesMap;
    private HashMap<String, Cliente> telefonosMap;
    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void MostrarPanel(JPanel p){
        p.setSize(530,577);
        p.setLocation(0,0);
        contenedor.removeAll();
        contenedor.add(p,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        
        
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butOpcionExit = new javax.swing.JButton();
        butOpcionAgregar = new javax.swing.JButton();
        butOpcionMostarCliente = new javax.swing.JButton();
        butOpcionModificarCliente = new javax.swing.JButton();
        butOpcionEliminarCliente = new javax.swing.JButton();
        butOpcionListarClientes = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butOpcionExit.setText("Volver a la pestaña anterior");
        butOpcionExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionExitActionPerformed(evt);
            }
        });

        butOpcionAgregar.setText("1.-Agregar un cliente");
        butOpcionAgregar.setToolTipText("");
        butOpcionAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionAgregarActionPerformed(evt);
            }
        });

        butOpcionMostarCliente.setText("2.-Mostrar un cliente");
        butOpcionMostarCliente.setToolTipText("");
        butOpcionMostarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionMostarClienteActionPerformed(evt);
            }
        });

        butOpcionModificarCliente.setText("3.-Modificar los datos de un cliente");
        butOpcionModificarCliente.setToolTipText("");
        butOpcionModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionModificarClienteActionPerformed(evt);
            }
        });

        butOpcionEliminarCliente.setText("4.-Eliminar cliente");
        butOpcionEliminarCliente.setToolTipText("");
        butOpcionEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionEliminarClienteActionPerformed(evt);
            }
        });

        butOpcionListarClientes.setText("5.-Listar clientes");
        butOpcionListarClientes.setToolTipText("");
        butOpcionListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpcionListarClientesActionPerformed(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setToolTipText("");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jLabel1.setText("Eliga la opción que desea realizar:");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butOpcionExit)
                    .addComponent(butOpcionAgregar)
                    .addComponent(butOpcionMostarCliente)
                    .addComponent(butOpcionModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butOpcionEliminarCliente)
                    .addComponent(butOpcionListarClientes)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(butOpcionAgregar)
                .addGap(18, 18, 18)
                .addComponent(butOpcionMostarCliente)
                .addGap(18, 18, 18)
                .addComponent(butOpcionModificarCliente)
                .addGap(18, 18, 18)
                .addComponent(butOpcionEliminarCliente)
                .addGap(18, 18, 18)
                .addComponent(butOpcionListarClientes)
                .addGap(52, 52, 52)
                .addComponent(butOpcionExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void butOpcionAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionAgregarActionPerformed
        // TODO add your handling code here:
        ClienteOpPanel1 p1 = new ClienteOpPanel1();
        MostrarPanel(p1);
        
    }//GEN-LAST:event_butOpcionAgregarActionPerformed

    private void butOpcionMostarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionMostarClienteActionPerformed
        // TODO add your handling code here:
        ClienteOpPanel2 p2 = new ClienteOpPanel2();
        MostrarPanel(p2);
    }//GEN-LAST:event_butOpcionMostarClienteActionPerformed

    private void butOpcionModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionModificarClienteActionPerformed
        // TODO add your handling code here:
        //MostrarPanel(OpPanel3);
    }//GEN-LAST:event_butOpcionModificarClienteActionPerformed

    private void butOpcionEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionEliminarClienteActionPerformed
        // TODO add your handling code here:
        //MostrarPanel(OpPanel4);
    }//GEN-LAST:event_butOpcionEliminarClienteActionPerformed

    private void butOpcionListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionListarClientesActionPerformed
        // TODO add your handling code here:
        //MostrarPanel(OpPanel5);
    }//GEN-LAST:event_butOpcionListarClientesActionPerformed

    private void butOpcionExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpcionExitActionPerformed
        // TODO add your handling code here:
        MenuGeneral vv = new MenuGeneral(clientesList,clientesMap,telefonosMap);
        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vv.setVisible(true);
        dispose();
    }//GEN-LAST:event_butOpcionExitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton butOpcionAgregar;
    private javax.swing.JButton butOpcionEliminarCliente;
    private javax.swing.JButton butOpcionExit;
    private javax.swing.JButton butOpcionListarClientes;
    private javax.swing.JButton butOpcionModificarCliente;
    private javax.swing.JButton butOpcionMostarCliente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel panelOpcion3;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
