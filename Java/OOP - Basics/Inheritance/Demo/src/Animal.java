public class Animal {

    private String name;
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String eat(){
        return "Eating...";
    }

    @Override
    public String toString() {
        return String.format("%s is the name. %d years old",name,age);
    }
}
