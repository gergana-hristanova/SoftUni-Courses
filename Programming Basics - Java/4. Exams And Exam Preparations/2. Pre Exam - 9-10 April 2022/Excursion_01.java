package PreExamApril2022;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupMembers = Integer.parseInt(scanner.nextLine());
        int overnights = Integer.parseInt(scanner.nextLine());
        int transportTickets = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        double overnightsCost = overnights * 20;
        double transportCost = transportTickets * 1.6;
        double museumCost = museumTickets * 6;
        double totalCostPerPerson = overnightsCost + museumCost + transportCost;

        double totalCost = totalCostPerPerson * groupMembers;
        totalCost += totalCost * 0.25;

        System.out.printf("%.2f", totalCost);
    }
}
