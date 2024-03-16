package units;

import static java.lang.Math.sqrt;

public class LocationOfThePosition {
    protected int x;
    protected int y;

    // метод определения расстояния между двумя позициями
    public Double distance(LocationOfThePosition a, LocationOfThePosition b){
        return sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}
