package TRAININGDAY10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String birthday;
    private String homeTown;
    private List<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student(String name, String birthday, String homeTown) {
        this.name = name;
        this.birthday = birthday;
        this.homeTown = homeTown;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String inputName() {
        System.out.println("Nhap ten sinh vien: ");
        return scanner.nextLine();
    }

    public String inputBirthday() {
        System.out.println("Nhap ngay sinh: ");
        return scanner.nextLine();
    }

    public String inputHomeTown() {
        System.out.println("Nhap que quan: ");
        return scanner.next();
    }

    public void showstudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Ten sinh vien la: " + students.get(i).getName());
            System.out.println("Ngay sinh: " + students.get(i).getBirthday());
            System.out.println("Que quan: " + students.get(i).getHomeTown());
        }
    }

    public void addStudent() {
        String name = inputName();
        String birthday = inputBirthday();
        String homeTown = inputHomeTown();
        Student student = new Student(name, birthday, homeTown);
        students.add(student);
    }

    public void findByHomeTownandYearOfBirth() {
        for (Student student : students) {
            if (student.getBirthday().contains("1985") && student.getHomeTown().equalsIgnoreCase("Thai Nguyen")) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "Student [birthday=" + birthday + ", homeTown=" + homeTown + ", name=" + name + ", scanner=" + scanner
                + ", students=" + students + "]";
    }
}
