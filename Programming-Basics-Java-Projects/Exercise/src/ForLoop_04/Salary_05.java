package ForLoop_04;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        //дефинираме цикъл, с който проверяваме всеки прозорец
        for (int i = 1; i <= n; i ++) {
            String website = scanner.nextLine();
            //проверяваме дали прозорецът е забранен
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            //проверяваме дали заплатата не е станала 0, при което спираме цикъла
            if (salary <= 0) {
                break;
            }
        }
        //извеждаме резултата
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }
    }
}