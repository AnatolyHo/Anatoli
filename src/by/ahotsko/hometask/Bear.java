package by.ahotsko.hometask;

public class Bear extends Animal {
    String rare;//редкий зверь
    String  honey;//мед
    public Bear(String name, int age, String eatab, String rare, String honey) {
        super(name, age, eatab);
        this.rare = rare;
        this.honey = honey;
    }

    @Override
    public void talk() {
        System.out.println(" Меня зовут " +getName()+","+ " мне "+getAge()+" лет, " + " я умею рычать. ");
    }

    @Override
    public void eat() {
        System.out.println( " я  люблю "+getEatab()+"," + " зверь я  "+rare+","+ " я люблю "+honey+".");
    }


    }


