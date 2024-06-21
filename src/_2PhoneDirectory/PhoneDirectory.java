package _2PhoneDirectory;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory; // Хранилище фамилий и списков номеров телефонов

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    // Добавление записи в справочник
    public void addEntry(String phoneNumber, String surname) {
        // Если фамилия уже присутствует в справочнике, добавляем новый номер телефона к существующему списку
        if (directory.containsKey(surname)) {
            List<String> phones = directory.get(surname);
            phones.add(phoneNumber);
        } else {
            // Если фамилии нет в справочнике, создаем новый список и добавляем номер телефона
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            directory.put(surname, phones);
        }
    }

    // Поиск номера телефона по фамилии
    public List<String> findPhonesBySurname(String surname) {
        return directory.get(surname);
    }

    // Вывод содержимого справочника
    public void printDirectory() {
        System.out.println("Телефонный справочник:");
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            String surname = entry.getKey();
            List<String> phones = entry.getValue();
            for (String phone : phones) {
                System.out.println("Номер: " + phone + ", Фамилия: " + surname);
            }
        }
    }
}