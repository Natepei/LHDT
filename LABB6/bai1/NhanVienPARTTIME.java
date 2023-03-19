package bai1;
public class NhanVienPARTTIME extends NhanVien{
    private int GioLamViec;
    public NhanVienPARTTIME(){}
    public NhanVienPARTTIME(int GioLamViec, String Ten, long Luong) {
        super(Ten, Luong);
        this.GioLamViec = GioLamViec;
    }public int getGioLamViec() {
        return GioLamViec;
    }public void setGioLamViec(int GioLamViec) {
        this.GioLamViec = GioLamViec;
    }
    @Override
    public long TinhLuong(){
        setLuong(GioLamViec*10);
        return getLuong();
    }
    @Override
    public void LoaiNhanVien(){
        System.out.println("Nhan vien PARTTIME");
    }
}
