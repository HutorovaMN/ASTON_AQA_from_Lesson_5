package Lesson_9;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*4.1. Необходимо узнать средний возраст студентов мужского пола;
4.2. Кому из студентов грозит получение повестки в этом году при условии,
что призывной возраст установлен в диапазоне от 18 до 27 лет;*/

public class Main_Student {

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Dmitrij", 17, Gender.MAN),
                new Student("Maksim", 20, Gender.MAN),
                new Student("Ekaterina", 20, Gender.WOMAN),
                new Student("Mikl", 28, Gender.MAN)
        );

        System.out.println("Task 4.1 ============================================================================");
        System.out.println("All students");
        System.out.println(students);
        System.out.println("The average age of male students");
        List<Student> list = students.stream().filter(e -> e.getGender().equals(Gender.MAN))
                .collect(Collectors.toList());
        double avg = list.stream().collect(Collectors.averagingInt(Student::getAge));
        System.out.println(avg);

        System.out.println("Task 4.2 ============================================================================");
        System.out.println("All students");
        System.out.println(students);
        System.out.println("Students between the ages of 18 and 27 (men)");
        List<Student> listFiltr = students.stream().filter(e ->
                        (e.getAge() > 18 && e.getAge() < 27 && e.getGender().equals(Gender.MAN)))
                .collect(Collectors.toList());
        System.out.println(listFiltr);
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
