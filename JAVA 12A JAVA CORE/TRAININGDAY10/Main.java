package TRAININGDAY10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Student> students = new ArrayList<>();
            Student student = new Student();
            System.out.println("Nhap so luong hoc sinh muon them");
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap ten hoc vien: ");
                student.setName(scanner.nextLine());
                System.out.println("Nhap ngay sinh cua hoc vien: ");
                student.setBirthday(scanner.nextLine());
                System.out.println("Nhap que quan cua hoc vien: ");
                student.setHomeTown(scanner.nextLine());
                students.add(student);
            }
            student.showstudents(students);
        }
    }
}
