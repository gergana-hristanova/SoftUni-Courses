package FirstStepsInCoding_01;

import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}