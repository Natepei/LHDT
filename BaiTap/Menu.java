package BaiTap;
import java.util.Scanner;
public class Menu {
    public static void menu() {
       System.out.println("+--------------------------+");
       System.out.println("1.Giai phuong trinh bac nhat");
       System.out.println("2.Giai phuong trinh bac hai");
       System.out.println("3.Tinh tien dien");
       System.out.println("4.Ket thuc");
       System.out.println("+--------------------------+");
       Scanner scanner = new Scanner(System.in);
       int chon = scanner.nextInt();
       switch (chon) {
           case 1 -> {
               int a , b;
               Scanner sc = new Scanner(System.in);
               System.out.println("Nhap a : ");
               a = sc.nextInt();
               System.out.println("Nhap b : ");
               b = sc.nextInt();
               if(a==0){
                   if(b==0){
                       System.out.println("Phuong trinh vo so nghiem");
                   } else {
                       System.out.println("Phuong trinh vo nghiem");
                   }
               } else {
                   float x = (float) -b/a;
                   System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
               }   }
           case 2 -> {
               float a,b,c,delta,x1,x2,x;
               System.out.println("Nhap a = ");
                Scanner sc = new Scanner(System.in);
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
                }       }
           case 3 -> {
               int soDien, tien;
               System.out.println("Nhap so dien: ");
               soDien = scanner.nextInt();
               if(soDien < 50){
                   tien = soDien * 1000;
               }else{
                   tien = 50 * 1000 + (soDien - 50) * 1200;
               }       System.out.println("So tien phai tra la: " + tien + "VND");
            }
           case 4 -> System.out.println("Ket thuc");
       }
    }
    public static void main(String[] args){
        menu();
    }
}
