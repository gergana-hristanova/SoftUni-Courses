package FirstStepsInCoding_01;

import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = r * r * Math.PI;
        double parameter = 2 * r * Math.PI;

        System.out.printf("%.2f", area);
        System.out.println("");
        System.out.printf("%.2f", parameter);
    }
}