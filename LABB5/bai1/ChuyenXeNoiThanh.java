package bai1;
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int SoTuyen;
    private int SoKmDiDuoc;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(int SoTuyen, int SoKmDiDuoc, int Masochuyen, int Soxe, float doanhthu, String Hotentaixe) {
        super(Masochuyen, Soxe, doanhthu, Hotentaixe);
        this.SoTuyen = SoTuyen;
        this.SoKmDiDuoc = SoKmDiDuoc;
    }

    public int getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(int SoTuyen) {
        this.SoTuyen = SoTuyen;
    }

    public int getSoKmDiDuoc() {
        return SoKmDiDuoc;
    }

    public void setSoKmDiDuoc(int SoKmDiDuoc) {
        this.SoKmDiDuoc = SoKmDiDuoc;
    }
    @Override
    public float TongDoanhThu(){
        float DT = (getDoanhthu()*100);
        return DT;
    }
}
