package midexampreparation;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighborhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");
        int currentPosition = 0;
        while (!command[0].equals("Love!")) {
            int jumpLength = Integer.parseInt(command[1]);

            currentPosition += jumpLength;
            if (currentPosition >= neighborhood.length) {
                currentPosition = 0;
            }
            neighborhood[currentPosition] -= 2;

            if (neighborhood[currentPosition] > -50 && neighborhood[currentPosition] <= 0) {
                System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                neighborhood[currentPosition] = -100;
            } else if (neighborhood[currentPosition] <= -50) {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            }

            command = scanner.nextLine().split(" ");
        }

        boolean hasFailed = false;
        int failedPlacesAmount = 0;
        for (int place : neighborhood) {
            if (place > -50) {
                hasFailed = true;
                failedPlacesAmount++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (hasFailed) {
            System.out.printf("Cupid has failed %d places.", failedPlacesAmount);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}