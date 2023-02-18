package BaiTap;
import java.util.Scanner;
public class GiaiPTB2 {
    public static void giaiptb2(){
        float a, b, c;
           Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a: ");
            a = scanner.nextFloat();
            System.out.print("Nhap b: ");
            b = scanner.nextFloat();
            System.out.print("Nhap c: ");
            c = scanner.nextFloat();
        float delta = ((b*b) - 4*a*c);
        if(a==0){
            System.out.println("Giai phuong trinh bac nhat: ");
            if(b==0){
                if(c==0){
                System.out.println("Phuong trinh vo so nghiem");
            }   
                else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }   
            else{
            float x = (float) -c/b;
            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
        }
       }
       else{
       if(delta<0){
           System.out.println("Phuong trinh vo nghiem");
       }else if(delta==0){
           float x1 = -b/(2*a);
               System.out.println("Phuong trinh co nghiem kep = " +x1);
       }else {
           float x1 = (float) (-b - Math.sqrt(delta))/(2*a);
           float x2 = (float) (-b + Math.sqrt(delta))/(2*a);
           System.out.println("Phuong trinh co 2 nghiem phan biet");
           System.out.println("x1="+ x1);
           System.out.println("x2="+ x2);
       }
       }
    }public static void main(String[] args){
            giaiptb2();
    }
}