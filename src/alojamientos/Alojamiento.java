/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alojamientos;

/**
 *
 * @author brand
 */
public abstract class Alojamiento {
    private int codigo;
    private String nombre;
    private int capacidadMaxima;
    private int precioPorNoche;
    private boolean disponible;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setPrecioPorNoche(int precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public Alojamiento(int codigo, String nombre, int capacidadMaxima, int precioPorNoche, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }
    
    
    
}
