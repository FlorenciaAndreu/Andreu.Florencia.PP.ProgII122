
package andreuflorencia.pp.pkg122;

public class Carguero extends Nave {
    private int capacidadCarga; 

    public Carguero(String nombre, int capacidadTripulacion, int añoLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, añoLanzamiento);
        if (capacidadCarga < 100 || capacidadCarga > 500)
            throw new IllegalArgumentException("La capacidad de carga debe ser entre 100 y 500 toneladas.");
        this.capacidadCarga = capacidadCarga;
    }

    public void explorar() {
        System.out.println(nombre + " se encuentra explorando como carguero.");
    }

    public void realizarMantenimiento() {
        System.out.println(nombre + " se encuentra realizando mantenimiento como carguero.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de carga: " + capacidadCarga + "t";
    }
}
