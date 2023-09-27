package API7ZADACHKA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CCCC {


        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Jandar", 23));
            students.add(new Student("Adelia", 22));
            students.add(new Student("Alina", 21));
            students.add(new Student("Nurai, Makeeva", 20));
            students.add(new Student("Elnura", 19));
            students.add(new Student("Aigerim, Bekenova", 18));
            students.add(new Student("Zalkar", 17));
            students.add(new Student("Kandybek", 16));
            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {

                    return Integer.compare(student2.getGrade(), student1.getGrade());
                }
            });


            for (Student student : students) {
                System.out.println(student.getName() + ": " + student.getGrade());
            }
        }
    }

