package mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mgustran on 02/05/2016.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}