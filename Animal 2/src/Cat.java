class Cat extends Animal {

    private static int catCount = 0;

    private boolean isHungry;

    public Cat(String name) {
        super(name);
        isHungry = true;
        catCount++;
    }

    public void eatFromBowl (Bowl bowl, int amount){
        if (bowl.eat(amount)){
            System.out.println(name + " покушал из миски ");
            isHungry = false;
        }
        else{
            System.out.println("В миске мало еды, это унизительно для кота и он не будет кушать");
        }
    }
    public boolean isHungry() {
        return isHungry;
    }
    public String getName() {
        return name;
    }


    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Котик " + name + " пробежал " + distance + " метров. ");
        } else {
            System.out.println(" Котик " + name + " не может пробежать такое расстояние.");
        }
    }


    @Override
    public void swim(int distance) {
        System.out.println(" Коты не умеют плавать ");

    }
}

