package mementoPattern;

/**
 * Created by mgustran on 02/05/2016.
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State nº1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State nº2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State nº3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State nº4");
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First Saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second Saved State: " + originator.getState());
    }
}