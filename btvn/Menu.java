package btvn;
import java.util.Scanner;
public class Menu {
    public static void menu() {
       System.out.println("+--------------------------+");
       System.out.println("1.Kiem tra so chinh phuong");
       System.out.println("2.Xep loai hoc sinh");
       System.out.println("3.Doc so nguyen co ba chu so");
       System.out.println("4.Tinh giai thua");
       System.out.println("+--------------------------+");
       Scanner scanner = new Scanner(System.in);
       int chon = scanner.nextInt();
       switch (chon){
           case 1:
               Bai1.sochinhphuong();
               break;
           case 2:
               Bai2.xeploai();
               break;
           case 3:
               Bai3.docso();
               break;
           case 4:
               Bai4.giaithua();
               break;
           case 5:
               Bai5.xoaphantu();
       }
    }public static void main(String[] args){
        menu();
    }
}
