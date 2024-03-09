package units;

import java.util.Random;

/*
ЗАДАНИЕ
*/
public abstract class Person {
    protected String name; // имя
    protected int health; // Здоровье
    protected int power; // Сила
    protected int age; // Возраст
    protected int pointX; // местоположение на плоскости, координата X (диапазон от 0 до 30)
    protected int pointY; //местоположение на плоскости, координата Y (диапазон от 0 до 30)

    public Person(String name){
        this.name = name;
        this.health = 100;
        this.power = 10;
        this.age = 20;
        this.pointX = new Random().nextInt(31);
        this.pointY = new Random().nextInt(31);
    }
    // метод чтения имени персонажа, возвращает имя (тип String)
    public String getNamePerson(){
        return this.name;
    }
}
