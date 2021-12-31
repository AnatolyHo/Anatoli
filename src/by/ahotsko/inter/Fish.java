package by.ahotsko.inter;

public class Fish implements Eat {
    String name;
    int age;


    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я рыба " +
                " с именем " + name + '\n' +
                " мне " + age +
                " год. ";
    }
}
