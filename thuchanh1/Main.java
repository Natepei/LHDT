package thuchanh1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SinhVienNhap sv = new SinhVienNhap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
        System.out.println("1. Nhap thong tin sinh vien");
        System.out.println("2. Xuat thong tin sinh vien");
        System.out.println("Nhap so khac de thoat");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien thu " + (i + 1));
                        sv.nhap();
            }
                break;
                case 2:
                    System.out.println(sv.toString());
                    default:
            }
        }while (n != 0);
    }
}
