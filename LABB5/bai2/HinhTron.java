package bai2;
import java.util.Scanner;
public class HinhTron extends Hinh{
    private float R;
    private final double PI=3.14;
    Scanner sc = new Scanner(System.in);
    public HinhTron() {
    }

    public HinhTron(float R, double DienTich) {
        super(DienTich);
        this.R = R;
    }

    public float getR() {
        return R;
    }

    public void setR(float R) {
        this.R = R;
    }
    @Override
    public double TinhDienTich(){
        System.out.println("Tinh dien tich hinh tron ");
        System.out.println("Nhap ban kinh: ");
        R = sc.nextFloat();
        float dtht = (float) (PI*R*R);
        System.out.println("Dien tich hinh chu nhat = "+dtht);
        return 0;
    }
    @Override
    public String toString(){
        return null;
    }
}
