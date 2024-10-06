/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.opencsv.exceptions.CsvValidationException;
import modelo.Cliente;
import modelo.Menu;
import controlador.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Emilio
 */
public class AdministradorDeContratosEmpresaTelefonica {

    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static HashMap<Integer,Cliente> mapaClientes = new HashMap<>();
    
    public static void main(String[] args) throws CsvValidationException{

        String opcion;
        Scanner lector = new Scanner(System.in);
        
        Controlador controladorV = new Controlador();
        controladorV.iniciar();
       
        do{
            Menu.menuGeneral();
            opcion = lector.nextLine();
            switch (opcion){
                case "0":
                    Menu.menuExit();
                    break;
                case "2":
                    menuContratos(lector);
                    break;
                default:
                    if(!"0".equals(opcion))
                        Menu.menuError();
                    break;
            }
        }while(!"0".equals(opcion));

        lector.close();
    }
    
    public static void menuContratos(Scanner lector){
        String opcionCliente;
        do{
            Menu.menuContratosPrint();
            opcionCliente = lector.nextLine();
            int rut,largoPlanes;
            double sumaPlanes;
            Cliente clienteAux;
            
            switch (opcionCliente){
                case "1":
                    System.out.println("Ingrese el rut del usuario al cual desea ver el contrato");
                    rut = lector.nextInt();
                    lector.nextLine();
                    clienteAux = mapaClientes.get(rut);
                    if(clienteAux != null){
                        if(clienteAux.getTieneContrato()){
                            System.out.println("-----------------------------------------");
                            System.out.println("El cliente " + clienteAux.getNombreCompleto());
                            System.out.println("rut : " + clienteAux.getRut());
                            sumaPlanes = 0;
                            largoPlanes=clienteAux.getListaPlanes().size();
                            for(int i = 0; i < largoPlanes; i++)
                               sumaPlanes += clienteAux.getListaPlanes().get(i).getPrecio();
                            System.out.println("El contrato del cliente tiene un valor de " + sumaPlanes);
                            System.out.println("-----------------------------------------");
                        }
                        else{
                            System.out.println("-----------------------------------------");
                            System.out.println("El cliente " + clienteAux.getNombreCompleto());
                            System.out.println("rut : " + clienteAux.getRut());
                            System.out.println("NO TIENE CONTRATO ");
                            System.out.println("-----------------------------------------");
                        }
                    }
                    else
                        System.out.println("El usuario no se a encontrado");
                    break;
                        
                case "2":
                    for(int i = 0; i < listaClientes.size(); i++){
                        clienteAux = listaClientes.get(i);
                        if(clienteAux.getTieneContrato()){
                            System.out.println("-----------------------------------------");
                            System.out.println("El cliente " + clienteAux.getNombreCompleto());
                            System.out.println("rut : " + clienteAux.getRut());
                            sumaPlanes = 0;
                            largoPlanes = clienteAux.getListaPlanes().size();
                            for(int k = 0; k < largoPlanes; k++)
                               sumaPlanes += clienteAux.getListaPlanes().get(k).getPrecio();
                            System.out.println("El contrato del cliente tiene un valor de " + sumaPlanes);
                            System.out.println("-----------------------------------------");
                        }
                        else{
                            System.out.println("-----------------------------------------");
                            System.out.println("El cliente " + clienteAux.getNombreCompleto());
                            System.out.println("rut : " + clienteAux.getRut());
                            System.out.println("NO TIENE CONTRATO ");
                            System.out.println("-----------------------------------------");
                        }
                    }        
                    break;
                    
                default:
                    if (!"3".equals(opcionCliente))
                        Menu.menuError();
                    break;
            }
                    
        }while(!"3".equals(opcionCliente));
    }
    
}
