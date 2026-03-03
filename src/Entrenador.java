public class Entrenador {

    // atributos de la clase Entrenador
    private int id;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    //El sistema debe permitir registrar entrenadores, buscarlos, mostrarlos y contar cuántos están actualmente almacenados.

    /**
     * Metodo constructor de la clase Entrenador que define el valor de sus atributos
     * @param id
     * @param nombre
     * @param especialidad
     * @param aniosExperiencia
     */
    public Entrenador(int id, String nombre, String especialidad, int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    /**
     * Metodo que devuelve el id del Entrenador
     * @return int id del Entrenador
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que devuelve el nombre del Entrenador
     * @return String nombre del Entrenador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que devuelve la especialidad del Entrenador
     * @return String especialidad del Entrenador
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Metodo que devuelve los años de experiencia del Entrenador
     * @return int años de experiencia del Entrenador
     */
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrenador{");
        sb.append("id: %d");
        sb.append(" , nombre: %s");
        sb.append(" , especialidad: %s");
        sb.append(" , aniosExperiencia: %d");
        sb.append('}');

        return sb.toString();
    }


}
