package Task1;

import java.util.*;

public class WordCollection {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("meat");
        food.add("iceСream");
        food.add("cookie");
        food.add("orange");
        food.add("tea");
        food.add("cola");
        food.add("meat");
        food.add("butter");
        food.add("ham");
        food.add("apple");
        food.add("juice");
        food.add("cake");
        food.add("cola");
        food.add("apple");
        food.add("ham");
        food.add("tea");


        HashMap<String, Integer> wordCount = new HashMap<>(); // создаем HashMap для подсчета количества каждого слова


        for (String word : food) { // количество каждого слова в списке food
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Подсчитаем сколько раз встречается каждое слово: ");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
        System.out.println("Уникальные слова: ");
        for (String word : food) {
            if (wordCount.get(word) == 1) {
                System.out.println(word);
            }
        }

    }
}