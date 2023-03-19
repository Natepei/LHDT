package bai1;
import java.util.Scanner;
public class Nhanvien {
    private String ten;
    protected long luong;
    Scanner scanner = new Scanner(System.in);
    public Nhanvien() {
        super();
    }
    public Nhanvien(String ten, long luong) {
        super();
        this.ten = ten;
        this.luong = luong;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    public String LoaiNhanVien(){
        System.out.println("FULL TIME hoac PART TIME");
        return null;
    }
    public void tinhLuong(){}
    public void XuatThongTin(){
        System.out.println("Ten nhan vien: "+ ten);
        System.out.println("Luong:" + luong);
    }
}

