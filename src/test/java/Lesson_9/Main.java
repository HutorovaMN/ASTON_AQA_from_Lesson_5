package Lesson_9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listEmpty = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
        listStr.add("Highload");
        listStr.add("High");
        listStr.add("Load");
        listStr.add("Highload");

        task1();
        System.out.println();
        task2_1(listStr);
        System.out.println();
        task2_2(listStr, listEmpty);
        System.out.println();
        task2_3(listStr, listEmpty);
        task3();
    }

    private static void task1() {
        /*Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.*/
        Random ran = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ran.nextInt(10));
        }
        System.out.println("Task 1 ==========================================================================");
        System.out.println("All numbers :");
        System.out.println(list);
        int result = (int) list.stream().filter(e -> e != 0).filter(e -> e % 2 == 0).count();
        System.out.println("The number of even numbers = " + result);
    }

    private static void task2_1(List<String> listStr) {
        /*2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
2.1. Посчитать, сколько раз объект «High» встречается в коллекции;*/
        int result = (int) listStr.stream().filter(e -> e.equals("High")).count();
        System.out.println("Task 2.1 ==========================================================================");
        System.out.println("Working with the collection :");
        System.out.println(listStr);
        System.out.println("The High-object is found in the collection = " + result);
    }

    private static void task2_2(List<String> listStr, List<String> listEmty) {
        /*2.2. Определить, какой элемент в коллекции находится на первом месте.
        Если мы получили пустую коллекцию, то пусть возвращается 0;*/
        String result = listStr.stream().findFirst().orElse("0");
        String resultEmpty = listEmty.stream().findFirst().orElse("0");
        System.out.println("Task 2.2 ==========================================================================");
        System.out.println("Working with the collection :");
        System.out.println(listStr);
        System.out.println("The item in the collection is in the first place = " + result);
        System.out.println("Working with the collection :");
        System.out.println(listEmty);
        System.out.println("The collection is empty = " + resultEmpty);
    }

    private static void task2_3(List<String> listStr, List<String> listEmty) {
        /*2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;*/
        String result = listStr.stream().reduce((x, y) -> y).orElse("0");
        String resultEmpty = listEmty.stream().reduce((x, y) -> y).orElse("0");
        System.out.println("Task 2.3 ==========================================================================");
        System.out.println("Working with the collection :");
        System.out.println(listStr);
        System.out.println("The item in the collection is in the last place = " + result);
        System.out.println("Working with the collection :");
        System.out.println(listEmty);
        System.out.println("The collection is empty = " + resultEmpty);
    }

    private static void task3() {
        /*Задана коллекция, содержащая элементы "f10", "a15", "f2", "f4", "f5", “b54”, “a16”.
         Необходимо отсортировать строки в алфавитном порядке
         (учесть, что при одинаковой букве цифры должны быть в порядке возрастания) и добавить их в массив;
         */
        List<String> list = new ArrayList<>();
        list.add("f1");
        list.add("a15");
        list.add("f2");
        list.add("f4");
        list.add("f5");
        list.add("f54");
        list.add("a16");
        Collections.sort(list, (x, y) -> x.compareToIgnoreCase(y));
        String[] result = list.toArray(new String[0]);
        System.out.println("Task 3 ============================================================================");
        System.out.println("Sorted array = " + Arrays.toString(result));
    }
}
