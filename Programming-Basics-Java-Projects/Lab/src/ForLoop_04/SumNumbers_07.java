package ForLoop_04;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }

        System.out.println(sum);
    }
}