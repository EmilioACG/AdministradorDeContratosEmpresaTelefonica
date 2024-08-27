/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.mycompany.administradordecontratosempresatelefonica.Clases.Menu;
import java.util.Scanner;


/**
 *
 * @author Emilio
 */
public class AdministradorDeContratosEmpresaTelefonica {

    public static void main(String[] args) {
        
        int opcion;
        Scanner lector = new Scanner(System.in);
        
        do{
            printMenuGeneral();
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 0:
                    printSalida();
                    break;
                case 1:
                    printMenuClientes();
                    break;
                case 2:
                    printMenuContratos();
                    break;
                case 3:
                    printMenuPlanes();
                    break;
                default:
                    printError();
                    break;
            }
                    
            
        }while(opcion != 0);
        
        
        lector.close();
    }
    
    public static void printMenuGeneral(){
        System.out.println("------------------------------------");
        System.out.println("1. Menú clientes");
        System.out.println("2.- Menú contratos");
        System.out.println("3.- Menú planes");
        System.out.println("------------------------------------");;
    }
    
    public static void printMenuClientes(){
        System.out.println("------------------------------------");
        System.out.println("Opciones clientes:");
        System.out.println("  1.- Agregar cliente");
        System.out.println("  2.- Mostrar cliente");
        System.out.println("  3.- Modificar datos cliente");
        System.out.println("  4.- Eliminar cliente");
        System.out.println("  5.- Listar clientes");
        System.out.println("  6.- Buscar cliente");
        System.out.println("------------------------------------");
    }
    
    public static void printMenuContratos(){
        System.out.println("------------------------------------");
        System.out.println("Opciones contratos:");
        System.out.println("  1.- Agregar cliente");
        System.out.println("  2.- Mostrar cliente");
        System.out.println("  3.- Modificar datos cliente");
        System.out.println("  4.- Eliminar cliente");
        System.out.println("  6.- Buscar cliente");
        System.out.println("------------------------------------");
    }
    
    public static void printMenuPlanes(){
        
    }
    
    public static void printSalida(){
        
    }
    
    public static void printError(){
    
    }
}
