package by.ahotsko.inter;

public class Main{
    public static void main(String[] args) {
        Eat fish =new Fish("Кукусик",1);
        Eat bird = new Bird("Сойка",2);
        Eat dogVesta = new DogVesta("Веста",6);
        Eat tolik = new Tolik("Чаловек",47);
        Eat plant = new Plant("Дуб",100);
        Eat bateryPhone = new BateryPhone("Энерджи",2);
        Eat bacteria =new Bacteria("Стрептококк",1);
        Eat avto = new Avto("Фольксваген",11);
        Eat [] mas = {fish,bird,dogVesta,tolik,plant,bateryPhone,bacteria,avto};
        for (Eat object : mas) {
            object.eat();

        }
    }
}
