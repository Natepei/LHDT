package bai2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocSinh hs = new HocSinh("Huynh Van Manh",12, 10, 5, 8);
        HocSinhChuyenToan ct = new HocSinhChuyenToan("Vo Minh Hieu", 11, 7, 10, 10);
        System.out.println("Diem trung binh cua "+ hs.getHoTen() + " la: "+ hs.DiemTB());
        System.out.println("Diem trung binh cua "+ ct.getHoTen() +" la hoc sinh chuyen toan "+ " la: "+ ct.DiemTB());
    }
}

