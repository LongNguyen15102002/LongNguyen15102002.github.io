package JAVACOREDAY10.TechMaster;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("S01", "Nguyen Viet Long", 20, "C" , true);
        Student student2 = new Student("S02", "Nguyen Hoang Anh", 28, "A" , false);
        Student student3 = new Student("S03", "Pham Khanh An", 26, "B" , true);
        Student student4 = new Student("S04", "Vu Thi Van Anh", 25, "A" , true);
        Student student5 = new Student("S05", "Pham Hoang Giang", 19, "C" , false);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Trung tam TechMaster: ");
        System.out.println();
        
        Class class1 = new Class("JAVA Core");
        class1.setStudents(students);
        System.out.println(class1.toString());

        Teacher teacher = new Teacher("Chu Tien Dat", 1997);
        System.out.println(teacher);
        System.out.println();
        Manager manager = new Manager("Nguyen Thanh Huong", 1991);
        System.out.println(manager);
        System.out.println();

        //Tạo Iterator để duyệt arraylist
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student i = it.next();
            if (i.isOnlab() == false) {
                it.remove();
            }
        }
        System.out.println("Danh sach lop sau khi xoa ban khong di hoc la: ");
        System.out.println();
        System.out.println(students);

        
    }
}
