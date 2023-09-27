package API2ZADACHKA;

import java.util.*;
import java.util.stream.Collectors;

public class zadachkaAPI {
            public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(3,2, 1,5, 4,7, 9, 0 );

                List<Integer> evenNumbers = numbers.stream()
                        .filter(num -> num % 2 == 0)
                        .collect(Collectors.toList());

                List<Integer> oddNumbers = numbers.stream()
                        .filter(num -> num % 2 != 0)
                        .collect(Collectors.toList());

                System.out.println("Четные числа: " + evenNumbers);
                System.out.println("Нечетные числа: " + oddNumbers);
            }
        }
