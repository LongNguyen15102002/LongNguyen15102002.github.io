package JAVACOREDAY06.Animal;

public class Cat extends Animal {
   
    public Cat(double weight) {
        this.weight = weight;
    }
    
    // public double getWeight() {
    //     return weight;
    // }
    public void run(double speed) {
        System.out.println("speed with double value: " + speed);
    }

    public void run(float speed) {
        System.out.println("speed with float value: ");
    }

    public void run (double speed, int second) {
        System.out.println("in " + second + " the cat will get speed " + speed);
    }
}
