/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.administradordecontratosempresatelefonica.Clases;
import java.util.Scanner;
import java.util.ArrayList;

import static com.mycompany.administradordecontratosempresatelefonica.Clases.Plan.crearPlanPersonalizado;
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
    ArrayList<Plan> listaPlanes = new ArrayList<>();
    
    
   //Constructores
   public Cliente(String nom,String apellP,String apellM,int num){
       this.nombre = nom;
       this.apellidoPaterno =  apellP;
       this.apellidoMaterno = apellM;
       this.rut = num;
   }
   
   //Metodos
   
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getRut() {
        return rut;
    }

    public boolean getTieneContrato() {
        return tieneContrato;
    }
    

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
    
   
   
   public void modificarDatosClientes(String nom,String apellP,String apellM){
       setNombre(nom);
       setApellidoPaterno(apellP);
       setApellidoMaterno(apellM);
   }
   
   public String mostrarDatos(){
       String mensajeAux;
       if(this.tieneContrato == true)
           mensajeAux = "\n >El usuario tiene contrato";
       else
           mensajeAux = "\n >El usuario no tiene contrato";
        return "Nombre: " + this.nombre + " "+ this.apellidoPaterno + " "+
                this.apellidoMaterno + " Rut: " + this.rut + mensajeAux;
    }
   

    public void agregarPlan(int planSeleccionado, Plan[] ofertaPlanes){
       if(planSeleccionado == 4){
           Plan planPersonalizado = crearPlanPersonalizado();
           listaPlanes.add(planPersonalizado);
           return;
       }

       listaPlanes.add(ofertaPlanes[planSeleccionado-1]);
    }

    public void mostrarPlanes(){
        System.out.println("-----------------------------------------");
        System.out.println("Planes asociados a " + getNombre() + ":");

        for (Plan planPrint : listaPlanes) {
            imprimirPlan(planPrint);
        }

        System.out.println("-----------------------------------------");
    }

}


