package final_exam_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer[]> heroesMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] heroInfo = scanner.nextLine().split(" ");
            String heroName = heroInfo[0];
            int heroHp = Integer.parseInt(heroInfo[1]);
            int heroMp = Integer.parseInt(heroInfo[2]);

            Integer[] value = new Integer[2];
            value[0] = heroHp;
            value[1] = heroMp;

            heroesMap.put(heroName, value);
        }

        String[] commandLine = scanner.nextLine().split(" - ");
        while (!commandLine[0].equals("End")) {

            String command = commandLine[0];
            String heroName = commandLine[1];
            switch (command) {

                case "CastSpell":
                    int neededMp = Integer.parseInt(commandLine[2]);
                    String spellName = commandLine[3];

                    int heroMp = heroesMap.get(heroName)[1];

                    if (neededMp > heroMp) {
                        System.out.printf("%s does not have enough MP to cast %s!%n",
                                heroName, spellName);
                    } else {
                        heroesMap.get(heroName)[1] -= neededMp;
                        System.out.printf("%s has successfully cast %s and now has %s MP!%n",
                                heroName, spellName, heroMp - neededMp);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(commandLine[2]);
                    String attacker = commandLine[3];

                    int heroHp = heroesMap.get(heroName)[0] - damage;
                    heroesMap.get(heroName)[0] = heroHp;
                    if (heroHp > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, heroHp);
                    } else {
                        heroesMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;

                case "Recharge":
                    int rechargedMp = Integer.parseInt(commandLine[2]);
                    heroMp = heroesMap.get(heroName)[1];

                    if (rechargedMp + heroMp > 200) {
                        rechargedMp = 200 - heroMp;
                    }

                    heroesMap.get(heroName)[1] += rechargedMp;
                    System.out.printf("%s recharged for %d MP!%n", heroName, rechargedMp);
                    break;

                case "Heal":
                    int healedHp = Integer.parseInt(commandLine[2]);
                    heroHp = heroesMap.get(heroName)[0];

                    if (healedHp + heroHp > 100) {
                        healedHp = 100 - heroHp;
                    }

                    heroesMap.get(heroName)[0] += healedHp;
                    System.out.printf("%s healed for %s HP!%n", heroName, healedHp);
                    break;
            }

            commandLine = scanner.nextLine().split(" - ");
        }

        for (Map.Entry<String, Integer[]> entry : heroesMap.entrySet()) {
            String heroName = entry.getKey();
            int heroHp = entry.getValue()[0];
            int heroMp = entry.getValue()[1];

            System.out.println(heroName);
            System.out.printf("  HP: %d%n", heroHp);
            System.out.printf("  MP: %d%n", heroMp);
        }
    }
}