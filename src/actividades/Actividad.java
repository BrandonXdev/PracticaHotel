/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades;

import java.time.LocalDate;
import java.time.LocalTime;
import personas.Cliente;


/**
 *
 * @author brand
 */
public class Actividad {
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int cupoMaximo;
    private Cliente[] clientes;
    private TipoActividades tipo;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Actividad(String nombre, LocalDate fecha, LocalTime hora, int cupoMaximo, TipoActividades tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.clientes = new Cliente[cupoMaximo];
        this.tipo = tipo;
    }
    
    public boolean cuposDisponibles(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                return true;   
            }
        }
        return false;
    }
    
    public void inscribirClientes(Cliente cliente){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;       
            }
        }
    }
    
    public double porcentajeOcupacion(){
        int ocupados = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                ocupados++;
                
            }
        }
        if (cupoMaximo == 0) {
            return 0;
        }
        return (ocupados * cupoMaximo) / 100;
    }
    
    
    
    
    
    
    
    
    
        
    
    
    
    
}
