package BTVNDAY03;

import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {
        // BT1
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao mot so nguyen duong: ");
        n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("khong hop le");
        } else {
            for (int i = 1; i <= n; ++i) {
                sum = sum + i;
            }
            System.out.println("Tong cac so nguyen duong tu 1 den " + n + " la: " + sum);
        }
    }
}
