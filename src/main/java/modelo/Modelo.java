/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import java.util.ArrayList;
import java.util.HashMap;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author melis
 */
public class Modelo {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static HashMap<Integer,Cliente> mapaClientes = new HashMap<>();
    private static HashMap<String, Cliente> mapaTelefonos = new HashMap<>();
    private static Plan ofertaPlanes[] = new Plan[3];
    private static final String path ="src\\main\\resources\\DBTelefonia.csv";
    private static Cliente nuevoCliente; 
    
    
    public static void main () throws CsvValidationException{
        datosIniciales();
    }
    
    public static boolean agregarCliente(String nomb,String apellPat,String apellMat,int rut) throws CsvValidationException{
        nuevoCliente = new Cliente(nomb,apellPat,apellMat,rut);
        String rutaArchivo = path;

        // Intenta escribir en el archivo CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Crea una línea de texto con los datos del cliente, separados por comas
            String linea = nuevoCliente.getRut() + "," + nuevoCliente.getNombre() + "," +
                           nuevoCliente.getApellidoPaterno() + "," + nuevoCliente.getApellidoMaterno();

            // Escribe la línea en el archivo
            bw.write(linea);
            bw.newLine(); // Agrega una nueva línea
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
        return true;
    }
    public void agregarClaseCSV(Cliente nuevoCl)throws CsvValidationException{
        
    }
    public static void datosIniciales(){
        //Se crean las 3 ofertas de planes
        ofertaPlanes[0] =  new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Full", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Pro", 300, 1000, 13592);
    }
    
   
}
