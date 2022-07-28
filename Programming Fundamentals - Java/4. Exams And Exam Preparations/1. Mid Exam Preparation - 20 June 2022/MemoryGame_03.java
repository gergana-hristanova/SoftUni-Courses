package midexampreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        int turnsCounter = 0;
        while (!input[0].equals("end")) {
            int index1 = Integer.parseInt(input[0]);
            int index2 = Integer.parseInt(input[1]);
            turnsCounter++;

            if (indexesAreValid(index1, index2, sequence)) {

                String firstElement = sequence.get(index1);
                if (firstElement.equals(sequence.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n",
                            firstElement);
                    sequence.remove(firstElement);
                    sequence.remove(firstElement);
                } else {
                    System.out.println("Try again!");
                }

            } else {
                System.out.println("Invalid input! Adding additional elements to the board");
                sequence.add(sequence.size() / 2, String.format("-%da", turnsCounter));
                sequence.add(sequence.size() / 2, String.format("-%da", turnsCounter));
            }

            if (sequence.isEmpty()) {
                break;
            }
            input = scanner.nextLine().split(" ");
        }

        if (sequence.isEmpty()) {
            System.out.printf("You have won in %d turns!", turnsCounter);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(sequence.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static boolean indexesAreValid(int firstIndex, int secondIndex, List<String> list) {
        return (firstIndex != secondIndex) &&
                (0 <= firstIndex && firstIndex < list.size()) && (0 <= secondIndex && secondIndex < list.size());
    }
}