public abstract class Animal {

    String name;
    private int distance;

    private static int animalCount = 0;


    public Animal() {
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public Animal(String name) {
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

