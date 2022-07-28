package midexampreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(command[1]);
                    int swapIndex2 = Integer.parseInt(command[2]);

                    int num1 = array[swapIndex1];
                    int num2 = array[swapIndex2];

                    array[swapIndex1] = num2;
                    array[swapIndex2] = num1;
                    break;

                case "multiply":
                    int mulIndex1 = Integer.parseInt(command[1]);
                    int mulIndex2 = Integer.parseInt(command[2]);

                    array[mulIndex1] = array[mulIndex1] * array[mulIndex2];
                    break;

                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i]--;
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println(Arrays.toString(array)
                .replace("[", "")
                .replace("]", ""));
    }
}