package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Levo");

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("Levo");
        list.add("Kris");
        list.add("Petro");
        list.add("Alex");

        boolean isContain = list.contains("Kris");
        System.out.println(isContain);

        //list.remove(2);
       // list.get(6001);

        //System.out.println(name);

        System.out.println(list);
    }
}
