package JAVACOREDAY07;

public class Main7 {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Dog dog = new Dog("becgie", "Alex");
        dog.speak();
        dog.move();

        Sedan sedan = new Sedan("Toyota", "red");

        Car car = new Sedan("Honda", "white");
        car.horn(true);

        Sedan sedan1 = (Sedan) car;
        sedan1.getColor();

        Car car2 = new Car("Ford");
        // Sedan sedan2 = (sedan)car2;
        // sedan2.horn(true);
        if (car2 instanceof Sedan) {
            System.out.println("car 2 la sedan");
        } else {
            System.out.println("car 2 ko la sedan");
        }

        Sedan sedan3 = new Sedan("Nissan", "Yellow");

        System.out.println(sedan3.getColor());

        changeColor(sedan3);

        System.out.println(sedan3.getColor());

        int number = 10;
        System.out.println(number);
        increase(number);
        System.out.println(number);
    }


    public static void changeColor(Sedan sedan) {
        sedan.setColor("gray");
    }

    public static void increase(int x) {
        x=x++;
    }
}
