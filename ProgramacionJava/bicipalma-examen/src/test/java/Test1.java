import org.junit.Test;

/**
 * Created by mgustran on 01/09/2016.
 */

public class Test1 {
    CItem pacific = new CItem("ptmerdaPacific");
    CItem lakers = new CItem("putamerdalakers");
    CItem e1 = new CItem("e1-qaedfvadf");
    CItem e2 = new CItem("e2-q  wedfwe");
    SItem asklain = new SItem("asklain");
    SItem e3 = new SItem("e3qaedfgvqerf");
    @Test
    public void tuputamadre() {

        //System.out.println("equipo: " + lakers.getNom());
    }

    @Test
    public void tuputamadre2() {

        System.out.println("div: " + pacific.getNom());
    }

    @Test
    public void tuputamadre3() {
        pacific.afegir(lakers);

    }

    @Test
    public void tuputamadre4() {
        lakers.afegir(asklain);
        pacific.afegir(lakers);
        pacific.afegir(e1);
        pacific.afegir(e2);
        e1.afegir(e3);

        System.out.println("iter " + pacific.getNom());
        pacific.iterar2();
    }
}