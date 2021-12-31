package by.ahotsko.inter;

public class Plant implements Eat {

    String name;
    int age;

    public Plant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Я растеньице " +
                " меня зовут " + name + '\n' +
                " мне  " + age +
                "  лет.";
    }}