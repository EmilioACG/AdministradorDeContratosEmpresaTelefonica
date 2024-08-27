/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administradordecontratosempresatelefonica.Clases;

/**
 *
 * @author Emilio
 */
public class Menu {
    public static void menuGeneral(){

        System.out.println("-----------------------------------------");
        System.out.println("1.- Menú clientes");
        System.out.println("2.- Menú contratos");
        System.out.println("3.- Menú planes");
        System.out.println("-----------------------------------------");
    }

    public void menuCliente(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones clientes:");
        System.out.println("  1.- Agregar cliente");
        System.out.println("  2.- Mostrar cliente");
        System.out.println("  3.- Modificar datos cliente");
        System.out.println("  4.- Eliminar cliente");
        System.out.println("  5.- Mostrar todos los clientes");
        System.out.println("  6.- Buscar cliente");
        System.out.println("-----------------------------------------");
    }

    public void menuContratos(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones contratos:");
        System.out.println("  1.- Agregar contrato");
        System.out.println("  2.- Mostrar contrato");
        System.out.println("  3.- Modificar contrato");
        System.out.println("  4.- Eliminar contrato");
        System.out.println("-----------------------------------------");
    }
    
    public void menuPlanes(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones planes:");
        System.out.println("  1.- Agregar un plan");
        System.out.println("  2.- Mostrar planes");
        System.out.println("  3.- Modificar plan");
        System.out.println("  4.- Eliminar un plan");
        System.out.println("-----------------------------------------");
    }
    
    public void menuError(){
        System.out.println("-----------------------------------------");
        System.out.println("Ha ocurrido un error, intente de nuevo");
        System.out.println("-----------------------------------------");
    }
    
    public void menuExit(){
        System.out.println("------------------------------------");
        System.out.println("Saliendo del programa...");
        System.out.println("------------------------------------");
    }
}
