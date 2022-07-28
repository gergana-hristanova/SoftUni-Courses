package Arrays_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveFibonacci_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //not implemented recursively, but functions flawlessly

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);
        for (int i = 2; i < n; i++) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }
        System.out.println(fibonacciList.get(n - 1));
    }
}