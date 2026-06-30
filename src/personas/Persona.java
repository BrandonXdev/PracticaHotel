/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    private String nombreCompleto;
    private String identificacion;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correoElectronico;
    private String paisProcedencia;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }
  
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    public int getEdad(){
        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Persona(String nombreCompleto, String identificacion, LocalDate fechaNacimiento, String telefono, String correoElectronico, String paisProcedencia) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.paisProcedencia = paisProcedencia;
    }

    @Override
    public String toString() {
        return "\n Nombre Completo: " + nombreCompleto + "\n Identificacion: " + identificacion + "\n Fecha Nacimiento: " + fechaNacimiento + "\n Telefono" + telefono + "\n Correo Electronico: " + correoElectronico + ", Pais Procedencia: " + paisProcedencia;
    }
    
    
    
}
