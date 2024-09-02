/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.mycompany.administradordecontratosempresatelefonica.Clases.*;
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
    
    public static void main(String[] args) {

        String opcion;
        Scanner lector = new Scanner(System.in);
        
        //Datos para lista clientes
        listaClientes.add(new Cliente("Pedro","Rodriguez","Perez",1341541));
        listaClientes.add(new Cliente("Juan", "Pérez", "González", 12345678));
        listaClientes.add(new Cliente("Ana", "López", "Ramírez", 87654321));
        listaClientes.add(new Cliente("Carlos", "Martínez", "Díaz", 11223344));
        listaClientes.add(new Cliente("María", "Rodríguez", "Fernández", 22334455));
        listaClientes.add(new Cliente("Pedro", "Gómez", "Morales", 33445566));
        listaClientes.add(new Cliente("Lucía", "Sánchez", "Jiménez", 44556677));
        listaClientes.add(new Cliente("Jorge", "Hernández", "Ruiz", 55667788));
        listaClientes.add(new Cliente("Elena", "Castro", "Torres", 66778899));
        listaClientes.add(new Cliente("Luis", "Mendoza", "Ortiz", 77889900));
        
        //Datos para el mapa clientes
        mapaClientes.put(1341541,new Cliente("Pedro","Rodriguez","Perez", 1341541));
        mapaClientes.put(12345678,new Cliente("Juan", "Pérez", "González", 12345678));
        mapaClientes.put(87654321,new Cliente("Ana", "López", "Ramírez", 87654321));
        mapaClientes.put(11223344,new Cliente("Carlos", "Martínez", "Díaz", 11223344));
        mapaClientes.put(22334455,new Cliente("María", "Rodríguez", "Fernández", 22334455));
        mapaClientes.put(33445566,new Cliente("Pedro", "Gómez", "Morales", 33445566));
        mapaClientes.put(44556677,new Cliente("Lucía", "Sánchez", "Jiménez", 44556677));
        mapaClientes.put(55667788,new Cliente("Jorge", "Hernández", "Ruiz", 55667788));
        mapaClientes.put(66778899,new Cliente("Elena", "Castro", "Torres", 66778899));
        mapaClientes.put(77889900,new Cliente("Luis", "Mendoza", "Ortiz", 77889900));
        
        do{
            Menu.menuGeneral();
            opcion = lector.nextLine();
            switch (opcion){
                case "1":
                    menuCliente(lector);
                    break;
                case "2":
                    menuContratos(lector);
                    break;
                case "3":
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
        int rut,rutAux=0;
        
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
                        for(int i = 0; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getRut() == rut){
                                listaClientes.get(i).modificarDatosClientes(nombre);
                            break;
                            }  
                        }
                    }
                    if("2".equals(opcionCliente) || "3".equals(opcionCliente)){
                        System.out.println("Ingrese su apellido paterno actualizado...");
                        apePat = lector.next();
                        System.out.println("Ingrese su apellido materno actualizado...");
                        apeMat = lector.next();
                        mapaClientes.get(rut).modificarDatosClientes(apePat, apeMat);
                        for(int i = 0; i < listaClientes.size(); i++){
                            if(listaClientes.get(i).getRut() == rut){
                                listaClientes.get(i).modificarDatosClientes(apePat, apeMat);
                                break;
                            }  
                        }
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
            int rut,sumaPlanes,largoPlanes;
            Cliente clienteAux;
            
            switch (opcionCliente){
                case "1":
                    System.out.println("Ingrese el rut del usuario al cual desea ver el contratto");
                    rut = lector.nextInt();
                    lector.nextLine();
                    clienteAux = mapaClientes.get(rut);
                    if(clienteAux != null){
                        if(clienteAux.getTieneContrato()){
                            System.out.println("El usuario " + clienteAux.getNombreCompleto());
                            System.out.println("rut : " + clienteAux.getRut());
                            //largoPlanes = clienteAux.getListaPlanes.size();
                        }
                        else 
                            System.out.println("El usuario no tiene contrato");
                    }
                    else
                        System.out.println("El usuario no se a encontrado");
                    break;
                        
                case "2":
                            
                    break;
                    
                default:
                    Menu.menuError();
                    break;
            }
                    
        }while(!"3".equals(opcionCliente));
    }
    
}
