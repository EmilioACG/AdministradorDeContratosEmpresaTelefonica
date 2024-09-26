/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.opencsv.exceptions.CsvValidationException;
import javax.swing.JFrame;
import vistas.*;
import vistasPanel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Modelo;
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
    private ClienteOpPanel1 panelAgregar;
    private Modelo modeloG;
    
    public Controlador () {
        inicializarVentanas();
    }
    
    public void inicializarVentanas() {
        menuCliente = new MenuCliente();
        menuCliente.getButOpcionAgregar().addActionListener(this);
        menuCliente.getButOpcionMostarCliente().addActionListener(this);
        menuCliente.getButOpcionModificarCliente().addActionListener(this);
        menuCliente.getButOpcionEliminarCliente().addActionListener(this);
        menuCliente.getButOpcionListarClientes().addActionListener(this);
        menuCliente.getButOpcionExit().addActionListener(this);
        
        menuContrato = new MenuContrato();
        menuContrato.getBtnMostrarContratoCliente().addActionListener(this);
        menuContrato.getBtnMostrarContratos().addActionListener(this);
        menuContrato.getBtnVolver().addActionListener(this);
        
        menuPlan = new MenuPlan();
        menuPlan.getBtnBuscarRut().addActionListener(this);
        menuPlan.getBtnAgregarPlan().addActionListener(this);
        menuPlan.getBtnMostrarPlanes().addActionListener(this);
        menuPlan.getBtnEliminarPlan().addActionListener(this);
        menuPlan.getBtnEliminarPlanes().addActionListener(this);
        menuPlan.getBtnVolver().addActionListener(this);
    }
  
    public void iniciar() throws CsvValidationException{
        
        modeloG = new Modelo();
        menuG = new MenuGeneral();
        menuG.getBtnCliente().addActionListener(this);
        menuG.getBtnMenuContratos().addActionListener(this);
        menuG.getBtnMenuPlanes().addActionListener(this);
        menuG.getBtnExitPr().addActionListener(this);
        menuG.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuG.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == menuG.getBtnCliente()){ //Ventana menu clientes
            menuCliente.setVisible(true);
            menuG.setVisible(false);
            return;
        } else if(ae.getSource() == menuCliente.getButOpcionAgregar()){  //Opciones de cambio de menu clientes
            panelAgregar = new ClienteOpPanel1();
            menuCliente.mostrarPanel(panelAgregar);
            agregarCliente(panelAgregar);
            return;
        }else if(ae.getSource() == menuCliente.getButOpcionMostarCliente()){
            ClienteOpPanel2 panelBuscar = new ClienteOpPanel2();
            menuCliente.mostrarPanel(panelBuscar);
            buscarCliente(panelBuscar);
            return;
        }else if(ae.getSource() ==  menuCliente.getButOpcionModificarCliente()){
            ClienteOpPanel3 panelAgregar = new ClienteOpPanel3();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() ==  menuCliente.getButOpcionEliminarCliente()){
            ClienteOpPanel4 panelAgregar = new ClienteOpPanel4();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() ==  menuCliente.getButOpcionListarClientes()){
            ClienteOpPanel5 panelAgregar = new ClienteOpPanel5();
            menuCliente.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuCliente.getButOpcionExit()){ //Opcion salir de la ventana cliente
            menuCliente.dispose();
            menuG.setVisible(true);
            return;
        }else if(ae.getSource() == menuG.getBtnMenuContratos()){ //Ventana menu contratos
            menuContrato.setVisible(true);
            menuG.setVisible(false);
            return;
        }else if(ae.getSource() == menuContrato.getBtnMostrarContratoCliente()){ //Opciones de cambio de menu contratos
            ContratoOpPanel1 panelAgregar = new ContratoOpPanel1();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuContrato.getBtnMostrarContratos()){
            ContratoOpPanel2 panelAgregar = new ContratoOpPanel2();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuContrato.getBtnVolver()){ //Opcion salir de la ventana contrato
            menuContrato.dispose();
            menuG.setVisible(true);
            return;
        }else if(ae.getSource() == menuG.getBtnMenuPlanes()){ //Ventana menu planes
            menuPlan.setVisible(true);
            menuG.setVisible(false);
            return;
        }else if(ae.getSource() == menuPlan.getBtnBuscarRut()){ //Opciones de cambio de menu planes
            return;
        }else if(ae.getSource() == menuPlan.getBtnAgregarPlan()){
            PlanOpPanel1 panelAgregar = new PlanOpPanel1();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuPlan.getBtnMostrarPlanes()){
            PlanOpPanel2 panelAgregar = new PlanOpPanel2();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuPlan.getBtnEliminarPlan()){
            PlanOpPanel3 panelAgregar = new PlanOpPanel3();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuPlan.getBtnEliminarPlanes()){
            PlanOpPanel4 panelAgregar = new PlanOpPanel4();
            menuPlan.mostrarPanel(panelAgregar);
            return;
        }else if(ae.getSource() == menuPlan.getBtnVolver()){ //Opcion salir de la ventana planes
            menuPlan.dispose();
            menuG.setVisible(true);
            return;
        }else if(ae.getSource() == menuG.getBtnExitPr()){
            modeloG.guardarDatos();
            System.exit(0);
            return;
        }
            
    }
    public void agregarCliente(ClienteOpPanel1 panelAgregar){
        panelAgregar.getButEnviarAgregarCliente().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                String nombre = panelAgregar.getTxtFiNombre();
                String apellPat = panelAgregar.getTxtFiApellPat();
                String apellMat = panelAgregar.getTxtFiApellMate();
                int rut = Integer.parseInt(panelAgregar.getTxtFiRut());
                System.out.println(nombre+apellPat+apellMat+rut);
                modeloG.agregarCliente(nombre, apellPat, apellMat, rut);
            return;
            }
            
        });
    }
    public void buscarCliente(ClienteOpPanel2 panelBuscar){
        HashMap<Integer, Cliente> mapaClientes = modeloG.mostrarCliente();
        panelBuscar.getButEnviarBusCliente().addActionListener(new ActionListener() {
        @Override   
        public void actionPerformed(ActionEvent ae) {
                int rutBuscar = Integer.parseInt(panelBuscar.getTextFieldRutBuscar());
                Cliente clienteAux = mapaClientes.get(rutBuscar);
                if(clienteAux != null){
                    panelBuscar.setLabelViewNombre("Nombre: " + clienteAux.getNombre());
                    panelBuscar.setLabelViewApllPat("Apellido Paterno: " + clienteAux.getApellidoPaterno());
                    panelBuscar.setLabelViewApllMat("Apellido Materno: " + clienteAux.getApellidoMaterno());
                    panelBuscar.setLabelViewRut("Rut: " +  clienteAux.getRut());
                    boolean tieneContrato = clienteAux.getTieneContrato();
                    if(tieneContrato)
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: SI");
                    else
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: NO");
                }
                else{
                    panelBuscar.setLabelViewSeEncontroClie("El cliente: ¡NO SE ENCONTRO!");
                }
            }
        });
    }
    
                
}
