package units;

//арбалетчик
public class Crossbowman extends Person {
    protected Integer arrowNumber; // количество стрел у арбалетчика

    public Crossbowman(String name){
        super(name);
        arrowNumber = 1;
    }

}
