package BaiTap;
import java.util.Scanner;
public class GiaiPTB1 {
    public static void giaiptb1() {
        float a,b;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a: ");
            a = scanner.nextFloat();
            System.out.print("Nhap b: ");
            b = scanner.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -b/a;
            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
        }
    }public static void main(String[] args){
            giaiptb1();
    }
}
