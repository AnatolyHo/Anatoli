package by.ahotsko.inter;

public class Tolik implements Eat {
    String name;
    int age;

    public Tolik(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я Толик " +
                " меня зовут " + name + "\n" +
                " мне " + age +
                " лет.";
    }
}
