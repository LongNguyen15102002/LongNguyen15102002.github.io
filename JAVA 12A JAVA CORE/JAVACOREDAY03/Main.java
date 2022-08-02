package JAVACOREDAY03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("nhap can nang: ");
        weight = scanner.nextDouble();
        System.out.println("nhap chieu cao: ");
        height = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        double BMI = weight /Math.pow(height , 2.0 );
        System.out.println("chi so BMI la: " + BMI);

        if (BMI < 18.5) {
            System.out.println("thieu can");
        }
        else if (BMI <= 24.9 && BMI >= 18.5) {
            System.out.println("can doi");
        }
        else {
            System.out.println("thua can");
        }

        String season = new String("summer");
        switch (season) {
            case "spring": {
                System.out.println("mua xuan");
                break;
            }
            case "summer": {
                System.out.println("mua ha");
                break;
            }
            case "autumn": {
                System.out.println("mua thu");
                break;
            }
            case "winter": {
                System.out.println("mua dong");
                break;
            }
            default: {
                System.out.println("khong co mua nay");
            }
        }
    }
}
