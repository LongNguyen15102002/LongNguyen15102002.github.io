package JAVACOREDAY01;

import java.util.Scanner;

public class Main {
    static int globalVar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.nextLine();

        System.out.println("Nhập name");
        String name = sc.next();

        System.out.println(id +" - "+name);
        sc.close();
    }
}