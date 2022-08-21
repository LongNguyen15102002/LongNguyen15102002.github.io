import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String choice = null;
            boolean exit = false;
            Student student = new Student();
            int id;
            showChoices();
            while (true) {
                choice = scanner.next();
                switch (choice) {
                    case "1":
                        student.addStudent();
                        break;
                    case "2":
                        id = student.inputId();
                        student.editById(id);
                        break;
                    case "3":
                        student.showClass();
                        break;
                    case "4":
                        student.deleteByCheckingIsOnlab();
                        break;
                    case "5":
                        System.out.println("Exit!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Please choose an option again!!");
                        break;
                }
                if (exit) {
                    break;
                }
                showChoices();
            }
        }
    }

    public static void showChoices() {
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by Id.");
        System.out.println("3. Show class.");
        System.out.println("4. Delete student by checking IsOnlab.");
        System.out.println("5. Exit.");
        System.out.print("Please choose your choice: ");
    }
}
