//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(" Бобик");
        Cat cat = new Cat(" Мурзик");

        Dog dog2 = new Dog(" Шарик");
        Cat cat2 = new Cat(" Васька");
        Dog dog3 = new Dog(" Джек");
        Cat cat3 = new Cat(" Басик");


        dog.run(400);
        dog.swim(5);

        cat.run(150);
        cat.swim(10);


        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Общее Количество животных: " + Animal2.getAnimal2Count());
    }

}