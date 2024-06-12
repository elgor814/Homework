public class Animal2 {

    String name;
    private int distance;
    // private int runLimit;
    //private int swimlimit;
    private static int animalCount = 0;


    public Animal2() {
    }

    public static int getAnimal2Count() {
        return animalCount;
    }

    public Animal2(String name) {
        this.name = name;
        animalCount++;
    }


    public void animalInfo() {
        System.out.println("Животное " + name);
    }


    public void run(int distance) {
        System.out.println(name + "пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name + "проплыл " + distance + " метров");
    }


}

