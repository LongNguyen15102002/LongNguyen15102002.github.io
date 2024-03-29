package CTDLGTBUOI3.ManageStudent;

public class Student {
    private String fullName;
    private int age;
    private double gpa;

    public Student(String fullName, int age, double gpa) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [fullName=" + fullName + ", age=" + age + ", gpa=" + gpa + "]";
    }

}
