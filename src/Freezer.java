public class Freezer {
    private String name;
   private double temp;

    private Freezer(String name, double temp){
        this.name=name;
        this.temp=temp;
    }

    private String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getTemp(){
        return temp;
    }

    public  void setTemp(double temp){
        this.temp=temp;
    }

    @Override
    public String toString (){
        return "Freezer{" +
                "temp=" + temp + '\''+
                '}';
    }
    }

