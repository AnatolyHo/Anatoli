package by.ahotsko.inter;

public class BateryPhone implements Eat {
    String name;
    int age;

    public BateryPhone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Я батарея " +
                " меня зовут " + name + '\n' +
                " мне " + age +
                " лет.";
    }}
