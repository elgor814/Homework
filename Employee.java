public class Employee {
    private String name;
    private String jobTitle;
    private String eMail;
    private long phoneNum;
    private int salary;
    private int age;

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
}
