package TestingPackage;

public class Person  extends Students {


    private int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }


    @Override
    public void Talk(){
        System.out.println("Meow");
    }
}
