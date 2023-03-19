package bai2;
public class HocSinh {
    private String HoTen;
    private int Lop;
    private int Toan;
    private int Ly;
    private int Hoa;
    public void HocSinh(){}
    public HocSinh(String HoTen, int Lop, int Toan, int Ly, int Hoa) {
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }public String getHoTen() {
        return HoTen;
    }public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }public int getLop() {
        return Lop;
    }public void setLop(int Lop) {
        this.Lop = Lop;
    }public int getToan() {
        return Toan;
    }public void setToan(int Toan) {
        this.Toan = Toan;
    }public int getLy() {
        return Ly;
    }public void setLy(int Ly) {
        this.Ly = Ly;
    }public int getHoa() {
        return Hoa;
    }public void setHoa(int Hoa) {
        this.Hoa = Hoa;
    }public float DiemTB(){
        float TB = (Toan + Ly + Hoa)/3;
        return TB;
    }
}
