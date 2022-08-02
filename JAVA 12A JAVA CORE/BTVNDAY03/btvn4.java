package BTVNDAY03;

import java.util.Scanner;

public class btvn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        System.out.print("nhap vao mot so nguyen duong n: ");
        n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            System.out.println("khong hop le");
        } else {
            System.out.println("bang cuu chuong len den 10 cua so nguyen duong n la: ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + i * n);
            }
        }
    }
}
