import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void taskOne(List<Integer> list) {
        for (Integer number: list) {
            if (!((number % 2) == 0)) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }

    public static void taskTwo(Set<Integer> set) {
        for (Integer numb: set) {
            if ((numb % 2) == 0) {
                System.out.print(numb + " ");
            }
        }

        System.out.println();
    }

    public static void taskThree(Set<String> set) {
        System.out.println(set.toString());
        System.out.println();
    }

    public static void taskFour(List<String> list) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (String word: list) {
            if (!(hashMap.containsKey(word))) {
                hashMap.put(word, 0);
            }

            hashMap.put(word, hashMap.get(word) + 1);
        }

        System.out.println(hashMap.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> listForTask = new ArrayList<>();
        Set<Integer> setForTask = new HashSet<>();
        int countForTask;
        int numbForTask;
        String stringForTask;
        String clear;

        System.out.print("Сколько вы хотите ввести чисел: ");
        countForTask = in.nextInt();

        System.out.print("Введите числа: ");
        for (int i = 0; i < countForTask; i++) {
            numbForTask = in.nextInt();
            listForTask.add(numbForTask);
        }

        taskOne(listForTask);
        System.out.println();

        System.out.print("Сколько вы хотите ввести чисел: ");
        countForTask = in.nextInt();

        System.out.print("Введите числа: ");
        for (int i = 0; i < countForTask; i++) {
            numbForTask = in.nextInt();
            setForTask.add(numbForTask);
        }

        taskTwo(setForTask);
        System.out.println();

        System.out.print("Введите строку: ");
        clear = in.nextLine();
        stringForTask = in.nextLine();
        Set<String> setForTaskStr = new HashSet<>(List.of(stringForTask.split(" ")));

        taskThree(setForTaskStr);
        System.out.println();

        System.out.print("Введите строку: ");
        stringForTask = in.nextLine();
        List<String> listForTaskStr = new ArrayList<>(List.of(stringForTask.split(" ")));

        taskFour(listForTaskStr);
    }
}