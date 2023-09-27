package API13ZADACHKA;

import java.util.List;

public class DDD {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Nurisa", 20),
                new Student("Ainazik", 19),
                new Student("Nurisa", 18),
                new Student("Aijan", 26)
        );

        int productOfAges = students.stream()
                .filter(student -> student.getAge() > 20)
                .mapToInt(Student::getAge)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Произведение возрастов студентов старше 20 лет: " + productOfAges);
    }
}
