package bai1;
public class ChuyenXe {
    private int Masochuyen;
    private int Soxe;
    private float doanhthu;
    private String Hotentaixe;

    public ChuyenXe() {
    }

    public ChuyenXe(int Masochuyen, int Soxe, float doanhthu, String Hotentaixe) {
        super();
        this.Masochuyen = Masochuyen;
        this.Soxe = Soxe;
        this.doanhthu = doanhthu;
        this.Hotentaixe = Hotentaixe;
    }

    public int getMasochuyen() {
        return Masochuyen;
    }

    public void setMasochuyen(int Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public int getSoxe() {
        return Soxe;
    }

    public void setSoxe(int Soxe) {
        this.Soxe = Soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    public String getHotentaixe() {
        return Hotentaixe;
    }

    public void setHotentaixe(String Hotentaixe) {
        this.Hotentaixe = Hotentaixe;
    }
    public float TongDoanhThu(){
        return 0;
    }
}
