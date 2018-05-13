public class WesternTown {

    private String town;
    private int yearOfEstablished;
    private int bars;
    private int sheriffs;

    public void setTown(String town){
        this.town = town;
    }

    public String getTown(){
        return this.town;
    }

    public void setYearOfEstablished(int yearOfEstablished){
        this.yearOfEstablished = yearOfEstablished;
    }

    public int getYearOfEstablished(){
        return this.yearOfEstablished;
    }

    public void setBars(int bars){
        this.bars = bars;
    }

    public int getBars(){
        return this.bars;
    }

    public void setSheriffs(int sheriffs){
        this.sheriffs = sheriffs;
    }

    public int getSheriffs(){
        return this.sheriffs;
    }

    public WesternTown(String town, int yearOfEstablished, int bars, int sheriffs){
        this.town = town;
        this.yearOfEstablished = yearOfEstablished;
        this.bars = bars;
        this.sheriffs = sheriffs;
    }

    public WesternTown(){
        this("Wester America", 1850, 2, 1);
    }

}
