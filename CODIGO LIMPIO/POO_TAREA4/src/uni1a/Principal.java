package uni1a;

public class Principal {
    public static void main(String[] args) {
        Actor actorPelicula = new Actor("Mark Hamill");
        Pelicula pelicula = new Pelicula("Star Wars El Imperio Contraataca", 124, "Ciencia Ficcion", actorPelicula, "Lucasfilm");

        Actor actorDocumental = new Actor("James Cameron");
        Documental documental = new Documental("Secretos de las Ballenas", 180, "Naturaleza", actorDocumental, "National Geographic");

        Actor actorSerie = new Actor("Pedro Pascal");
        Temporada temporada = new Temporada(3, 8);
        SerieDeTV serie = new SerieDeTV("The Mandalorian", 40, "Ciencia Ficcion", actorSerie, temporada);

        Investigador investigador = new Investigador("Jacques Cousteau", "Biologia Marina");

        System.out.println("Sistema de Gestion Audiovisual");
        System.out.println("==============================");
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Duracion: " + pelicula.getDuracionEnMinutos() + " minutos");
        System.out.println("Genero: " + pelicula.getGenero());
        System.out.println("Actor Principal: " + pelicula.getActorPrincipal().getNombre());
        System.out.println("Estudio: " + pelicula.getEstudioCinema());
        System.out.println("------------------------------");
        System.out.println("Documental: " + documental.getTitulo());
        System.out.println("Duracion: " + documental.getDuracionEnMinutos() + " minutos");
        System.out.println("Genero: " + documental.getGenero());
        System.out.println("Director/Presenter: " + documental.getActorPrincipal().getNombre());
        System.out.println("Cadena: " + documental.getCadenaInvestigacion());
        System.out.println("Investigador Especialista: " + investigador.getNombre() + " (Especialidad: " + investigador.getEspecialidad() + ")");
        System.out.println("------------------------------");
        System.out.println("Serie de TV: " + serie.getTitulo());
        System.out.println("Duracion por Episodio: " + serie.getDuracionEnMinutos() + " minutos");
        System.out.println("Genero: " + serie.getGenero());
        System.out.println("Actor Principal: " + serie.getActorPrincipal().getNombre());
        System.out.println("Detalle: Temporada " + serie.getTemporadaInfo().getNumeroTemporada() + " con " + serie.getTemporadaInfo().getCantidadEpisodios() + " episodios");
        System.out.println("==============================");
    }
}