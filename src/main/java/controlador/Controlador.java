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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Modelo;
import modelo.Plan;
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
    
    private int rutMenuPlan;
    private String numMenuPlan;
    
    public Controlador () {
        inicializarVentanas();
    }

    public int getRutMenuPlan() {
        return rutMenuPlan;
    }
    public void setRutMenuPlan(int rutMenuPlan) {
        this.rutMenuPlan = rutMenuPlan;
    }
    public String getNumMenuPlan() {
        return numMenuPlan;
    }
    public void setNumMenuPlan(String numMenuPlan) {
        this.numMenuPlan = numMenuPlan;
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
        //Action Listener
        menuPlan.getBtnBuscarRut().addActionListener(this);
        menuPlan.getBtnAgregarPlan().addActionListener(this);
        menuPlan.getBtnMostrarPlanes().addActionListener(this);
        menuPlan.getBtnEliminarPlan().addActionListener(this);
        menuPlan.getBtnModificarPlan().addActionListener(this);
        menuPlan.getBtnVolver().addActionListener(this);
        //Funcionalidades que no deben mostrarse hasta validad el rut
        menuPlan.getJlbTituloOpciones().setVisible(false);
        menuPlan.getBtnAgregarPlan().setVisible(false);
        menuPlan.getBtnMostrarPlanes().setVisible(false);
        menuPlan.getBtnEliminarPlan().setVisible(false);
        menuPlan.getBtnModificarPlan().setVisible(false);
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
        
        if (ae.getSource() == menuG.getBtnCliente()){ //Ventana menu clientes
            menuCliente.setVisible(true);
            menuG.setVisible(false);
            return;
        } 
        else if (ae.getSource() == menuCliente.getButOpcionAgregar()) {  //Opcion agregar clientes
            panelAgregar = new ClienteOpPanel1();
            menuCliente.mostrarPanel(panelAgregar);
            agregarCliente(panelAgregar);
            return;
        }
        else if (ae.getSource() == menuCliente.getButOpcionMostarCliente()) { //Opcion mostrar clientes
            ClienteOpPanel2 panelBuscar = new ClienteOpPanel2();
            menuCliente.mostrarPanel(panelBuscar);
            buscarCliente(panelBuscar);
            return;
        }
        else if (ae.getSource() ==  menuCliente.getButOpcionModificarCliente()) { //Opcion modificar clientes
            ClienteOpPanel3 panelModificar = new ClienteOpPanel3();
            menuCliente.mostrarPanel(panelModificar);
            panelModificar.setViewLabelNomMod(0);
            panelModificar.setViewLabelNomApPat(0);
            panelModificar.setViewLabelApMat(0);
            panelModificar.setViewTextNombreMod(0);
            panelModificar.setViewTextApellPatMod(0);
            panelModificar.setViewTextApellMatMod(0);
            panelModificar.setViewButCambiar(0);
            modDatosClientes(panelModificar);              
            return;
        }
        else if (ae.getSource() ==  menuCliente.getButOpcionEliminarCliente()) { //Eliminar cliente
            ClienteOpPanel4 panelEliminar = new ClienteOpPanel4();
            menuCliente.mostrarPanel(panelEliminar);
            eliminarCliente(panelEliminar);
            return;
        }
        else if (ae.getSource() ==  menuCliente.getButOpcionListarClientes()) { //Listar Clientes
            ClienteOpPanel5 panelListar = new ClienteOpPanel5();
            menuCliente.mostrarPanel(panelListar);
            listarClientes(panelListar);
            return;
        }
        else if (ae.getSource() == menuCliente.getButOpcionExit()) { //Opcion salir de la ventana cliente
            menuCliente.dispose();
            menuG.setVisible(true);
            return;
        }
        else if (ae.getSource() == menuG.getBtnMenuContratos()) { //Ventana menu contratos
            menuContrato.setVisible(true);
            menuG.setVisible(false);
            return;
        }
        else if (ae.getSource() == menuContrato.getBtnMostrarContratoCliente()) { //Opciones de cambio de menu contratos
            ContratoOpPanel1 panelAgregar = new ContratoOpPanel1();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }
        else if (ae.getSource() == menuContrato.getBtnMostrarContratos()) {
            ContratoOpPanel2 panelAgregar = new ContratoOpPanel2();
            menuContrato.mostrarPanel(panelAgregar);
            return;
        }
        else if (ae.getSource() == menuContrato.getBtnVolver()) { //Opcion salir de la ventana contrato
            menuContrato.dispose();
            menuG.setVisible(true);
            return;
        }
        else if (ae.getSource() == menuG.getBtnMenuPlanes()) { //Ventana menu planes
            menuPlan.setVisible(true);
            menuG.setVisible(false);
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnBuscarRut()) { //Opciones de cambio de menu planes
            setRutMenuPlan(Integer.parseInt(menuPlan.getTxtRutBuscado()));
            buscarRut(rutMenuPlan);
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnAgregarPlan()) {
            PlanOpPanel1 panelAgregarPlan = new PlanOpPanel1();
            System.out.println("rut buscado: "+ getRutMenuPlan());
            menuPlan.mostrarPanel(panelAgregarPlan);
            agregarPlan(panelAgregarPlan, getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnMostrarPlanes()) {
            PlanOpPanel2 panelMostrar = new PlanOpPanel2();
            menuPlan.mostrarPanel(panelMostrar);
            mostrarPlanes(panelMostrar, getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnEliminarPlan()) {
            PlanOpPanel3 panelEliminar = new PlanOpPanel3();
            menuPlan.mostrarPanel(panelEliminar);
            eliminarPlan(panelEliminar,getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnModificarPlan()) {
            PlanOpPanel4 panelModificar = new PlanOpPanel4();
            System.out.println("Panel creado" );
            menuPlan.mostrarPanel(panelModificar);
            System.out.println("Mostrandose panel de modificar" );
            modificarPlan(panelModificar, getRutMenuPlan());
            System.out.println("Llamando funcionalidad del metodo modificar" );
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnVolver()) { //Opcion salir de la ventana planes
            menuPlan.dispose();
            menuG.setVisible(true);
            return;
        }
        else if (ae.getSource() == menuG.getBtnExitPr()) {
            modeloG.guardarDatos();
            modeloG.guardarDatosPlanes();
            System.exit(0);
            return;
        }
            
    }
    
    // -----------------------------------------------------------------------------------------------
    // Metodos Ventana MenuCliente.java
    // -----------------------------------------------------------------------------------------------        
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
                panelAgregar.setjLabelConf("El cliente: ¡El cliente se a agregado con exito!");
            return;
            }
            
        });
    }
    
    public void buscarCliente(ClienteOpPanel2 panelBuscar){
        HashMap<Integer, Cliente> mapaClientes = modeloG.mostrarCliente();
        panelBuscar.getButEnviarBusCliente().addActionListener(new ActionListener() {
        @Override   
        public void actionPerformed(ActionEvent ae) {
                //Se reinicia los label
                panelBuscar.setLabelViewNombre("Nombre: ");
                panelBuscar.setLabelViewApllPat("Apellido Paterno: ");
                panelBuscar.setLabelViewApllMat("Apellido Materno: ");
                panelBuscar.setLabelViewRut("Rut: ");
                panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: ");
                panelBuscar.setLabelViewSeEncontroClie("El cliente: ",2);
                //inicia busqueda de cliente
                int rutBuscar = Integer.parseInt(panelBuscar.getTextFieldRutBuscar());
                Cliente clienteAux = mapaClientes.get(rutBuscar);
                if(clienteAux != null){ //verifivar si el cliente existe
                    panelBuscar.setLabelViewNombre("Nombre: " + clienteAux.getNombre());
                    panelBuscar.setLabelViewApllPat("Apellido Paterno: " + clienteAux.getApellidoPaterno());
                    panelBuscar.setLabelViewApllMat("Apellido Materno: " + clienteAux.getApellidoMaterno());
                    panelBuscar.setLabelViewRut("Rut: " +  clienteAux.getRut());
                    boolean tieneContrato = clienteAux.getTieneContrato();
                    if(tieneContrato)
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: SI");
                    else
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: NO");
                    panelBuscar.setLabelViewSeEncontroClie("El cliente: ¡SE ENCONTRO!",1);
                }
                else{
                    panelBuscar.setLabelViewSeEncontroClie("El cliente: ¡NO SE ENCONTRO!",0);
                }
            }
        });
        
    }
    
    public void modDatosClientes(ClienteOpPanel3 panelModificar){
        
        panelModificar.getButBuscarMod().addActionListener(new ActionListener() {
        @Override   
        public void actionPerformed(ActionEvent ae) {
            //Se reinicia los label y txtfield
            panelModificar.setViewLabelNomMod(0);
            panelModificar.setViewLabelNomApPat(0);
            panelModificar.setViewLabelApMat(0);
            panelModificar.setViewTextNombreMod(0);
            panelModificar.setViewTextApellPatMod(0);
            panelModificar.setViewTextApellMatMod(0);
            panelModificar.setViewButCambiar(0);
            String nombre = panelModificar.getTextRutMod();
            String opcion = panelModificar.getTextOpMod(); 
            //Se hace visible la opcion correspondiente
            if("1".equals(opcion)){
                panelModificar.setViewLabelNomMod(1);
                panelModificar.setViewTextNombreMod(1);
                panelModificar.setViewButCambiar(1);
            }
            else if("2".equals(opcion)){
                panelModificar.setViewLabelNomApPat(1);
                panelModificar.setViewLabelApMat(1);
                panelModificar.setViewTextApellPatMod(1);
                panelModificar.setViewTextApellMatMod(1);
                panelModificar.setViewButCambiar(1);
            }
            else if("3".equals(opcion)){
                panelModificar.setViewLabelNomMod(1);
                panelModificar.setViewTextNombreMod(1); 
                panelModificar.setViewLabelNomApPat(1);
                panelModificar.setViewLabelApMat(1);
                panelModificar.setViewTextApellPatMod(1);
                panelModificar.setViewTextApellMatMod(1);
                panelModificar.setViewButCambiar(1);
            }
            panelModificar.getButCambiar().addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent al) {
                    int rut = Integer.parseInt(panelModificar.getTextRutMod());
                    if("1".equals(opcion)){
                        modeloG.modificarDatosCliente(rut,panelModificar.getTextNombreMod(),"","",opcion);
                        panelModificar.setLabelConfirmacionMod("El cliente: ¡SE CAMBIARON LOS DATOS CON EXITO!",1);
                    }
                    else if("2".equals(opcion)){
                        String apPat = panelModificar.getTextApellPatMod();
                        String apMat = panelModificar.getTextApellMatMod();
                        modeloG.modificarDatosCliente(rut,"",apPat,apMat,opcion);
                        panelModificar.setLabelConfirmacionMod("El cliente: ¡SE CAMBIARON LOS DATOS CON EXITO!",1);
                    }else if("3".equals(opcion)){
                        String apPat = panelModificar.getTextApellPatMod();
                        String apMat = panelModificar.getTextApellMatMod();
                        modeloG.modificarDatosCliente(rut,panelModificar.getTextNombreMod(),apPat,apMat,opcion);
                        panelModificar.setLabelConfirmacionMod("El cliente: ¡SE CAMBIARON LOS DATOS CON EXITO!",1);
                    }
                    else
                        panelModificar.setLabelConfirmacionMod("El cliente: ¡OCURRIO UN ERROR!",0);
                }
                });
            
            }
        });
    }
    
    public void eliminarCliente(ClienteOpPanel4 panelEliminar){  
        panelEliminar.getButDelete().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                panelEliminar.setLabelConfirmacionDelete("El cliente: ",2);
                int rutDelete = Integer.parseInt(panelEliminar.getTextRutDelete());
                if(modeloG.deleteCliente(rutDelete))
                    panelEliminar.setLabelConfirmacionDelete("El cliente: ¡SE ELIMINO CORRECTAMENTE!",1);
                else
                    panelEliminar.setLabelConfirmacionDelete("El cliente: ¡OCURRIO UN ERROR!",0);
            return;
            }
            
        });
    }
    
    public void listarClientes(ClienteOpPanel5 panelListar){
        String[] arregloClientes = modeloG.listarCliente();
        panelListar.listTabClientes(arregloClientes);
    }

    // -----------------------------------------------------------------------------------------------
    // Metodos Ventana MenuPlan.java
    // -----------------------------------------------------------------------------------------------    
    private void buscarRut(int rutBuscado) {
        HashMap<Integer, Cliente> mapaClientesClonado = modeloG.mostrarCliente();
        
        Cliente clienteAux = mapaClientesClonado.get(rutBuscado);
        
        if(clienteAux == null){
            menuPlan.setJlbExisteRut(rutBuscado +" no existe como cliente");
            menuPlan.getJlbTituloOpciones().setVisible(false);
            menuPlan.getBtnAgregarPlan().setVisible(false);
            menuPlan.getBtnMostrarPlanes().setVisible(false);
            menuPlan.getBtnEliminarPlan().setVisible(false);
            menuPlan.getBtnModificarPlan().setVisible(false);
        }
        else {
            menuPlan.setJlbExisteRut("Cliente "+rutBuscado+" encontrado");
            menuPlan.getJlbTituloOpciones().setVisible(true);
            menuPlan.getBtnAgregarPlan().setVisible(true);
            menuPlan.getBtnMostrarPlanes().setVisible(true);
            menuPlan.getBtnEliminarPlan().setVisible(true);
            menuPlan.getBtnModificarPlan().setVisible(true);
        }
    }
    
    private void agregarPlan(PlanOpPanel1 panelAgregarPlan, int rut) {
        panelAgregarPlan.getBtnSelecPlanUno().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(0, rut);
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                panelAgregarPlan.setJlbNewCantGigas( planContratado.getCantGigaBytes() + "Gigabytes");
                panelAgregarPlan.setJlbNewCantMinutos(planContratado.getCantMinutos() + "Minutos");
                panelAgregarPlan.setJlbNewNombrePlan(planContratado.getNombrePlan());
                panelAgregarPlan.setJlbNewNumTelefono(planContratado.getNumeroTelefono());
                panelAgregarPlan.setJlbNewPrecio(planContratado.getPrecio()+"");
                
                panelAgregarPlan.getJlbNuevoPlanAdquirido().setVisible(true);
                panelAgregarPlan.getJlbPrefijoNumero().setVisible(true);
                panelAgregarPlan.getJlbNewCantGigas().setVisible(true);
                panelAgregarPlan.getJlbNewCantMinutos().setVisible(true);
                panelAgregarPlan.getJlbNewNombrePlan().setVisible(true);
                panelAgregarPlan.getJlbNewNumTelefono().setVisible(true);
                panelAgregarPlan.getJlbNewPrecio().setVisible(true);
            }
        }
        );
        
        panelAgregarPlan.getBtnSelecPlanDos().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(1,rut);
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                panelAgregarPlan.setJlbNewCantGigas( planContratado.getCantGigaBytes() + "Gigabytes");
                panelAgregarPlan.setJlbNewCantMinutos(planContratado.getCantMinutos() + "Minutos");
                panelAgregarPlan.setJlbNewNombrePlan(planContratado.getNombrePlan());
                panelAgregarPlan.setJlbNewNumTelefono(planContratado.getNumeroTelefono());
                panelAgregarPlan.setJlbNewPrecio(planContratado.getPrecio()+"");
                
                panelAgregarPlan.getJlbNuevoPlanAdquirido().setVisible(true);
                panelAgregarPlan.getJlbPrefijoNumero().setVisible(true);
                panelAgregarPlan.getJlbNewCantGigas().setVisible(true);
                panelAgregarPlan.getJlbNewCantMinutos().setVisible(true);
                panelAgregarPlan.getJlbNewNombrePlan().setVisible(true);
                panelAgregarPlan.getJlbNewNumTelefono().setVisible(true);
                panelAgregarPlan.getJlbNewPrecio().setVisible(true);
            }
        }
        );
        
        panelAgregarPlan.getBtnSelecPlanTres().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(2,rut);
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                panelAgregarPlan.setJlbNewCantGigas( planContratado.getCantGigaBytes() + "Gigabytes");
                panelAgregarPlan.setJlbNewCantMinutos(planContratado.getCantMinutos() + "Minutos");
                panelAgregarPlan.setJlbNewNombrePlan(planContratado.getNombrePlan());
                panelAgregarPlan.setJlbNewNumTelefono(planContratado.getNumeroTelefono());
                panelAgregarPlan.setJlbNewPrecio(planContratado.getPrecio()+"");
                
                panelAgregarPlan.getJlbNuevoPlanAdquirido().setVisible(true);
                panelAgregarPlan.getJlbPrefijoNumero().setVisible(true);
                panelAgregarPlan.getJlbNewCantGigas().setVisible(true);
                panelAgregarPlan.getJlbNewCantMinutos().setVisible(true);
                panelAgregarPlan.getJlbNewNombrePlan().setVisible(true);
                panelAgregarPlan.getJlbNewNumTelefono().setVisible(true);
                panelAgregarPlan.getJlbNewPrecio().setVisible(true);
            }
        }
        );
        
    }       
    
    private void mostrarPlanes(PlanOpPanel2 panel, int rut) {
        HashMap<Integer, Cliente> mapaClientesClonado = modeloG.mostrarCliente();
        panel.setJlbNombreCliente(mapaClientesClonado.get(rut).getNombre());
        String[] arregloPlanes = modeloG.listarPlanes(rut);
        panel.listTabPlanes(arregloPlanes);
    }

    private void eliminarPlan(PlanOpPanel3 panel, int rut) {
        panel.getJlbEstadoPlan().setVisible(false);
        panel.getBtnEliminarPlan().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String numPlanEliminar = panel.getTxtEliminarPlan();
                if(modeloG.eliminarPlan(rut, numPlanEliminar)) {
                    panel.setJlbEstadoPlan("El numero +56 9 " + numPlanEliminar + " fue eliminado correctamente.");
                    panel.getJlbEstadoPlan().setVisible(true);
                }
                else {
                    panel.setJlbEstadoPlan("El numero +56 9 " + numPlanEliminar + " no existe.");
                    panel.getJlbEstadoPlan().setVisible(true);
                }
            }
            
        });
    }

    private void modificarPlan(PlanOpPanel4 panel, int rut) {
        actualizarPanelModificar(panel,false,-1);
        panel.getJlbNumeroNoEncontrado().setVisible(false);
        
        panel.getBtnModificarPlan().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int planActual;
                setNumMenuPlan(panel.getTxtModificarPlan());
                if (modeloG.existeNumero(getNumMenuPlan(),rut)) {
                    panel.getJlbNumeroNoEncontrado().setVisible(false);
                    planActual = modeloG.planActual(rut, getNumMenuPlan());
                    actualizarPanelModificar(panel,true,planActual);
                }
                else {
                    panel.getJlbNumeroNoEncontrado().setVisible(true);
                    actualizarPanelModificar(panel,false,-1);
                }
            }
        });
        
        panel.getBtnModificarPlanInicial().addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.modificarPlan(rut, getNumMenuPlan(), 0);
                panel.getJlbCambiadoInicial().setVisible(true);
                panel.getJlbCambiadoPro().setVisible(false);
                panel.getJlbCambiadoUltra().setVisible(false);
                
                panel.getJlbPlanUltraActual().setVisible(false);
                panel.getJlbPlanProActual().setVisible(false);
                
                panel.getBtnModificarPlanInicial().setVisible(false);
                panel.getBtnModificarPlanPro().setVisible(false);
                panel.getBtnModificarPlanUltra().setVisible(false);
            }
            
        });
        
        panel.getBtnModificarPlanPro().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                modeloG.modificarPlan(rut,getNumMenuPlan(),1);
                panel.getJlbCambiadoInicial().setVisible(false);
                panel.getJlbCambiadoPro().setVisible(true);
                panel.getJlbCambiadoUltra().setVisible(false);
                
                panel.getJlbPlanInicialActual().setVisible(false);
                panel.getJlbPlanUltraActual().setVisible(false);
                
                panel.getBtnModificarPlanInicial().setVisible(false);
                panel.getBtnModificarPlanPro().setVisible(false);
                panel.getBtnModificarPlanUltra().setVisible(false);
            }
        });
        
        panel.getBtnModificarPlanUltra().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                modeloG.modificarPlan(rut,getNumMenuPlan(),2);
                panel.getJlbCambiadoInicial().setVisible(false);
                panel.getJlbCambiadoPro().setVisible(false);
                panel.getJlbCambiadoUltra().setVisible(true);
                
                panel.getJlbPlanInicialActual().setVisible(false);
                panel.getJlbPlanProActual().setVisible(false);
                
                panel.getBtnModificarPlanInicial().setVisible(false);
                panel.getBtnModificarPlanPro().setVisible(false);
                panel.getBtnModificarPlanUltra().setVisible(false);
            }
         });
        
        
    }
    
    private void actualizarPanelModificar(PlanOpPanel4 panel, boolean visibilidad, int planActual) {
        panel.getJlbNombreInicial().setVisible(visibilidad);
        panel.getJlbNombrePro().setVisible(visibilidad);
        panel.getJlbNombreUltra().setVisible(visibilidad);
        panel.getJlbGigasInicial().setVisible(visibilidad);
        panel.getJlbGigasPro().setVisible(visibilidad);
        panel.getJlbGigasUltra().setVisible(visibilidad);
        panel.getJlbMinutosInicial().setVisible(visibilidad);
        panel.getJlbMinutosPro().setVisible(visibilidad);
        panel.getJlbMinutosUltra().setVisible(visibilidad);
        panel.getJlbPrecioInicial().setVisible(visibilidad);
        panel.getJlbPrecioPro().setVisible(visibilidad);
        panel.getJlbPrecioUltra().setVisible(visibilidad);
        
        //Tiene Plan Inicial -> puede cambiarse entre Plan Pro y Plan Ultra
        if (planActual == 0) {
            panel.getJlbPlanInicialActual().setVisible(true);
            panel.getJlbPlanProActual().setVisible(false);
            panel.getJlbPlanUltraActual().setVisible(false);
            panel.getBtnModificarPlanInicial().setVisible(false);
            panel.getBtnModificarPlanPro().setVisible(true);
            panel.getBtnModificarPlanUltra().setVisible(true);
        } 
        //Tiene Plan Pro -> puede cambiarse entre Plan Inicial y Plan Ultra
        else if (planActual == 1) {
            panel.getJlbPlanInicialActual().setVisible(false);
            panel.getJlbPlanProActual().setVisible(true);
            panel.getJlbPlanUltraActual().setVisible(false);
            panel.getBtnModificarPlanInicial().setVisible(true);
            panel.getBtnModificarPlanPro().setVisible(false);
            panel.getBtnModificarPlanUltra().setVisible(true);
        } 
        //Tiene Plan Ultra -> puede cambiarse entre Plan Inicial y Plan Pro
        else if (planActual == 2) {
            panel.getJlbPlanInicialActual().setVisible(false);
            panel.getJlbPlanProActual().setVisible(false);
            panel.getJlbPlanUltraActual().setVisible(true);
            panel.getBtnModificarPlanInicial().setVisible(true);
            panel.getBtnModificarPlanPro().setVisible(true);
            panel.getBtnModificarPlanUltra().setVisible(false);            
        }
        //No tiene ningun plan o el numero no fue encontrado, por lo que no se puede cambiar a nada
        else {
            panel.getJlbPlanInicialActual().setVisible(false);
            panel.getJlbPlanProActual().setVisible(false);
            panel.getJlbPlanUltraActual().setVisible(false);
            panel.getBtnModificarPlanInicial().setVisible(false);
            panel.getBtnModificarPlanPro().setVisible(false);
            panel.getBtnModificarPlanUltra().setVisible(false);          
            
        }
        panel.getJlbCambiadoInicial().setVisible(false);
        panel.getJlbCambiadoPro().setVisible(false);
        panel.getJlbCambiadoUltra().setVisible(false);
        
        
    }
}
