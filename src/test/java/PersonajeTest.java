import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio6 ej = new Ejercicio6();

    @Test
    public void test1() {
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Todos los planetas.
        // tip: ej.planets.obtenerTodos()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 10
        int esperado = 10;
        int actual = ej.obtenerTodosPlanetas().length;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test2() {
        // TODO Haz la función en la clase Ejercicio6: obtenerMasPobladosQue(long poblacion)
        //  nos devuelve una lista de aquellos planetas que tienen más población que el integer pasado por parámetro
        // TODO Haz todos los test que sean necesarios.
        // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
        Planet [] esperado = {ej.obtenerTodosPlanetas()[0]};
        Planet [] actual = ej.obtenerMasPobladosQue("200000");
        Assertions.assertArrayEquals(esperado,actual);
    }

    @Test
    public void test3() {
        // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasConTerreno(String terreno)
        //  nos devuelve una lista de aquellos planetas que tienen terrenos que se llamen como el string.
        // tip: Algunos terrenos disponibles: forests, mountains, hills, etc.
        // TODO Haz todos los test que sean necesarios.
        // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
/*
        Planet[] esperado = {
                new Planet("Tatooine", "", "", "10465", "arid",
                        "1", "desert", "null", "200000",
                        new String[]{"https://swapi.dev/api/people/1/", "https://swapi.dev/api/people/2/", "https://swapi.dev/api/people/4/",
                                "https://swapi.dev/api/people/6/", "https://swapi.dev/api/people/7/", "https://swapi.dev/api/people/8/",
                                "https://swapi.dev/api/people/9/", "https://swapi.dev/api/people/11/", "https://swapi.dev/api/people/43/",
                                "https://swapi.dev/api/people/62/"},
                        new String[]{"https://swapi.dev/api/films/1/", "https://swapi.dev/api/films/3/",
                                "https://swapi.dev/api/films/4/", "https://swapi.dev/api/films/5/",
                                "https://swapi.dev/api/films/6/]", "created=2014-12-09T13:50:49.641000Z",
                                "edited=2014-12-20T20:58:18.411000Z", "url=https://swapi.dev/api/planets/1/)"},
                        "", "", "")};
*/
        int esperado = 1;
        int actual = ej.obtenerPlanetasConTerreno("forests").length;
        Assertions.assertEquals(esperado, actual);


        // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasResidentes(int residentes, String nombre)
        //  nos devuelve una lista de aquellos planetas que tienen más residentes que la variable "residentes" y que su nombre contenga el String "nombre"
        // tip: cada residente es represetnado por una url, solo tienes que contar. Ej si residents=[https://swapi.dev/api/people/3/, https://swapi.dev/api/people/21/] el resultado será 2
        // TODO Haz todos los test que sean necesarios.
        // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
    }



    @Test
    public void testPrueba () {
        Planet [] actual = {ej.obtenerTodosPlanetas()[0]};
        Planet [] esperado = {ej.obtenerTodosPlanetas()[1]};
        Assertions.assertArrayEquals(actual,esperado);
    }






}
