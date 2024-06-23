package _2PhoneDirectory;

import java.util.*;

public class PhoneDirectory {

    private final Map<String, Set<String>> directory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        // Проверяем, содержится ли этот номер телефона уже в других множествах
        for (Map.Entry<String, Set<String>> entry : directory.entrySet()) {
            String key = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();
            if (!key.equals(lastName) && phoneNumbers.contains(phoneNumber)) {
                System.out.println("Номер телефона " + phoneNumber + " нельзя добавить в справочник, так как он уже есть в справочнике.");
                System.out.println();
                return; // Выходим из метода, если номер телефона уже есть в справочнике
            }
        }

        // Если номер телефона не найден в других множествах, добавляем его
        Set<String> phoneNumbers = directory.getOrDefault(lastName, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        directory.put(lastName, phoneNumbers);
    }

    public void set(String lastName, Set<String> phoneNumbers) {
        directory.put(lastName, phoneNumbers);
    }

    public void remove(String lastName) {
        directory.remove(lastName);
    }

    public void printAllEntries() {
        for (Map.Entry<String, Set<String>> entry : directory.entrySet()) {
            String lastName = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();
            System.out.println("Фамилия: " + lastName);
            Object n;
            System.out.println("Номер телефона:");
            for (String phoneNumber : phoneNumbers) {
                System.out.print(phoneNumber + "  ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
