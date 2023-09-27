package API12ZADACHKA;
import java.util.*;
import java.util.stream.Collectors;
public class LLLL {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry");


            Set<String> uniqueWords = words.stream()
                    .collect(Collectors.toCollection(() -> new TreeSet<>()));


            uniqueWords.forEach(System.out::println);
        }
    }


