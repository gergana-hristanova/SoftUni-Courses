package WhileLoop_05;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме нужните пари за ваканцията и наличните пари
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        //дефинираме променливи за:
        String lastAction = ""; //последното направено действие
        int consecutiveSpendsCounter = 1; //брояч за последователни харчения
        int daysCounter = 0; //брояч за дните
        boolean moneyAreEnough = true; //проверка дали парите са събрани
        //докато парите не са събрани
        while (availableMoney < vacationMoney) {
            daysCounter++; //увеличаваме броя на дните с 1
            String action = scanner.nextLine(); //въвеждаме действие
            //проверяваме дали Джеси харчи последователно
            if (lastAction.equals("spend") && action.equals("spend")) {
                //ако да, увеличаваме броя на последователните харчения с 1
                consecutiveSpendsCounter++;
            } else { //ако не, връщаме началната стойност на брояча
                consecutiveSpendsCounter = 1;
            } //проверяваме дали Джени е харчила пет последователни пъти
            if (consecutiveSpendsCounter == 5) {
                //ако да, присвояваме на проверката стойност false
                moneyAreEnough = false;
                break; //и спираме цикъла
            }
            //запаметяваме последното направено действие
            lastAction = action;
            //дефинираме променлива за парите, които Джеси спестява или харчи
            double actionMoney;
            //проверяваме дали ги харчи или ги събира
            switch (action) {
                case "spend":
                    actionMoney = Double.parseDouble(scanner.nextLine());
                    availableMoney -= actionMoney;
                    break;
                case "save":
                    actionMoney = Double.parseDouble(scanner.nextLine());
                    availableMoney += actionMoney;
                    break;
            }
            //зануляваме парите ѝ, ако са отрицателно число
            if (availableMoney < 0) {
                availableMoney = 0;
            }
        }
        //след края на цикъла проверяваме дали парите са събрани
        if (moneyAreEnough) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        } else { //ако не са
            System.out.print("You can't save the money.\n" + daysCounter);
        }
    }
}