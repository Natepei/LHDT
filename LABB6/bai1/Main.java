package bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien nv = new Nhanvien();
        fulltime ft = new fulltime(10,0,"Huynh Van Manh",5000);
        parttime pt = new parttime(6,"Vo Minh Hieu", 10000);
        System.out.println("Chon loai nhan vien: FULLTIME(0) - PARTTIME(1)");
        int chon = sc.nextInt();
        if (chon == 0){
            ft.LoaiNhanVien();
            ft.tinhLuong();
            System.out.println("Ten nhan vien "+ ft.getTen());
        }else if (chon == 1){
            pt.LoaiNhanVien();
            pt.tinhLuong();
            System.out.println("Ten nhan vien: "+ pt.getTen());
        }
    }
}
