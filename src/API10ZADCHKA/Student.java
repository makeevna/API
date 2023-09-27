package API10ZADCHKA;

public class Student {
    private String name;
    private int course;
    private int age;

    public Student(String name, int course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }
}