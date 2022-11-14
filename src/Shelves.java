public class Shelves {
    private String name;
    private double fruit;
    private double countOfShelves;


    private Shelves(String name, double fruit, double countOfShelves) {
        this.name = name;
        this.fruit = fruit;
        this.countOfShelves = countOfShelves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFruit() {
        return fruit;
    }

    public void setFruit(double fruit) {
        this.fruit = fruit;
    }

    public double getCountOfShelves() {
        return countOfShelves;
    }

    public void setCountOfShelves(double countOfShelves) {
        this.countOfShelves = countOfShelves;
    }
    @Override
    public String toString (){
        return "Shelves{" +
               "fruit=" + fruit + '\'' +
                "countOfShelves=" + countOfShelves + '\'' +
                '}';

    }

    }

