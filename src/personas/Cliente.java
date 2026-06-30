/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

/**
 *
 * @author hilar
 */
public class Cliente extends personas.Persona {
 private String nacionalidad;
 private String internacional;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getInternacional() {
        return internacional;
    }
 
    public Cliente(String nombreCompleto, String identificacion, LocalDate fechaNacimiento, String telefono, String correoElectronico, String paisProcedencia) {
        super(nombreCompleto, identificacion, fechaNacimiento, telefono, correoElectronico, paisProcedencia);
    }

    @Override
    public String toString() {
        return  "Nacionalidad: " + nacionalidad + "\n Internacional:" + internacional;
    }
    
}
