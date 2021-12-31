package by.ahotsko.hometask;

public abstract class Animal {
    private String name;
    private int age;
    private String eatab;//мясо
    public abstract void talk();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEatab() {
        return eatab;
    }

    public void setEatab(String eatab) {
        this.eatab = eatab;
    }

    public Animal(String name, int age, String eatab) {
        this.name = name;
        this.age = age;
        this.eatab = eatab;
    }
}
