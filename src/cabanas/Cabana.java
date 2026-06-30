/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabanas;

import alojamientos.Alojamiento;

/**
 *
 * @author joanreciojimenez
 */
public class Cabana extends Alojamiento {
    private double metroCuadrado;
    private boolean picsina;
    
    public double getMetroCuadrado(){
        return metroCuadrado;
    }
    public boolean getPiscina (){
        return picsina;
    }

    public void setMetroCuadrado(double metroCuadrado) {
        this.metroCuadrado = metroCuadrado;
    }

    public void setPicsina(boolean picsina) {
        this.picsina = picsina;
    }

    public Cabana(double metroCuadrado, boolean picsina, int codigo, String nombre, int capacidadMaxima, int precioPorNoche, boolean disponible) {
        super(codigo, nombre, capacidadMaxima, precioPorNoche, disponible);
        this.metroCuadrado = metroCuadrado;
        this.picsina = picsina;
    }

    @Override
    public String toString() {
        return "Cabana{" + "\nmetroCuadrado = " + metroCuadrado + "\npicsina = " + picsina + '}';
    }

    
    

   
    
    
    
}
