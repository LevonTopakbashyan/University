package ArrayList;

public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Person's name is %s",this.name);
    }

}
