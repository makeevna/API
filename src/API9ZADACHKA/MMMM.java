package API9ZADACHKA;
import java.util.List;
import java.util.stream.Collectors;
public class MMMM {
        public static void main(String[] args) {
            List<Student> students = List.of(
                    new Student("Emirlan"),
                    new Student("Temirlan"),
                    new Student("Amirlan"),
                    new Student("Amageldi"),
                    new Student("Uulkelsin")
            );


            String names = students.stream()
                    .map(Student::getName)
                    .collect(Collectors.joining(", "));

            System.out.println("Имена студентов: " + names);
        }
    }

