package units;

// разбойник
public class Outlaw extends Person{

    public Outlaw(String name){
        super(name);
    }
    // действие побить
    public void beat(Person person){
        person.health = person.health - 1;
    }
    // действие ограбить
    public void rob(Person person) {
        if (person instanceof Peasant){
            ((Peasant) person).woodNumber -= 1;
        }
        if (person instanceof Spearman){
            ((Spearman) person).spearNumber -= 1;
        }
        if (person instanceof Crossbowman){
            ((Crossbowman) person).arrowNumber -= 1;
        }
    }
}
