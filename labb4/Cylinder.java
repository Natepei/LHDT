package labb4;
public class Cylinder extends Circle{
    private double Height;
    public Cylinder(){}
    public Cylinder(double Radius, String Color, double Height){
        super(Radius, Color);
        this.Height=Height;
    }public double getHeight(){
        return Height;
    }public void setHeight(double Height){
        this.Height=Height;
    }public double getVolume(){
        return getArea()*Height;
    }
}
