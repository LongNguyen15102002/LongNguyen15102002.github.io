package JAVACOREDAY10.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap so nha: ");
            String soNha = scanner.nextLine();
            System.out.println("Nhap so thanh vien: ");
            int familyNumber = scanner.nextInt();

            Person person = new Person("Huong", "1-1-1991", "HR");
            Person person2 = new Person("Hong", "2-1-1991", "Manager");

            ArrayList<Person> people = new ArrayList<>();
            people.add(person);
            people.add(person2);

            Household household = new Household();
            household.setHouseNumber(soNha);
            household.setNumberOfMembers(familyNumber);
            household.setPeople(people);

            System.out.println(household.toString());
        }
        
    }
}
