package by.ahotsko.oop;

public class Person {
    //Все классы в Java наследуються от класса Object
     String name;//поля класса,состояние нашего обьекта
    int age;

    public Person() {

    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //public String getName(){//поведения нашего обьекта -это методы
    // return name;
    public void printToConsole() {
        System.out.println(name + '\n' + age);
        // return;// можно так он заканчивает и выходит из метода
        // Конструкторы :
        //Они выполняют инициализацию нашего обьекта !!!
        // public Person(){ // работает по умолчанию
        //Модификатор доступа (public)и имя класса(Person)!
        // обьект - это копия  нашего класса!
        //Класс - это наш шаблон!
        //Шаблоном и описанием являеться класс

    }
}

