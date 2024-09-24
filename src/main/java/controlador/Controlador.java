/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vistas.MenuPlan;

/**
 *
 * @author melis
 */
public class Controlador implements ActionListener {
    private MenuPlan vvPlan;
    private Modelo model;
    
    public Controlador(MenuPlan vvPlan, Modelo model){
        this.vvPlan = vvPlan;
        this.model = model;
        this.vvPlan.getBtnBuscarRutValido().addActionListener(this);
    }
    
    public void iniciar(){
        vvPlan.setTitle("MVC Planes");
        vvPlan.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
}
