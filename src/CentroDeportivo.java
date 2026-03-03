public class CentroDeportivo {

    // atributos de la clase CentroDeportivo
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    // constructor de la clase CentroDeportivo
    public CentroDeportivo(int cantidad_maxima_entrenadores) {

        this.NUM_MAX_ENTRENADORES = comprobarCantidadEntrenadores(cantidad_maxima_entrenadores);


    }

    /**
     * Metodo para comprobar que la cantidad de entrenadores recibida sea mayor que 0
     * @param cantidad_maxima_entrenadores
     * @return la cantidad que ha sido recibida si es mayor que 0, o si es menor que 0 se le asigna el valor 15
     */
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

    /**
     * Metodo para buscar un Entrenador por su id
     * @param id
     * @return el Entrenador entero si lo encuentra o null si no lo ha encontrado
     */
    public Entrenador buscarEntrenador(int id){
        boolean seguirBuscando = true;
        Entrenador entrenadorBuscado = null;

        for( int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++){
           if( entrenadores[i] != null && entrenadores[i].getId() == id ){
               entrenadorBuscado = entrenadores[i];
               seguirBuscando = false;
           }
        }
        return entrenadorBuscado;
    }

    /**
     * Metodo que sirve para buscar el primero hueco libre del array entrenadores
     * @return la primera posición libre si la encuentra o un -1 si no ha encontrado
     */
    private int buscarPrimerHuecoLibre(){
        boolean seguirBuscando = true;
        int primerHuecoLibre = -1;

        for ( int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++){
            if( entrenadores[i] == null ){
                primerHuecoLibre = i;
                seguirBuscando = false;
            }
        }
        return primerHuecoLibre;
    }


}
