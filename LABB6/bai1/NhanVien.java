package bai1;
import java.util.Scanner;
public class NhanVien {
    Scanner sc = new Scanner(System.in);
    private String Ten;
    private long Luong;
    public NhanVien(String Ten, long Luong) {
        super();
        this.Ten = Ten;
        this.Luong = Luong;
    }public Scanner getSc() {
        return sc;
    }public void setSc(Scanner sc) {
        this.sc = sc;
    }public String getTen() {
        return Ten;
    }public void setTen(String Ten) {
        this.Ten = Ten;
    }public long getLuong() {
        return Luong;
    }public void setLuong(long Luong) {
        this.Luong = Luong;
    }
    NhanVien(){}
    public void LoaiNhanVien(){
        System.out.println("FULL TIME hoac PART TIME");
    }
    public long TinhLuong(){
        return Luong;
    }
    public void XuatThongTin(){
        System.out.println("Ten nhan vien: "+ Ten);
        System.out.println("Luong:" + Luong);
    }
}
