package FirstStepsInCoding_01;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        int desksWidth = (int) (((width * 100) - 100) / 70);
        int desksLength = (int) ((length * 100) / 120);
        int desksTotal = desksLength * desksWidth - 3;

        System.out.println(desksTotal);
    }
}