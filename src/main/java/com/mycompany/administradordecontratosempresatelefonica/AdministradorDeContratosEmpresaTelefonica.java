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
        
        mapaClientes.put(1341541,new Cliente("Pedro","Rodriguez","Perez", 12345678));
        mapaClientes.put(12345678,new Cliente("Juan", "Pérez", "González", 12345678));
        mapaClientes.put(87654321,new Cliente("Ana", "López", "Ramírez", 87654321));
        mapaClientes.put(11223344,new Cliente("Carlos", "Martínez", "Díaz", 11223344));
        mapaClientes.put(22334455,new Cliente("María", "Rodríguez", "Fernández", 22334455));
        mapaClientes.put(33445566,new Cliente("Pedro", "Gómez", "Morales", 33445566));
        mapaClientes.put(44556677,new Cliente("Lucía", "Sánchez", "Jiménez", 44556677));
        mapaClientes.put(55667788,new Cliente("Jorge", "Hernández", "Ruiz", 55667788));
        mapaClientes.put(66778899,new Cliente("Elena", "Castro", "Torres", 66778899));
        mapaClientes.put(77889900,new Cliente("Luis", "Mendoza", "Ortiz", 77889900));

        Plan ofertaPlanes[] = new Plan[3];
        ofertaPlanes[0] =  new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Full", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Pro", 300, 1000, 13592);

        
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
                    break;
                case "3":
                    menuPlanes(lector, ofertaPlanes);
                    break;
                default:
                    if(!"0".equals(opcion))
                        Menu.menuError();
                    else
                        Menu.menuExit();
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
        int rut;
        
        do{
            Menu.menuCliente();
            
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
                    rut = lector.nextInt();
                    lector.nextLine();
                    System.out.println("-----------------------------------------");
                    nuevoCliente = new Cliente(nombre,apePat, apeMat, rut);
                    listaClientes.add(nuevoCliente);
                    mapaClientes.put(rut,new Cliente(nombre,apePat, apeMat,rut));
                    break;
                   
                case "2": 
                    System.out.print("Ingrese el rut del cliente que desea buscar:");
                    rut = lector.nextInt();
                    lector.nextLine();
                    Cliente clienteAux = mapaClientes.get(rut);
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
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese su nombre actualizado...");
                    nombre = lector.next();
                    System.out.println("Ingrese su apellido paterno actualizado...");
                    apePat = lector.next();
                    System.out.println("Ingrese su apellido materno actualizado...");
                    apeMat = lector.next();
                    System.out.println("-----------------------------------------");
                    mapaClientes.get(rut).modificarDatosClientes(nombre, apePat, apeMat);
                    for(int i = 0; i < listaClientes.size(); i++){
                        if(listaClientes.get(i).getRut() == rut){
                            listaClientes.get(i).modificarDatosClientes(nombre, apePat, apeMat);
                            break;
                        }  
                    }
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
                                break;
                            }  
                        }
                    }  
                    break;
                    
                    
                case "5":
                    for(Cliente cliente:listaClientes)
                        System.out.println(cliente.mostrarDatos());
                    break;
                    
                    
                case "6":
                    break;
                             
                default:
                    if(!"7".equals(opcionCliente))
                        Menu.menuError();
                    break;
            }
            
        }while( !"7".equals(opcionCliente) );
    }

    public static void menuPlanes(Scanner lector, Plan[] ofertaPlanes){

        String opcionPlan;
        int rut;

        do{

            do{
                System.out.println("Ingrese el rut del cliente que desea operar sobre sus planes:");
                rut = lector.nextInt();
                lector.nextLine();
                if( mapaClientes.get(rut) == null )
                    Menu.menuError();
            }while( mapaClientes.get(rut) == null );


            Menu.menuPlanes();

            opcionPlan = lector.nextLine();

            switch(opcionPlan){
                case "1": //1.- Agregar un plan
                    Menu.ofertaPlanes();

                    int seleccionPlan;
                    seleccionPlan = lector.nextInt();
                    lector.nextLine();

                    for(int i = 0; i < listaClientes.size(); i++){
                        if(listaClientes.get(i).getRut() == rut){
                            listaClientes.get(i).agregarPlan(seleccionPlan, ofertaPlanes);
                        }
                    }

                    break;

                case "2": //2.- Mostrar planes
                    for(int i = 0; i < listaClientes.size(); i++){
                        if(listaClientes.get(i).getRut() == rut){
                            listaClientes.get(i).mostrarPlanes();
                        }
                    }
                    break;

                case "3": //3.- Modificar plan

                    break;

                case "4": //4.- Eliminar un plan

                    break;

                default:
                    if( !"5".equals(opcionPlan) )
                        Menu.menuError();
                    break;
            }

        }while( !"5".equals(opcionPlan) );
    }
}
