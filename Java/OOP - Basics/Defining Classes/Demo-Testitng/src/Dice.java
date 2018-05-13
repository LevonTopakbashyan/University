public class Dice {
    private int sides;

    public Dice(){
        this.sides = 6;
    }

    public Dice(int sides){
        this.sides = sides;
    }

    public int getSides(){
        return this.sides;
    }
}
