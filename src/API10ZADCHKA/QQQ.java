package API10ZADCHKA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QQQ {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Muxa", 1, 23),
                new Student("Meerim", 4, 22),
                new Student("Kandybek", 2, 17),
                new Student("Nurai", 2, 20),
                new Student("Omurbek", 3, 19)
        );


        Map<Integer, Map<Integer, List<Student>>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.groupingBy(Student::getAge)));


        groupedStudents.forEach((course, ageGroup) -> {
            System.out.println("Курс " + course + ":");
            ageGroup.forEach((age, studentList) -> {
                System.out.println("  Возраст " + age + ":");
                studentList.forEach(student -> {
                    System.out.println("    " + student.getName());
                });
            });
        });
    }
}
