
public class Animal {

     protected String name;
     protected int legs;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setLegs(int legs) {
        this.legs = legs;
    }

    public void Sleep(){
        System.out.println("I am sleeping. Ask me later");
    }

    public Animal(){

    }

    public Animal(String name, int legs){
        this.setName(name);
        this.setLegs(legs);
    }
}
