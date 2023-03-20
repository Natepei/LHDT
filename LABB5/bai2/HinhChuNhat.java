package bai2;
import java.util.Scanner;
public class HinhChuNhat extends Hinh{
    private float d;
    private float r;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat() {
    }

    public HinhChuNhat(float d, float r, double DienTich) {
        super(DienTich);
        this.d = d;
        this.r = r;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    @Override
    public double TinhDienTich(){
        System.out.println("Tinh dien tich hinh chu nhat ");
        System.out.println("Nhap chieu dai: ");
        d = sc.nextFloat();
        System.out.println("Nhap chieu rong: ");
        r = sc.nextFloat();
        float dthcn = d*r;
        System.out.println("Dien tich hinh chu nhat = "+dthcn);
        return 0;
    }
    @Override
    public String toString(){
        return null;
    }
}
