
package andreuflorencia.pp.pkg122;

public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int añoLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, añoLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void realizarMantenimiento() {
        System.out.println(nombre + " se encuentra realizando mantenimiento como crucero estelar.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Pasajeros: " + cantidadPasajeros;
    }
}
