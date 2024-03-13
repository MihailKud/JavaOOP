import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> commandWhite = new ArrayList<Person>();
        ArrayList<Person> commandBlack = new ArrayList<Person>();
        int temp;
        // формируем первую команду
        for (int i = 0; i < 10; i++) {
            temp = new Random().nextInt(0, 4);
            if (temp == 0) {
                commandWhite.add(new Peasant(outName())); // добавляем крестьянина
            } else if (temp == 1){
                commandWhite.add(new Magician(outName())); // добавляем колдуна
            } else if (temp == 2){
                commandWhite.add(new Crossbowman(outName())); // добавляем арбалетчика
            } else if (temp == 3){
                commandWhite.add(new Spearman(outName())); // добавляем копейщика
            }
            System.out.println(commandWhite.get(i).getClass().getName() + " " + commandWhite.get(i).getNamePerson());
        }
        // формируем вторую команду
        for (int i = 0; i < 10; i++) {
            temp = new Random().nextInt(0, 4);
            if (temp == 0) {
                commandBlack.add(new Peasant(outName())); // добавляем крестьянина
            } else if (temp == 1){
                commandBlack.add(new Sniper(outName())); // добавляем снайпера
            } else if (temp == 2){
                commandBlack.add(new Monk(outName())); // добавляем монаха
            } else if (temp == 3){
                commandBlack.add(new Outlaw(outName())); // добавляем разбойника
            }
            System.out.println(commandBlack.get(i).getClass().getName() + " " + commandBlack.get(i).getNamePerson());
        }

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

     //   Person unit1 = new Peasant("Peasant01");
     //   Person unit2 = new Outlaw("Outlaw01");
     //   Person unit3 = new Sniper("Sniper01");
     //   Person unit4 = new Magician("Magician01");
     //   Person unit5 = new Spearman("Spearman01");
     //   Person unit6 = new Crossbowman("Crossbowman01");
     //   Person unit7 = new Monk("Monk01");

     //   System.out.println(unit1.getNamePerson());
     //   System.out.println(unit2.getNamePerson());
     //   System.out.println(unit3.getNamePerson());
     //   System.out.println(unit4.getNamePerson());
     //   System.out.println(unit5.getNamePerson());
     //   System.out.println(unit6.getNamePerson());
     //   System.out.println(unit7.getNamePerson());