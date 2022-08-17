package JAVACOREDAY06;

import JAVACOREDAY06.Animal.Cat;
import JAVACOREDAY06.Animal.Chicken;

public class Main6 {
    public static void main(String[] args) {
        Cat cat = new Cat(3.0);

        Chicken chicken = new Chicken(1.5);

        System.out.println("cat weight: " + cat.getWeight());
        System.out.println("chicken weight: " + chicken.getWeight());
        cat.run(100.0);
        cat.run(100.0f);
        cat.run(100.0, 30);
    }
}
