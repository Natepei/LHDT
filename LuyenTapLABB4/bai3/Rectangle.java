package bai3;
public class Rectangle extends Shape{
    private double width = 1.0;
    private double lenght = 1.0;
    public Rectangle(){
        super();
    }public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }public double getWidth(){
        return width;
    }public void setWidth(double width){
        this.width = width;
    }public double getLenght(){
        return lenght;
    }public void setLenght(double lenght){
        this.lenght = lenght;
    }
}
