package bai1;
public class HoaQua{
    private int giaban;
    private String nguongocxuatxu;
    private int ngaynhap;
    private int soluong;
    public HoaQua(){
    }public HoaQua(int giaban, String nguongocxuatxu, int ngaynhap, int soluong){
        super();
        this.giaban = giaban;
        this.nguongocxuatxu = nguongocxuatxu;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }public int getGiaban(){
        return giaban;
    }public void setGiaban(int giaban){
        this.giaban = giaban;
    }public String getNguongocxuatxu(){
        return nguongocxuatxu;
    }public void setNguongocxuatxu(String nguongocxuatxu){
        this.nguongocxuatxu = nguongocxuatxu;
    }public int getNgaynhap(){
        return ngaynhap;
    }public void setNgaynhap(int ngaynhap){
        this.ngaynhap = ngaynhap;
    }public int getSoluong(){
        return soluong;
    }public void setSoluong(int soluong){
        this.soluong = soluong;
    }
}
