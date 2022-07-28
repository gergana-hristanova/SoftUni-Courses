package methods_04;

import java.util.Scanner;

public class CalculateRectangleArea_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Integer.parseInt(scanner.nextLine());
        double lengthInput = Integer.parseInt(scanner.nextLine());

        double area = getRectangleArea(widthInput, lengthInput);

        System.out.printf("%.0f", area);
    }

    public static double getRectangleArea(double width, double length) {
        return width * length;
    }
}