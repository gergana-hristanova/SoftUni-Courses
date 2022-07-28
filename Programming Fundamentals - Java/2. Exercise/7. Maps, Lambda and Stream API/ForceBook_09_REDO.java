package mapslambdaandstreamAPI_07;

import java.util.*;

public class ForceBook_09_REDO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String team = input.split(" ")[0];
                String player = input.split(" ")[2];

                if (!map.containsKey(team)) {
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                } else {
                    List<String> currentPlayers = map.get(team);
                    boolean isExistInOtherTeams = false;
                    for (List<String> list : map.values()) {
                        if (list.contains(player)) {
                            isExistInOtherTeams = true;
                        }
                    }

                    if (!isExistInOtherTeams) {
                        currentPlayers.add(player);
                        map.put(team, currentPlayers);
                    }
                }
            } else if (input.contains("->")) {
                String team = input.split(" -> ")[1];
                String player = input.split(" -> ")[0];

                map.entrySet().forEach(entry -> entry.getValue().remove(player));

                if (map.containsKey(team)) {
                    List<String> currentPlayers = map.get(team);
                    currentPlayers.add(player);
                    map.put(team, currentPlayers);
                } else {
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }

            input = scanner.nextLine();
        }

        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(player -> System.out.println("! " + player));
                        });

    }
}