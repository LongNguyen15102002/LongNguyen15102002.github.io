package BTVNDAY07;

import java.util.Scanner;

public abstract class User {
    private String Id;
    private String Name;
    private String Gender;
    private int Age;
    private String Email;
    private String PhoneNumber;
    
    Scanner scanner = new Scanner(System.in);

    public User() {
        super();
    }

    public String getId() {
        return this.Id;
    }

    public void setid(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void nhap() {
        System.out.println("Nhap Id: ");
        Id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        Name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gender = scanner.nextLine();
        System.out.println("Nhap tuoi");
        Age = scanner.nextInt();
        System.out.println("Nhap email: ");
        Email = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        PhoneNumber = scanner.nextLine();
    }

    @Override
    public String toString() {
        String text = "Id: " + Id + " Name: " + Name + " Gender: " + Gender + " Age: " + Age + " Email: "
                + Email + " Phone Number: " + PhoneNumber;
        return text;
    }
}
