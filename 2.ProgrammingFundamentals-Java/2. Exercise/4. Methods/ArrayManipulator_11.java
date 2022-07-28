package methods_04;

import java.util.*;

public class ArrayManipulator_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("end")) {
            String command = commandLine[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(commandLine[1]);
                    if (indexIsValid(index, array)) {

                        List<Integer> arrayToList = new ArrayList<>();
                        for (Integer element : array) {
                            arrayToList.add(element);
                        }

                        List<Integer> firstSubList = arrayToList.subList(0, index + 1);
                        List<Integer> secondSubList = arrayToList.subList(index + 1, array.length);

                        List<Integer> outputList = new ArrayList<>();
                        outputList.addAll(secondSubList);
                        outputList.addAll(firstSubList);

                        for (int i = 0; i < array.length; i++) {
                            array[i] = outputList.get(i);
                        }

                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "max":
                    String conditionMax = commandLine[1];
                    if (conditionMax.equals("even")) {
                        int[] evens = getEvens(array);
                        int max = getMax(evens);
                        if (max == 404) {
                            System.out.println("No matches");
                        } else {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] == max) {
                                    System.out.println(i);
                                    break;
                                }
                            }
                        }
                    } else {
                        int[] odds = getOdds(array);
                        int max = getMax(odds);
                        if (max == 404) {
                            System.out.println("No matches");
                        } else {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] == max) {
                                    System.out.println(i);
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "min":
                    String conditionMin = commandLine[1];
                    if (conditionMin.equals("even")) {
                        int[] evens = getEvens(array);
                        int min = getMin(evens);
                        if (min == 404) {
                            System.out.println("No matches");
                        } else {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] == min) {
                                    System.out.println(i);
                                    break;
                                }
                            }
                        }
                    } else {
                        int[] odds = getOdds(array);
                        int min = getMin(odds);
                        if (min == 404) {
                            System.out.println("No matches");
                        } else {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] == min) {
                                    System.out.println(i);
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "first":
                    int countFirst = Integer.parseInt(commandLine[1]);
                    int counterFirst = 0;
                    List<Integer> outputListFirst = new ArrayList<>();

                    if (!((countFirst <= array.length) && (countFirst > 0))) {
                        System.out.println("Invalid count");
                    } else {
                        String condition = commandLine[2];
                        if (condition.equals("even")) {
                            for (int i = 0; i < array.length; i++) {
                                if (array[i] % 2 == 0) {
                                    counterFirst++;
                                    outputListFirst.add(array[i]);
                                }

                                if (counterFirst == countFirst) {
                                    break;
                                }
                            }
                        } else {
                            for (int i = 0; i < array.length; i++) {
                                if (array[i] % 2 != 0) {
                                    counterFirst++;
                                    outputListFirst.add(array[i]);
                                }

                                if (counterFirst == countFirst) {
                                    break;
                                }
                            }
                        }

                        System.out.println(outputListFirst);
                    }
                    break;

                case "last":
                    int countLast = Integer.parseInt(commandLine[1]);
                    int counterLast = 0;
                    List<Integer> outputListLast = new ArrayList<>();

                    if (!((countLast <= array.length) && (countLast > 0))) {
                        System.out.println("Invalid count");
                    } else {
                        String condition = commandLine[2];
                        if (condition.equals("even")) {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] % 2 == 0) {
                                    counterLast++;
                                    outputListLast.add(array[i]);
                                }

                                if (counterLast == countLast) {
                                    break;
                                }
                            }
                        } else {
                            for (int i = array.length - 1; i >= 0; i--) {
                                if (array[i] % 2 != 0) {
                                    counterLast++;
                                    outputListLast.add(array[i]);
                                }

                                if (counterLast == countLast) {
                                    break;
                                }
                            }
                        }

                        Collections.reverse(outputListLast);
                        System.out.println(outputListLast);
                    }
                    break;
            }

            commandLine = scanner.nextLine().split(" ");
        }

        System.out.println(Arrays.toString(array));
    }

    private static boolean indexIsValid(int index, int[] array) {
        return index >= 0 && index < array.length;
    }

    private static int[] getEvens(int[] array) {
        List<Integer> returnList = new ArrayList<>();
        for (int element : array) {
            if (element % 2 == 0) {
                returnList.add(element);
            }
        }

        int[] returnArray = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            returnArray[i] = returnList.get(i);
        }

        return returnArray;
    }

    private static int[] getOdds(int[] array) {
        List<Integer> returnList = new ArrayList<>();
        for (int element : array) {
            if (element % 2 != 0) {
                returnList.add(element);
            }
        }

        int[] returnArray = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            returnArray[i] = returnList.get(i);
        }

        return returnArray;
    }

    private static int getMax(int[] array) {
        if (Arrays.stream(array).max().isPresent()) {
            int max = Arrays.stream(array).max().getAsInt();

            for (int i : array) {
                if (i == max) {
                    return i;
                }
            }
        }

        return 404;
    }

    private static int getMin(int[] array) {
        if (Arrays.stream(array).min().isPresent()) {
            int min = Arrays.stream(array).min().getAsInt();

            for (int i : array) {
                if (i == min) {
                    return i;
                }
            }
        }

        return 404;
    }
}