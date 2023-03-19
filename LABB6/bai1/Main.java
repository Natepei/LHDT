package bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon loai nhan vien: FULLTIME(0) hoac PARTTIME(1)");
        int choose = sc.nextInt();
        if(choose == 0){
            NhanVienFULLTIME LoaiNhanVien;
            LoaiNhanVien = new NhanVienFULLTIME();
            NhanVienFULLTIME ft = new NhanVienFULLTIME();
            ft.LoaiNhanVien();
            ft.TinhLuong();
            ft.setTen("Huynh Van Manh");
            ft.setNgayLamThem(10);
            ft.setLoaiChucVu(1);
            System.out.println("Ten nhan vien: "+ ft.getTen());
            System.out.println("Luong: "+ ft.getLuong());
        }else if(choose == 1){
            NhanVienPARTTIME LoaiNhanVien = new NhanVienPARTTIME();
            NhanVienPARTTIME pt = new NhanVienPARTTIME();
            pt.LoaiNhanVien();
            pt.TinhLuong();
            pt.setLuong(pt.getGioLamViec()*30);
            pt.setTen("Vo Minh Hieu");
            pt.setGioLamViec(6);
            System.out.println("Ten nhan vien:"+ pt.getTen());
            System.out.println("Luong: "+ pt.getLuong());
        }
    }
}
