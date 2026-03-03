public class CentroDeportivo {

    // atributos de la clase CentroDeportivo
    private Entrenador[] entrenadores;
    private final int MAX_ENTRENADORES;

    // constructor de la clase CentroDeportivo
    public CentroDeportivo(int cantidad_maxima_entrenadores) {
        MAX_ENTRENADORES = cantidad_maxima_entrenadores;

    }

    private boolean comprobarCantidadEntrenadores(int cantidad_maxima_entrenadores){
        boolean entrenadoresMayorQueCero = false;

        if( cantidad_maxima_entrenadores > 0){
            entrenadoresMayorQueCero = true;
        }
        return entrenadoresMayorQueCero;
    }
}
