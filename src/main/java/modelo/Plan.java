package modelo;

public class Plan {
    private String nombrePlan;
    private String numeroTelefono;
    private int cantGigaBytes;
    private int cantMinutos;
    private double precio;


    // -----------------------------------------------------------------------------------------------
    //Constructor
    // -----------------------------------------------------------------------------------------------

    public Plan(String nombrePlan, int cantGigaBytes, int cantMinutos, double cuotaMensual) {
        this.nombrePlan = nombrePlan;
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cuotaMensual;
    }

    public Plan(int cantGigaBytes, int cantMinutos, double cuotaMensual) {
        this.nombrePlan = "Plan Personalizado";
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cuotaMensual;
    }
    
    public Plan(int cantGigaBytes, int cantMinutos, String numeroTelefono) {
        this.nombrePlan = "Plan Personalizado";
        this.numeroTelefono = numeroTelefono;
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cantGigaBytes * 24 + cantMinutos * 6.392;
    }
    
    public Plan(String nombrePlan, String numeroTelefono, int cantGigaBytes, int cantMinutos, double cuotaMensual) {
        this.nombrePlan = nombrePlan;
        this.numeroTelefono = numeroTelefono;
        this.cantGigaBytes = cantGigaBytes;
        this.cantMinutos = cantMinutos;
        this.precio = cuotaMensual;
    }

    public Plan(Plan ofertaPlanes) {
        this.nombrePlan = ofertaPlanes.nombrePlan;
        this.numeroTelefono = ofertaPlanes.numeroTelefono;
        this.cantGigaBytes = ofertaPlanes.cantGigaBytes;
        this.cantMinutos = ofertaPlanes.cantMinutos;
        this.precio = ofertaPlanes.precio;

    }

    // -----------------------------------------------------------------------------------------------
    // Getters
    // -----------------------------------------------------------------------------------------------

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
    
    // -----------------------------------------------------------------------------------------------
    // Setters
    // -----------------------------------------------------------------------------------------------

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
    
    // -----------------------------------------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------------------------------------

    public static void imprimirPlan(Plan plan) {
        System.out.println(" " + plan.getNombrePlan());
        System.out.println("   +56 9" + plan.getNumeroTelefono());
        System.out.println("   " + plan.getCantGigaBytes() + " Gigas Libres");
        System.out.println("   " + plan.getCantMinutos() + " Minutos Libres");
        System.out.println("   $" + plan.getPrecio() + "\n")   ;
    }




}
