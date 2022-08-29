package TRAININGDAY10;

import java.util.List;
import java.util.Scanner;

public class School {
    private String classes;
    private String course;
    private String semester;
    private List<Student> students;

    Scanner scanner = new Scanner(System.in);

    public School(String classes, String course, String semester, List<Student> students) {
        this.classes = classes;
        this.course = course;
        this.semester = semester;
        this.students = students;
    }

    public School() {
    }

    public String getClasses() {
        return classes;
    }

    public String getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public List<Student> getstudents() {
        return students;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School [classes=" + classes + ", course=" + course + ", scanner=" + scanner + ", semester=" + semester
                + ", students=" + students + "]";
    }

   
}
