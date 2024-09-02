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



    public static void imprimirPlan(Plan plan) {
        System.out.println(" " + plan.getNombrePlan());
        System.out.println("   " + plan.getNumeroTelefono());
        System.out.println("   " + plan.getCantGigaBytes() + " Gigas Libres");
        System.out.println("   " + plan.getCantMinutos() + " Minutos Libres");
        System.out.println("   $" + plan.getPrecio() + "\n")   ;
    }




}
