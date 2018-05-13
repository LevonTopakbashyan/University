public class Dish {
    private String name;
    private int measure;

    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    public int getMeasure(){
        return measure;
    }

    public void setMeasure(int measure){
        if (measure >= 100 && measure <= 200){
            this.measure = measure;
        }
    }

    public Dish(String name, int measure){
        this.name = name;
        setMeasure(measure);
    }

    public String toString(){
        return "Dish [name = " + name + ", measure = " + measure + "]";
    }

    public Dish(){

    }
}
