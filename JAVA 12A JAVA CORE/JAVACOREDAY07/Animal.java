package JAVACOREDAY07;

public abstract class Animal {
    protected String name;
    protected String breed;
    double weight;

    public String getName() {
        return this.name;
    }

    public void move() {
        System.out.println("animal move");
    }

    public abstract void speak();
}
