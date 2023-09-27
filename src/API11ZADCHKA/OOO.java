package API11ZADCHKA;
import java.util.*;
import java.util.stream.Collectors;
public class OOO {



        public static void main(String[] args) {
            List<String> sentences = Arrays.asList(
                    "Поздравляем всей со сдачей экзамена.");

            List<String> result = sentences.stream()
                    .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                    .filter(word -> countConsonants(word) > countVowels(word))
                    .collect(Collectors.toList());

            result.forEach(System.out::println);
        }


        private static long countConsonants(String word) {
            return word.chars().filter(c -> "Согласные буквы".indexOf(c) >= 0).count();
        }


        private static long countVowels(String word) {
            return word.chars().filter(c -> "Гласных буквы".indexOf(c) >= 0).count();
        }
    }

