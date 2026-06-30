/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recervaciones;

import alojamientos.Alojamiento;
import java.time.LocalDate;
import java.time.Period;
import personas.Cliente;

/**
 *
 * @author joanreciojimenez
 */
public class Recervacion {
    private Cliente cliente;
    private Alojamiento alojamento;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private String estadoHabitacion;
    private int nochesReservadas;

    public Cliente getCliente() {
        return cliente;
    }

    public Alojamiento getAlojamento() {
        return alojamento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAlojamento(Alojamiento alojamento) {
        this.alojamento = alojamento;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }
    
    public int calcularNochesRecervadas(){
        Period tiempoHotelNoche = Period.between(fechaIngreso,fechaSalida);
        return tiempoHotelNoche.getDays();
    }

    public Recervacion(Cliente cliente, Alojamiento alojamento, LocalDate fechaIngreso, LocalDate fechaSalida, String estadoHabitacion) {
        this.cliente = cliente;
        this.alojamento = alojamento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoHabitacion = estadoHabitacion;
        this.nochesReservadas = calcularNochesRecervadas();
    }

    @Override
    public String toString() {
        return "Recervacion{" + "\ncliente = " + cliente + "\nalojamento = " + alojamento + ", fechaIngreso = " + fechaIngreso + "\n fechaSalida = " + fechaSalida + "\n estadoHabitacion = " + estadoHabitacion + "\n nochesReservadas = " + nochesReservadas + '}';
    }  
    
}
