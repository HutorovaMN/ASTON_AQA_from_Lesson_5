package Lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов. Как только пользователь введет пустую строку -
программа должна прекратить приём данных от пользователя и вывести в консоль логины, начинающиеся на букву f (строчную).*/
public class Login {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean trigger = true;
        while (trigger) {
            System.out.println("Enter login");
            String login = scan.nextLine();
            if (login.isEmpty()) {
                trigger = false;
            }
            list.add(login);
        }
        list.stream().filter(e -> e.startsWith("f")).forEach(System.out::println);
    }
}
