package Lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Duplicates {

    public static void removeDuplicates(List<String> list) {
        int count = 1;
        List<String> temp = new ArrayList<String>();
        List<Integer> listInt = new ArrayList<Integer>();

        for (String s : list) {
            if (!temp.contains(s)) {
                temp.add(s);
            }
        }
        for (String s : temp) {
            listInt.add(Collections.frequency(list, s));
        }
        System.out.println("Массив без дубликатов : ");
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i) + " - " + listInt.get(i) + "\n");
        }
    }

    public static void removeDuplicatesMap(String[] strArray) {
        HashMap<String, Integer> countChar = Arrays.stream(strArray).collect(HashMap::new, (m, c) -> {
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);
            else
                m.put(c, 1);
        }, HashMap::putAll);
        System.out.println(countChar);
    }
}

