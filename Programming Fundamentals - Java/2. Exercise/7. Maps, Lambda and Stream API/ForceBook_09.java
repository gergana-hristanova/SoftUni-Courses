package mapslambdaandstreamAPI_07;

import java.util.*;

public class ForceBook_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                //force_side | force_user
                String[] inputLine = input.split(" \\| ");
                String forceSide = inputLine[0];
                String forceUser = inputLine[1];

                boolean skipCommand = false;
                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    for (String user : entry.getValue()) {
                        if (user.equals(forceUser)) {
                            skipCommand = true;
                            break;
                        }
                    }
                }
                if (skipCommand) {
                    break;
                }

                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                forceBook.get(forceSide).add(forceUser);

            } else {
                //force_user -> force_side
                String[] inputLine = input.split(" -> ");
                String forceUser = inputLine[0];
                String forceSide = inputLine[1];

                boolean removedUserFromSide = false;
                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    for (String user : entry.getValue()) {
                        if (user.equals(forceUser)) {
                            entry.getValue().remove(forceUser);
                            removedUserFromSide = true;
                            break;
                        }
                    }

                    if (removedUserFromSide) {
                        break;
                    }
                }

                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                forceBook.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",
                            entry.getKey(), entry.getValue().size());
                    for (String member : entry.getValue()) {
                        System.out.println("! " + member);
                    }
                });
    }
}