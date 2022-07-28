package ConditionalStatements_02;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double area = 0;

        if (figureType.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        } else if (figureType.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (figureType.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * Math.PI;

        } else if (figureType.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (a * h) / 2;
        }

        System.out.printf("%.3f", area);
    }
}