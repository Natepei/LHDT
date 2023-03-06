package bai3;
public class Square extends Rectangle{
    private double side;
    public Square(){
    }public Square(double side, double width, double lenght, String color, boolean filled){
        super(width, lenght, color, filled);
        this.side = side;
    }public double getSide(){
        return side;
    }public void setSide(double side){
        this.side = side;
    }
}
