package BTVNDAY07;

public class Teacher extends User{
    int YearOfExperiences;
    String Speciality;

    public Teacher(String Id, String Name, String Gender, int Age, String Email, String PhoneNumber){
        super();
    }

    public int getYearOfExperiences() {
        return this.YearOfExperiences;
    }

    public void setYearOfExperiences (int YearOfExperiences) {
        this.YearOfExperiences = YearOfExperiences;
    }

    public String getSpeciality() {
        return this.getSpeciality();
    }

    public void setSpeciality (String Speciality) {
        this.Speciality = Speciality;
    }

    
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap so nam kinh nghiem: ");
        YearOfExperiences = scanner.nextInt();
        System.out.println("Nhap chuyen mon: ");
        Speciality = scanner.nextLine();
    }
}
