package junitTests;

import nbaComposite.SimpleItem;
import nbaComposite.CompositeItem;
import nbaComposite.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mgustran on 10/06/2016.
 */
public class Test1 {
    SimpleItem lakers = new SimpleItem("Lakers");
    CompositeItem pacific = new CompositeItem("Pacific");
    String[] elakers = {"Lakers"};

    @Test
    public void test1() {
        System.out.println("\n *** crear item simple y testear su nombre *** \n");


        System.out.println(lakers.getNombre());
    }

    @Test
    public void test2(){
        System.out.println("\n *** crear item compuesto y testear su nombre *** \n");

        System.out.println("Division: " + pacific.getNombre());
    }

    @Test
    public void test3(){
        System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");

        pacific.anadir(lakers);
        System.out.println(lakers.getNombre() +"! añadido a : "+ pacific.getNombre());
    }

    @Test
    public void test4(){
        System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");

        pacific.composite(elakers);
        pacific.iterable();
    }


}
