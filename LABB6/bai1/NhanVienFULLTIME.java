package bai1;
public class NhanVienFULLTIME extends NhanVien{
    private int LoaiChucVu;
    private int NgayLamThem;
    public int getLoaiChucVu() {
        return LoaiChucVu;
    }public void setLoaiChucVu(int LoaiChucVu) {
        this.LoaiChucVu = LoaiChucVu;
    }public int getNgayLamThem() {
        return NgayLamThem;
    }public void setNgayLamThem(int NgayLamThem) {
        this.NgayLamThem = NgayLamThem;
    }public NhanVienFULLTIME(){}
    public NhanVienFULLTIME(int LoaiChucVu, int NgayLamThem, String Ten, long Luong) {
        super(Ten, Luong);
        this.LoaiChucVu = LoaiChucVu;
        this.NgayLamThem = NgayLamThem;
    }@Override
    public void LoaiNhanVien(){
            System.out.println("Nhan vien FULLTIME");
    }
    @Override
    public long TinhLuong(){
        switch (LoaiChucVu) {
            case 0 -> setLuong(10 * NgayLamThem);
            case 1 -> setLuong(5 * NgayLamThem);
            default -> {
                return -1;
            }
        }
        return getLuong();
    }
}

