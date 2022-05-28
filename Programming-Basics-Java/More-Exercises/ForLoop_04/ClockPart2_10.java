package ForLoop_04;

public class ClockPart2_10 {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;

        for (int seconds = 0; true; seconds++) {
            if (seconds > 59) {
                seconds = 0;
                minutes++;
            }
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }
            if (hours > 23) {
                break;
            }
            System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
        }
    }
}