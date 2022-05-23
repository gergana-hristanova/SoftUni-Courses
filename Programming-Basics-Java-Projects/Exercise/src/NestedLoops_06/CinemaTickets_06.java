package NestedLoops_06;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме входа
        String input = scanner.nextLine();
        //дефинираме променливи за:
        int studentCounter = 0; //брояч за студентските билети
        int standardCounter = 0; //брояч за стандартните билети
        int kidsCounter = 0; //брояч за детските билети
        //докато не получим комадната Finish
        while (!input.equals("Finish")) {
            //четем свободните места в залата
            double capacity = Integer.parseInt(scanner.nextLine());
            //дефинираме променлива за заетите места
            int takenSeats = 0;
            //проверяваме от какъв тип е всеки билет
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidsCounter++;
                        break;
                }
                //с всеки закупен билет инкрементираме заетите места
                takenSeats++;
                //проверяваме дали залата се е напълнила
                if (takenSeats == capacity) {
                    break;
                } else {
                    //ако не е, четем нов тип билет
                    ticketType = scanner.nextLine();
                }
            }
            //след всеки филм принтираме процента на заетите места в залата
            System.out.printf("%s - %.2f%% full.%n", input, takenSeats / capacity * 100);
            //четем нов вход
            input = scanner.nextLine();
        }
        //изчисляваме общо закупените билети и извеждаме резултатите
        double totalTickets = studentCounter + standardCounter + kidsCounter;
        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCounter / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsCounter / totalTickets * 100);
    }
}