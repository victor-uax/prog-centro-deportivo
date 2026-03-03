public class Main {
    public static void main(String[] args) {
        CentroDeportivo centroDeportivo1 = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Gulian", "hockey", 7345632);
        Entrenador entrenador2 = new Entrenador(2, "Guanga", "fuchibol", 21);
        Entrenador entrenador3 = new Entrenador(3, "Luca", "boxeo", 2);
        Entrenador entrenador4 = new Entrenador(4, "El kiko", "criket", 5);
        Entrenador entrenador5 = new Entrenador(5, "Mario", "surf", 12);
        Entrenador entrenador6 = new Entrenador(6, "Carlos", "esgrima", 88);
        Entrenador entrenador7 = new Entrenador(7, "Rafa", "póker", 550);
        Entrenador entrenador8 = new Entrenador(8, "Santi", "triatlon", 1500);
        Entrenador entrenador9 = new Entrenador(9, "PapuGod", "skate", 0);

        System.out.println(centroDeportivo1.registrarEntrenador(entrenador1));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador2));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador3));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador4));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador5));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador6));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador7));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador8));
        System.out.println(centroDeportivo1.registrarEntrenador(entrenador9));

        System.out.println(centroDeportivo1.mostrarEntrenadores());

        System.out.println(centroDeportivo1.contarEntrenadores());
    }
}