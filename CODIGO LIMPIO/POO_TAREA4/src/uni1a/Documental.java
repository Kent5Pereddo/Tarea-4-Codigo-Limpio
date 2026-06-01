package uni1a;

public class Documental extends ContenidoAudiovisual {
    private final String cadenaInvestigacion;

    public Documental(String titulo, int duracionEnMinutos, String genero, Actor actorPrincipal, String cadenaInvestigacion) {
        super(titulo, duracionEnMinutos, genero, actorPrincipal);
        this.cadenaInvestigacion = cadenaInvestigacion;
    }

    public String getCadenaInvestigacion() {
        return cadenaInvestigacion;
    }
}