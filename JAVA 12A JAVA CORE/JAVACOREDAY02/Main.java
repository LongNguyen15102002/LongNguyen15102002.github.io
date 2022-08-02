package JAVACOREDAY02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String s1 = "cat";
        System.out.println(s1);

        String s2 = "cat";
        System.out.println(s2);
        String s3 = new String("cat");

        System.out.println(s3);
        String s4 = new String("cat");
        System.out.println(s4);

        String s5 = "Dog";
        System.out.println(s5);

        String s6 = new String("Dog");
        System.out.println(s6);

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s3 == s4);

        System.out.println(s5 == s6);

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(s2));

        String txt = "Toi la coder";
        // chiều dài
        System.out.println("length: " + txt.length());
        // chuyển thành chữ hoa
        System.out.println("chu hoa: " + txt.toUpperCase());
        // chuyển thành chữ thường
        System.out.println("chu thuong: " + txt.toLowerCase());

        char ch = txt.charAt(5);
        System.out.println("ki tu" + ch);

        // tìm chữ o
        int firstIndex = txt.indexOf("o");
        System.out.println(firstIndex);

        int lastIndex = txt.lastIndexOf("o");
        System.out.println("last Index: " + lastIndex);

        firstIndex = txt.indexOf("k");
        System.out.println("first index: " + firstIndex);

        String subString = txt.substring(1);
        System.out.println("sub string: " + subString);
        subString = txt.substring(1, 11);
        System.out.println("sub string 2: " + subString);

        int index = txt.indexOf("la");
        System.out.println(index);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate birthday = LocalDate.of(2002,10,15);
        System.out.println(birthday);

        // Tính tuổi

        int birthdayYear = birthday.getYear();
        int currentYear = currentDate.getYear();

        int age = currentYear - birthdayYear;
        System.out.println("tuoi: " + age);

        int month = birthday.getMonthValue();
        System.out.println("month: " + month);

        int day = birthday.getDayOfMonth();
        System.out.println("day" + day);

        LocalDate newDate = birthday.plusDays(150);
        System.out.println(newDate);

        System.out.println(birthday.isLeapYear());

        System.out.println(birthday.minusMonths(14));

        LocalTime startTime = LocalTime.of(10, 30, 12);
        System.out.println(startTime.minusMinutes(45));

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime birthTime = LocalDateTime.of(2002, 10, 15, 1, 3, 16);

        System.out.println(birthTime);

        birthTime = LocalDateTime.of(2002, 10, 15, 1, 3, 16);

        boolean compareResult = currentTime.isEqual(birthTime);
        System.out.println("is equal: " + compareResult);

        boolean isAfter = currentTime.isAfter(birthTime);
        System.out.println("is after: " + isAfter);

        boolean isBefore = currentTime.isBefore(birthTime);
        System.out.println("is after: " + isBefore);

        // Mục tiêu hiển thị ngày theo dạng năm/tháng/ngày, giờ theo dạng giờ-phút-giây

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd E W hh:mm:ss.SSS");
        String display = formatter.format(currentTime);
        System.out.println("hien thi " + display);

        /// SCANNER

        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap so nguyen");
        int intNumber;
        intNumber = scanner.nextInt();
        System.out.println("ban da nhap: " + intNumber);
        

        System.out.println("hay nhap so double");
        double doubleNum;
        doubleNum = scanner.nextDouble();
        System.out.println("ban da nhap: " + doubleNum);

        scanner.nextLine();

        System.out.println("hay nhap text");
        String inputText;
        inputText = scanner.nextLine();
        System.out.println("ban da nhap: " + inputText);
        scanner.close();
    }
}
