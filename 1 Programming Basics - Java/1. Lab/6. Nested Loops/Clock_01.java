package NestedLoops_06;

public class Clock_01 {
    public static void main(String[] args) {

        for (int hours = 0; hours <= 23; hours++) {
            for (int mins = 0; mins <= 59; mins++) {
                System.out.printf("%d:%d%n", hours, mins);
            }
        }
    }
}