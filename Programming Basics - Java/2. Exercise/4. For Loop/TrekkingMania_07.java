package ForLoop_04;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме броя на групите
        int groupsAmount = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за хората, изкачващи:
        int trekkersMusala = 0; //Мусала
        int trekkersMontBlanc = 0; //Монблан
        int trekkersKilimanjaro = 0; //Килиманджаро
        int trekkersK2 = 0; //К2
        int trekkersEverest = 0; //Еверест

        for (int i = 1; i <= groupsAmount; i ++) {
            //въвеждаме броя на хората в групата
            int groupMembers = Integer.parseInt(scanner.nextLine());
            //проверяваме към коя планина са причислени
            if (groupMembers <= 5) {
                trekkersMusala += groupMembers;
            } else if (groupMembers <= 12) {
                trekkersMontBlanc += groupMembers;
            } else if (groupMembers <= 25) {
                trekkersKilimanjaro += groupMembers;
            } else if (groupMembers <= 40) {
                trekkersK2 += groupMembers;
            } else {
                trekkersEverest += groupMembers;
            }
        }
        //изчисляваме общо всички хора
        double totalTrekkers = trekkersMusala + trekkersMontBlanc +
                trekkersKilimanjaro + trekkersK2 + trekkersEverest;
        //изчисляваме и извеждаме резултатите
        System.out.printf("%.2f%%%n", trekkersMusala / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersMontBlanc / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersKilimanjaro / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersK2 / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersEverest / totalTrekkers * 100);
    }
}