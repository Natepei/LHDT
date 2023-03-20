package bai2;
public class Hinh {
    private double DienTich;

    public Hinh() {
    }

    public Hinh(double DienTich) {
        super();
        this.DienTich = DienTich;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double DienTich) {
        this.DienTich = DienTich;
    }
    public double TinhDienTich(){
        System.out.println("Tinh dien tich cac hinh: ");
        return 0;
    }
}
