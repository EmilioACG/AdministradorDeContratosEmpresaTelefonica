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
        ofertaPlanes[1] = new Plan("Plan Pro", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Ultra", 300, 1000, 13592);
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
        File fileTelefonos = new File(pathTelefonos);
        try {   
                FileReader inputFile = new FileReader(fileTelefonos);
                CSVParser parser = new CSVParserBuilder()
                                                                            .withSeparator(',')
                                                                            .build();
            
                CSVReader csvReader = new CSVReaderBuilder(inputFile)
                                                                                        .withCSVParser(parser)
                                                                                        .build();
            
                String[] datosTelefonos;
                int i=0; //Primer linea es un header, por lo que se salta
                while( (datosTelefonos = csvReader.readNext()) != null) {
                        System.out.println(Arrays.toString(datosTelefonos));
                        if(i>0) {
                            System.out.println(datosTelefonos.length);
                            if(datosTelefonos.length >= 6){
                                int rut = Integer.parseInt(datosTelefonos[0]);
                                String nombrePlan = datosTelefonos[1];
                                String numeroTelefono = datosTelefonos[2];
                                int cantGigaBytes =  Integer.parseInt(datosTelefonos[3]);
                                int cantMinutos =  Integer.parseInt(datosTelefonos[4]);
                                double precio = Double.parseDouble(datosTelefonos[5]);
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
    
    public boolean modificarDatosCliente(int rut,String nom,String appPat,String appMat,String opcion){
        if("1".equals(opcion) || "3".equals(opcion)){
            mapaClientes.get(rut).modificarDatosClientes(nom);
            if("1".equals(opcion))
                return true;
        }         
        if("2".equals(opcion) || "3".equals(opcion)){
            mapaClientes.get(rut).modificarDatosClientes(appPat, appMat);
            return true;
        }
        return false;
    }
    
    public boolean deleteCliente(int rutEliminar){
        Cliente clienteAux = mapaClientes.get(rutEliminar);
        if(clienteAux == null){
            System.out.println("El usuario no se a encontrado");
            return false;
        }     
                        
        int largo = mapaClientes.get(rutEliminar).getListaPlanes().size();
        for(int i = 0; i < largo; i++){
            System.out.println("la clave  es " + mapaClientes.get(rutEliminar).getListaPlanes().get(i).getNumeroTelefono());
            mapaTelefonos.remove(mapaClientes.get(rutEliminar).getListaPlanes().get(i).getNumeroTelefono());    
        }
        for(String key:mapaTelefonos.keySet())
            System.out.println("numero " + key);
                        
        mapaClientes.remove(rutEliminar);
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i).getRut() == rutEliminar){
                listaClientes.remove(i);
                System.out.println("Se a eliminado con exito");
                return true;
                }  
        }
        return false;                
    }
    
    public String [] listarCliente(){
        String strClientes = "";
        
        for(int i = 0; i < listaClientes.size();i++){
            strClientes += listaClientes.get(i).getNombre() + "," + listaClientes.get(i).getApellidoPaterno() + "," +
                    listaClientes.get(i).getApellidoMaterno() + "," + listaClientes.get(i).getRut() +
                    "," + Boolean.toString(listaClientes.get(i).getTieneContrato()) + "\n";
        }
        String[] arregloClientes = strClientes.split("\n");
        
        return arregloClientes;
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
    
    public void agregarPlanPersonalizado(int rutCliente, int cantGigaBytes, int cantMinutos, String numeroTelefono) {
        if("".equals(numeroTelefono)) {
            Faker generarNumero = new Faker();
            String posibleNumero;
            
            do {
                posibleNumero = generarNumero.numerify("########");
                if(mapaTelefonos.get(posibleNumero) != null) {
                    System.out.println(posibleNumero + " ya existe "); //------------------------------------------------------------------> AGREGAR EXCEPCION
                }
                else {
                    numeroTelefono = posibleNumero;
                    System.out.println(posibleNumero + " no existe, nuevo numero guardado");
                }
            } while (numeroTelefono == null);
        }
        
        for(Cliente auxCliente : listaClientes) {
            if(auxCliente.getRut() == rutCliente) {
                auxCliente.agregarPlanPersonalizadado(cantGigaBytes, cantMinutos, numeroTelefono);
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

    public String[] listarPlanes(int rut) {
        String strPlanes = "";
        int cantPlanes = mapaClientes.get(rut).getListaPlanes().size();
        
        if (cantPlanes == 0) {
            String[] arregloPlanes = {"No,existen,planes,para," + rut};
            return arregloPlanes;
        }
        
        for(int i = 0 ; i < cantPlanes ; i++) {
            strPlanes += mapaClientes.get(rut).getListaPlanes().get(i).getNombrePlan() + "," +
                    mapaClientes.get(rut).getListaPlanes().get(i).getNumeroTelefono() + "," +
                    mapaClientes.get(rut).getListaPlanes().get(i).getCantGigaBytes() + "," +
                    mapaClientes.get(rut).getListaPlanes().get(i).getCantMinutos() + "," +
                    "$" + mapaClientes.get(rut).getListaPlanes().get(i).getPrecio() + ".\n";
        }
        
        String[] arregloPlanes = strPlanes.split("\n");
        
        return arregloPlanes;
    }

    public boolean eliminarPlan(int rut, String numPlanEliminar) {
        if(mapaTelefonos.get(numPlanEliminar) == null) {
            return false;
        }
        
        for(Cliente auxCliente : listaClientes) {
            if(auxCliente.getRut() == rut) {
                for (int i = 0 ; i < auxCliente.getListaPlanes().size() ; i++) {
                    if(numPlanEliminar.equals(auxCliente.getListaPlanes().get(i).getNumeroTelefono())) {
                        auxCliente.getListaPlanes().remove(i);
                        break;
                    }
                }
                break;
            }
        }
        
        mapaTelefonos.remove(numPlanEliminar);
        
        return true;
    }

    public boolean existeNumero(String numBuscar, int rut) {
        Cliente auxCliente = mapaTelefonos.get(numBuscar);
        
        if (auxCliente == null) {
            //El numero no existe
            return false;
        }
        
        //el numero buscado existe, pero pertenece al cliente que se esta operando?
        return auxCliente.getRut() == rut; 
        
    }

    public int planActual(int rut, String numModificar) {
        for (Cliente auxCliente : listaClientes) {
            if (auxCliente.getRut() == rut) {
                for (Plan auxPlan : auxCliente.getListaPlanes()) {
                    if (numModificar.equals(auxPlan.getNumeroTelefono())) {
                        if ("Plan Inicial".equals(auxPlan.getNombrePlan())) {
                            return 0;
                        } else if ("Plan Pro".equals(auxPlan.getNombrePlan())) {
                            return 1;
                        } else if ("Plan Ultra".equals(auxPlan.getNombrePlan())) {
                            return 2;
                        }else if ("Plan Personalizado".equals(auxPlan.getNombrePlan())) {
                            return 3;
                        }
                        break;
                    }
                }
                break;
            }
        }
        
        return -1;
    }

    public void modificarPlan(int rut, String numeroTelefono, int posPlan) {
        for (Cliente auxCliente : listaClientes) {
            if (auxCliente.getRut() == rut) {
                System.out.println("Cliente " + rut + " encontrado" );
                for (Plan auxPlan : auxCliente.getListaPlanes()) {
                    if (numeroTelefono.equals(auxPlan.getNumeroTelefono())) {
                        System.out.println("Plan " + auxPlan.getNumeroTelefono() + " es el plan buscado :  " + numeroTelefono );
                        
                        System.out.println("Nombre Plan pre modificación : " + auxPlan.getNombrePlan());
                        auxPlan.setNombrePlan(ofertaPlanes[posPlan].getNombrePlan());
                        System.out.println("Nombre Plan pos modificación : " + auxPlan.getNombrePlan());
                        
                        System.out.println("Gigas Plan pre modificación : " + auxPlan.getCantGigaBytes());
                        auxPlan.setCantGigaBytes(ofertaPlanes[posPlan].getCantGigaBytes());
                        System.out.println("Gigas Plan pos modificación : " + auxPlan.getCantGigaBytes());
                        
                        System.out.println("Minutos Plan pre modificación : " + auxPlan.getCantMinutos());
                        auxPlan.setCantMinutos(ofertaPlanes[posPlan].getCantMinutos());
                        System.out.println("Minutos Plan pos modificación : " + auxPlan.getCantMinutos());
                        
                        System.out.println("Precio Plan pre modificación : " + auxPlan.getPrecio());
                        auxPlan.setPrecio(ofertaPlanes[posPlan].getPrecio());
                        System.out.println("Preco Plan pos modificación : " + auxPlan.getPrecio());
                        
                        System.out.println("Plan cambiado correctamente");
                        break;
                    }
                    System.out.println("Plan " + auxPlan.getNumeroTelefono() + " es distinto a " + numeroTelefono );
                }
                break;
            }
        }
    }
        
    
   
}
