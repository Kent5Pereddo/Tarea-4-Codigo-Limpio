package uni1a;

public class SerieDeTVtest {

    public static void main(String[] args) {
        Actor actorSerie = new Actor("Pedro Pascal");
        Temporada temporada = new Temporada(3, 8);
        SerieDeTV serie = new SerieDeTV("The Mandalorian", 40, "Ciencia Ficcion", actorSerie, temporada);
        
        if (!serie.getTitulo().equals("The Mandalorian")) throw new AssertionError();
        if (serie.getDuracionEnMinutos() != 40) throw new AssertionError();
        if (!serie.getGenero().equals("Ciencia Ficcion")) throw new AssertionError();
        if (!serie.getActorPrincipal().getNombre().equals("Pedro Pascal")) throw new AssertionError();
        if (serie.getTemporadaInfo().getNumeroTemporada() != 3) throw new AssertionError();
        if (serie.getTemporadaInfo().getCantidadEpisodios() != 8) throw new AssertionError();
        
        System.out.println("Prueba de Serie de TV completada con exito");
    }
}