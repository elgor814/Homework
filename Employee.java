class Employee {
    String name;
    String jobTitle;
    String eMail;
    long phoneNum;
    int salary;
    int age;

    public Employee(String name, String jobTitle, String eMail, long phoneNum, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    // метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Сотрудник: " + name + " " + jobTitle + " " + eMail + " " + phoneNum + " " + salary + age);
    }


    public static void main(String[] args) {
        // создание объекта
        Employee Alex = new Employee("Alex", "tester", "alextest@gmail.com", 1234567890, 2000, 30);
        Employee Alex1 = new Employee("Alex1", "tester", "alex1test@gmail.com", 1234567890, 3000, 50);
        //вызов метода вывода
        Alex1.displayInfo();
        Alex.displayInfo();

        Employee[] arrayEmployee = new Employee[5]; // объявляем массив объектов

        arrayEmployee[0] = new Employee("Ivanov Ivan", "Инженер", " ivivan@mailbox.com ", 892312312, 30000, 30);
        arrayEmployee[1] = new Employee("Semenov Semen", "Инженер", "semen@mailbox.com ", 811111111, 30000, 31);
        arrayEmployee[2] = new Employee("Sergeev Sergei", "старший Инженер", " Sergeev@mailbox.com ", 822222222, 40000, 32);
        arrayEmployee[3] = new Employee("Leonidov Leonid", "старший Инженер", " Alexeev@mailbox.com ", 833333333, 40000, 33);
        arrayEmployee[4] = new Employee("Alekseev Aleksei", "ведущий Инженер", "leonid@mailbox.com ", 844444444, 30000, 45);
        arrayEmployee[3].displayInfo(); // вывод в консоль информацию об объекте из массива
    }
}
