package labb3;
import java.util.Scanner;
public class tinhvector {
    public static void main(String[] args) {
        vector v = new vector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        double x = scanner.nextDouble();
        System.out.println("Nhap y: ");
        double y = scanner.nextDouble();
        System.out.println("Nhap z: ");
        double z = scanner.nextDouble();
        System.out.println("Nhap k: ");
        double k = scanner.nextDouble();
        v.setx(10);
        v.sety(20);
        v.setz(30);
        v.setcongvector(x + v.getx());
        v.setcongvector(y + v.gety());
        v.setcongvector(z + v.getz());
        v.settruvector(x - v.getx());
        v.settruvector(y - v.gety());
        v.settruvector(z - v.getz());
        v.setnhanmothangso(k*x);
        v.setnhanmothangso(k*y);
        v.setnhanmothangso(k*z);
        v.setnhanvohuong(x * v.getx() + y * v.gety() + z * v.getz());
        System.out.println("Cong Vector: "+v.getcongvector());
        System.out.println("Tru Vector: "+v.gettruvecor());
        System.out.println("Nhan Mot Mang hang so: "+v.getnhanmothangso());
        System.out.println("Nhan Vo Huong: "+v.getnhanvohuong());
    }
}
