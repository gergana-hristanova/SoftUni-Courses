package WhileLoop_05;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeSize = width * length;

        boolean noCake = false;
        int eatenSlices;
        int totalEatenSlices = 0;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {

            eatenSlices = Integer.parseInt(input);
            totalEatenSlices += eatenSlices;

            if (totalEatenSlices > cakeSize) {
                noCake = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (noCake) {
            System.out.printf("No more cake left! You need %d pieces more.",
                    totalEatenSlices - cakeSize);
        } else {
            System.out.printf("%d pieces are left.",
                    cakeSize - totalEatenSlices);
        }
    }
}