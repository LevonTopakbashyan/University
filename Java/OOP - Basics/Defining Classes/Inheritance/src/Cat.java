public class Cat extends Animal {

    public Cat(String name, int legs){
        super(name, legs);
    }

    @Override
    public void Sleep(){
        System.out.println("I am awake");
    }

    @Override
    public String toString() {
        return String.format("%s name. %d legs",this.name,this.legs);
    }
}
