package uni1a;

public class Documentaltest {

    public static void main(String[] args) {
        Actor actorDocumental = new Actor("James Cameron");
        Documental documental = new Documental("Secretos de las Ballenas", 180, "Naturaleza", actorDocumental, "National Geographic");
        
        if (!documental.getTitulo().equals("Secretos de las Ballenas")) throw new AssertionError();
        if (documental.getDuracionEnMinutos() != 180) throw new AssertionError();
        if (!documental.getGenero().equals("Naturaleza")) throw new AssertionError();
        if (!documental.getActorPrincipal().getNombre().equals("James Cameron")) throw new AssertionError();
        if (!documental.getCadenaInvestigacion().equals("National Geographic")) throw new AssertionError();
        
        System.out.println("Prueba de Documental completada con exito");
    }
}