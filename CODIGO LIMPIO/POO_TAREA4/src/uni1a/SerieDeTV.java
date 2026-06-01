package uni1a;

public class SerieDeTV extends ContenidoAudiovisual {
    private final Temporada temporadaInfo;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, Actor actorPrincipal, Temporada temporadaInfo) {
        super(titulo, duracionEnMinutos, genero, actorPrincipal);
        this.temporadaInfo = temporadaInfo;
    }

    public Temporada getTemporadaInfo() {
        return temporadaInfo;
    }
}