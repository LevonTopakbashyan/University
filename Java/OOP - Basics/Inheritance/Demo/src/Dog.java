public class Dog extends Animal implements Walkable{

    public Dog(String name, int age) {
        super(name, age);
        System.out.println(super.toString());
    }

    public String bark(){
        return "Barking...";
    }


    @Override
    public String walk() {
        return "Walking...";
    }
}
