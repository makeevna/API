package API3ZADACHKA;

import java.util.*;
import java.util.stream.Collectors;


public class APIzadachka {
    public static void main(String[] args) {


                List<Person> people = new ArrayList<>();
                people.add(new Person("Madina", 23));
                people.add(new Person("Bilal", 5));
                people.add(new Person("Chyngyz", 19));
                people.add(new Person("Farida", 20));

                // Найдем самую старую персону
                Optional<Person> oldestPerson = people.stream()
                        .max(Comparator.comparingInt(Person::getAge));

                if (oldestPerson.isPresent()) {
                    System.out.println("Самая старшая: " + oldestPerson.get().getName());
                } else {
                    System.out.println("Список пуст");
                }
            }
        }

