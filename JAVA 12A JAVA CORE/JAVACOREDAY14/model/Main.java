package JAVACOREDAY14.model;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1, 120000);
        Wallet wallet2 = new Wallet(2, 190000);

        Shipper shipper = new Shipper(1, "Shipper1", "123456", "1234");
        Shipper shipper2 = new Shipper(2, "Shipper2", "123", "123");

        Customer customer = new Customer(1, "Customer1", "111111", "111", false, wallet);
        Customer customer2 = new Customer(2, "Customer2", "111222", "122", false, wallet2);

        Food food = new Food(1, "Pizza", 120000, "FastFood", 4, "Nice", 2);
        Food food2 = new Food(2, "Noodles", 190000, "Fast Food", 3.8, "NOt bad", 3);
    }
}
