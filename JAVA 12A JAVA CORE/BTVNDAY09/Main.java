package BTVNDAY09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhap ten chu TK: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so TK: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap so du TK: ");
        double accountBalance = scanner.nextDouble();
        account.setName(name);
        account.setAccountNumber(accountNumber);
        account.setEmail(email);
        account.setAccountBalance(accountBalance);
        account.displayInfo();
        System.out.println("Nhap so tien muon nap: ");
        double recharge = scanner.nextDouble();
        System.out.println("Nhap email moi: ");
        String newEmail = scanner.nextLine();
        account.setName(name);
        account.setAccountNumber(accountNumber);
        account.setEmail(newEmail);
        account.recharge(recharge);
        account.displayChangedInfo();
        scanner.close();
    }
}
