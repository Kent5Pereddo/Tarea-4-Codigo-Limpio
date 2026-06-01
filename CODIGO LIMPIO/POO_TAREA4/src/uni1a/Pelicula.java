package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private final String estudioCinema;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, Actor actorPrincipal, String estudioCinema) {
        super(titulo, duracionEnMinutos, genero, actorPrincipal);
        this.estudioCinema = estudioCinema;
    }

    public String getEstudioCinema() {
        return estudioCinema;
    }
}