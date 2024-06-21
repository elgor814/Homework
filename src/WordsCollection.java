import java.util.*;

public class WordsCollection {

    // Метод для преобразования массива строк в список строк
    public static List<String> arrayToList(String[] array) {
        List<String> food = new ArrayList<>(Arrays.asList(array));
        return food;

    }

    // Статический метод для подсчета частоты встречаемости слов
    public static Map<String, Integer> countWords(String[] wordsArray) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordsArray) {
            // Получаем текущее количество вхождений слова, или 0, если слово встречается впервые
            int count = wordCountMap.getOrDefault(word, 0);
            // Увеличиваем количество вхождений слова на 1 и обновляем в мапе
            wordCountMap.put(word, count + 1);
        }

        return wordCountMap;


    }


}


