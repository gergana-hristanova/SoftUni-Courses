package ForLoop_04;

import java.io.StringReader;
import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //въвеждаме дните
        int days = Integer.parseInt(scanner.nextLine());
        //дефинираме променливи за:
        int doctors = 7; //лекарите
        int untreatedPatients = 0; //непрегледаните пациенти
        int treatedPatients = 0; //прегледаните пациенти
        //докато не достигнем роя на дните
        for (int i = 1; i <= days; i++) {
            //четем пациенти за деня
            int patients = Integer.parseInt(scanner.nextLine());
            //ако е трети ден и непрегледаните са повече от прегледаните пациенти
            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors ++; //увеличаваме броя на лекарите
            }
            //изчисляваме прегледаните и нелпрегледаните пациенти
            if (patients >= doctors) {
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            } else {
                treatedPatients += patients;
            }
        }
        //извеждаме резултата
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}