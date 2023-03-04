package labb4;
public class Kethua {
    public static void main(String[] args){
        Circle cir = new Circle(10,"mau hong");
        Cylinder cyl = new Cylinder(15,"mau tim",5);
        System.out.println("Ban kinh hinh tron: "+cir.getRadius());
        System.out.println("Mau sac cua hinh tron la: "+cir.getColer());
        System.out.println("Ban kinh hinh tru la: "+cyl.getRadius());
        System.out.println("Mau sac cua hinh tru la: "+cyl.getColer());
        System.out.println("Chieu cao cua hinh tru la: "+cyl.getHeight());
        System.out.println("Volume la: "+cyl.getVolume());
        System.out.println("Area la: "+cir.getArea());
    }
}
