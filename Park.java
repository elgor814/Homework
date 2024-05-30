public class Park {

    public static class Attraction {   // внутренний класс аттракционы
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) { //конструктор аттракциона
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public Attraction() {
        }

        // Методы доступа к полям аттракционов
        public String getName() {
            return name;
        }

        public String getWorkTime() {
            return workTime;
        }

        public int getCoast() {
            return price;
        }

    }

    public static void main(String[] args) {
        Park.Attraction attraction = new Attraction();
    }
}