package BaiTap;
import java.util.Scanner;
public class Tinhtiendien {
    public static void tinhtiendien() {
        int soDien, tien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        soDien = scanner.nextInt();
        if(soDien < 50){
            tien = soDien * 1000;
        }else{
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("So tien phai tra la: " + tien + "VND");
    }public static void main(String[] args){
            tinhtiendien();
    }
}
