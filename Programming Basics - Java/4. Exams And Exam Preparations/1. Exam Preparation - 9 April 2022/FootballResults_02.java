package ExamPreparationMarch2022;

import java.util.Scanner;

public class FootballResults_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String match1Result = scanner.nextLine();
        String match2Result = scanner.nextLine();
        String match3Result = scanner.nextLine();
        int wonGames = 0;
        int lostGames = 0;
        int drawnGames = 0;

        char result1Home = match1Result.charAt(0);
        int result1HomeInt = Integer.parseInt(String.valueOf(result1Home));
        char result1Guest = match1Result.charAt(2);
        int result1GuestInt = Integer.parseInt(String.valueOf(result1Guest));
        if (result1HomeInt > result1GuestInt) {
            wonGames++;
        } else if (result1HomeInt < result1GuestInt){
            lostGames++;
        } else {
            drawnGames++;
        }
        char result2Home = match2Result.charAt(0);
        int result2HomeInt = Integer.parseInt(String.valueOf(result2Home));
        char result2Guest = match2Result.charAt(2);
        int result2GuestInt = Integer.parseInt(String.valueOf(result2Guest));
        if (result2HomeInt > result2GuestInt) {
            wonGames++;
        } else if (result2HomeInt < result2GuestInt){
            lostGames++;
        } else {
            drawnGames++;
        }
        char result3Home = match3Result.charAt(0);
        int result3HomeInt = Integer.parseInt(String.valueOf(result3Home));
        char result3Guest = match3Result.charAt(2);
        int result3GuestInt = Integer.parseInt(String.valueOf(result3Guest));
        if (result3HomeInt > result3GuestInt) {
            wonGames++;
        } else if (result3HomeInt < result3GuestInt){
            lostGames++;
        } else {
            drawnGames++;
        }

        System.out.printf("Team won %d games.%n", wonGames);
        System.out.printf("Team lost %d games.%n", lostGames);
        System.out.printf("Drawn games: %d", drawnGames);
    }
}
