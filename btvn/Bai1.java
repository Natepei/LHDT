package btvn;
import java.util.Scanner;
public class Bai1 {
    public static void sochinhphuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so de kiem tra: ");
        int n = scanner.nextInt();
        float kq = (float) Math.sqrt(n);
        if(kq==(int)kq){
            System.out.println("la so chinh phuong");
        }
        else{
            System.out.println("khong phai la so chinh phuong");
        }
    }
    public static void main(String[] args){
            sochinhphuong();
    }
}
