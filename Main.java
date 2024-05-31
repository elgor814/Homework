
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        fiveAttractions();
        addSixthAttration();
        System.out.println ("                                             ");
        System.out.println ("                                             ");
        System.out.println (" Сотруднички:");

        Employee alex = new Employee("Alex", "tester", "alextest@gmail.com", 1234567890, 2000, 30);
        Employee alex1 = new Employee("Alex1", "tester", "alex1test@gmail.com", 1234567890, 3000, 50);
        //вызов метода вывода
        alex1.displayInfo();
        alex.displayInfo();

        Employee[] arrayEmployee = new Employee[5]; // объявляем массив объектов

        arrayEmployee[0] = new Employee("Ivanov Ivan", "Инженер", " ivivan@mailbox.com ", 892312312, 30000, 30);
        arrayEmployee[1] = new Employee("Semenov Semen", "Инженер", "semen@mailbox.com ", 811111111, 30000, 31);
        arrayEmployee[2] = new Employee("Sergeev Sergei", "старший Инженер", " Sergeev@mailbox.com ", 822222222, 40000, 32);
        arrayEmployee[3] = new Employee("Leonidov Leonid", "старший Инженер", " Alexeev@mailbox.com ", 833333333, 40000, 33);
        arrayEmployee[4] = new Employee("Alekseev Aleksei", "ведущий Инженер", "leonid@mailbox.com ", 844444444, 30000, 45);
        arrayEmployee[3].displayInfo(); // вывод в консоль информацию об объекте из массива



    }

    private static void fiveAttractions() {

        System.out.println("Парк с пятью аттракционами");

        // создаем 5 аттракционов
        Park.Attraction firstAttraction = new Park.Attraction("Лошадки ", "9.00-18.00  ", 300);
        Park.Attraction secondAttraction = new Park.Attraction("Тачки ", "9.30-18.30  ", 200);
        Park.Attraction thirdAttraction = new Park.Attraction("НЛО ", "10.00-16.00  ", 500);
        Park.Attraction fourthAttraction = new Park.Attraction("Горки ", "12.00-16.00  ", 400);
        Park.Attraction fifthAttraction = new Park.Attraction("Батут ", "9.00-21.00", 100);

        // создаем список из аттракционов и добавляем их
        List<Park.Attraction> attractions = new ArrayList<>();
        attractions.add(firstAttraction);
        attractions.add(secondAttraction);
        attractions.add(thirdAttraction);
        attractions.add(fourthAttraction);
        attractions.add(fifthAttraction);

        Park park = new Park(5, attractions);

        // вывод информации об аттракционах в парке
        park.getInfoAboutAttractions();

        Park.Attraction sixthAttraction = new Park.Attraction("Супергерои ", "14.00-20.00", 1000);
    }

    // Добавим шестой аттракцион в парк размером 5
    private static void addSixthAttration() {

        System.out.println();
        System.out.println("Добавим шестой аттракцион в парк:");

        Park.Attraction firstAttraction = new Park.Attraction("Лошадки: ", "9.00-18.00  ", 300);
        Park.Attraction secondAttraction = new Park.Attraction("Тачки: ", "9.30-18.30  ", 200);
        Park.Attraction thirdAttraction = new Park.Attraction("НЛО: ", "10.00-16.00  ", 500);
        Park.Attraction fourthAttraction = new Park.Attraction("Горки: ", "12.00-16.00  ", 400);
        Park.Attraction fifthAttraction = new Park.Attraction("Батут: ", "9.00-21.00  ", 100);
        Park.Attraction sixthAttraction = new Park.Attraction("Горки-2:", "11.00-13.00  ", 600);

        List<Park.Attraction> attractions = new ArrayList<>();
        attractions.add(firstAttraction);
        attractions.add(secondAttraction);
        attractions.add(thirdAttraction);
        attractions.add(fourthAttraction);
        attractions.add(fifthAttraction);
        attractions.add(sixthAttraction);

        new Park(5, attractions);
    }

    private static Park.Attraction createAttraction(String name, String workingTime, int cost) {
        return new Park.Attraction(name, workingTime, cost);
    }
}