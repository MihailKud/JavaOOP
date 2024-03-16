package units;

// копейщик
public class Spearman extends Person {
    protected Integer spearNumber; // количество копий у копейщика

    public Spearman(String name, int x, int y){
        super(name, x, y);
        spearNumber = 1;
        initiative =2;
    }
    @Override
    public void step(){

    }

}
