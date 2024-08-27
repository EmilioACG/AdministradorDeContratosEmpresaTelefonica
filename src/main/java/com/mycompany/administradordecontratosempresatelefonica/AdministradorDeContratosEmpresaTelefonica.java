/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.mycompany.administradordecontratosempresatelefonica.Clases.*;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Emilio
 */
public class AdministradorDeContratosEmpresaTelefonica {

    public static void main(String[] args) {

        int opcion;
        Scanner lector = new Scanner(System.in);
        
        Menu.menuGeneral();
        
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
            
            opcionCliente = lector.next();
            
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
                    nuevoCliente = new Cliente(nombre,apePat, apeMat, rut);
                    System.out.println("-----------------------------------------");
                    break;
                   
                case "2":
                    
                    break;
                    
                    
                case "3":
                    System.out.println("-----------------------------------------");
                    System.out.println("Ingrese su nombre actualizado...");
                    nombre = lector.next();
                    System.out.println("Ingrese su apellido paterno actualizado...");
                    apePat = lector.next();
                    System.out.println("Ingrese su apellido materno actualizado...");
                    apeMat = lector.next();
                    System.out.println("Ingrese su rut actualizado..."); //No se deberia actualizar menu
                    rut = lector.nextInt();
                    nuevoCliente = new Cliente(nombre,apePat, apeMat, rut);
                    System.out.println("-----------------------------------------");
                    break;
                    
                    
                case "4":
                    break;
                    
                    
                case "5":
                    break;
                    
                    
                case "6":
                    break;
                    
                    
                case "7":
                    break;
                    
                    
                default:
                    Menu.menuError();
                    break;
            }
            
        }while( opcionCliente != "7" );
    }
}
