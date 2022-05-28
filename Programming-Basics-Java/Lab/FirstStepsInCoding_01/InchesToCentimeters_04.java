package FirstStepsInCoding_01;

import java.util.Scanner;

public class InchesToCentimeters_04 {
    //psvm
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double in = Double.parseDouble(scanner.nextLine());
        double cm = in * 2.54;

        //sout
        System.out.println(cm);
    }
}
