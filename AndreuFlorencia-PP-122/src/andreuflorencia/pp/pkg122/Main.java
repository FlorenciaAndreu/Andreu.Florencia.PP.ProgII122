
package andreuflorencia.pp.pkg122;


public class Main {
    public static void main(String[] args) {
        AgenciaEspacial agencia = new AgenciaEspacial();

        System.out.println("\n**** Bienvenidos a nuestra Agencia Espacial ****\n");
        
        try {
            agencia.agregarNave(new NaveExploracion("Apolo", 5, 2020, TipoMision.CARTOGRAFIA));
            agencia.agregarNave(new Carguero("Galactica", 10, 2022, 300));
            agencia.agregarNave(new CruceroEstelar("Andromeda", 20, 2021, 500));
            agencia.agregarNave(new NaveExploracion("Mercurio", 4, 2022, TipoMision.INVESTIGACION));
            agencia.agregarNave(new NaveExploracion("Urano", 5, 2021, TipoMision.INVESTIGACION));
            agencia.agregarNave(new NaveExploracion("Marte", 6, 2020, TipoMision.CONTACTO));
            
            // Duplicar carguero con mismo nombre y año
            agencia.agregarNave(new Carguero("Galactica", 10, 2022, 400));
        } catch (ExcepcionNaveDuplicada e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Naves registradas ---");
        agencia.mostrarNaves();

        System.out.println("\n--- Iniciar exploracion ---");
        agencia.iniciarExploracion();

        System.out.println("\n--- Filtrar por mision: CARTOGRAFIA ---");
        agencia.filtrarPorTipoMision(TipoMision.CARTOGRAFIA);
        
        System.out.println("\n--- Filtrar por mision: INVESTIGACION ---");
        agencia.filtrarPorTipoMision(TipoMision.INVESTIGACION);
        
        System.out.println("\n--- Filtrar por mision: CONTACTO ---");
        agencia.filtrarPorTipoMision(TipoMision.CONTACTO);
        
    }
}
