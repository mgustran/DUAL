import java.util.ArrayList;

/**
 * Created by mgustran on 01/09/2016.
 */
public class Item implements Iterable, Componible{
    private String nom;
    private boolean compost;
    private ArrayList<Item> fills;
    private String barra ;

    public Item(String nom){
        this.nom=nom;
        fills= new ArrayList<Item>();
        this.barra= "-----";


    }

    public boolean isCompost() {
        return compost;
    }

    public void setCompost(boolean compost) {
        this.compost = compost;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Item> getFills() {
        return fills;
    }

    public void incriseBarra() {
        barra=barra+("-----");
    }

    public void afegir(Item something){
//        if (!something.isCompost()) {
            fills.add(something);
            System.out.println("OK, sha afegit l'item: "+something.getNom());
//        }

    }

    public void llevar(Item something){
        fills.remove(something);
    }





    public void iterar2(){
        System.out.println(getNom());

        iterar();
    }
    @Override
    public void iterar(){

        if (isCompost()){

            for (Item something : fills) {

                something.incriseBarra();
                System.out.println(barra + something.getNom());


                for(Item something2 : something.getFills()){
                    something2.incriseBarra();
                }
                    something.iterar();
            }

        }
    }

    public void composite(String[] items){
        for (String item : items){
            fills.add(new SItem(item));
        }
    }

    public void composite(ArrayList<Item> items){
        for (Item item : items){
            fills.add(item);
        }

    }
}
