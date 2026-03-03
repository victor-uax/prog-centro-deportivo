public class CentroDeportivo {

    // atributos de la clase CentroDeportivo
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    // constructor de la clase CentroDeportivo
    public CentroDeportivo(int cantidad_maxima_entrenadores) {

        this.NUM_MAX_ENTRENADORES = comprobarCantidadEntrenadores(cantidad_maxima_entrenadores);


    }

    private int comprobarCantidadEntrenadores(int cantidad_maxima_entrenadores){
        int cantidadFinal;

        if( cantidad_maxima_entrenadores > 0){
            cantidadFinal = cantidad_maxima_entrenadores;
        }else{
            cantidadFinal = 15;
        }
        cantidadFinal = cantidad_maxima_entrenadores;
        return cantidad_maxima_entrenadores;
    }
}
