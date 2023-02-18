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
       switch (chon){
           case 1:
               GiaiPTB1.giaiptb1();
               break;
           case 2:
               GiaiPTB2.giaiptb2();        
               break;
           case 3:
               Tinhtiendien.tinhtiendien();
               break;
           case 4:
               System.out.println("Ket thuc");
               break;
       }
    }
    public static void main(String[] args){
        menu();
    }
}
