package by.ahotsko.hometask;

public class Tiger extends Animal {
    public Tiger(String name, int age, String eatab) {
        super(name, age, eatab);
    }

    @Override
    public void talk() {
        System.out.println(" Меня зовут " + getName() +" Мне " + getAge()+" лет ");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю " + getEatab());
    }
}
