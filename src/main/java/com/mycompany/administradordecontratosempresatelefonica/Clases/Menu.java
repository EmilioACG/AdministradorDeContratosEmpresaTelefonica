/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administradordecontratosempresatelefonica.Clases;
import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class Menu {
    public mostrarMenuGeneral(Scanner lector){
        int opcion;

        do{
            System.out.println("------------------------------------");
            System.out.println("1. Menú clientes");
            System.out.println("2.- Menú contratos");
            System.out.println("3.- Menú planes");
            System.out.println("------------------------------------");

            opcion = lector.nextInt();

            switch ( opcion ) {
                case 1:
                    mostrarMenuCliente(lector);
                    break;
                case 2:
                    mostrarMenuContratos(lector);
                    break;
                case 3:
                    mostrarMenuPlanes(lector);
                    break;
            }
        }while(opcion != 0);

    }

    public mostrarMenuCliente(Scanner lector){
        int opcion;

        do{
            System.out.println("------------------------------------");
            System.out.println("Opciones clientes:");
            System.out.println("  1.- Agregar cliente");
            System.out.println("  2.- Mostrar cliente");
            System.out.println("  3.- Modificar datos cliente");
            System.out.println("  4.- Eliminar cliente");
            System.out.println("  5.- Listar clientes");
            System.out.println("  6.- Buscar cliente");
            System.out.println("------------------------------------");

            opcion = lector.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del nuevo cliente: ");
                    Cliente nuevoCliente = new Cliente();
                    nuevoCliente.
            }

        }while(opcion != 0);

    }

    public mostrarMenuContratos(Scanner lector){
        int opcion;

        do {
            System.out.println("------------------------------------");
            System.out.println("Opciones contratos:");
            System.out.println("  1.- Agregar contrato");
            System.out.println("  2.- Mostrar contrato");
            System.out.println("  3.- Modificar contrato");
            System.out.println("  4.- Eliminar contrato");
            System.out.println("------------------------------------");

            opcion = lector.nextInt();

            switch (opcion){
                case 1:
            }
        }while (opcion != 0)
    }

}
