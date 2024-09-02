/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.administradordecontratosempresatelefonica.Clases;
import java.util.Scanner;
import java.util.ArrayList;
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
    
    public String getNombreCompleto(){
        return "nombre: " + this.nombre + " "+ this.apellidoPaterno + " "
                + this.apellidoMaterno;
    }

    public ArrayList<Plan> getListaPlanes() {
        return listaPlanes;
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

    public void setListaPlanes(ArrayList<Plan> listaPlanes) {
        this.listaPlanes = listaPlanes;
    }
    
   
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
   


}


