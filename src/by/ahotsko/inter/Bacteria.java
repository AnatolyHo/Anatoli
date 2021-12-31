package by.ahotsko.inter;

public class Bacteria implements Eat {
    String name;
     int age;

    public Bacteria(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Я бактерия " +
                " меня зовут " + name + '\n' +
                " мне " + age +
                " лет. ";
    }
}
