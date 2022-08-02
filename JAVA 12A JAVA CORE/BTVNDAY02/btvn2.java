package BTVNDAY02;

import java.time.Duration;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        /* BT1 */
        String letter = "Than gui cac ban, \nDuoi day la cau noi noi tieng\n\t\"A journey of a thousand miles begins with a single step\"\nNo co nghia la\n\t\"Hanh trinh ngan dam bat dau tu mot buoc chan\"\nChuc cac ban thanh cong !!!";
        System.out.println(letter);
        /* BT2 */
        Double distance = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        Scanner scanner = new Scanner(System.in);
        // nhập khoảng cách từ bàn phím, gán vào biến distance
        System.out.print("Nhap khoang cach: ");
        distance = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Khoang cach la " + distance + "km");

        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.print("Nhap thoi gian bat dau (Ngay-thang-nam gio:phut): ");
        startTimeStr = scanner.nextLine();
        // nhập thời gian kết thúc, gán vào biến finishTimeStr
        System.out.print("Nhap thoi gian ket thuc (Ngay-thang-nam gio:phut): ");
        finishTimeStr = scanner.nextLine();

        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime
        LocalDateTime startTime = LocalDateTime.parse(startTimeStr, formatter);
        LocalDateTime finishTime = LocalDateTime.parse(finishTimeStr, formatter);
        Duration duration = Duration.between(startTime, finishTime);
        double durationMinutes = Double.valueOf(duration.toMinutes());
        double durationtoHour = durationMinutes / 60.0;

        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thoi gian chay %s phut\n", duration.toMinutes());
        System.out.println("thoi gian chay doi sang gio la " + durationtoHour + " gio");
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Van toc trung binh %s km/h\n", distance / durationtoHour);
    }

}
