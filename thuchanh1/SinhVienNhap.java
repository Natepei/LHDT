package thuchanh1;
import java.util.Scanner;
public class SinhVienNhap {
    private String MaSV;
    private String HoTen;
    private String DiaChi;
    private int SDT;
    public SinhVienNhap() {
    }
    public SinhVienNhap(String MaSV, String HoTen, String DiaChi, int SDT) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }
    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        HoTen = sc.nextLine();
        System.out.println("Nhap dia chi sinh vien: ");
        DiaChi = sc.nextLine();
        System.out.println("Nhap SDT: ");
        SDT = sc.nextInt();
        System.out.println("Nhap ma sinh vien: ");
        MaSV = sc.nextLine();
    }
    @Override
    public String toString(){
        return "Ma Sinh Vien: " + MaSV + ",Ho Ten: "+ HoTen + ",Dia Chi: " + DiaChi;
    }
}
