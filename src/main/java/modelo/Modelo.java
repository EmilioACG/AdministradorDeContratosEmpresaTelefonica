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
import java.util.Arrays;
import net.datafaker.Faker;

/**
 *
 * @author melis
 */
public class Modelo {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static HashMap<Integer,Cliente> mapaClientes = new HashMap<>();
    private static HashMap<String, Cliente> mapaTelefonos = new HashMap<>();
    private static Plan ofertaPlanes[] = new Plan[3];

    private static final String path = "src\\main\\resources\\DataBase\\DBTelefonia.csv";
    private static final String pathTelefonos = "src\\main\\resources\\DataBase\\telefonos.csv";
    private static Cliente nuevoCliente; 
    
    
    public Modelo() throws CsvValidationException{
        leerCsv();
        leerCsvTelefonos();
        ofertaPlanes[0] =  new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Full", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Pro", 300, 1000, 13592);
    }
    
    public static void leerCsv() throws CsvValidationException{
        File file = new File(path);
        try{
            FileReader inputFile = new FileReader(file);
            CSVParser parser = new CSVParserBuilder()
                                    .withSeparator(',')
                                    .build();
            CSVReader csvReader = new CSVReaderBuilder(inputFile)
                                                .withCSVParser(parser)
                                                .build();
            
            String[] datos;
            int i=0; //Primer linea es un header, por lo que se salta
            while((datos = csvReader.readNext())!= null){
                if(i>0){
                    if(datos.length >= 5){
                        String nombre = datos[0];
                        String apellidoPaterno = datos[1];
                        String apellidoMaterno = datos[2];
                        int rut = Integer.parseInt(datos[3]);
                        boolean tieneContrato = Boolean.parseBoolean(datos[4]);
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
    }
    
    public static void leerCsvTelefonos() throws CsvValidationException {
        System.out.println("1 telefonos");

        File fileTelefonos = new File(pathTelefonos);
        try {   
                FileReader inputFile = new FileReader(fileTelefonos);
                CSVParser parser = new CSVParserBuilder()
                                                                            .withSeparator(',')
                                                                            .build();
            
                System.out.println("2 telefonos");
                CSVReader csvReader = new CSVReaderBuilder(inputFile)
                                                                                        .withCSVParser(parser)
                                                                                        .build();
            
                String[] datosTelefonos;
                int i=0; //Primer linea es un header, por lo que se salta
                System.out.println("3 telefonos");
                while( (datosTelefonos = csvReader.readNext()) != null) {
                        System.out.println("3.25 telefonos");
                        System.out.println(Arrays.toString(datosTelefonos));
                        if(i>0) {
                            System.out.println("3.5 telefonos");
                            System.out.println(datosTelefonos.length);
                            if(datosTelefonos.length >= 6){
                                System.out.println("entre");
                                int rut = Integer.parseInt(datosTelefonos[0]);
                                System.out.println("entre"+ rut);
                                String nombrePlan = datosTelefonos[1];
                                System.out.println("entre"+ nombrePlan);
                                String numeroTelefono = datosTelefonos[2];
                                int cantGigaBytes =  Integer.parseInt(datosTelefonos[3]);
                                int cantMinutos =  Integer.parseInt(datosTelefonos[4]);
                                double precio = Double.parseDouble(datosTelefonos[5]);
                                System.out.println("4 telefonos");
                                Plan plan = new Plan(nombrePlan, numeroTelefono, cantGigaBytes, cantMinutos, precio);
                        
                                for (Cliente auxCliente : listaClientes) {
                                    if(auxCliente.getRut() == rut){
                                        auxCliente.getListaPlanes().add(plan);
                                        mapaTelefonos.put(numeroTelefono,auxCliente);
                                        System.out.print(rut+" "+plan);
                                    }
                                }
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
        System.out.println("5 telefonos");
        
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
        
        File fileDb = new File(path);
        
        if (fileDb.exists()) {
            if (fileDb.delete()) {
                System.out.println("Archivo existente eliminado: " + path);
            } else {
                System.out.println("No se pudo eliminar el archivo: " + path);
                return;
            }
        }
        
        //Se ecriben los datos de CSV clientes
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
    
    public void guardarDatosPlanes() {
        Plan auxPlan;
        File fileTelefonos = new File(pathTelefonos);
        
        int auxRut;
        String auxNombrePlan;
        String auxNumeroTelefono;
        int auxCantGigas;
        int auxCantMinutos;
        double auxPrecio;
        
        int cantPlanes;
        
        if (fileTelefonos.exists()) {
            if (fileTelefonos.delete()) {
                System.out.println("Archivo existente eliminado: " + pathTelefonos);
            } else {
                System.out.println("No se pudo eliminar el archivo: " + pathTelefonos);
                return;
            }
        }
        
        //Se ecriben los datos en el CSV  de telefonia
        try (CSVWriter writer = new CSVWriter(new FileWriter(pathTelefonos))) {
        String[] encabezado = {"Rut", "NombrePlan", "numeroFono", "cantGigaBytes", "CantMinutos","precio"};
        writer.writeNext(encabezado);
        
        // Escribir los datos de la lista de clientes en el archivo CSV
        for (Cliente auxCliente : listaClientes) {
            cantPlanes = auxCliente.getListaPlanes().size();
            
            if( cantPlanes != 0 ) {
                auxRut = auxCliente.getRut();
                
                for(int i = 0; i < cantPlanes ; i++) {
                    auxPlan = auxCliente.getListaPlanes().get(i);
                    
                    auxNombrePlan = auxPlan.getNombrePlan();
                    auxNumeroTelefono = auxPlan.getNumeroTelefono();
                    auxCantGigas = auxPlan.getCantGigaBytes();
                    auxCantMinutos = auxPlan.getCantMinutos();
                    auxPrecio = auxPlan.getPrecio();
                    
                    String[] datosFono = {
                        String.valueOf(auxRut),
                        auxNombrePlan,
                        auxNumeroTelefono,
                        String.valueOf(auxCantGigas),
                        String.valueOf(auxCantMinutos),
                        String.valueOf(auxPrecio)
                    };
                    
                    writer.writeNext(datosFono);
                }
            }
        }
        
        System.out.println("Nuevo archivo CSV creado: " + pathTelefonos);
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    //este metodo no funciona
    /*public boolean guardarDatos(String nomb,String apellPat,String apellMat,int rut) throws CsvValidationException{
        nuevoCliente = new Cliente(nomb,apellPat,apellMat,rut);
        String rutaArchivo = path;
        String rutaArchivTelef = pathTelefonos;

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
    }*/

    public void agregarPlan(int planSeleccionado, int rutCliente) {
        String numeroTelefono;
        Faker generarNumero = new Faker();
        
         do {
            numeroTelefono = generarNumero.numerify("########");
         } while ( mapaTelefonos.get(numeroTelefono) != null );
        
        for(Cliente auxCliente : listaClientes) {
            if(auxCliente.getRut() == rutCliente) {
                auxCliente.agregarPlan(planSeleccionado, ofertaPlanes, numeroTelefono);
                mapaTelefonos.put(numeroTelefono, auxCliente);
                
                System.out.println(numeroTelefono + "    " + auxCliente.getNombre()+auxCliente.getApellidoPaterno());
                break;
            }          
        }
    }

    public Plan ultimoPlanContratado(int rutCliente) {
        Plan ultPlan = null;
        int posUltPlan;
        for(Cliente auxCliente : listaClientes) {
            if(auxCliente.getRut() == rutCliente) {
                posUltPlan = auxCliente.getListaPlanes().size() - 1;
                ultPlan = auxCliente.getListaPlanes().get(posUltPlan);
                break;
            }
        }
        
        return ultPlan;
    }
    
   
}
