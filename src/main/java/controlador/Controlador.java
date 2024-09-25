/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import javax.swing.JFrame;
import vistas.*;
import vistasPanel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.MenuPlan;

/**
 *
 * @author melis
 */
public class Controlador implements ActionListener {
    //Listas y mapas
    private MenuGeneral menuG;
    private MenuCliente menuCliente;
    private MenuContrato menuContrato;
    private MenuPlan menuPlan;

  
    public void iniciar(){
        
        menuG = new MenuGeneral();
        menuG.getButCliente().addActionListener(this);
        menuG.getbutMenuContratos().addActionListener(this);
        menuG.getbutMenuPlanes().addActionListener(this);
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
        if(ae.getSource() == menuCliente.getButOpcionExit()){
            menuCliente.dispose();
            return;
        }
        
        //Ventana menu contratos
        if(ae.getSource() == menuG.getbutMenuContratos()){
            menuContrato = new MenuContrato();
            menuContrato.getBtnMostrarContratoCliente().addActionListener(this);
            menuContrato.getBtnMostrarContratos().addActionListener(this);
            menuContrato.getBtnVolver().addActionListener(this);
            menuContrato.setVisible(true);
            return;
        }
        
        //Opciones de cambio de menu contratos
        if(ae.getSource() == menuContrato.getBtnMostrarContratoCliente()){
            ContratoOpPanel1 panelAgregar = new ContratoOpPanel1();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuContrato.getBtnMostrarContratos()){
            ContratoOpPanel2 panelAgregar = new ContratoOpPanel2();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuContrato.getBtnVolver()){
            menuContrato.dispose();
            return;
        }
        
        //Ventana menu planes
        if(ae.getSource() == menuG.getbutMenuPlanes()){
            menuPlan = new MenuPlan();
            menuPlan.getBtnBuscarRut().addActionListener(this);
            menuPlan.getBtnAgregarPlan().addActionListener(this);
            menuPlan.getBtnMostrarPlanes().addActionListener(this);
            menuPlan.getBtnEliminarPlan().addActionListener(this);
            menuPlan.getBtnEliminarPlanes().addActionListener(this);
            menuPlan.getBtnVolver().addActionListener(this);
            menuPlan.setVisible(true);
            return;
        }
        
        //Opciones de cambio de menu contratos
        if(ae.getSource() == menuPlan.getBtnBuscarRut()){
            return;
        }
        if(ae.getSource() == menuPlan.getBtnAgregarPlan()){
            PlanOpPanel1 panelAgregar = new PlanOpPanel1();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuPlan.getBtnMostrarPlanes()){
            PlanOpPanel2 panelAgregar = new PlanOpPanel2();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuPlan.getBtnEliminarPlan()){
            PlanOpPanel3 panelAgregar = new PlanOpPanel3();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuPlan.getBtnEliminarPlanes()){
            PlanOpPanel4 panelAgregar = new PlanOpPanel4();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }
        if(ae.getSource() == menuPlan.getBtnVolver()){
            menuPlan.dispose();
            return;
        }
    }
}
