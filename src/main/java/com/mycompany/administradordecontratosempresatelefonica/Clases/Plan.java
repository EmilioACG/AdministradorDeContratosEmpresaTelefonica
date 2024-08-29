package com.mycompany.administradordecontratosempresatelefonica.Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Plan {
    private String nombrePlan;
    private String numeroTelefono;
    private int cantGigaBytes;
    private int cantMinutos;
    private double precio;



    //Constructor
    public Plan(String nombrePlan, int cantGigaBytes, int cantMinutos, double cuotaMensual) {
        this.nombrePlan = nombrePlan;
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cuotaMensual;
    }

    public Plan(int cantGigaBytes, int cantMinutos, double cuotaMensual) {
        this.nombrePlan = "Plan personalizado";
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cuotaMensual;
    }



    //Getters
    public String getNombrePlan() {
        return nombrePlan;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getCantGigaBytes() {
        return cantGigaBytes;
    }

    public int getCantMinutos() {
        return cantMinutos;
    }

    public double getPrecio() {
        return precio;
    }



    //Setters
    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCantGigaBytes(int cantGigaBytes) {
        this.cantGigaBytes = cantGigaBytes;
    }

    public void setCantMinutos(int cantMinutos) {
        this.cantMinutos = cantMinutos;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    //Metodos
    /*
    public void contrataPlanBasico(Scanner lector, ArrayList<Plan> planes, Plan[] planesBasicos) {
        
    }
     */


    public void crearPlanPersonalizado(Scanner lector, ArrayList<Plan> planes) {
        int cantGigaBytes;
        int cantMinutos;
        String numeroTelefono;
        double precio;

        System.out.println("Ingrese la cantidad de giga bytes mensuales que necesita: ");
        cantGigaBytes = lector.nextInt();
        lector.nextLine();

        System.out.println("Ingrese la cantidad de minutos mensuales que necesita: ");
        cantMinutos = lector.nextInt();
        lector.nextLine();

        System.out.println("Ingrese el numero de telefono: ");
        numeroTelefono = lector.nextLine(); //FALTA VERIFICACION DE QUE EL NUMERO NO EXISTA

        precio = cantGigaBytes * 1700 + cantMinutos * 6.93;

        Plan nuevoPlan = new Plan(cantGigaBytes, cantMinutos,precio);
        nuevoPlan.setNumeroTelefono(numeroTelefono);

        planes.add(nuevoPlan);
    }

    public void mostrarPlanesCliente(Cliente cliente) {

        System.out.println("-----------------------------------------");
        System.out.println("Planes asociados a " + cliente.getNombre() + ":");

        for (Plan planPrint : cliente.listaPlanes) {
            imprimirPlan(planPrint);
        }

        System.out.println("-----------------------------------------");
    }

    public void imprimirPlan(Plan plan) {
        System.out.println(" " + plan.getNombrePlan());
        System.out.println(" " + plan.getNumeroTelefono());
        System.out.println("  " + plan.getCantGigaBytes() + " Gigas Libres");
        System.out.println("  " + plan.getCantMinutos() + " Minutos Libres");
        System.out.println("   $" + plan.getPrecio() + "\n")   ;
    }




}
