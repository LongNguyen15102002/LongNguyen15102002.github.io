package BTVNDAY03;

import java.util.Scanner;

public class btvn8 {
    public static void main(String args[]){
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("nhap vao 1 xau bat ki: ");
                String text = scanner.nextLine();
                System.out.println(isUnique(text));
            }
    }
    public static boolean isUnique(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            char selectedChar = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                if (selectedChar == text.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
