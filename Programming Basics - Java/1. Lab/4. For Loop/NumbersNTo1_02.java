package ForLoop_04;

import java.util.Scanner;

public class NumbersNTo1_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме n
        int n = Integer.parseInt(scanner.nextLine());
        //докато n >= 1, увеличаваме i с 1
        for (int i = n; i >= 1; i--) {
            //извеждаме i
            System.out.println(i);
        }
    }
}