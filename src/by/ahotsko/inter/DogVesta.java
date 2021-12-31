package by.ahotsko.inter;

public class DogVesta implements Eat {
    String name;
    int age;

    public DogVesta(String name, int age) {
        this.name = name;
        this.age = age;
}

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Я собака " +
                " меня звать " + name + '\n' +
                " мне " + age +
                " лет. ";
    }
}

