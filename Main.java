
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        fiveAttractions();
        addSixthAttration();
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