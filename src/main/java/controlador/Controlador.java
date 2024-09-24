/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vistas.*;
import vistasPanel.*;

/**
 *
 * @author melis
 */
public class Controlador implements ActionListener {
    //Listas y mapas
    private MenuGeneral menuG;
    private MenuCliente menuCliente;
    private MenuPlan menuPlan;
    private MenuContrato MenuContrato;
    
    
    public void iniciar(){
        
        menuG = new MenuGeneral();
        menuG.getButCliente().addActionListener(this);
        menuG.getbutMenuPlanes().addActionListener(this);
        menuG.getbutMenuContratos().addActionListener(this);
        menuG.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuG.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //Ventana menu clientes
        if(ae.getSource() == menuG.getButCliente()){
            menuCliente = new MenuCliente();
            menuCliente.getButOpcionAgregar().addActionListener(this);
            menuCliente.getButOpcionMostarCliente().addActionListener(this);
            menuCliente.getButOpcionModificarCliente().addActionListener(this);
            menuCliente.getButOpcionEliminarCliente().addActionListener(this);
            menuCliente.getButOpcionListarClientes().addActionListener(this);
            menuCliente.getButOpcionExit().addActionListener(this);
            menuCliente.setVisible(true);
            return;
        }
        //Opciones de cambio de menu
        if(ae.getSource() == menuCliente.getButOpcionAgregar()){
            ClienteOpPanel1 panelAgregar = new ClienteOpPanel1();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuCliente.getButOpcionMostarCliente()){
            ClienteOpPanel2 panelAgregar = new ClienteOpPanel2();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() ==  menuCliente.getButOpcionModificarCliente()){
            ClienteOpPanel3 panelAgregar = new ClienteOpPanel3();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() ==  menuCliente.getButOpcionEliminarCliente()){
            ClienteOpPanel4 panelAgregar = new ClienteOpPanel4();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() ==  menuCliente.getButOpcionListarClientes()){
            ClienteOpPanel5 panelAgregar = new ClienteOpPanel5();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }
        //Ventana menu planes
        if(ae.getSource() == menuG.getbutMenuPlanes()){
            menuPlan = new MenuPlan();
            menuPlan.getButBuscarRutValido().addActionListener(this);
            menuPlan.getButAgregarPlan().addActionListener(this);
            menuPlan.getButMostrarPlanes().addActionListener(this);
            menuPlan.getButEliminarPlan().addActionListener(this);
            menuPlan.getButEliminarPlanes().addActionListener(this);
            menuPlan.getButVolver().addActionListener(this);
            menuPlan.setVisible(true);
            return;
        }
        if(ae.getSource() == menuG.getbutMenuContratos()){
            MenuContrato = new MenuContrato();
            MenuContrato.setVisible(true);
             
            return;
        }
        
        //Opciones de salir de la ventana
        if(ae.getSource() == menuCliente.getButOpcionExit()){
            menuCliente.dispose();
            return;
        }
        if(ae.getSource() == menuPlan.getButVolver()){
            menuPlan.dispose();
            return;
        }
    }
}
