public class CentroDeportivo {

    // atributos de la clase CentroDeportivo
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    // constructor de la clase CentroDeportivo
    public CentroDeportivo(int cantidad_maxima_entrenadores) {

        this.NUM_MAX_ENTRENADORES = comprobarCantidadEntrenadores(cantidad_maxima_entrenadores);

        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];

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

    /**
     * Este metodo registra el Entrenador recibido, para ello comprueba primero si hay hueco libre para él y si lo hay comprueba que no esté registrado ya
     * @param entrenador
     * @return true si ha podido ser registrado correctamente o false si no ha podido ser registrado
     */
    public boolean registrarEntrenador(Entrenador entrenador){
        int primerHuecoLibre = buscarPrimerHuecoLibre();
        boolean entrenadorRegistrado = false;

        if( primerHuecoLibre >= 0 ){
            if( buscarEntrenador(entrenador.getId()) == null ){
                entrenadores[buscarPrimerHuecoLibre()] = entrenador;
                entrenadorRegistrado = true;
            }
        }
        return entrenadorRegistrado;
    }

    /**
     * Muestra la información de los Entrenadores de cada posición del array entrenadores siempre que la posición no esté vacía
     * @return String con toda la información de los Entrenadores
     */
    public String mostrarEntrenadores(){
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < NUM_MAX_ENTRENADORES; i++ ){
            if( entrenadores[i] != null){

                entrenadores[i].toString();
                sb.append(entrenadores[i].toString());
            }
        }
        return sb.toString();
    }

    /**
     * Metodo que cuenta los entrenadores
     * @return int contadorDeEntrenadores
     */
    public int contarEntrenadores(){
        int contadorDeEntrenadores = 0;

        for( int i = 0; i < NUM_MAX_ENTRENADORES; i++ ){
            if( entrenadores[i] != null){
                contadorDeEntrenadores++;
            }
        }
        return contadorDeEntrenadores;
    }
}
