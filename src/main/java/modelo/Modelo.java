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
import excepciones.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import net.datafaker.Faker;

/**
 *
 * @author melis
 */
public class Modelo {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Contrato> listaContratos = new ArrayList<>();
    private static HashMap<Integer,Cliente> mapaClientes = new HashMap<>();
    private static HashMap<String, Cliente> mapaTelefonos = new HashMap<>();
    private static Plan ofertaPlanes[] = new Plan[3];

    private static final String path = "src\\main\\resources\\DataBase\\DBTelefonia.csv";
    private static final String pathTelefonos = "src\\main\\resources\\DataBase\\telefonos.csv";
    private static Cliente nuevoCliente; 
    
    
    public Modelo() throws CsvValidationException{
        leerCsv();
        leerCsvTelefonos();
        ofertaPlanes[0] = new Plan("Plan Inicial", 100, 1000, 8792);
        ofertaPlanes[1] = new Plan("Plan Pro", 200, 1000, 11192);
        ofertaPlanes[2] = new Plan("Plan Ultra", 300, 1000, 13592);
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------
    // Lectura y Escritura de los csv
    //----------------------------------------------------------------------------------------------------------------------------------------
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
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
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
                        if(i>0) {
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
                                    }
                                }
                            }
                        }
                       i++;   
                }
                    
                csvReader.close();
                inputFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        
    }
    
    public void guardarDatos(){
        File fileDb = new File(path);
        
        if (fileDb.exists()) {
            if (!fileDb.delete()) {
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
            if (!fileTelefonos.delete()) {
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
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }

    // ---------------------------------------------------------------------------------------------------
    //   Verificaciones con excepciones
    // ---------------------------------------------------------------------------------------------------
    public void nombreApellidosValido(String nombre, String apellidoPaterno, String apellidoMaterno) throws ClienteInvalidoException {
        for(char c : nombre.toCharArray() )
            if(Character.isDigit(c))
                throw new ClienteInvalidoException("El nombre contiene caracteres numericos");
        
        for(char c : apellidoPaterno.toCharArray() )
            if(Character.isDigit(c))
                throw new ClienteInvalidoException("El apellido paterno contiene caracteres numericos");
        
        for(char c : apellidoMaterno.toCharArray() )
            if(Character.isDigit(c))
                throw new ClienteInvalidoException("El apellido materno contiene caracteres numericos");
    }
    
    public void noExisteCliente(String rut) throws RutYaRegistradoException, RutInvalidoException {
        for(char c : rut.toCharArray() )
            if(!Character.isDigit(c))
                throw new RutInvalidoException("El RUT ingresado contiene caracteres no numericos");
        
        int rutBuscado = Integer.parseInt(rut);
        
        if(mapaClientes.get(rutBuscado) != null) {
            throw new RutYaRegistradoException("El RUT " + rutBuscado + " ya está registrado.");
        }
    }
    
    public void existeCliente(String rut) throws RutNoRegistradoException, RutInvalidoException {
        for(char c : rut.toCharArray() )
            if(!Character.isDigit(c))
                throw new RutInvalidoException("El RUT ingresado contiene caracteres no numericos");
        
        int rutBuscado = Integer.parseInt(rut);
        
        if(mapaClientes.get(rutBuscado) == null) {
            throw new RutNoRegistradoException("El RUT " + rutBuscado + " no está registrado.");
        }
    }
    
    public void numeroValido(String numeroTelefono) throws NumeroInvalidoException {
        for(char c : numeroTelefono.toCharArray()) 
            if(!Character.isDigit(c)) 
                throw new NumeroInvalidoException("El numero de telefono contiene caracteres no numericos.");

        if(numeroTelefono.length() < 8) 
            throw new NumeroInvalidoException("El numero de telefono ingresado tiene menos de 8 digitos");
        
        if (numeroTelefono.length() > 8)
            throw new NumeroInvalidoException("El numero de telefono ingresado tiene mas de 8 digitos");
    }
    
    public void existeNumero(String numeroTelefono) throws NumeroNoRegistradoException, NumeroInvalidoException {
        numeroValido(numeroTelefono);
        
        if(mapaTelefonos.get(numeroTelefono) == null)
            throw new NumeroNoRegistradoException("+56 9 " + numeroTelefono + " no esta registrado en el sistema");
    }
    
    public void noExisteNumero(String numeroTelefono) throws NumeroYaRegistradoException, NumeroInvalidoException {
        numeroValido(numeroTelefono);
        
        if(mapaTelefonos.get(numeroTelefono) != null)
            throw new NumeroYaRegistradoException("+56 9 " + numeroTelefono + " ya esta registrado en el sistema");
    }
    
    public void existeNumeroEnCliente(String numeroTelefono, int rut) throws NumeroInvalidoException, NumeroNoRegistradoException, Exception {
        existeNumero(numeroTelefono);
        
        if(mapaTelefonos.get(numeroTelefono).getRut() != rut)
            throw new Exception("+56 9 " + numeroTelefono + " no esta registrado en el cliente con RUT " + rut);
    }
    
    // ---------------------------------------------------------------------------------------------------
    //   Metodos para el negocio de clientes
    // ---------------------------------------------------------------------------------------------------
    public boolean agregarCliente(String nomb,String apellPat,String apellMat,int rut) throws RutYaRegistradoException, RutInvalidoException{      
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
    
    public void deleteCliente(int rutEliminar) throws RutNoRegistradoException, RutInvalidoException{
        existeCliente(rutEliminar+"");

        //Eliminar sus planes del mapa de telefonos
        for(Plan auxPlan : mapaClientes.get(rutEliminar).getListaPlanes())
            mapaTelefonos.remove(auxPlan.getNumeroTelefono());

        //Eliminar al cliente del mapa de clientes
        mapaClientes.remove(rutEliminar);
        
        //Eliminar al cliente de la lista de clientes
        for(int posCliente = 0; posCliente < listaClientes.size(); posCliente++)
            if(listaClientes.get(posCliente).getRut() == rutEliminar)
                listaClientes.remove(posCliente);
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
    
    // ---------------------------------------------------------------------------------------------------
    //   Metodos para el negocio de planes
    // ---------------------------------------------------------------------------------------------------   
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
                break;
            }          
        }
    }

    public void agregarPlan(int rutCliente, int cantGigaBytes, int cantMinutos, String numeroTelefono) throws NumeroInvalidoException, NumeroYaRegistradoException {
        //Generar numero de telefono si no fue ingresado
        if("".equals(numeroTelefono)) {
            Faker generarNumero = new Faker();
            String posibleNumero;
            
            do {
                posibleNumero = generarNumero.numerify("########");
                if(mapaTelefonos.get(posibleNumero) == null) 
                    numeroTelefono = posibleNumero;
            } while (numeroTelefono == null);
        }
        
        noExisteNumero(numeroTelefono);
        
        for(Cliente auxCliente : listaClientes) {
            if(auxCliente.getRut() == rutCliente) {
                auxCliente.agregarPlanPersonalizadado(cantGigaBytes, cantMinutos, numeroTelefono);
                mapaTelefonos.put(numeroTelefono, auxCliente);
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

    public void eliminarPlan(int rut, String numPlanEliminar) throws NumeroNoRegistradoException, NumeroInvalidoException {
        
        existeNumero(numPlanEliminar);
  
        mapaClientes.get(rut).eliminarPlan(numPlanEliminar);
        
        mapaTelefonos.remove(numPlanEliminar);
        
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
                for (Plan auxPlan : auxCliente.getListaPlanes()) {
                    if (numeroTelefono.equals(auxPlan.getNumeroTelefono())) {
                        auxPlan.setNombrePlan(ofertaPlanes[posPlan].getNombrePlan());
                        auxPlan.setCantGigaBytes(ofertaPlanes[posPlan].getCantGigaBytes());
                        auxPlan.setCantMinutos(ofertaPlanes[posPlan].getCantMinutos());
                        auxPlan.setPrecio(ofertaPlanes[posPlan].getPrecio());
                        break;
                    }
                }
                break;
            }
        }
    }
    
    // ---------------------------------------------------------------------------------------------------
    //   Metodos para el negocio de contratos
    // ---------------------------------------------------------------------------------------------------  
    public Contrato buscarContrato(int rutClie){
        llenarListContactos();
        for(int i = 0 ; i < listaContratos.size() ; i ++){
            if(listaContratos.get(i).getRut() == rutClie){
                return listaContratos.get(i);
            }
        }
        return null;
    }
    
    public String[] listarContratos(int filtro){
        llenarListContactos();
        String strContratos = "";
        System.out.println(filtro);
        for(int i = 0 ; i < listaContratos.size() ; i++){
            if(filtro == 0)
            {
                strContratos += listaContratos.get(i).datosAgrupados() + listaContratos.get(i).cantPlanes();
            }
            else if(filtro >= listaContratos.get(i).getPrecioPlanes())
            {
                strContratos += listaContratos.get(i).datosAgrupados() + listaContratos.get(i).cantPlanes();
            }
        }
        System.out.println(strContratos);
        String[] arrContratos = strContratos.split("\n");
        return arrContratos;
    }
    
    public void llenarListContactos(){
        listaContratos.clear();
        for(int i = 0; i < listaClientes.size() ; i ++){
            Cliente clienteAux = listaClientes.get(i);
            if(clienteAux.getTieneContrato()){
               boolean tieneContrPerso = hayContPerso(clienteAux);
               String nom = clienteAux.getNombre() + " " + clienteAux.getApellidoPaterno();
               int rut = clienteAux.getRut();
               int cantPlanes = clienteAux.getListaPlanes().size();
               double precioPlanes = cantPrecio(clienteAux);
               if(tieneContrPerso){
                   int cantPlanesPerso = cantPlanPerso(clienteAux);
                   ContratoPersonalizado contPerso = new ContratoPersonalizado(nom,rut,
                           cantPlanes,cantPlanesPerso,precioPlanes,true);
                    listaContratos.add(contPerso);
               }
               else{
                   Contrato contrato = new Contrato(nom,rut,cantPlanes,precioPlanes);
                   listaContratos.add(contrato);
               }
            }
        }
           
    }
    
    public boolean hayContPerso(Cliente cli){
        boolean tieneContrPerso = false;
        for(int i = 0 ; i < cli.getListaPlanes().size() ; i++){
            if("Plan Personalizado".equals(cli.getListaPlanes().get(i).getNombrePlan())){
                tieneContrPerso = true;
                break;
            }
        }
        return tieneContrPerso;
    }
    
    public double cantPrecio(Cliente cli){
        double precioTotal = 0;
        for(int i = 0 ; i < cli.getListaPlanes().size() ; i++){
            precioTotal += cli.getListaPlanes().get(i).getPrecio();
        }
        return precioTotal;
    }
    
    public int cantPlanPerso(Cliente cli){
        int contPlanes = 0;
        for(int i = 0 ; i < cli.getListaPlanes().size() ; i++){
            if("Plan Personalizado".equals(cli.getListaPlanes().get(i).getNombrePlan()))
                contPlanes ++;
        }
        return contPlanes;
    }

}
