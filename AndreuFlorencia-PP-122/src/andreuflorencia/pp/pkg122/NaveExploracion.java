
package andreuflorencia.pp.pkg122;

public class NaveExploracion extends Nave {
    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int añoLanzamiento, TipoMision tipoMision) {
        super(nombre, capacidadTripulacion, añoLanzamiento);
        this.tipoMision = tipoMision;
    }

    public void explorar() {
        System.out.println(nombre + " se encuentra explorando con la mision: " + tipoMision);
    }

    public TipoMision getTipoMision() {
        return tipoMision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Mision: " + tipoMision;
    }
}

