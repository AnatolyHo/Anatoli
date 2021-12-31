package by.ahotsko.inter;

public class Avto implements Eat{
    String name;
    int age;

    public Avto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я автомобиль " +
                " мое имя " + name + '\n' +
                " мне " + age +
                " лет.";
    }
}
