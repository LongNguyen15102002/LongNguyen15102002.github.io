package JAVACOREDAY07;

public class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }
    
    // public void horn() {
    //     System.out.println("Tuyt tuyt...");
    // }

    public void horn(boolean isCrowd) {
        if (isCrowd) {
            System.out.println(" Pip pip pip...");
        }
        System.out.println(" Pip");
    }
    
}
