package BaiTap;
import java.util.Scanner;
public class GiaiPTB2 {
    public static void main(String[] args) {
       float a,b,c,delta,x1,x2,x;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap a = ");
       a = sc.nextFloat();
       System.out.println("Nhap b = ");
       b = sc.nextFloat();
       System.out.println("Nhap c = ");
       c = sc.nextFloat();
       delta = (float) (Math.pow(b,2) - 4*a*c);
       if(a==0){
            System.out.println("Giai phuong trinh bac 1");
            if(b==0){
            if(c==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = -c/b;
            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
        }
       }else{
       if(delta<0){
           System.out.println("Phuong trinh vo nghiem");
       }else if(delta==0){
               x1 = -b/(2*a);
               System.out.println("Phuong trinh co nghiem kep = " +x1);
       } else {
           x1 = (float) (-b - Math.sqrt(delta))/(2*a);
           x2 = (float) (-b + Math.sqrt(delta))/(2*a);
           System.out.println("Phuong trinh co 2 nghiem phan biet");
           System.out.println("x1="+ x1);
           System.out.println("x2="+ x2);
       }
     }
   }
}
