package units;

import java.util.ArrayList;

//арбалетчик
public class Crossbowman extends Person {
    protected Integer arrowNumber; // количество стрел у арбалетчика

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
        arrowNumber = 1;
        initiative = 3;
    }

    // метод определения первого ближайшего противника
    // в качестве аргумента передается перечень всех действующих команд
    // метод возвращает первый ближайший обнаруженный персонаж в команде противника,
    public Person theClosestEnemy(ArrayList<Person> arrPersonWhite, ArrayList<Person> arrPersonBlack){
        ArrayList<Person> arrPerson;
        if (arrPersonWhite.contains(this)){
            arrPerson = arrPersonBlack;
        } else{
            arrPerson = arrPersonWhite;
        }
        Double[] tempArr = new Double[arrPerson.size()];
        for (int i = 0; i < arrPerson.size(); i++){
            tempArr[i] = this.position.distance(this.position, arrPerson.get(i).position);
        }
        Person tempPerson = arrPerson.get(0);
        double min = tempArr[0];
        for (int j = 1; j < arrPerson.size(); j++){
            if (tempArr[j] < min){
                min = tempArr[j];
                tempPerson = arrPerson.get(j);
            }
        }
        return tempPerson;
    }

    public void step(ArrayList<Person> White, ArrayList<Person> Black) {
        if (this.aliveAndArrows()) {
            this.attack(theClosestEnemy(White, Black));
        }
    }
    @Override
    public void step(){

    }


    // действие "атака". Действие уменьшает значение поля health (здоровье) атакуемого на 5 единиц.
    // Сложные формулы (значение урона зависит от силы атакующего и т.п.) на данном этапе не реализовывал.
    // количество стрел уменьшается на 1
    public void attack(Person attackPerson){
        attackPerson.health = attackPerson.health - 5;
        this.arrowNumber -= 1;
    }


    // функция проверки "жив" и "есть стрелы"
    Boolean aliveAndArrows(){
        return (this.health > 0) & (this.arrowNumber > 0);
    }
}
