package BTVNDAY05;

import java.time.LocalDate;

public class Employee {
    public String id;
    public String name;
    public LocalDate birthday;
    public GENDER gender;
    public double salary;

    public Employee (String id, String name, LocalDate birthday, GENDER gender, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean hasKeyword(String Keyword) {
        boolean result = this.name.contains(Keyword);
        return result;
    }

    public boolean checkId(String id) {
        boolean result = this.id.contains(id);
        return result;
    }

    public int AgeOfEmployee(Employee employee){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int birthdayYear = this.birthday.getYear();
        int age = currentYear - birthdayYear;
        return age;
    }

}
