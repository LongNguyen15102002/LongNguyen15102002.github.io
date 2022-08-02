package JAVACOREDAY03;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("nhập 1 tháng trong năm: ");
        // int thang = scanner.nextInt();
        // scanner.close();
        // switch (thang) {
        // case 1:
        // case 3:
        // case 5:
        // case 7:
        // case 8:
        // case 10:
        // case 12: {
        // System.out.println("tháng " + thang + " có 31 ngày");
        // break;
        // }
        // case 2: {
        // System.out.println("tháng " + thang + " có 28 hoặc 29 ngày");
        // break;
        // }
        // case 4:
        // case 6:
        // case 9:
        // case 11: {
        // System.out.println("tháng " + thang + " có 30 ngày");
        // break;
        // }
        // default:
        // System.out.println("Không có tháng này");
        // break;
        // }
        // for (int index = 10; index >= 0; index--) {
        // System.out.println("vong lap thu " + index);
        // }

        // for (int index = 1; index < 10; index++) {
        // System.out.println("vong lap: " + index);
        // index = index + 2;
        // }
        int count = 0;
        String text = "Toi la java coder";
        for (int index = 0; index < text.length(); index++) {
            System.out.println("ky tu: " + text.charAt(index));
            char character = text.charAt(index);
            if (character == 'o') {
                System.out.println("ky tu o");
                count++;
            }
        }
        System.out.println("so ky tu o la: " + count);

        // for (int index = text.length() - 1; index >=0; index--) {
        // char character = text.charAt(index);
        // if (character == 'o'){
        // System.out.println("o xuat hien o vi tri: " + index);
        // }
        // switch (character) {
        // case 'a':
        // case 'u':
        // case 'i':
        // case 'e':
        // case 'o': {
        // System.out.println("nguyen am " + character + " o vi tri thu " + (index + 1
        // ));
        // break;
        // }
        // default: {
        // break;
        // }
        // }
        // }

        // int index = 0;
        // while (index < text.length()) {
        // System.out.println("ky tu o vi tri " + index + " la " + text.charAt(index));
        // index = index + 1;
        // }

        int index = text.length() - 1;
        while (index >= 0) {
            System.out.println("index " + index + " ky tu " + text.charAt(index));
            index--;
        }

        // in ra tren man hinh cau hoi
        // hay nhap mot so bat ki
        // neu so nhap la so chan thi dung
        // neu so nhap la so le thi yeu cau nhap lai

        Scanner scanner3 = new Scanner(System.in);

        // boolean isEven = false;
        // do {
        // System.out.println("Hay nhap mot so bat ki: ");
        // int inputNumber = scanner3.nextInt();
        // if (inputNumber % 2 == 0) {
        // System.out.println("ban da nhap dung");
        // isEven = true;
        // }
        // } while (isEven == false);

        // scanner3.close();

        // System.out.println("Hay nhap mot so bat ki: ");
        // boolean isEven = false;
        // while (isEven == false) {
        //     int inputNumber = scanner3.nextInt();
        //     if (inputNumber % 2 == 0) {
        //         System.out.println("ban da nhap dung");
        //         isEven = true;

        //     } else {
        //         System.out.println("Hay nhap mot so bat ki: ");
        //     }
        // }

        for (int i = 0; i <= text.length(); i++) {
            char character = text.charAt(i);
            if (character == 'o') {
                System.out.println("ky tu o dau tien o: " + i);
                break;
            }
            System.out.println("ky tu " + character);
        }

        int j = 0;
        while (j < text.length()) {
            char character = text.charAt(j);
            if (character == 'o') {
                j++;
                continue;
            }
            System.out.println("ky tu " + character);
            j++;
        }

        while (true) {
            System.out.println("nhap so chan");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("ban da nhap dung");
                break;
            }
        }
    }
}
