import java.util.Scanner;

public class MyKitchen {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String nameOfFood = console.nextLine();
        int measureOfFood = Integer.parseInt(console.nextLine());

        DailyMenu dish = new DailyMenu(
                new Dish(nameOfFood,measureOfFood),
                new Dish(nameOfFood,measureOfFood),
                new Dish(nameOfFood,measureOfFood));

        System.out.println(dish);


        WeeklyMenu menu = new WeeklyMenu(3);

        System.out.println(menu);

    }
}
