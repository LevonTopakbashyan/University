package TestingPackage;

public class Students {

    private String name;
    private int fNom;
    private double avrMark;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getfNom(){
        return this.fNom;
    }

    public void setfNom(int fNom){
        this.fNom = fNom;
    }

    public double getAvrMark(){
        return this.avrMark;
    }

    public void setAvrMark(double avrMark){
        this.avrMark = avrMark;
    }

    public Students(){
        this.fNom = 0;
        this.name = null;
        this.avrMark = 0;
    }

    public Students(String name,int fNom,double avrMark){
        this.name = name;
        this.fNom = fNom;
        this.avrMark = avrMark;
    }


    public void Talk(){
        System.out.println("Hi");
    }


    @Override
    public String toString(){
        return String.format("Student %s, fNom %d, %.2f avr Mark",
                this.getName(),
                this.getfNom(),
                this.getAvrMark());
    }



}
