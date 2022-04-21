package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(text);
        List<String> words = new ArrayList<>();

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        while (scanner.hasNext())
            words.add(scanner.next());
        scanner.close();

        Set<String> set = new HashSet<String>(words);
        for (String key : set) {
            hashMap.put(key, Collections.frequency(words, key));
        }

        hashMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(100).forEach(System.out::println); //сортировка по значяению Integer
    }
}





