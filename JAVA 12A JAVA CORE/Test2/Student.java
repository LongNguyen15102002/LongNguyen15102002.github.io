import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int yearOfBirth;
    private String classification;
    private boolean isOnlab = true;
    private ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student(){}
    
    public Student(int id, String name, int yearOfBirth, String classification, Boolean isOnlab) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.classification = classification;
        this.isOnlab = isOnlab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    

    public void showClass() {
        System.out.println("Trung tam Techmaster");
        Class class1 = new Class("JAVA Core");
        class1.setStudents(students);
        
        Teacher teacher = new Teacher("Chu Tien Dat", 1997);
        System.out.println(teacher);
        System.out.println();
        Manager manager = new Manager("Nguyen Thanh Huong", 1991);
        System.out.println(manager);
        System.out.println();
        for (Student student : students) {
            System.out.println("Ten hoc vien la: " + student.getName());
            System.out.println("Id hoc vien la: " + student.getId());
            System.out.println("Sinh nam: " + student.getYearOfBirth());
            System.out.println("Xep loai: " + student.getClassification());
            System.out.println("Di hoc: " + student.isOnlab());
        }
    }

    public void addStudent() {
        int id = (students.size() > 0) ? (students.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        int yearOfBirth = inputYearOfBirth();
        String classification = inputClassification();
        boolean isOnlab = isOnlab();
        Student student = new Student(id, name, yearOfBirth, classification, isOnlab);
        students.add(student);
    }
    
    public void editById(int id) {
        boolean isExisted = false;
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                isExisted = true;
                students.get(i).setName(inputName());
                students.get(i).setYearOfBirth(inputYearOfBirth());
                students.get(i).setClassification(inputClassification());
                break;
            }
        }
        if (!isExisted) {
            System.out.println("This id not existed.");
        }
    }

    public void deleteByCheckingIsOnlab() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student i = it.next();
            if (i.isOnlab == false) {
                it.remove();
            }
        }
        System.out.println("Delete successfully!!");
    }

    int inputId() {
        System.out.println("Nhap id hoc vien: ");
        return scanner.nextInt();
    }

    private String inputName() {
        System.out.println("Nhap ten hoc vien: ");
        return scanner.next();
    }

    private int inputYearOfBirth() {
        System.out.println("Nhap nam sinh cua hoc vien: ");
        return scanner.nextInt();
    }

    private String inputClassification() {
        System.out.println("Nhap xep loai hoc vien: ");
        return scanner.next();
    }

    

    public boolean isOnlab() {
        return isOnlab;
    }

    public void setOnlab(boolean isOnlab) {
        this.isOnlab = isOnlab;
    }

}
