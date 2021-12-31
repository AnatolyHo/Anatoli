package by.ahotsko.hometask;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger ("Барсик", 11,"мясо");
        tiger.talk();
        tiger.eat();
        Wolf wolf = new Wolf(" Тишка ",5," мясо ","север");
        wolf.talk();
        wolf.eat();
        Bear bear = new Bear("Потап",7,"мясо","редкий","мёд");
        bear.talk();
        bear.eat();
        Fox fox = new Fox(" Рижик ",4," мясо "," хитрый ");
        fox.talk();
        fox.eat();
    }
}
