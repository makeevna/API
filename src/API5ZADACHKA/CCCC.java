package API5ZADACHKA;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CCCC {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Bektur", 2));
            students.add(new Student("Alina", 6));
            students.add(new Student("Nurai", 5));
            students.add(new Student("Meerim", 3));



            Collections.sort(students, (s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()));


            for (Student student : students) {
                System.out.println(student.getName() + ": " + student.getGrade());
            }
        }
    }

