public class Villager {

    enum Nose {Broken, Healthy}

    private int legs;
    private int arms;
    private int eyes;
    private Nose noseType;
    private String horseName;
    private String name;
    private String whiskey;


    public Villager(){
        this.legs = 2;
        this.arms = 2;
        this.eyes = 2;
        this.noseType = Nose.Healthy;
        this.horseName = "Jack";
        this.name = "Levo";
        this.whiskey = "Jameson";
    }

    public Villager(int legs, int arms, int eyes, Nose noseType, String horseName, String name, String whiskey){
        this.legs = legs;
        this.arms = arms;
        this.eyes = eyes;
        this.noseType = noseType;
        this.horseName = horseName;
        this.name = name;
        this.whiskey = whiskey;
    }

    public String getName(){
        return this.name;
    }

    public String getWhiskey(){
        return this.whiskey;
    }

}
