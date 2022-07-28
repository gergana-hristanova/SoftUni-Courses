package ConditionalStatementsAdvanced_03;

import java.util.Scanner;

public class PointOnRectangleBorder_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        //проверяваме дали:
        //x = x1 или x2, докато y е между y1 и y2
        if ((x == x1 || x == x2) && (y >= y1 && y <= y2)) {
            System.out.printf("Border");
        //проверяваме дали:
        //y = y1 или y2, докато x е между x1 и x2
        } else if ((y == y1 || y == y2) && (x >= x1 && x <= x2)) {
            System.out.printf("Border");
        } else {
            System.out.printf("Inside / Outside");
        }
    }
}