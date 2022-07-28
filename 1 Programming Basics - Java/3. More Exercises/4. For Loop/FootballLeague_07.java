package ForLoop_04;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double totalFans = Integer.parseInt(scanner.nextLine());
        int fansSectorA = 0;
        int fansSectorB = 0;
        int fansSectorV = 0;
        int fansSectorG = 0;

        for (int i = 1; i <= totalFans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    fansSectorA++;
                    continue;
                case "B":
                    fansSectorB++;
                    continue;
                case "V":
                    fansSectorV++;
                    continue;
                case "G":
                    fansSectorG++;
            }
        }
        System.out.printf("%.2f%%%n", fansSectorA / totalFans * 100);
        System.out.printf("%.2f%%%n", fansSectorB / totalFans * 100);
        System.out.printf("%.2f%%%n", fansSectorV / totalFans * 100);
        System.out.printf("%.2f%%%n", fansSectorG / totalFans * 100);
        System.out.printf("%.2f%%%n", totalFans / stadiumCapacity * 100);
    }
}