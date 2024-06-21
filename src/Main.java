import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] wordsArray = {"meat", "iceСream", "cookie", "orange", "tea", "cola", "meat", "butter", "ham", "apple", "juice", "cake", "cola", "apple", "ham", "tea"};


        List<String> foodList = WordsCollection.arrayToList(wordsArray);  // Используем метод из WordsCollection для преобразования массива в список

        // Выводим элементы списка на консоль
        System.out.println("Список foodList:");
        for (String food : foodList) {
            System.out.println(food);
        }
        System.out.println();

        // Используем статический метод из класса WordsCollection для подсчета частоты встречаемости слов
        Map<String, Integer> wordCountMap = WordsCollection.countWords(wordsArray);

        // Выводим результаты на консоль
        System.out.println("Частота встречаемости каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println();
        }
        System.out.println("Уникальные слова: ");
        for (String word : foodList) {
            if (wordCountMap.get(word) == 1) {
                System.out.println(word);
            }
        }
    }
}