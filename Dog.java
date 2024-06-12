class Dog extends Animal2 {

    private static int distance;
    private static int dogCount = 0;


    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }


    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Пёс " + name + " пробежал" + distance + " метров. ");
        } else {
            System.out.println("Пёс " + name + " не может пробежать такое расстояние.");
        }
    }


    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " метров. ");
        } else {
            System.out.println(name + " не может проплыть такое расстояние.");
        }
    }

}