package BTVNDAY03;

import java.util.Scanner;

public class btvn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hay nhap text: ");
        String InputText;
        InputText = scanner.nextLine();
        scanner.close();
        StringBuffer reverseString = new StringBuffer(InputText);
        reverseString.reverse();
        System.out.println("chuoi viet theo thu tu dao nguoc la: " + reverseString);
    }
}
