package NestedLoops_06;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int roomsPerFloor = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < roomsPerFloor; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 != 0) {
                    System.out.printf("A%d%d ", i, j);
                } else {
                    System.out.printf("O%d%d ", i, j);
                }
            }
            System.out.printf("%n");
        }
    }
}