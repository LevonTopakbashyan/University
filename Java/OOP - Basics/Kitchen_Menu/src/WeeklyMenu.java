import java.lang.reflect.Array;

public class WeeklyMenu {
    private DailyMenu[] menu;

    public WeeklyMenu(){
        this(7);
    }

    public WeeklyMenu(int count){
        if (count > 0 && count < 8){
            menu = new DailyMenu[count];
        }
    }

    public DailyMenu[] getMenu(){
        return menu;
    }

    public void setMenu(DailyMenu[] menu) {
        this.menu = menu;
    }

    public String toString(){
        return "Weekly menu [menu = " + (menu) + "]";
    }

}
