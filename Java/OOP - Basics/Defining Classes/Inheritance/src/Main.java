public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Levo",15);

        System.out.println(cat.toString());

        Cat cat2 = new Cat("Zdravko",19);

        //cat2.setLegs(34);

        cat2.Sleep();
        System.out.println(cat2.toString());
    }
}
