package FinalExamApril2022;

import java.util.Scanner;

public class Spaceship_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double shipWidth = Double.parseDouble(scanner.nextLine());
        double shipLength = Double.parseDouble(scanner.nextLine());
        double shipHeight = Double.parseDouble(scanner.nextLine());
        double averageAstronautHeight = Double.parseDouble(scanner.nextLine());

        double roomSize = 4 * (averageAstronautHeight + 0.40);
        double shipSize = shipWidth * shipLength * shipHeight;
        double astronautCapacity = Math.floor(shipSize / roomSize);

        if (astronautCapacity < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (astronautCapacity > 10) {
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.printf("The spacecraft holds %.0f astronauts.", astronautCapacity);
        }
    }
}