package units;

//снайпер
public class Sniper extends Person {

    public Sniper(String name, int x, int y){
        super(name, x, y);
        initiative = 2;
    }

    @Override
    public void step(){

    }
}
