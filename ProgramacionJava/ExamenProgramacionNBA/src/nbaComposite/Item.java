package nbaComposite;

import java.util.ArrayList;

/**
 * Created by Dual on 09/06/2016.
 */
public class Item implements Componible , Iterable  {

    // propiedades
    private String nombre;
    private boolean compuesto;
    private ArrayList<Item> hijos;


    // Constructor
    public Item(String nombre){
        this.nombre=nombre;
        hijos= new ArrayList<Item>();


    }




    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompuesto() {
        return compuesto;
    }

    public void setCompuesto(boolean compuesto) {
        this.compuesto = compuesto;
    }

    public ArrayList<Item> getHijos() {
        if (isCompuesto()){
            return hijos;
        }
        else{
            return new ArrayList();}
    }


    //  Metodos

    public void anadir(Item equipo){
        if (equipo.isCompuesto()){
            hijos.add(equipo);
        }else{}
        ;

}


    public void quitar(Item item){
        if (isCompuesto()){
        hijos.remove(item);}
        else {

        }

    }



    public void iterable(){
        Item h2=new Item("temp");
        Item h3=new Item("temp");
        if (isCompuesto()){
        System.out.println(getNombre());
        for (int i = 0; i<hijos.size(); i++) {
            h2=hijos.get(i);
            System.out.println("---------" + h2.getNombre());
            for (int i2 = 0; i2 < h2.hijos.size(); i2++) {
                h3=h2.hijos.get(i2);
                if (isCompuesto()){
                    System.out.println("--------------" + h2.hijos.get(i2).getNombre());
                    }
                for (int i3 = 0; i3 < h3.hijos.size();i3++){
                    if (isCompuesto()){
                        System.out.println("-----------------------"+ h3.hijos.get(i3).getNombre());
                    }
            }

            }


        }}

    }


    public void composite(String[] items){
        for (int i = 0; i < items.length; i++){
            hijos.add(new SimpleItem(items[i]));

        }
    }


    public void composite(ArrayList<Item> param){
        for (int i = 0; i < param.size(); i++){
            hijos.add( param.get(i));}
    }






}
