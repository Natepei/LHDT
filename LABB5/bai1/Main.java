package bai1;
public class Main {
    public static void main(String[] args) {
        ChuyenXe cx = new ChuyenXe();
        ChuyenXeNoiThanh cxnoi = new ChuyenXeNoiThanh();
        ChuyenXeNgoaiThanh cxngoai = new ChuyenXeNgoaiThanh();
        cxngoai.setDoanhthu(500);
        cxnoi.setDoanhthu(300);
        System.out.println("Tong doanh thu cua chuyen xe noi thanh: "+cxnoi.TongDoanhThu());
        System.out.println("Tong doanh thu cua chuyen xe ngoai thanh: "+cxngoai.TongDoanhThu());
        int tong = (int) (cxnoi.TongDoanhThu()+cxngoai.TongDoanhThu());
        System.out.println("Tong doanh thu cua tat ca chuyen xe la: "+tong);
    }
}
