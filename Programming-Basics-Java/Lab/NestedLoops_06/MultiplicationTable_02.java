package NestedLoops_06;

public class MultiplicationTable_02 {
    public static void main(String[] args) {

        for (int multiplier1 = 1; multiplier1 <= 10; multiplier1++) {
            for (int multiplier2 = 1; multiplier2 <= 10; multiplier2++) {
                int result = multiplier1 * multiplier2;
                System.out.printf("%d * %d = %d%n",
                        multiplier1, multiplier2, result);
            }
        }
    }
}