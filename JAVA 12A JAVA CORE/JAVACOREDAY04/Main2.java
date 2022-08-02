package JAVACOREDAY04;

import java.util.Scanner;

public class Main2 {

    static Scanner scanner;

    static void initScanner() {
        scanner = new Scanner(System.in);
        System.out.println("Khoi tao scanner");
    }

    static void closeScanner() {
        scanner.close();
        System.out.println("Dong scanner");
    }

    static void ex1() {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao mot so nguyen duong: ");
        n = scanner.nextInt();
        // scanner.close();
        if (n <= 0) {
            System.out.println("khong hop le");
        } else {
            for (int i = 1; i <= n; ++i) {
                sum = sum + i;
            }
            System.out.println("Tong cac so nguyen duong tu 1 den " + n + " la: " + sum);
        }
    }

    static void ex2() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao n so nguyen to dau tien: ");
        n = scanner.nextInt();
        // scanner.close();
        int primeCount = 0; // Số lượng số nguyên tố đã tìm ra sau mỗi vòng lặp
        int sumOfPrime = 0;
        int num = 2; // Số nguyên tố luôn bắt đầu từ 2

        while (primeCount < n) {
            // Lặp cho đến khi nào tìm đủ n số nguyên tố thì thôi

            boolean isNumPrime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isNumPrime = false;
                    break;
                }
            }
            if (isNumPrime) {
                sumOfPrime += num;
                System.out.println(num + " la so nguyen to");
                primeCount++;
            }
            num++;
        }
        System.out.println("So luong so nguyen to da tim ra la: " + primeCount);
        System.out.println("Tong cua " + n + " so nguyen to dau tien la: " + sumOfPrime);
    }

    static void ex3() {
        int positiveNumber, digitSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong bat ki: ");
        positiveNumber = scanner.nextInt();
        // scanner.close();
        while (positiveNumber > 0) // nhập số nguyên dương đến khi nào không còn chữ số để chia thì thôi
        {
            int lastDigit = positiveNumber % 10; // lấy ra chữ số cuối cùng bằng cách chia số nguyên dương lấy phần dư
            positiveNumber = positiveNumber / 10; // lấy phần nguyên còn lại của số nguyên dương bằng cách chia số đó
                                                  // cho 10
            digitSum += lastDigit; // cộng thêm chữ số cuối cùng vào tổng các chữ số
        }
        System.out.println("tong cac chu so cua so nguyen duong la: " + digitSum);
    }

    public static void main(String[] args) {
        int mehtodVar = 10;
        for (int i = 0; i < 10; i++) {
            // System.out.println("var: " + var);
            int var = 3;
            System.out.println("total: " + (var + i));
            System.out.println("methodVar is inside block: " + mehtodVar);
        }
        // System.out.println("var is: " + var);
        System.out.println("methodVar is outside block: " + mehtodVar);

        // initScanner();
        // ex1();
        // ex2();
        // ex3();
        // closeScanner();
    }
}
