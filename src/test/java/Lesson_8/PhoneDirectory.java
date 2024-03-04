package Lesson_8;

import java.util.*;

/*Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи,
  а с помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.*/

import java.util.HashMap;

public class PhoneDirectory {
    private static HashMap<String, String> pD = new HashMap<String, String>();

    public static void add(String phone, String name) {
        pD.put(phone, name);
    }

    public static void get(String surname) {
        List<String> result = new ArrayList<String>();
        for (Map.Entry entry : pD.entrySet()) {
            if (surname.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) {
            result.add("абонент с такой фамилией не найден");
        }
        System.out.println("Данный абонент содержит следующий номер телефона : ");
        System.out.println(result);
    }

    public static void PrintPhonebook() {
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> k : pD.entrySet()) {
            System.out.println(k.getValue() + ": " + k.getKey());
        }
    }
}
