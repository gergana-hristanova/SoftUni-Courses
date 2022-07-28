package NestedLoops_06;

import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digitFloor = Integer.parseInt(scanner.nextLine());
        int digitRoof = Integer.parseInt(scanner.nextLine());

        for (int digit1 = digitFloor; digit1 <= digitRoof; digit1++) {
            for (int digit2 = digitFloor; digit2 <= digitRoof; digit2++) {
                for (int digit3 = digitFloor; digit3 <= digitRoof; digit3++) {
                    for (int digit4 = digitFloor; digit4 <= digitRoof; digit4++) {

                        if ((digit1 % 2 == 0 && digit4 % 2 != 0) ||
                             digit1 % 2 != 0 && digit4 % 2 == 0) {
                            if (digit1 > digit4) {
                                if ((digit2 + digit3) % 2 == 0) {
                                    System.out.printf("%d%d%d%d ",
                                            digit1, digit2 ,digit3, digit4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}