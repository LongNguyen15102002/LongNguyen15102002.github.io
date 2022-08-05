package BTVNDAY05;

import java.time.LocalDate;
import java.util.Scanner;

enum GENDER {
    MALE, FEMALE
}

public class Main {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("NV01", "Nguyen Hoang Anh", LocalDate.parse("1994-11-20"), GENDER.MALE,
                8500000.0);
        employeeList[1] = new Employee("NV02", "Hoang Thi Van", LocalDate.parse("1985-01-30"), GENDER.FEMALE,
                5870000.0);
        employeeList[2] = new Employee("NV03", "Nguyen Quang Hieu", LocalDate.parse("1985-08-29"), GENDER.MALE,
                6000000.0);
        employeeList[3] = new Employee("NV04", "Tran Huong Giang", LocalDate.parse("1995-12-26"), GENDER.FEMALE,
                7750000.0);
        employeeList[4] = new Employee("NV05", "Tran Trung Thanh", LocalDate.parse("1982-05-30"), GENDER.MALE,
                6820000.0);

        for (Employee employee : employeeList) {
            System.out.println(employee.id + " " + employee.name + " " + employee.birthday + " " + employee.gender);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id: ");
        String id = scanner.nextLine();

        // Tìm id của nhân viên (Tìm chính xác)
        for (int i = 0; i < employeeList.length; i++) {
            Employee employee = employeeList[i];
            if (employee.checkId(id)) {
                System.out.println("ten nhan vien theo id la: " + employee.name);
            }
        }

        // Tìm tên nhân viên theo từ khoá
        System.out.println("nhap tu khoa ten nhan vien: ");
        String keyword = scanner.nextLine();

        for (int i = 0; i < employeeList.length; i++) {
            Employee employee = employeeList[i];
            if (employee.hasKeyword(keyword)) {
                System.out.println("ten nhan vien theo tu khoa la: " + employee.name);
            }
        }

        // Đếm số nhân viên Nam/Nữ
        int count_male = 0, count_female = 0;
        for (int i = 0; i < employeeList.length; i++) {
            Employee employee = employeeList[i];
            if (employee.gender.equals(GENDER.MALE)) {
                count_male++;
            }
            else {
                count_female++;
            }
        }
        System.out.println("so nhan vien nam la: " + count_male);
        System.out.println("so nhan vien nu la: " + count_female);

        // Tìm kiếm nhân viên trên 30 tuổi 
        for (int i = 0; i < employeeList.length; i++) {
            Employee employee = employeeList[i];
            int age = employee.AgeOfEmployee(employee);
            if (age > 30) {
                System.out.println("nhan vien tren 30 tuoi la: " + employee.name);
            }
        }    
    }
}
