package bai3;
public class Circle extends Shape{
    private double radius = 1.0;
    private double PI = 3.14;
    public Circle(){
    }public Circle(double radius, double PI, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
        this.PI = PI;
    }public double getRadius(){
        return radius;
    }public void setRadius(double radius){
        this.radius = radius;
    }public double getPI(){
        return PI;
    }public void setPI(double PI){
        this.PI = PI;
    }
}
