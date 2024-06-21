package _2PhoneDirectory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Добавляем записи в телефонный справочник
        phoneDirectory.addEntry("123456789", "Иванов");
        phoneDirectory.addEntry("987654321", "Иванов");
        phoneDirectory.addEntry("555444333", "Петров");

        // Выводим содержимое справочника
        phoneDirectory.printDirectory();

        // Пример поиска номеров телефонов по фамилии
        String surname = "Иванов";
        List<String> phones = phoneDirectory.findPhonesBySurname(surname);
        if (phones != null) {
            System.out.println("Номера телефонов для фамилии " + surname + ": " + phones);
        } else {
            System.out.println("Фамилия " + surname + " не найдена в справочнике");
        }
    }
}
