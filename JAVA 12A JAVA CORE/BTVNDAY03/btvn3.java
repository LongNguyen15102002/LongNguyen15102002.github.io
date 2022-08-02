package BTVNDAY03;

import java.util.Scanner;

public class btvn3 {
    public static void main(String[] args) {
        int positiveNumber, digitSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong bat ki: ");
        positiveNumber = scanner.nextInt();
        scanner.close();
        while (positiveNumber > 0) // nhập số nguyên dương đến khi nào không còn chữ số để chia thì thôi
        {
            int lastDigit = positiveNumber % 10; // lấy ra chữ số cuối cùng bằng cách chia số nguyên dương lấy phần dư
            positiveNumber = positiveNumber / 10; // lấy phần nguyên còn lại của số nguyên dương bằng cách chia số đó cho 10
            digitSum += lastDigit; // cộng thêm chữ số cuối cùng vào tổng các chữ số
        }
        System.out.println("tong cac chu so cua so nguyen duong la: " + digitSum);
    }
}
