package by.ahotsko.hometask;

public class Wolf extends Animal{
        String north;

    public Wolf(String name, int age, String eatab, String north) {
        super(name, age, eatab);
        this.north = north;
    }

    @Override
    public void talk() {
        System.out.println(" Меня зовут "+getName()+" мне уже "+getAge()+" лет "+"и я по ночам вою ");
    }

    @Override
    public void eat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " я живу там где много пищи " +
                " люблю " + north + '\n' +
                " и леса.";
    }
}
