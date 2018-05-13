package TestingPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Students student = new Students("levo",1212,4.5);

        Person person = new Person();

        //student.setfNom(121216169);
        //student.setName("Levo");
        //student.setAvrMark(5.50);

        person.setAge(20);
        person.setfNom(121215);

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String color = console.nextLine();


        Animal animal = new Animal(name, age, color);

        animal.Talk();

        System.out.println(animal.toString());

        //System.out.println(student.toString());


    }
}