package FirstStepsInCoding_01;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height; //cm^3
        double totalLiters = volume * 0.001; //cm^3 -> liters
        double freeVolume = 1 - (percent / 100);
        double neededLiters = totalLiters * freeVolume;

        System.out.println(neededLiters);
    }
}