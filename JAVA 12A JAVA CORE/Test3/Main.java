package Test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String choice = null;
            boolean exit = false;
            ManageProduction manageProduction = new ManageProduction();
            int id;
            String name;
            showChoices();
            while (true) {
                choice = scanner.next();
                switch (choice) {
                    case "1": {
                        manageProduction.addProductions();
                        break;
                    }
                    case "2": {
                        name = manageProduction.inputName();
                        manageProduction.findByName(name);
                        break;
                    }
                    case "3a": {
                        id = manageProduction.inputId();
                        manageProduction.deleteById(id);
                        break;
                    }
                    case "3b": {
                        id = manageProduction.inputId();
                        manageProduction.editById(id);
                        break;
                    }
                    case "4": {
                        manageProduction.findByAmountOf5andLower();
                        break;
                    }
                    case "5": {
                        manageProduction.findByPrice();
                        break;
                    }
                    case "6": {
                        manageProduction.showProductions();
                        break;
                    }
                    case "7": {
                        System.out.println("Exit now !!");
                        exit = true;
                        break;
                    }
                    default: {
                        System.out.println("Please choose correct choice again !!");
                        break;
                    }   
                }
                if (exit) {
                    break;
                }
                showChoices();
            }
        }
    }

    public static void showChoices() {
        System.out.println("1. Add productions.");
        System.out.println("2. Find productions by name.");
        System.out.println("3a. Delete productions by id.");
        System.out.println("3b. Edit productions'amount by id.");
        System.out.println("4. Find productions which has amount by 5 and below.");
        System.out.println("5. Find productions by price.");
        System.out.println("6. Show productions list.");
        System.out.println("7. Exit.");
        System.out.println("Please choose: ");
    }
}
