import units.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> commandWhite = new ArrayList<Person>(); // коллекция - первая команда
        ArrayList<Person> commandBlack = new ArrayList<Person>(); // коллекция - вторая команда
        int temp;
        // формируем первую команду
        for (int i = 0; i < 10; i++) {
            temp = new Random().nextInt(0, 4);
            if (temp == 0) {
                commandWhite.add(new Peasant(outName(), 1, 0)); // добавляем крестьянина
            } else if (temp == 1){
                commandWhite.add(new Magician(outName(), 2, 0)); // добавляем колдуна
            } else if (temp == 2){
                commandWhite.add(new Crossbowman(outName(), 1, 0)); // добавляем арбалетчика
            } else if (temp == 3){
                commandWhite.add(new Spearman(outName(), 3, 0)); // добавляем копейщика
            }
            System.out.println(commandWhite.get(i).getClass().getName() + " " + commandWhite.get(i).getNamePerson());
        }
        // формируем вторую команду
        for (int i = 0; i < 10; i++) {
            temp = new Random().nextInt(0, 4);
            if (temp == 0) {
                commandBlack.add(new Peasant(outName(), 1, 9)); // добавляем крестьянина
            } else if (temp == 1){
                commandBlack.add(new Sniper(outName(), 1, 9)); // добавляем снайпера
            } else if (temp == 2){
                commandBlack.add(new Monk(outName(), 2, 9)); // добавляем монаха
            } else if (temp == 3){
                commandBlack.add(new Outlaw(outName(), 0, 9)); // добавляем разбойника
            }
            System.out.println(commandBlack.get(i).getClass().getName() + " " + commandBlack.get(i).getNamePerson());
        }



        // тестирование на правильное определение ближайшего персонажа из команды врага и его атаки
        //Crossbowman testValue = new Crossbowman("testUnit", 3, 3);
        //commandWhite.add(testValue);
        //System.out.println("------------------------------------");
        //System.out.println(testValue.getNamePerson());
        //System.out.println("Near " + testValue.theClosestEnemy(commandBlack, commandWhite).getNamePerson());
        //testValue.step(commandWhite, commandBlack);
        //System.out.println(testValue.theClosestEnemy(commandBlack, commandWhite).health);
    }

    // функция генерации случайного имени длиной 6 символов
    public static String outName(){
        String tempString = "";
        for (int j = 1; j <= 6; j++){
            int kodChar = new Random().nextInt(97, 123);
            tempString = tempString + (char)kodChar;
        }
        return tempString;
    }
}
