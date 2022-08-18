package JAVACOREDAY10.TechMaster;

public class Teacher {
    private String teacherName;
    private int teacherYearOfBirth;

    public Teacher(String teacherName, int teacherYearOfBirth) {
        this.teacherName = teacherName;
        this.teacherYearOfBirth = teacherYearOfBirth;
    }

    @Override
    public String toString() {
        return "Giang vien giang day: " + teacherName +  "\t" + "Sinh nam: " + teacherYearOfBirth +  "";
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getteacherYearOfBirth() {
        return teacherYearOfBirth;
    }

    public void setteacherYearOfBirth(int teacherYearOfBirth) {
        this.teacherYearOfBirth = teacherYearOfBirth;
    }
}
