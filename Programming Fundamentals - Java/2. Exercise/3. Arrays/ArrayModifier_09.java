package arrays_03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];

                switch (commandType) {
                    case "swap":
                        int swapIndex1 = Integer.parseInt(commandParts[1]);
                        int swapElement1 = array[swapIndex1];
                        int swapIndex2 = Integer.parseInt(commandParts[2]);
                        int swapElement2 = array[swapIndex2];

                        array[swapIndex1] = swapElement2;
                        array[swapIndex2] = swapElement1;
                        break;

                    case "multiply":
                        int multiplyIndex1 = Integer.parseInt(commandParts[1]);
                        int multiplyElement1 = array[multiplyIndex1];
                        int multiplyIndex2 = Integer.parseInt(commandParts[2]);
                        int multiplyElement2 = array[multiplyIndex2];

                        int product = multiplyElement1 * multiplyElement2;
                        array[multiplyIndex1] = product;
                        break;

                    case "decrease":
                        for (int index = 0; index < array.length; index++) {
                            array[index] -= 1;
                        }
                        break;
                }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(array)
                .replace("[", " ")
                .replace("]", " "));
    }
}