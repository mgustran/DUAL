package clases;

public class Pato implements Walkable {
private String name;
public Duck(String name) {
this.name = name;
}
public void walk() {
System.out.println(name + " (a duck) is walking.");
}
}
