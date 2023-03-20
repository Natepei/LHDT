package bai2;
public class Main {
    public static void main(String[] args) {
        Hinh h = new Hinh();
        HinhChuNhat hcn = new HinhChuNhat();
        HinhTron ht = new HinhTron();
        h.TinhDienTich();
        hcn.TinhDienTich();
        hcn.toString();
        ht.TinhDienTich();
        ht.toString();
    }
}
