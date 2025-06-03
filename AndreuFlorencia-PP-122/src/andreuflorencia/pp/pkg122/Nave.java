
package andreuflorencia.pp.pkg122;

public abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int añoLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int añoLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getNombre() { return nombre; }
    public int getCapacidadTripulacion() { return capacidadTripulacion; }
    public int getAñoLanzamiento() { return añoLanzamiento; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tripulacion: " + capacidadTripulacion +
                ", Lanzamiento: " + añoLanzamiento;
    }
}
