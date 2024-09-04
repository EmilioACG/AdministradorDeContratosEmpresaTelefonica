/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.administradordecontratosempresatelefonica.Clases;
import net.datafaker.Faker;
import java.util.Scanner;
import java.util.ArrayList;

import static com.mycompany.administradordecontratosempresatelefonica.Clases.Plan.imprimirPlan;

/**
 *
 * @author Emilio
 */
public class Cliente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int rut;
    private boolean tieneContrato = false;
    private ArrayList<Plan> listaPlanes = new ArrayList<>();

    // -----------------------------------------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------------------------------------

   public Cliente(String nom,String apellP,String apellM,int num){
       this.nombre = nom;
       this.apellidoPaterno =  apellP;
       this.apellidoMaterno = apellM;
       this.rut = num;
   }

   public Cliente(String nom, String apellP, String apellM, int num, Plan[] ofertaPlanes, int planSeleccionado, String telefono){
       this.nombre = nom;
       this.apellidoPaterno =  apellP;
       this.apellidoMaterno = apellM;
       this.rut = num;
       this.tieneContrato = true;
       Plan copiaPlan = ofertaPlanes[planSeleccionado];
       copiaPlan.setNumeroTelefono(telefono);
       this.listaPlanes.add(copiaPlan);
   }

    // -----------------------------------------------------------------------------------------------
    // Getters
    // -----------------------------------------------------------------------------------------------
   
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public int getRut() {
        return this.rut;
    }

    public boolean getTieneContrato() {
        return this.tieneContrato;
    }
    
    public String getNombreCompleto(){
        return "nombre: " + this.nombre + " "+ this.apellidoPaterno + " "
                + this.apellidoMaterno;
    }

    public ArrayList<Plan> getListaPlanes() {
        return this.listaPlanes;
    }

    // -----------------------------------------------------------------------------------------------
    // Setters
    // -----------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setTieneContrato(boolean tieneContrato) {
        this.tieneContrato = tieneContrato;
    }

    public void setListaPlanes(ArrayList<Plan> listaPlanes) {
        this.listaPlanes = listaPlanes;
    }

    // -----------------------------------------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------------------------------------

   public void modificarDatosClientes(String nom){
       setNombre(nom);
   }

   public void modificarDatosClientes(String apellP,String apellM){
       setApellidoPaterno(apellP);
       setApellidoMaterno(apellM);
   }

   public String mostrarDatos(){
       String mensajeAux;
       if(this.tieneContrato == true)
           mensajeAux = "\n >El usuario SI tiene contrato";
       else
           mensajeAux = "\n >El usuario NO tiene contrato";
       return "Nombre: " + this.nombre + " "+ this.apellidoPaterno + " "+
               this.apellidoMaterno + " Rut: " + this.rut + mensajeAux;
   }
   

   public void agregarPlan(int planSeleccionado, Plan[] ofertaPlanes, String numeroTelefono){
       this.tieneContrato = true;
       Plan copiaPlan = ofertaPlanes[planSeleccionado];
       copiaPlan.setNumeroTelefono(numeroTelefono);
       listaPlanes.add(ofertaPlanes[planSeleccionado]);
   }

   public void mostrarPlanes(){
       System.out.println("-----------------------------------------");
       System.out.println("Planes asociados a " + getNombre() + ":");
       System.out.println("Aqui-1");
       int tamaño = listaPlanes.size();
       System.out.println("El tamaño es" + tamaño);
       for (Plan planPrint : listaPlanes) {
           System.out.println("Entra al for");
           imprimirPlan(planPrint);
       }

       System.out.println("-----------------------------------------");
   }

}


