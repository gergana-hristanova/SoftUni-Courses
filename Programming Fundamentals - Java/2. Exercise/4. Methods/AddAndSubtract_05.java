package methods_04;

import java.util.Scanner;

public class AddAndSubtract_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(sum(firstInt, secondInt), thirdInt));
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtract(int sum, int thirdNumber) {
        return sum - thirdNumber;
    }
}