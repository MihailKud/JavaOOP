import units.*;

public class Main {
    public static void main(String[] args) {
        Person unit1 = new Peasant("Peasant01");
        Person unit2 = new Outlaw("Outlaw01");
        Person unit3 = new Sniper("Sniper01");
        Person unit4 = new Magician("Magician01");
        Person unit5 = new Spearman("Spearman01");
        Person unit6 = new Crossbowman("Crossbowman01");
        Person unit7 = new Monk("Monk01");

        System.out.println(unit1.getNamePerson());
        System.out.println(unit2.getNamePerson());
        System.out.println(unit3.getNamePerson());
        System.out.println(unit4.getNamePerson());
        System.out.println(unit5.getNamePerson());
        System.out.println(unit6.getNamePerson());
        System.out.println(unit7.getNamePerson());
    }
}