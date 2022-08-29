package TrainingDAY09.TrainingDAY092;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap chieu dai hcn: ");
            double length = scanner.nextDouble();
            System.out.println("Nhap chieu rong hcn: ");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(length);
            rectangle.setWidth(width);
            System.out.println("Nhap kich co cua hinh vuong: ");
            double size = scanner.nextDouble();
            Square square = new Square();
            square.setSize(size);
            rectangle.display();
            rectangle.calArea();
            square.display();
            square.calArea();
        }
    }
}
