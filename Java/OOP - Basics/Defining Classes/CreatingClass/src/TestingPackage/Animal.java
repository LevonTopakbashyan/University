package TestingPackage;

public class Animal {

    private String name;
    private int age;
    private String color;

    public void Talk(){
        System.out.println("Hi");
    }

    private void setName(String name){
        this.name = name;
    }

    private void setAge(int age){
        this.age = age;
    }

    private void setColor(String color){
        this.color = color;
    }

    public Animal(String name, int age, String color){
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    @Override
    public String toString() {
        return String.format("%s. %d years old. %s color",this.name,this.age,this.color);
    }
}
