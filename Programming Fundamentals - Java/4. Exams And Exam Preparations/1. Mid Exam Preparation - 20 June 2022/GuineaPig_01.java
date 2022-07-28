package midexampreparation;

import java.util.Scanner;

public class GuineaPig_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double wight = Double.parseDouble(scanner.nextLine()) * 1000;

        boolean ranOut = false;
        for (int day = 1; day <= 30; day++) {
            food -= 300;

            if (day % 2 == 0) {
                hay -= food * 0.05;
            }
            if (day % 3 == 0) {
                cover -= wight / 3;
            }

            if (food <= 0 || hay <= 0 || cover <= 0) {
                ranOut = true;
                break;
            }
        }

        if (ranOut) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    food / 1000, hay / 1000, cover / 1000);
        }
    }
}