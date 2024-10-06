/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Emilio
 */
public class ContratoPersonalizado extends Contrato {
    private boolean HayPlanPersonalizado;
    private int cantPlanesPersonalizado; 
    
    public ContratoPersonalizado(String nom,int rut,int cantPlan,int cantPlanPerso,double precio,boolean planPerson) {
        super(nom,rut,cantPlan,precio);
        this.HayPlanPersonalizado = planPerson;
        this.cantPlanesPersonalizado = cantPlanPerso;
    }
    
    //Getters

    public boolean isHayPlanPersonalizado() {
        return HayPlanPersonalizado;
    }
    
    //Setters

    public void setHayPlanPersonalizado(boolean HayPlanPersonalizado) {
        this.HayPlanPersonalizado = HayPlanPersonalizado;
    }
    
    //metodos
    
    public String datosAgrupados(){
        String nom = getNombreCompleto();
        int rut = getRut();
        String precio = Double.toString(getPrecioPlanes());
        String datos = nom + "," + rut + "," + precio + "," + Boolean.toString(HayPlanPersonalizado) + ",";
        return datos;
    }
    
    public String cantPlanes(){
        String cantPlanes = Integer.toString(getCantidadPlanes());
        String numPlanes = cantPlanes + "," + Integer.toString(cantPlanesPersonalizado) + "\n";
        return numPlanes;
    }
}
