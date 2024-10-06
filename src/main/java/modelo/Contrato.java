/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Emilio
 */
public class Contrato {
    private String nombreCompleto;
    private int rut;
    private int cantidadPlanes;
    private double precioPlanes;
    
    public Contrato (String nom,int rut,int cantPlanes,double precio){
        this.nombreCompleto = nom;
        this.rut = rut;
        this.cantidadPlanes = cantPlanes;
        this.precioPlanes = precio;
        
    }
    
    //Geters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getRut() {
        return rut;
    }

    public int getCantidadPlanes() {
        return cantidadPlanes;
    }
    
    public double getPrecioPlanes() {
        return precioPlanes;
    }
    
    
    //Setters

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setPrecioPlanes(double precioPlanes) {
        this.precioPlanes = precioPlanes;
    }

    public void setCantidadPlanes(int cantidadPlanes) {
        this.cantidadPlanes = cantidadPlanes;
    }
    
    //metodos
    
    public String datosAgrupados(){
        String datos = this.nombreCompleto + "," + this.rut + "," +
                this.precioPlanes + "," + " false " + ",";
        return datos;
    }
    
    public String cantPlanes(){
        String numPlanes = Integer.toString(cantidadPlanes) + "," + " / " + "\n";
        return numPlanes;
    }
}
    
