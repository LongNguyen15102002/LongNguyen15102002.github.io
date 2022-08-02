package BTVNDAY03;

import java.util.Scanner;

public class btvn2for {
    public static void main(String[] args) {
        int n;
        int isPrime = 1;
        int PrimeTotal = 0;
        int primeNumber = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao n so nguyen to dau tien: ");
        n = scanner.nextInt();
        if ( n >= 1) {
            System.out.println(2 + " la so nguyen to"); // Số nguyên tố luôn bắt đầu từ 2
            PrimeTotal = 2; // Tổng của số nguyên tố đầu tiên luôn bằng 2
        }
        else {
            System.out.println("khong hop le");
        }
        scanner.close();
        for (int i = 2; i <= n;) {
            for (int j = 2; j <= Math.sqrt(primeNumber); j++) {
                if (primeNumber % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime != 0) {
                System.out.println(primeNumber + " la so nguyen to");
                PrimeTotal += primeNumber;
                i++; // bắt buộc điều kiện isNumPrime phải là số nguyên tố thì i mới tăng
                // nếu để i++ trong vòng lặp for ngoài cùng sẽ dẫn điến việc i vẫn tăng cho dùng isNumPrime là số nguyên tố hay không
            }
            isPrime = 1;
            primeNumber++;
        }
        System.out.println("tong " + n + " so nguyen to dau tien la: " + PrimeTotal);
    }
}
