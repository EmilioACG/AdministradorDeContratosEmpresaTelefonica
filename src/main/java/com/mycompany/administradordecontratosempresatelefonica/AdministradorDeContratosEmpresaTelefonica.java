/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.administradordecontratosempresatelefonica;
import com.opencsv.exceptions.CsvValidationException;
import controlador.*;

/**
 *
 * @author Emilio
 */
public class AdministradorDeContratosEmpresaTelefonica {
    
    public static void main(String[] args) throws CsvValidationException{
        
        Controlador controladorV = new Controlador();
        controladorV.iniciar();
 
    }
    
}
