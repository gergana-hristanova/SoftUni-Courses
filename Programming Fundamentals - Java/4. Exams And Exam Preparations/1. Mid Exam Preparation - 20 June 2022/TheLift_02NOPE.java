package midexampreparation;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02NOPE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleToLift = Integer.parseInt(scanner.nextLine());
        int[] liftArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int liftCapacity = 4 * liftArray.length;

        if (peopleToLift > liftCapacity) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",
                    peopleToLift - (liftCapacity - Arrays.stream(liftArray).sum()));

            for (int i = 0; i < liftArray.length; i++) {
                System.out.print("4 ");
            }
        } else if (peopleToLift == liftCapacity) {

            for (int i = 0; i < liftArray.length; i++) {
                System.out.print("4 ");
            }
        } else {
            System.out.println("The lift has empty spots!");

            boolean doneLifting = false;
            for (int i = 0; i < liftArray.length; i++) {
                for (int j = 0; j < 4; j++) {
                    peopleToLift--;
                    liftArray[i]++;

                    if (peopleToLift == 0) {
                        doneLifting = true;
                        break;
                    }

                    if (doneLifting) {
                        break;
                    }
                }
            }

            System.out.println(Arrays.toString(liftArray).replaceAll("[\\[\\],]", ""));
        }
    }
}