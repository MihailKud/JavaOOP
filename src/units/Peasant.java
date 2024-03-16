package units;

//крестьянин, будет выполнять функцию производства оружия (на первом этапе)
public class Peasant extends Person {
    protected Integer spearNumber; // количество заготовленных копий у крестьянина
    protected Integer arrowNumber; // количество заготовленных стрел для арбалета
    protected Integer woodNumber; //количество заготовленной крестьянином древесины для изготовления стрел и копий
    protected Integer ironNumber; //количество железа для наконечеников стрел и копий

    public Peasant(String name, int x, int y){
        super(name, x, y);
        spearNumber = 0;
        arrowNumber = 0;
        woodNumber = 10;
        ironNumber = 10;
        initiative = 0;
    }
    // действие заготовка древесины
    public void harvestingOfWood(){
        this.woodNumber = this.woodNumber + 1;
    }
    // действие заготовка железа
    public void harvestingOfIron(){
        this.ironNumber = this.ironNumber + 1;
    }
    // действие производство стрелы
    public void arrowProduction(){
        if (this.woodNumber > 1 & this.ironNumber > 0) {
            this.arrowNumber = this.arrowNumber + 1;
            this.woodNumber = this.woodNumber - 2;
            this.ironNumber = this.ironNumber - 1;
        }
    }
    // действие производство копья
    public void spearProduction(){
        if (this.woodNumber > 2 & this.ironNumber > 0) {
            this.spearNumber = this.spearNumber + 1;
            this.woodNumber = this.woodNumber - 3;
            this.ironNumber = this.ironNumber - 1;
        }
    }
    //действие передать стрелу арбалетчику
    public void transferArrow(Crossbowman person){
        if (this.arrowNumber > 0) {
            this.arrowNumber = this.arrowNumber - 1;
            person.arrowNumber = person.arrowNumber + 1;
        }
    }
    //действие передать копье копейщику
    public void transferSpear(Spearman person){
        if (this.spearNumber > 0) {
            this.spearNumber = this.spearNumber - 1;
            person.spearNumber = person.spearNumber + 1;
        }
    }
    @Override
    public void step(){

    }
}
