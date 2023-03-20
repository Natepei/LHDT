package bai1;
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String NoiDen;
    private int SoNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String NoiDen, int SoNgayDiDuoc, int Masochuyen, int Soxe, float doanhthu, String Hotentaixe) {
        super(Masochuyen, Soxe, doanhthu, Hotentaixe);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String NoiDen) {
        this.NoiDen = NoiDen;
    }

    public int getSoNgayDiDuoc() {
        return SoNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int SoNgayDiDuoc) {
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }
    @Override
    public float TongDoanhThu(){
        float DT = (getDoanhthu()*200);
        return DT;
    }
}
