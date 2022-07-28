package WhileLoop_05;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме данните
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        //изчисляваме общата големина на жилището
        int roomSize = width * length * height;
        //дефинираме променливи за:
        String input = scanner.nextLine(); //началния вход
        boolean noSpace = false; //проверка дали е свършило мястото
        //докато не получим командата Done
        while (!input.equals("Done")) {
            //чрез boxes превръщаме input в integer
            int boxes = Integer.parseInt(input);
            //намираме мястото в стаята след тяхното вкарване
            roomSize -= boxes;
            //проверяваме дали мястото е свършило
            if (roomSize <= 0) {
                //ако е, актуализираме проверката noSpace
                noSpace = true;
                break; //спираме цикъла
            } else { //ако не е, четем отново вход
                input = scanner.nextLine();
            }
        }
        //проверяваме дали мястото е свършило
        if (noSpace) { //извеждаме съответен резултат
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    Math.abs(roomSize));
        } else {
            System.out.println(roomSize + " Cubic meters left.");
        }
    }
}