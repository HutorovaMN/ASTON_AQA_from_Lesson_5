package Lesson_8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"стол", "стул", "стол", "стул", "диван", "картина", "окно", "кровать", "окно", "шкаф",
                "диван", "шкаф"};
        List<String> list = Arrays.asList(strArray);
        System.out.println("Вариант 1 решения задания 1, с использованием только коллекций --------------------");
        System.out.println("Массив до удаления дубликатов :");

        System.out.println(list);
        Duplicates.removeDuplicates(list);

        System.out.println("Вариант 2 решения задания 1, с использованием мапы и стримов --------------------");
        Duplicates.removeDuplicatesMap(strArray);

        System.out.println();
        System.out.println("=====================================================================================");
        System.out.println("Решение задания 2 -------------------------------------------------------------------");
        PhoneDirectory.add("234-45-56","Иванов");
        PhoneDirectory.add("789-45-56","Иванов");
        PhoneDirectory.add("786-87-56","Сидоров");
        PhoneDirectory.add("234-90-32","Зайцев");
        PhoneDirectory.add("234-12-45","Фурсов");

        PhoneDirectory.PrintPhonebook();

        PhoneDirectory.get("Иванов");

    }
}
