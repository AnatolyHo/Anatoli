package by.ahotsko.inter;

public class Bird implements Eat {
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я птичка " +
                " меня зовут " + name + '\n' +
                " мне " + age +
                " года. ";
    }
}
