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
    private static HashMap<Integer,Cliente> mapClientes = new HashMap<>();
    
    public static void main(String[] args) {

        int opcion;
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
        
        mapClientes.put(1341541,new Cliente("Juan", "Pérez", "González", 12345678));
        mapClientes.put(12345678,new Cliente("Juan", "Pérez", "González", 12345678));
        mapClientes.put(87654321,new Cliente("Ana", "López", "Ramírez", 87654321));
        mapClientes.put(11223344,new Cliente("Carlos", "Martínez", "Díaz", 11223344));
        mapClientes.put(22334455,new Cliente("María", "Rodríguez", "Fernández", 22334455));
        mapClientes.put(33445566,new Cliente("Pedro", "Gómez", "Morales", 33445566));
        mapClientes.put(44556677,new Cliente("Lucía", "Sánchez", "Jiménez", 44556677));
        mapClientes.put(55667788,new Cliente("Jorge", "Hernández", "Ruiz", 55667788));
        mapClientes.put(66778899,new Cliente("Elena", "Castro", "Torres", 66778899));
        mapClientes.put(77889900,new Cliente("Luis", "Mendoza", "Ortiz", 77889900));
        
        do{
            Menu.menuGeneral();
            opcion = Integer.parseInt(lector.nextLine());
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
        }
        }while(opcion != 0);


        lector.close();
        
    }

}
