package bai1;
public class parttime extends Nhanvien{
   private int gioLamViec; 

    public parttime() {
        super();
    }

    public parttime(int gioLamViec, String ten, long luong) {
        super(ten, luong);
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
   @Override
    public String LoaiNhanVien(){
        System.out.println("Nhan vien PARTTIME");
       return null;
    }
   @Override
    public void tinhLuong(){
        luong = gioLamViec * 10;
        System.out.println("Luong: "+ luong);
    }
}
