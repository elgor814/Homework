
import java.util.List;

class Park {

    private final int parkSize;
    private final List<Attraction> attractions;

    public Park(int parkSize, List<Attraction> attractions) {
        this.parkSize = parkSize;
        this.attractions = attractions;
        if (parkSize < attractions.size())
            System.out.println("В парке с размером = " + parkSize + " не может быть " + attractions.size() + " аттракционов");
    }

    public void addAttraction(Park.Attraction attraction) {

        if (parkSize == this.attractions.size()) {
            return;
        }
        this.attractions.add(attraction);
    }

    public void getInfoAboutAttractions() {
        System.out.println("Информация об аттракционах в парке");
        this.attractions.forEach(attraction -> System.out.println("Аттракцион: " + attraction.name +
                "Время работы: " + attraction.workingTime + " Стоимость = " + attraction.cost));
    }

    static class Attraction {

        private final String name;
        private final String workingTime;
        private final int cost;

        public Attraction(String name, String workingTime, int cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }
    }

}