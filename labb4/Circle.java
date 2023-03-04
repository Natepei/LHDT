package labb4;
public class Circle {
    double Radius;
    String Color;
    public Circle(){
        super();
    }public Circle(double Radius, String Color){
        super();
        this.Color=Color;
        this.Radius=Radius;
    }public double getRadius(){
        return Radius;
    }public void setRadius(double Radius){
        this.Radius=Radius;
    }public String getColer(){
        return Color;
    }public void setColor(String Color){
        this.Color=Color;
    }public String toStringg(){
        return "Circle[Radius, Color]";
    }public double getArea(){
        return Radius*Radius*Math.PI;
    }
}
