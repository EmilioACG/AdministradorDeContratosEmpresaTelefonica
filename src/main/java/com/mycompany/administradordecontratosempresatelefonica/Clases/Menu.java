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
        System.out.println("0.- Salir");
        System.out.println("-----------------------------------------");
    }

    public static void menuClientePrint(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones clientes:");
        System.out.println("  1.- Agregar cliente");
        System.out.println("  2.- Mostrar un cliente");
        System.out.println("  3.- Modificar datos cliente");
        System.out.println("  4.- Eliminar cliente");
            System.out.println("  5.- Mostrar todos los clientes");
        System.out.println("6.- Regresar a la pestaña anterior");
        System.out.println("-----------------------------------------");
    }
    public static void menuModificarCliente(){
        System.out.println("-----------------------------------------");
        System.out.println("Que desea modificar:");
        System.out.println("  1.- Nombre");
        System.out.println("  2.- Apellidos");
        System.out.println("  3.- Nombre y Apellido");
        System.out.println("-----------------------------------------");
    }

    public static void menuContratosPrint(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones contratos:");
        System.out.println("  1.- Mostrar el contrato de un cliente");
        System.out.println("  2.- Mostrar todos los contratos");
        System.out.println("  3.- Regresar a la pestaña anterior");
        System.out.println("-----------------------------------------");
    }
    
    public static void menuPlanes(){
        System.out.println("-----------------------------------------");
        System.out.println("Opciones planes:");
        System.out.println("  1.- Agregar un plan");
        System.out.println("  2.- Mostrar planes");
        System.out.println("  3.- Modificar plan");
        System.out.println("  4.- Eliminar un plan");
        System.out.println("5.- Volver a la pestaña anterior");
        System.out.println("-----------------------------------------");
    }
    
    public static void menuError(){
        System.out.println("-----------------------------------------");
        System.out.println("Ha ocurrido un error, intente de nuevo");
        System.out.println("-----------------------------------------");
    }
    
    public static void menuExit(){
        System.out.println("-----------------------------------------");
        System.out.println("Saliendo del programa...");
        System.out.println("-----------------------------------------");
    }

    public static void ofertaPlanes(){
        System.out.println("-----------------------------------------");
        System.out.println("Oferta de planes:");
        System.out.println("1.- Plan Inicial");
        System.out.println("    100 Gigas");
        System.out.println("    1000 Minutos");
        System.out.println("    $8.792\n");
        System.out.println("2.- Plan Full");
        System.out.println("    200 Gigas");
        System.out.println("    1000 Minutos");
        System.out.println("    $11.192\n");
        System.out.println("3.- Plan Pro");
        System.out.println("    300 Gigas");
        System.out.println("    1000 Minutos");
        System.out.println("    $13.592\n");
        System.out.println("4.- Plan Personalizado");
        System.out.println("    Cantidad de gigas a elección");
        System.out.println("    Cantidad de minutos a elección");
        System.out.println("    $(Dependerá de los GB y minutos solicitados)");
        System.out.println("-----------------------------------------");
    }
    
}
