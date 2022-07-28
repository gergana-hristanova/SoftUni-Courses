package methods_04;

import java.util.Scanner;

public class PrintingTriangle_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < input; i++) {
            printLine(1, i);
        }

        for (int i = input; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}