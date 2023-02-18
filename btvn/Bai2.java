package btvn;
import java.util.Scanner;
public class Bai2{
    public static void xeploai(){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem");
        x = scanner.nextInt();
        if(x<5){
            System.out.println("yeu");
        }if(x>5&&x<7){
            System.out.println("Trung binh");
        }if(x>7&&x<8){
            System.out.println("Kha");
        }if(x>8){
            System.out.println("Gioi");
        }
    }public static void main(String[] args){
        xeploai();
    }
}
