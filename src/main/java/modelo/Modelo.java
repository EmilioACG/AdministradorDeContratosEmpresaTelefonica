/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.HashMap;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author melis
 */
public class Modelo {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static HashMap<Integer,Cliente> mapaClientes = new HashMap<>();
    private static HashMap<String, Cliente> mapaTelefonos = new HashMap<>();
    private static Plan ofertaPlanes[] = new Plan[3];
    private static final String path ="src\\main\\resources\\DataBase\\DBTelefonia.csv";
    private static Cliente nuevoCliente; 
    
    
    public Modelo () throws CsvValidationException{
        leerCsv();
        datosIniciales();
    }
    public static void leerCsv() throws CsvValidationException{
        System.out.println("1");
        
        File file = new File(path);
        try{
            FileReader inputFile = new FileReader(file);
            CSVParser parser = new CSVParserBuilder()
                                    .withSeparator(',')
                                    .build();
             System.out.println("2");
            CSVReader csvReader = new CSVReaderBuilder(inputFile)
                                                .withCSVParser(parser)
                                                .build();
            
            String[] datos;
            int i=0; //Primer linea es un header, por lo que se salta
            System.out.println("3");
            while((datos = csvReader.readNext())!= null){
                if(i>0){
                    if(datos.length >= 5){
                        String nombre = datos[0];
                        String apellidoPaterno = datos[1];
                        String apellidoMaterno = datos[2];
                        int rut = Integer.parseInt(datos[3]);
                        boolean tieneContrato = Boolean.parseBoolean(datos[4]);
                        System.out.println("4");
                        Cliente cliente = new Cliente(nombre,apellidoPaterno,apellidoMaterno,rut,tieneContrato);
                        listaClientes.add(cliente);
                        mapaClientes.put(rut,cliente);
                    } 
                }
                i++;
            }      
            csvReader.close();
            inputFile.close();
        }catch(IOException e){
            System.out.print("error");
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            System.out.println("Programa corriendo...");
        }
        System.out.println("5");
        for(Cliente cliente:listaClientes){
            System.out.println(cliente.getRut());
        }
    }

    private static Reader newFileReader(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean agregarCliente(String nomb,String apellPat,String apellMat,int rut){
        //Cliente clienteAux;
        /*do{
            clienteAux = mapaClientes.get(rut);
            if(clienteAux != null)
                System.out.println("El rut ya existe ingrese otro:");
        }while(clienteAux != null);*/           
        nuevoCliente = new Cliente(nomb,apellPat,apellMat, rut);
        listaClientes.add(nuevoCliente);
        mapaClientes.put(rut,nuevoCliente);
        return true;
    }
    public HashMap<Integer, Cliente> mostrarCliente(){
        HashMap<Integer, Cliente> mapaClonado = (HashMap<Integer, Cliente>) mapaClientes.clone();
        return mapaClonado;
    }
    public static void datosIniciales(){
        //Se crean las 3 ofertas de planes
        ofertaPlanes[0] =  new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Full", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Pro", 300, 1000, 13592);
    }
    
    public void guardarDatos(){
        
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Archivo existente eliminado: " + path);
            } else {
                System.out.println("No se pudo eliminar el archivo: " + path);
                return;
            }
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter(path))) {
        // Agregar el encabezado al nuevo archivo CSV
        String[] encabezado = {"Nombre", "Apellido Paterno", "Apellido Materno", "RUT", "Tiene Contrato"};
        writer.writeNext(encabezado);
        
        // Escribir los datos de la lista de clientes en el archivo CSV
        for (Cliente cliente : listaClientes) {
            String[] datosCliente = {
                cliente.getNombre(),
                cliente.getApellidoPaterno(),
                cliente.getApellidoMaterno(),
                String.valueOf(cliente.getRut()),
                String.valueOf(cliente.getTieneContrato())
            };
            writer.writeNext(datosCliente);
        }
        
        System.out.println("Nuevo archivo CSV creado: " + path);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
   
}
