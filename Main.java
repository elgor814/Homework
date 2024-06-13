public class Main {
    public static void main(String[] args) {

        Bowl bowl = new Bowl(2); // создаем миску
        Cat[] cats = new Cat[3]; // Создаем массив котов
        cats[0] = new Cat("Котя");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Том");


        Dog dog = new Dog(" Бобик");
        //Cat cat = new Cat(" Мурзик");

        Dog dog2 = new Dog(" Шарик");
        //Cat cat2 = new Cat(" Васька");
        Dog dog3 = new Dog(" Джек");
        //Cat cat3 = new Cat(" Басик");


        dog.run(400);
        dog.swim(5);

        for (Cat cat : cats) {
            cat.run(150); // Вызываем метод run для каждого кота в массиве
            cat.swim(10); // Вызываем метод swim для каждого кота в массиве
        }

        for (Cat cat : cats) {
            cat.eatFromBowl(bowl, 5);// кот хочет съесть 5 еды из миски
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " голоден: " + cat.isHungry());
        }

        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Общее Количество животных: " + Animal.getAnimalCount());

    }
}