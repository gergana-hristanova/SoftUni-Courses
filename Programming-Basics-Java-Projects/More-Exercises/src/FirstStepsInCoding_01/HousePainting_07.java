package FirstStepsInCoding_01;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaBackWall = x * x;
        double areaFrontWall = areaBackWall - (1.2 * 2);
        double areaSideWalls = (x * y) - (1.5 * 1.5);

        double areaRoofRectangles = x * y;
        double areaRoofTriangles = (x * h) / 2;

        double neededGreenPaint = (areaBackWall + areaFrontWall + 2 * areaSideWalls) / 3.4;
        double neededRedPaint = (2 * areaRoofRectangles + 2 * areaRoofTriangles) / 4.3;

        System.out.printf("%.2f", neededGreenPaint);
        System.out.println("");
        System.out.printf("%.2f", neededRedPaint);
    }
}