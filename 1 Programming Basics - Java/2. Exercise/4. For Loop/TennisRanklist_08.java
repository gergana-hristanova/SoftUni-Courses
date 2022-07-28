package ForLoop_04;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме входните данни
        int totalTournaments = Integer.parseInt(scanner.nextLine());
        double startingPoints = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за:
        double tournamentsPoints = 0; //точките, спечелени от турнири
        double wonTournaments = 0; //спечелените турнири (W)

        for (int i = 1; i <= totalTournaments; i ++) {
            //прочитаме достигнатия етап на турнира
            String tournamentRank = scanner.nextLine();
            //според достигнатия етап, причисляваме точки
            switch (tournamentRank) {
                case "W":
                    tournamentsPoints += 2000;
                    //отчитаме колко са спечелените турнири
                    wonTournaments ++;
                    break;
                case "F":
                    tournamentsPoints += 1200;
                    break;
                case "SF":
                    tournamentsPoints += 720;
                    break;
            }
        }
        //изчисляваме колко точки са изкарани от турнирите средно
        double averagePoints = Math.floor(tournamentsPoints / totalTournaments);
        //изчисляваме колко процента от турнирите са спечелени
        double percentageWonTournaments = wonTournaments / totalTournaments * 100;
        //извеждаме резултатите
        System.out.printf("Final points: %.0f%n", startingPoints + tournamentsPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentageWonTournaments);
    }
}