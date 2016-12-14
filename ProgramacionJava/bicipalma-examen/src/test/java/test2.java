import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mgustran on 02/09/2016.
 */

public class test2 {

    CItem nba = new CItem("NBA");
    CItem este = new CItem("East");
    CItem atlantic = new CItem("Atlantic");
    CItem central = new CItem("Central");
    CItem southEast = new CItem("South East");
    CItem oeste = new CItem("West");
    CItem northEast = new CItem("North East");
    CItem pacific = new CItem("Pacific");
    CItem southWest = new CItem("South West");
    String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
    String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
    String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};
    String[] equiposNorthEast = {"Nuggets", "TimberWolves", "Thunder", "Blazers", "Jazz"};
    String[] equiposPacific = {"Warriors", "LA Clippers", "LA Lakers", "Suns", "Kings"};
    String[] equiposSouthWest = {"Mavericks", "Rockets", "Grizzlies", "Pelicans", "Spurs"};
    ArrayList<Item> divisionesEste = new ArrayList<>();
    ArrayList<Item> divisionesOeste = new ArrayList<>();
    ArrayList<Item> conferenciasNBA = new ArrayList<>();

    // Crear division Central



    @Test
    public void test1(){
        System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");
        System.out.println("Se han añadido 5 equipos");

        atlantic.composite(equiposAtlantic);
        atlantic.iterar2();
    }


    @Test
    public  void test2(){
        System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");

        nba.afegir(este);
        este.afegir(atlantic);
        atlantic.composite(equiposAtlantic);
        nba.iterar2();
    }

    @Test
    public void test3(){
        System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");

        central.composite(equiposCentral);
        central.iterar2();
    }

    @Test
    public void test4(){
        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");

        southEast.composite(equiposSouthEast);
        este.afegir(southEast);
        southEast.iterar2();
    }

    @Test
    public void test5(){
        System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");

        atlantic.composite(equiposAtlantic);
        central.composite(equiposCentral);
        southEast.composite(equiposSouthEast);

        divisionesEste.add(atlantic);
        divisionesEste.add(central);
        divisionesEste.add(southEast);

        este.composite(divisionesEste);
        este.iterar2();
    }


    @Test
    public void test6(){
        System.out.println("\n *** eliminar un hijo a profundidad n *** \n");

        atlantic.composite(equiposAtlantic);
        central.composite(equiposCentral);
        southEast.composite(equiposSouthEast);

        divisionesEste.add(atlantic);
        divisionesEste.add(central);
        divisionesEste.add(southEast);

        este.composite(divisionesEste);
        este.llevar(atlantic);
        este.iterar2();
    }


    @Test
    public void test7(){
        System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");

        atlantic.composite(equiposAtlantic);
        central.composite(equiposCentral);
        southEast.composite(equiposSouthEast);

        divisionesEste.add(atlantic);
        divisionesEste.add(central);
        divisionesEste.add(southEast);


        northEast.composite(equiposNorthEast);
        pacific.composite(equiposPacific);
        southWest.composite(equiposSouthWest);

        divisionesOeste.add(northEast);
        divisionesOeste.add(pacific);
        divisionesOeste.add(southWest);


        este.composite(divisionesEste);
        oeste.composite(divisionesOeste);

        conferenciasNBA.add(este);
        conferenciasNBA.add(oeste);

        nba.composite(conferenciasNBA);


        nba.iterar2();
    }





}
