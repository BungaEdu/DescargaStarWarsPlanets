import java.util.Arrays;

public class Ejercicio6 {

    public Planets planets;

    public Ejercicio6() {
        planets = new Planets(ObtenerPlanetsRequest.Companion.get().getResults());
    }

    public Planet[] quitarNulos(Planet[] plan, int i) {
        return Arrays.copyOf(plan, i);
    }

    public Planet[] obtenerTodosPlanetas() {
        Planet[] out = new Planet[planets.obtenerTodos().length];
        int i = 0;
        for (Planet plan : planets.obtenerTodos()) {
            out[i] = plan;
            i++;
        }
        return quitarNulos(out, i);
    }

    public Planet[] obtenerMasPobladosQue(String poblacion) {
        Planet[] outWithoutUnknown = new Planet[planets.obtenerTodos().length];
        Planet[] out = new Planet[planets.obtenerTodos().length];
        int i = 0;
        for (Planet plan : planets.obtenerTodos()) {
            if (!plan.getPopulation().equals("unknown")) {
                outWithoutUnknown[i] = plan;
                i++;
            }
        }
        i = 0;
        for (Planet x : outWithoutUnknown) {
            if (x.getPopulation().equals(poblacion)) {
                out[i] = x;
                i++;
            }
        }
        return quitarNulos(outWithoutUnknown, i);
    }

    public Planet[] obtenerPlanetasConTerreno(String terreno) {
        Planet[] outWithoutUnknown = new Planet[planets.obtenerTodos().length];
        Planet[] out = new Planet[planets.obtenerTodos().length];
        int i = 0;
        for (Planet plan : planets.obtenerTodos()) {
            if (!plan.getPopulation().equals("unknown")) {
                outWithoutUnknown[i] = plan;
                i++;
            }
        }
        i = 0;
        for (Planet x : outWithoutUnknown) {
            if (x.getTerrain().equals(terreno)) {
                out[i] = x;
                i++;
            }
        }
        return quitarNulos(outWithoutUnknown, i);
    }




}