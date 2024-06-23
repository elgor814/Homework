package _2PhoneDirectory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Добавление записей в справочник
        phoneDirectory.add("Иванов", "1111111");
        phoneDirectory.add("Петров", "2222222");
        phoneDirectory.add("Иванов", "3333333");
        phoneDirectory.add("Иванов", "4444444");
        phoneDirectory.add("Сидоров", "5555555");
        phoneDirectory.add("Кошкин", "6666666");

        // Добавим уже имеющийся номер телефона
        phoneDirectory.add("Мошкин", "1111111");


        // Вывод всех записей в справочнике
        phoneDirectory.printAllEntries();

    }
}