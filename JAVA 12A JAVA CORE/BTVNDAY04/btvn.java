package BTVNDAY04;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class btvn {
    static Scanner scanner;

    static void initScanner() {
        scanner = new Scanner(System.in);
        System.out.println("Khoi tao scanner");
    }

    static void closeScanner() {
        scanner.close();
        System.out.println("Dong scanner");
    }

    static void bai1() {
        // Viết chương trình thực hiện in ra hình vuông (trường hợp đặc biệt của hình
        // chữ nhật) và tam giác vuông
        int length, witdh;
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        length = scanner.nextInt();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        witdh = scanner.nextInt();
        // vòng lặp tạo hình vuông
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < witdh; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        // vòng lặp tạo tam giác vuông
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void bai2() {
        try (// Đếm số từ trong chuỗi , đếm và in ra index của 1 kí tự bất kì trong chuỗi
                // vừa nhập
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("nhap 1 chuoi bat ki: ");
            String str = scanner.nextLine();
            String[] splitstr = str.split(" ");
            System.out.println("so tu co trong chuoi la: " + splitstr.length);
            System.out.print("nhap 1 ki tu bat ki: ");
            char character;
            character = scanner.next().charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == character) {
                    System.out.println("Vi tri cua ki tu " + character + " la: " + i);
                    count++;
                }
            }
            System.out.println("So lan xuat hien cua ki tu " + character + " la: " +
                    count);
        }
    }

    static void bai3() {
        int int_random = ThreadLocalRandom.current().nextInt();
        System.out.println("random integer is: " + int_random);

        boolean isPrimeNumber = true;
        for (int i = 2; i < Math.sqrt(int_random); i++) {
            if (int_random % i == 0) {
                isPrimeNumber = false;
                break;
            }
            if (isPrimeNumber) {
            }
            System.out.println(int_random + " la so nguyen to");
        }
    }

    static void bai4() {
        // nhập n số nguyên tố đầu tiên và nhập giá trị m để so sánh vs các số nguyên tố
        // đó
        // nếu số nguyên tố nhỏ hơn giá trị m thì tăng biến đếm và in ra giá trị của các
        // số đó
        int n, m;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("nhap vao n so nguyen to dau tien: ");
            n = scanner.nextInt();
            System.out.print("nhap vao gia tri m: ");
            m = scanner.nextInt();
        }
        int primeCount = 0; // Số lượng số nguyên tố đã tìm ra sau mỗi vòng lặp
        int num = 2; // Số nguyên tố luôn bắt đầu từ 2

        while (primeCount < n && num < m) {
            // Lặp cho đến khi nào tìm đủ n số nguyên tố thì thôi

            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println(num + " la so nguyen to nho hon m");
                primeCount++;
            }
            num++;
        }
        System.out.println("So luong so nguyen to nho hon m da tim ra la: " + primeCount);
    }

    static void bai5() {
        // Tạo mảng 2 chiều A với số dòng và số cột nhập vào từ bàn phím
        int NumOfRows, NumOfColumns;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("nhap so dong cua mang A: ");
            NumOfRows = scanner.nextInt();
            System.out.println("nhap so cot cua mang A: ");
            NumOfColumns = scanner.nextInt();

            // Khai báo và cấp phát bộ nhớ cho mảng A
            int[][] twoDimensionArray_A = new int[NumOfRows][NumOfColumns];

            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    System.out.print("nhap phan tu thu [" + i + ", " + j + "] cua mang A: ");
                    twoDimensionArray_A[i][j] = scanner.nextInt();
                }
            }

            // In thông tin mảng A ra màn hình
            System.out.println("mang A vua nhap la: ");
            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    System.out.print(twoDimensionArray_A[i][j] + "\t");
                }
                System.out.println("\n");
            }

            // Tạo mảng 2 chiều B với số dòng và số cột nhập vào từ bàn phím

            System.out.println("nhap so dong cua mang B: ");
            NumOfRows = scanner.nextInt();
            System.out.println("nhap so cot cua mang B: ");
            NumOfColumns = scanner.nextInt();

            // Khai báo và cấp phát bộ nhớ cho mảng B
            int[][] twoDimensionArray_B = new int[NumOfRows][NumOfColumns];

            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    System.out.print("nhap phan tu thu [" + i + ", " + j + "] cua mang B: ");
                    twoDimensionArray_B[i][j] = scanner.nextInt();
                }
            }

            // In thông tin mảng B ra màn hình
            System.out.println("mang B vua nhap la: ");
            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    System.out.print(twoDimensionArray_B[i][j] + "\t");
                }
                System.out.println("\n");
            }

            // Tính ma trận tổng C là tổng của 2 ma trận A và B
            int twoDimensionArray_C[][] = new int[NumOfRows][NumOfColumns];
            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    twoDimensionArray_C[i][j] = twoDimensionArray_A[i][j] + twoDimensionArray_B[i][j];
                }
            }

            // hiển thị ma trận tổng C
            System.out.println("Ma tran tong C la:");
            for (int i = 0; i < NumOfRows; i++) {
                for (int j = 0; j < NumOfColumns; j++) {
                    System.out.print(twoDimensionArray_C[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }

        

        // hiển thị các phần tử nằm trên đường chéo chính của 1 ma trận vuông bất kì

        int r; // bậc r của ma trận vuông p
        try (Scanner scanner2 = new Scanner(System.in)) {
            System.out.println("nhap vao bac r cua ma tran vuong p: ");
            r = scanner2.nextInt();

            int p[][] = new int[r][r];

            System.out.println("nhap cac phan tu cho ma tran vuong p: ");
            for (int m = 0; m < r; m++) {
                for (int n = 0; n < r; n++) {
                    System.out.print("p[" + m + "][" + n + "] = ");
                    p[m][n] = scanner2.nextInt();
                }
            }

            System.out.println("ma tran vuong p vua nhap la: ");
            for (int m = 0; m < r; m++) {
                for (int n = 0; n < r; n++) {
                    System.out.print(p[m][n] + "\t");
                }
                System.out.println("\n");
            }

            for (int m = 0; m < r; m++) {
                for (int n = 0; n < r; n++) {
                    // kiểm tra nếu m = n thì mới in ra màn hình
                    if (m == n) {
                        System.out.println("phan tu nam trong duong cheo chinh cua ma tran vuong p la: " + p[m][n]);
                    }
                }
            }
        }
    }

    static void bai6() {
        boolean EmailCheck, PhoneCheck;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                String EmailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                System.out.print("Input your email(email@address.com): ");
                String inputEmail = scanner.next();
                EmailCheck = inputEmail.matches(EmailPattern);
                if (!EmailCheck) {
                    System.out.println("Invalid email");}
            } while (!EmailCheck);
            System.out.println("Valid email");
            do {
                String PhonePattern = "[0-9]{9,11}";
                System.out.print("Input your phone number (9-11 digits): ");
                String inputPhoneNumber = scanner.next();
                PhoneCheck = inputPhoneNumber.matches(PhonePattern);
                if (!PhoneCheck) {
                    System.out.println("Invalid phone number");
                }
            } while (!PhoneCheck);
        }
        System.out.println("Valid phone number");
    }

    public static void main(String[] args) {
        initScanner();
        bai1();
        bai2();
        bai3();
        bai4();
        bai5();
        bai6();
        closeScanner();
    }
}