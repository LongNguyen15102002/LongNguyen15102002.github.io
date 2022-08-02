package BTVNDAY03;

import java.util.Scanner;

public class btvn6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String inputText = scanner.nextLine();
        String capitalize_case_line = "";
        inputText = inputText.replaceAll("[^a-zA-Z\\s]", "");
        Scanner lineScan = new Scanner(inputText);
        while (lineScan.hasNext()) {
            String CapitalizeWord = lineScan.next();
            
            capitalize_case_line += Character.toUpperCase(CapitalizeWord.charAt(0)) + CapitalizeWord.substring(1) + " ";
        }
        System.out.println(capitalize_case_line.trim());
    }
}
