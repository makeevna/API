
       import java.util.*;
import java.util.stream.Collectors;

        public class Main {
            public static void main(String[] args) {

                List<Student> students = new ArrayList<>();
                students.add(new Student("Nurai", 3));
                students.add(new Student("Alina", 2));
                students.add(new Student("Erkin", 1));
                students.add(new Student("Aigerim", 3));
                students.add(new Student("Adelia", 2));
                students.add(new Student("Tunuk", 1));


                Map<Integer, List<Student>> studentsByCourse = students.stream()
                        .collect(Collectors.groupingBy(Student::getCourse));


                for (Map.Entry<Integer, List<Student>> entry : studentsByCourse.entrySet()) {
                    int course = entry.getKey();
                    List<Student> studentsInCourse = entry.getValue();
                    System.out.println("Курс " + course + ": " + studentsInCourse);
                }
            }
        }
