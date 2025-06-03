
package andreuflorencia.pp.pkg122;

import java.util.*;

public class AgenciaEspacial {
    private List<Nave> naves = new ArrayList<>();

    public void agregarNave(Nave nave) throws ExcepcionNaveDuplicada {
        for (Nave n : naves) {
            if (n.getNombre().equals(nave.getNombre()) &&
                n.getAñoLanzamiento() == nave.getAñoLanzamiento()) {
                throw new ExcepcionNaveDuplicada("Ya existe una nave con ese mismo nombre y fecha de lanzamiento.");
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
        for (Nave n : naves) {
            System.out.println(n);
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            if (n instanceof NaveExploracion) {
                ((NaveExploracion) n).explorar();
            } else if (n instanceof Carguero) {
                ((Carguero) n).explorar();
            } else {
                System.out.println(n.getNombre() + " no puede iniciar exploracion, solamente transporta pasajeros.");
            }
        }
    }

    public void filtrarPorTipoMision(TipoMision tipo) {
        for (Nave n : naves) {
            if (n instanceof NaveExploracion) {
                NaveExploracion ne = (NaveExploracion) n;
                if (ne.getTipoMision() == tipo) {
                    System.out.println(ne);
                }
            }
        }
    }
}
