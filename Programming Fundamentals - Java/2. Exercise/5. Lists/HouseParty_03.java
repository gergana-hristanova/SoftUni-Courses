package lists_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < numberOfGuests; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            String guestName = inputList.get(0);

            if (inputList.get(2).equals("not")) {
                if (guestList.contains(guestName)) {
                    guestList.remove(guestName);
                } else {
                    System.out.println(guestName + " is not in the list!");
                }
            } else {
                if (guestList.contains(guestName)) {
                    System.out.println(guestName + " is already in the list!");
                } else {
                    guestList.add(guestName);
                }
            }
        }

        for (String guest : guestList) {
            System.out.println(guest);
        }
    }
}