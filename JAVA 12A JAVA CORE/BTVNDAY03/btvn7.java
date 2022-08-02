package BTVNDAY03;

import java.util.Scanner;

public class btvn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
