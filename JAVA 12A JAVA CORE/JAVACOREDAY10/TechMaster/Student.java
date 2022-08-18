package JAVACOREDAY10.TechMaster;

public class Student {
    private String studentID;
    private String studentName;
    private int studentAge;
    private String studentClassification;
    private boolean isOnlab;

    public Student(String studentID, String studentName, int studentAge, String studentClassification,
            boolean isOnlab) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentClassification = studentClassification;
        this.isOnlab = isOnlab;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentClassification() {
        return studentClassification;
    }

    public void setStudentClassification(String studentClassification) {
        this.studentClassification = studentClassification;
    }

    @Override
    public String toString() {
        return "ID: " + studentID + "\t" + "Ten hoc vien: " + studentName + "\t" + "Tuoi: " + studentAge + "\t"
                + "Xep loai: " + studentClassification  + "\t" + "Co di hoc: " + isOnlab +  "\n" + "";
    }


    public boolean isOnlab() {
        return isOnlab;
    }


    public void setOnlab(boolean isOnlab) {
        this.isOnlab = isOnlab;
    }

}
