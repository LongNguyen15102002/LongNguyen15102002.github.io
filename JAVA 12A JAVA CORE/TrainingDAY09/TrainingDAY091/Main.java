package TrainingDAY09.TrainingDAY091;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Student student = new Student();
            System.out.println("Nhap ten hoc vien: ");
            String name = scanner.nextLine();
            System.out.println("Nhap tuoi cua hoc vien: ");
            int age = scanner.nextInt();
            System.out.println("Nhap diem cua hoc vien: ");
            double marks = scanner.nextDouble();
            student.setName(name);
            student.setAge(age);
            student.setMarks(marks);
            student.display();
            student.classify();
        }
    }
}
