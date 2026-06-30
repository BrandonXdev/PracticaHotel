
package habitaciones;
import alojamientos.Alojamiento; 


public class Habitacion extends Alojamiento{
    private int numeroPiso;
    private boolean balcon;

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public Habitacion(int numeroPiso, boolean balcon, int codigo, String nombre,
            int capacidadMaxima, int precioPorNoche, boolean disponible) {
        super(codigo, nombre, capacidadMaxima, precioPorNoche, disponible);
        this.numeroPiso = numeroPiso;
        this.balcon = balcon;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return super.toString() +
         "Numero de piso: " + numeroPiso + "\nBalcon: " + balcon;
    }
>>>>>>> Habitaciones
}
