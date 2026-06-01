package uni1a;

public class Peliculatest {

    public static void main(String[] args) {
        Actor actorPelicula = new Actor("Mark Hamill");
        Pelicula pelicula = new Pelicula("Star Wars El Imperio Contraataca", 124, "Ciencia Ficcion", actorPelicula, "Lucasfilm");
        
        if (!pelicula.getTitulo().equals("Star Wars El Imperio Contraataca")) throw new AssertionError();
        if (pelicula.getDuracionEnMinutos() != 124) throw new AssertionError();
        if (!pelicula.getGenero().equals("Ciencia Ficcion")) throw new AssertionError();
        if (!pelicula.getActorPrincipal().getNombre().equals("Mark Hamill")) throw new AssertionError();
        if (!pelicula.getEstudioCinema().equals("Lucasfilm")) throw new AssertionError();
        
        System.out.println("Prueba de Pelicula completada con exito");
    }
}