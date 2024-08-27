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
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        Scanner lector = new Scanner(System.in);
                    
                    
        Menu(lector);
    }
}
