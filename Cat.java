class Cat extends Animal2 {

    private static int catCount = 0;


    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Котик " + name + " пробежал" + distance + " метров. ");
        } else {
            System.out.println(" Котик " + name + " не может пробежать такое расстояние.");
        }
    }


    @Override
    public void swim(int distance) {
        System.out.println(" Коты не умеют плавать ");

    }
}

