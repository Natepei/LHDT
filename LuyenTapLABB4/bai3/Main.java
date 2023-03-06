package bai3;
public class Main {
    public static void main(String[] args){
        Shape S = new Shape();
        Circle c = new Circle();
        Square s = new Square(8,8,8,S.getColor(),S.isFilled());
        Rectangle r = new Rectangle();
        float dtht,cvht,dthv,cvhv,dthcn,cvhcn;
        dtht = (float) ((c.getRadius()*c.getRadius())*c.getPI());
        cvht = (float) ((2*c.getRadius())*c.getPI());
        dthv = (float) (2*s.getSide());
        cvhv = (float) (4*s.getSide());
        dthcn = (float) (r.getLenght()*r.getWidth());
        cvhcn = (float) ((r.getLenght()+r.getWidth())*2);
        System.out.println("Hinh tron");
        System.out.println("Dien tich = "+dtht);
        System.out.println("Chu vi = "+cvht);
        System.out.println("\n");
        System.out.println("Hinh vuong");
        System.out.println("Dien tich = "+dthv);
        System.out.println("Chu vi = "+cvhv);
        System.out.println("\n");
        System.out.println("Hinh chu nhat");
        System.out.println("Dien tich = "+dthcn);
        System.out.println("Chu vi = "+cvhcn);
    }
}
//Trong biểu đồ trên có tất cả bao nhiêu quan hệ thừa kế (is-a)?
//Có 2 lớp kế thừa là đa cấp và phân cấp

//Tại sao lớp Circle có thể thừa kế lớp Shape mà không phải lớp Rectangle?
//Vì đó là kế thừa phân cấp, chỉ cho nhiều lớp con kế thừa lớp cha chứ không thể kế thừa các lớp con với nhau

//Biến PI này có nên để final không?
//Yêu cầu: Không vì gán final thì không thể thay đổi giá trị
