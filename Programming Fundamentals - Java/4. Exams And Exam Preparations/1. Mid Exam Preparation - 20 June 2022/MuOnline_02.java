package midexampreparation;

import java.util.Scanner;

public class MuOnline_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomsArray = scanner.nextLine().split("\\|");
        int bitcoins = 0;
        int health = 100;

        short passedRooms = 0;
        boolean hasDied = false;
        for (String room : roomsArray) {
            String[] roomArray = room.split(" ");
            String command = roomArray[0];
            int amount = Integer.parseInt(roomArray[1]);
            passedRooms++;

            switch (command) {
                case "potion":

                    if (100 - health < amount) {
                        amount = 100 - health;
                    }
                    health += amount;

                    System.out.printf("You healed for %d hp.%n", amount);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;

                case "chest":
                    bitcoins += amount;
                    System.out.printf("You found %d bitcoins.%n", amount);
                    break;

                default:
                    health -= amount;

                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", passedRooms);
                        hasDied = true;
                    }
                    break;
            }

            if (hasDied) {
                break;
            }
        }

        if (!hasDied) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}