/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.opencsv.exceptions.CsvValidationException;
import excepciones.*;
import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.JFrame;
import vistas.*;
import vistasPanel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import modelo.*;

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
    //private Errores vistaError;
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
            ContratoOpPanel1 panelBuscarContr = new ContratoOpPanel1();
            menuContrato.mostrarPanel(panelBuscarContr);
            buscarContrato(panelBuscarContr);
            return;
        }
        else if (ae.getSource() == menuContrato.getBtnMostrarContratos()) {
            ContratoOpPanel2 panelListarContr = new ContratoOpPanel2();
            menuContrato.mostrarPanel(panelListarContr);
            listarContrato(panelListarContr);
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
            buscarRut(menuPlan.getTxtRutBuscado());
        }
        else if (ae.getSource() == menuPlan.getBtnAgregarPlan()) { //Agregar plan a un cliente
            PlanOpPanel1 panelAgregarPlan = new PlanOpPanel1();
            menuPlan.mostrarPanel(panelAgregarPlan);
            agregarPlan(panelAgregarPlan, getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnMostrarPlanes()) { // Mostrar planes de un cliente
            PlanOpPanel2 panelMostrarPlan = new PlanOpPanel2();
            menuPlan.mostrarPanel(panelMostrarPlan);
            mostrarPlanes(panelMostrarPlan, getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnEliminarPlan()) { //Eliminar un plan de un cliente
            PlanOpPanel3 panelEliminarPlan = new PlanOpPanel3();
            menuPlan.mostrarPanel(panelEliminarPlan);
            eliminarPlan(panelEliminarPlan,getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnModificarPlan()) { //Modificar un plan de un cliente
            PlanOpPanel4 panelModificarPlan = new PlanOpPanel4();
            menuPlan.mostrarPanel(panelModificarPlan);
            modificarPlan(panelModificarPlan, getRutMenuPlan());
            return;
        }
        else if (ae.getSource() == menuPlan.getBtnVolver()) { //Opcion salir de la ventana planes
            menuPlan.dispose();
            menuG.setVisible(true);
            return;
        }
        else if (ae.getSource() == menuG.getBtnExitPr()) { //Opcion para finalizar correctamente el programa
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
                try {
                    String nombre = panelAgregar.getTxtFiNombre();
                    String apellPat = panelAgregar.getTxtFiApellPat();
                    String apellMat = panelAgregar.getTxtFiApellMate();
                    int rut = Integer.parseInt(panelAgregar.getTxtFiRut());
                    modeloG.noExisteCliente(rut+"");
                    modeloG.nombreApellidosValido(nombre, apellPat, apellMat);
                    modeloG.agregarCliente(nombre, apellPat, apellMat, rut);
                    panelAgregar.setjLabelConf("El cliente: ¡El cliente se a agregado con exito!",GREEN);
                } catch (RutYaRegistradoException | RutInvalidoException | ClienteInvalidoException ex) {
                    panelAgregar.setjLabelConf("Error : " + ex.getMessage(),RED);
                } catch (NumberFormatException ex) {
                    panelAgregar.setjLabelConf("Error: " + "El RUT ingresado contiene caracteres no numericos", RED);
                }
            }
        });
    }
    
    public void buscarCliente(ClienteOpPanel2 panelBuscar){
        panelBuscar.getButEnviarBusCliente().addActionListener(new ActionListener() {
            @Override   
            public void actionPerformed(ActionEvent ae) {
                panelBuscar.setLabelViewNombre("Nombre: ");
                panelBuscar.setLabelViewApllPat("Apellido Paterno: ");
                panelBuscar.setLabelViewApllMat("Apellido Materno: ");
                panelBuscar.setLabelViewRut("Rut: ");
                panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: ");
                panelBuscar.setLabelViewSeEncontroClie("El cliente: ",black);
            
                try {
                    Cliente clienteBuscado = modeloG.existeCliente(panelBuscar.getTextFieldRutBuscar());
                
                    panelBuscar.setLabelViewNombre("Nombre: " + clienteBuscado.getNombre());
                    panelBuscar.setLabelViewApllPat("Apellido Paterno: " + clienteBuscado.getApellidoPaterno());
                    panelBuscar.setLabelViewApllMat("Apellido Materno: " + clienteBuscado.getApellidoMaterno());
                    panelBuscar.setLabelViewRut("Rut: " +  clienteBuscado.getRut());
                    boolean tieneContrato = clienteBuscado.getTieneContrato();
                    if(tieneContrato)
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: SI");
                    else
                        panelBuscar.setLabelViewTieneContr("Tiene un contrato activo: NO");
                
                    panelBuscar.setLabelViewSeEncontroClie("El cliente: ¡SE ENCONTRO!",green);
                } catch (NumberFormatException ex) {
                    panelBuscar.setLabelViewSeEncontroClie("Error: El RUT ingresado contiene caracteres no numericos",red);
                } catch (RutNoRegistradoException | RutInvalidoException ex) {
                    panelBuscar.setLabelViewSeEncontroClie("Error: " + ex.getMessage(),red);
                }
            
            }
        });
        
    }
    
    public void modDatosClientes(ClienteOpPanel3 panelModificar) {
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
    
    public void mostrar(ClienteOpPanel3 panel, int opcion) {
        
    }
    
    public void eliminarCliente(ClienteOpPanel4 panelEliminar){  
        panelEliminar.getButDelete().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                try {
                    panelEliminar.setLabelConfirmacionDelete("El cliente: ",black);
                    int rutDelete = Integer.parseInt(panelEliminar.getTextRutDelete());
                    modeloG.deleteCliente(rutDelete);
                    panelEliminar.setLabelConfirmacionDelete("El cliente: ¡SE ELIMINO CORRECTAMENTE!",green);
                } catch (RutNoRegistradoException | RutInvalidoException ex) {
                    panelEliminar.setLabelConfirmacionDelete("Error: " + ex.getMessage(),red);
                } catch (NumberFormatException ex) {
                    panelEliminar.setLabelConfirmacionDelete("Error: " + "El RUT ingresado contiene caracteres no numericos",red);
                }
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
    private void buscarRut(String rutBuscado)  {
        try {
            modeloG.existeCliente(rutBuscado);
            mostrarOpcionesMenuPlan(true);
            menuPlan.setJlbExisteRut("Cliente encontrado", green);
            setRutMenuPlan(Integer.parseInt(rutBuscado));
        } catch (RutNoRegistradoException | RutInvalidoException ex) {
            menuPlan.setJlbExisteRut(ex.getMessage(), red);
            mostrarOpcionesMenuPlan(false);
        }
    }
    
    private void mostrarOpcionesMenuPlan(boolean visible) {
        menuPlan.getJlbTituloOpciones().setVisible(visible);
        menuPlan.getBtnAgregarPlan().setVisible(visible);
        menuPlan.getBtnMostrarPlanes().setVisible(visible);
        menuPlan.getBtnEliminarPlan().setVisible(visible);
        menuPlan.getBtnModificarPlan().setVisible(visible);
    }
    
    private void agregarPlan(PlanOpPanel1 panelAgregarPlan, int rut) {
        panelAgregarPlan.getBtnSelecPlanPerso().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int cantGigaBytes = Integer.parseInt(panelAgregarPlan.getTxtGigasPlanPerso());
                    int cantMinutos = Integer.parseInt(panelAgregarPlan.getTxtMinutosPlanPerso());
                    String numeroTelefono = panelAgregarPlan.getTxtNumeroPlanPerso();

                    modeloG.agregarPlan(rut,cantGigaBytes, cantMinutos,numeroTelefono);

                    Plan planContratado = modeloG.ultimoPlanContratado(rut);
                    mostrarUltimoPlanContratado(panelAgregarPlan, planContratado);
                    panelAgregarPlan.setJlbNumeroPersoVacio("Si no introduce un numero le generaremos uno", new Color(102,102,102));
                } catch (NumberFormatException ex) {
                    panelAgregarPlan.setJlbNumeroPersoVacio("Error: "+"cantidad de GB's o minutos invalida.", red);
                } catch (NumeroInvalidoException | NumeroYaRegistradoException ex) {
                    panelAgregarPlan.setJlbNumeroPersoVacio("Error: "+ ex.getMessage(), red);
                }
            }
        });
        
        panelAgregarPlan.getBtnSelecPlanInicial().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(0, rut);
                
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                mostrarUltimoPlanContratado(panelAgregarPlan, planContratado);
            }
        });
        
        panelAgregarPlan.getBtnSelecPlanPro().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(1,rut);
                
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                mostrarUltimoPlanContratado(panelAgregarPlan, planContratado);
            }
        });
        
        panelAgregarPlan.getBtnSelecPlanUltra().addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloG.agregarPlan(2,rut);
                
                Plan planContratado = modeloG.ultimoPlanContratado(rut);
                
                mostrarUltimoPlanContratado(panelAgregarPlan, planContratado);
            }
        });
        
    }       
    
    private void mostrarUltimoPlanContratado(PlanOpPanel1 panel, Plan ultimoPlan) {
        panel.setJlbNewCantGigas( ultimoPlan.getCantGigaBytes() + "Gigabytes");
        panel.setJlbNewCantMinutos(ultimoPlan.getCantMinutos() + "Minutos");
        panel.setJlbNewNombrePlan(ultimoPlan.getNombrePlan());
        panel.setJlbNewNumTelefono(ultimoPlan.getNumeroTelefono());
        panel.setJlbNewPrecio("$" + ultimoPlan.getPrecio());
                
        panel.getJlbNuevoPlanAdquirido().setVisible(true);
        panel.getJlbPrefijoNumero().setVisible(true);
        panel.getJlbNewCantGigas().setVisible(true);
        panel.getJlbNewCantMinutos().setVisible(true);
        panel.getJlbNewNombrePlan().setVisible(true);
        panel.getJlbNewNumTelefono().setVisible(true);
        panel.getJlbNewPrecio().setVisible(true);
    }
    
    private void mostrarPlanes(PlanOpPanel2 panel, int rut) {
        String[] arregloPlanes = modeloG.listarPlanes(rut);
        panel.listTabPlanes(arregloPlanes);
    }

    private void eliminarPlan(PlanOpPanel3 panel, int rut) {
        panel.getJlbEstadoPlan().setVisible(false);
        panel.getBtnEliminarPlan().addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numPlanEliminar = panel.getTxtEliminarPlan();
                try {
                    modeloG.eliminarPlan(rut, numPlanEliminar);
                    panel.setJlbEstadoPlan("El numero +56 9 " + numPlanEliminar + " fue eliminado correctamente.", green);
                    panel.getJlbEstadoPlan().setVisible(true);
                } catch (NumeroInvalidoException | NumeroNoRegistradoException ex) {
                    panel.setJlbEstadoPlan("Error: "+ ex.getMessage(), red);
                 }
            } 
        });
    }

    private void modificarPlan(PlanOpPanel4 panel, int rut) {
        actualizarPanelModificar(panel,false,-1);
        panel.setJlbNumeroNoEncontrado("",black);
        
        panel.getBtnModificarPlan().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int planActual;
                setNumMenuPlan(panel.getTxtModificarPlan());
                try {
                    modeloG.existeNumeroEnCliente(getNumMenuPlan(), rut);
                    planActual = modeloG.planActual(rut, getNumMenuPlan());
                    actualizarPanelModificar(panel,true,planActual);
                    panel.setJlbNumeroNoEncontrado("",black);
                } catch (NumeroInvalidoException | NumeroNoRegistradoException ex) {
                    actualizarPanelModificar(panel,false,-1);
                    panel.setJlbNumeroNoEncontrado("Error: " + ex.getMessage(),red);
                } catch (Exception ex) {
                    actualizarPanelModificar(panel,false,-1);
                    panel.setJlbNumeroNoEncontrado("Error: " + ex.getMessage(),red);
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
        //Tiene un Plan Personalizado -> puede cambiarse a Inicial, Pro o Ultra
        else if (planActual == 3) {
            panel.getJlbPlanInicialActual().setVisible(false);
            panel.getJlbPlanProActual().setVisible(false);
            panel.getJlbPlanUltraActual().setVisible(false);
            panel.getBtnModificarPlanInicial().setVisible(true);
            panel.getBtnModificarPlanPro().setVisible(true);
            panel.getBtnModificarPlanUltra().setVisible(true);
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
    
    // -----------------------------------------------------------------------------------------------
    // Metodos Ventana Contratos
    // -----------------------------------------------------------------------------------------------

    public void buscarContrato(ContratoOpPanel1 panelBuscarContr){
        // se reinician los mensajes
        panelBuscarContr.setLabelNombre("Nombre : ");
        panelBuscarContr.setLabelRut("Rut : ");
        panelBuscarContr.setLabelCantPlanes("Cantidad de planes : ");
        panelBuscarContr.setLabelPrecio("Precio del contrato : ");
        
        panelBuscarContr.getButBuscarContr().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int rutBuscar = Integer.parseInt(panelBuscarContr.getTxtpRutCliente());
            if(modeloG.buscarContrato(rutBuscar) != null){
                Contrato contrCliente = modeloG.buscarContrato(rutBuscar);
                panelBuscarContr.setLabelNombre("Nombre : " + contrCliente.getNombreCompleto());
                panelBuscarContr.setLabelRut("Rut : " + Integer.toString(contrCliente.getRut()));
                panelBuscarContr.setLabelCantPlanes("Cantidad de planes : " + Integer.toString(contrCliente.getCantidadPlanes()));
                panelBuscarContr.setLabelPrecio("Precio del contrato : " + Double.toString(contrCliente.getPrecioPlanes()));
            }
            }
            
        });
    }

    public void listarContrato(ContratoOpPanel2 panelListarContr){
        
        panelListarContr.getButListarContr().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
                int filtro = Integer.parseInt(panelListarContr.getTextFiltro());
                String[] arregloContratos = modeloG.listarContratos(filtro);
                panelListarContr.listTabContratos(arregloContratos);
            }
        });
        }
}
