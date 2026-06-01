package uni1a;

public abstract class ContenidoAudiovisual {
    private final String titulo;
    private final int duracionEnMinutos;
    private final String genero;
    private final Actor actorPrincipal;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero, Actor actorPrincipal) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.actorPrincipal = actorPrincipal;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }
}