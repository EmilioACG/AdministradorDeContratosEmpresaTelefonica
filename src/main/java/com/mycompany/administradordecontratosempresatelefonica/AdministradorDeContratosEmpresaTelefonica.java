/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.opencsv.exceptions.CsvValidationException;
import modelo.Cliente;
import modelo.Menu;
import modelo.Plan;
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
    private static HashMap<String, Cliente> mapaTelefonos = new HashMap<>();
    private static Plan ofertaPlanes[] = new Plan[3];
    
    public static void main(String[] args) throws CsvValidationException{

        String opcion;
        Scanner lector = new Scanner(System.in);
        //Se llama al metodo que inicializa datos
        datosIniciales();
        
        Controlador controladorV = new Controlador();
        controladorV.iniciar();
       
        
        do{
            Menu.menuGeneral();
            opcion = lector.nextLine();
            switch (opcion){
                case "0":
                    Menu.menuExit();
                    break;
                case "1":
                    menuCliente(lector);
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
    
    public static void menuCliente(Scanner lector){
        String opcionCliente;
        String nombre;
        String apePat;
        String apeMat;
        Cliente clienteAux = null;
        int rut,largo;
        
        do{
            Menu.menuClientePrint();
            
            opcionCliente = lector.nextLine();
            
            switch(opcionCliente){
                case "1":
                    Cliente nuevoCliente;
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese su nombre...");
                    nombre = lector.next();
                    System.out.println("Ingrese su apellido paterno...");
                    apePat = lector.next();
                    System.out.println("Ingrese su apellido materno...");
                    apeMat = lector.next();
                    System.out.println("Ingrese su rut...");
                    do{
                        rut = lector.nextInt();
                        lector.nextLine();
                        clienteAux = mapaClientes.get(rut);
                            if(clienteAux != null)
                                System.out.println("El rut ya existe ingrese otro:");
                    }while(clienteAux != null);                  
                    System.out.println("-----------------------------------------");
                    nuevoCliente = new Cliente(nombre,apePat, apeMat, rut);
                    listaClientes.add(nuevoCliente);
                    mapaClientes.put(rut,nuevoCliente);
                    System.out.println("tamaño planes lista " + mapaClientes.get(rut).getListaPlanes().size());
                    break;
                   
                case "2": 
                    System.out.print("Ingrese el rut del cliente que desea buscar:");
                    rut = lector.nextInt();
                    lector.nextLine();
                    clienteAux = mapaClientes.get(rut);
                    if(clienteAux != null){
                        System.out.println("Los datos del cliente son:");
                        System.out.println(clienteAux.mostrarDatos()); 
                    }
                    else
                        System.out.println("El usuario no se a encontrado");   
                    break;
                    
                    
                case "3":
                    System.out.println("Ingrese el rut del usuario que desea modificar: ");
                    rut = lector.nextInt();
                    lector.nextLine();
                    Menu.menuModificarCliente();
                    opcionCliente = lector.nextLine();
                    System.out.println("-----------------------------------------");
                    if("1".equals(opcionCliente) || "3".equals(opcionCliente)){

                        System.out.println("Ingrese su nombre actualizado...");
                        nombre = lector.next();
                        mapaClientes.get(rut).modificarDatosClientes(nombre);
                    }
                    
                    if("2".equals(opcionCliente) || "3".equals(opcionCliente)){
                        System.out.println("Ingrese su apellido paterno actualizado...");
                        apePat = lector.next();
                        System.out.println("Ingrese su apellido materno actualizado...");
                        apeMat = lector.next();
                        mapaClientes.get(rut).modificarDatosClientes(apePat, apeMat);
                    }
                    System.out.println("-----------------------------------------");
                    break;
                    
                    
                case "4":
                    System.out.println("¡ADVERTENCIA!, NO SE RECOMIENDA ELIMINAR CLIENTES");
                    System.out.println("¿QUIERES SEGUIR?");
                    System.out.println("SI-Culaquier otro numero");
                    System.out.println("NO-presione el 0");
                    opcionCliente = lector.nextLine();
                    if(!"0".equals(opcionCliente)){
                        
                        System.out.println("Ingrese el rut del usuario que desea eliminar: ");
                        rut = lector.nextInt();
                        lector.nextLine();
                        clienteAux = mapaClientes.get(rut);
                        if(clienteAux == null){
                            System.out.println("El usuario no se a encontrado");
                            break;
                        }     
                        
                        largo = mapaClientes.get(rut).getListaPlanes().size();
                        for(int i = 0; i < largo; i++){
                            System.out.println("la clave  es " + mapaClientes.get(rut).getListaPlanes().get(i).getNumeroTelefono());
                            mapaTelefonos.remove(mapaClientes.get(rut).getListaPlanes().get(i).getNumeroTelefono());    
                        }
                        for(String key:mapaTelefonos.keySet())
                            System.out.println("numero " + key);
                        
                        mapaClientes.remove(rut);
                        for(int i = 0; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getRut() == rut){
                                listaClientes.remove(i);
                                System.out.println("Se a eliminado con exito");
                                break;
                            }  
                        }
                    }  
                    break; 
                    
                case "5":
                    for(Cliente cliente:listaClientes)
                        System.out.println(cliente.mostrarDatos());
                    break;
                             
                default:
                    if(!"6".equals(opcionCliente))
                        Menu.menuError();
                    break;
            }
            
        }while( !"6".equals(opcionCliente) );
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
    
    public static void datosIniciales(){
        //Se crean las 3 ofertas de planes
        ofertaPlanes[0] =  new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Full", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Pro", 300, 1000, 13592);
        
        //Se crean 10 clientes 
        Cliente clientePrueba1 = new Cliente("Pedro","Rodriguez","Perez",1341541, ofertaPlanes, 0,"56780976");
        Cliente clientePrueba2 = new Cliente("Juan", "Pérez", "González", 112341, ofertaPlanes, 2,"56780977");
        Cliente clientePrueba3 = new Cliente("Ana", "López", "Ramírez", 87654321, ofertaPlanes, 0,"56780978");
        Cliente clientePrueba4 = new Cliente("Carlos", "Martínez", "Díaz", 11223344, ofertaPlanes, 1,"56780979");
        Cliente clientePrueba5 = new Cliente("María", "Rodríguez", "Fernández", 22334455, ofertaPlanes, 1,"56780980");
        Cliente clientePrueba6 = new Cliente("Pedro", "Gómez", "Morales", 33445566);
        Cliente clientePrueba7 = new Cliente("Lucía", "Sánchez", "Jiménez", 44556677);
        Cliente clientePrueba8 = new Cliente("Jorge", "Hernández", "Ruiz", 55667788);
        Cliente clientePrueba9 = new Cliente("Elena", "Castro", "Torres", 66778899);
        Cliente clientePrueba10 = new Cliente("Luis", "Mendoza", "Ortiz", 77889900);

        //Datos para lista clientes
        listaClientes.add(clientePrueba1);
        listaClientes.add(clientePrueba2);
        listaClientes.add(clientePrueba3);
        listaClientes.add(clientePrueba4);
        listaClientes.add(clientePrueba5);
        listaClientes.add(clientePrueba6);
        listaClientes.add(clientePrueba7);
        listaClientes.add(clientePrueba8);
        listaClientes.add(clientePrueba9);
        listaClientes.add(clientePrueba10);
        
        //Datos para el mapa clientes
        mapaClientes.put(1341541,clientePrueba1);
        mapaClientes.put(12345678,clientePrueba2);
        mapaClientes.put(87654321,clientePrueba3);
        mapaClientes.put(11223344,clientePrueba4);
        mapaClientes.put(22334455,clientePrueba5);
        mapaClientes.put(33445566,clientePrueba6);
        mapaClientes.put(44556677,clientePrueba7);
        mapaClientes.put(55667788,clientePrueba8);
        mapaClientes.put(66778899,clientePrueba9);
        mapaClientes.put(77889900,clientePrueba10);

        //Datos para el mapa de numero telefonicos existentes
        mapaTelefonos.put("56780976", clientePrueba1);
        mapaTelefonos.put("56780977", clientePrueba2);
        mapaTelefonos.put("56780978", clientePrueba3);
        mapaTelefonos.put("56780979", clientePrueba4);
        mapaTelefonos.put("56780980", clientePrueba5);
    }
}
