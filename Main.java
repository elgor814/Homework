package task2PhoneDirectory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "+7 (495) 000-0001");
        phoneDirectory.add("Петров", "+7 (495) 000-0002");
        phoneDirectory.add("Сидоров", "+7 (495) 000-0003");
        phoneDirectory.add("Иванов", "+7 (495) 000-0004");

        List<String> ivanovNumbers = phoneDirectory.get("Иванов");
        System.out.println("Найденные номера телефонов для фамилии Иванов:");
        for (String number : ivanovNumbers) {
            System.out.println(number);
        }
        List<String> petrovNumbers = phoneDirectory.get("Петров");
        System.out.println("Найденные номера телефонов для фамилии Петров:");
        for (String number : petrovNumbers) {
            System.out.println(number);
        }
    }
}
