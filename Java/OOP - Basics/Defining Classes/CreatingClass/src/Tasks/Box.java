package Tasks;

public class Box {

    private double length;
    private double width;
    private double height;

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public Box(double length, double width, double height){
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    //2× h × W + 2× L × h + 2× w × L.

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f \nLateral Surface Area - %.2f \nVolume – %.2f",
                2*this.height*this.width + 2*this.length*this.height + 2*this.width*this.length,
                this.width,
                this.width*this.length*this.height);
    }
}
