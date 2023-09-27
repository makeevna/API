package API4ZADACHKA;
import java.util.*;
import java.util.stream.Collectors;
public class BBBB {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Nurai", 169));
            students.add(new Student("Jandar", 185));
            students.add(new Student("Zalkar", 160));
            students.add(new Student("Adelia", 171));


            double averageHeight = students.stream()
                    .mapToDouble(Student::getHeight)
                    .average()
                    .orElse(0.0);

            System.out.println("Средний рост группы студентов: " + averageHeight + " см");
        }
    }

