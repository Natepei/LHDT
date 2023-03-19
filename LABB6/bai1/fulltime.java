package bai1;
public class fulltime extends Nhanvien{
    private int NgayLamThem;
    private int loaiChucVu;

    public fulltime() {
        super();
    }

    public fulltime(int NgayLamThem, int loaiChucVu, String ten, long luong) {
        super(ten, luong);
        this.NgayLamThem = NgayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return NgayLamThem;
    }

    public void setNgayLamThem(int NgayLamThem) {
        this.NgayLamThem = NgayLamThem;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String LoaiNhanVien(){
        System.out.println("Nhan vien FULLTIME");
        return null;
    }@Override
    public void tinhLuong(){
        if (loaiChucVu == 0){
            luong =100*NgayLamThem;
            System.out.println("Luong: "+ luong);
        }else if (loaiChucVu == 1){
            luong = 50*NgayLamThem;
            System.out.println("Luong: "+ luong);
        }else{
            System.out.println("Thong tin khong hop le");
        }
    }
}

