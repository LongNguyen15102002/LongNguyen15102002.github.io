package TrainingDAY09.TrainingDAY091;

public class Student implements Iclassification {
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Student(){}

    @Override
    public void display(){
        System.out.println("Ten hoc vien la: "  + name +"\n" + "Tuoi hoc vien la: " + age +"\n" + "Diem hoc vien la: " + marks);
    }

    @Override
    public void classify(){
        if (marks >= 8) {
            System.out.println("Hoc vien loai A");
        } else if (marks < 8 && marks >= 6.5) {
            System.out.println("Hoc vien loai B");
        } else {
            System.out.println("Hoc vien loai C");
        }
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * @return String return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

}
