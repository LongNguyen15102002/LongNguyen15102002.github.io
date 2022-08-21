package BTVNDAY10.TechMaster;

import java.io.Serializable;
import java.util.ArrayList;

public class Class implements Serializable{
    private String subject;

    public Class(String subject) {
        this.subject = subject;
    }

    private ArrayList<Student> students;

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "Class: " + subject + "\n" + students +"";
    }

}
