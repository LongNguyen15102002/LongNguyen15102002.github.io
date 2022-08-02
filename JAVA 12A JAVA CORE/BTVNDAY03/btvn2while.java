package BTVNDAY03;

import java.util.Scanner;

public class btvn2while {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao n so nguyen to dau tien: ");
        n = scanner.nextInt();
        scanner.close();
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
}