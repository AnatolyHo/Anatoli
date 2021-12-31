package by.ahotsko.hometask;

public class Fox  extends Animal{
    String tricky;//хитрая.
    public Fox(String name, int age, String eatab, String tricky) {
        super(name, age, eatab);
        this.tricky = tricky;
    }



    @Override
    public void talk() {
        System.out.println(toString());
    }

    @Override
    public void eat() {
        System.out.println( " Я люблю "+ getEatab()+","+ " я зверь -"+tricky+".");
    }

    @Override
    public String toString() {
        return " Меня зовут " +getName()+","+ " мне "+
                + getAge()+" года,"+'\n'+
                " я  говорю тонко и тихо.";
    }

}
