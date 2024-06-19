package task2PhoneDirectory;

import java.util.*;


public class PhoneDirectory {

    private final Map<String, List<String>> directory = new HashMap<>(); //  Фамилия и список номеров телефонов

    public void add(String lastName, String phoneNumber) { //добавляем запись в справочник


        if (directory.containsKey(lastName)) { // Если фамилия уже есть в справочнике, добавляем номер в список
            directory.get(lastName).add(phoneNumber);

        } else { // Иначе создаем новую запись

            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            directory.put(lastName, numbers);
        }
    }


    public List<String> get(String lastName) { // метод для поиска номера телефона по фамилии
        if (directory.containsKey(lastName)) {
            return directory.get(lastName);
        } else {
            return new ArrayList<>();
        }
    }
}