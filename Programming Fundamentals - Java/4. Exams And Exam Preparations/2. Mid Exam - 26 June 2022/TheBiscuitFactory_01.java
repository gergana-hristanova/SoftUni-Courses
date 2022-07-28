package midexam;

import java.util.Scanner;

public class TheBiscuitFactory_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workerEfficiency = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int competingFactoryBiscuits = Integer.parseInt(scanner.nextLine());

        int overallEfficiency = workerEfficiency * workersCount;

        int producedBiscuits = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                producedBiscuits += Math.floor(overallEfficiency * 0.75);
            } else {
                producedBiscuits += overallEfficiency;
            }
        }

        System.out.printf("You have produced %d biscuits for the past month.%n", producedBiscuits);

        double difference = Math.abs(producedBiscuits - competingFactoryBiscuits);
        double percentage = difference / competingFactoryBiscuits * 100;
        if (producedBiscuits > competingFactoryBiscuits) {
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", percentage);
        }
    }
}