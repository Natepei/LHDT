package bai1;
public class QuaCam extends HoaQua{
    private float cannang;
    public QuaCam(){
    }public QuaCam(float cannang, int giaban, String nguongocxuatxu, int ngaynhap, int soluong){
        super(giaban, nguongocxuatxu, ngaynhap, soluong);
        this.cannang = cannang;
    }public float getCannang(){
        return cannang;
    }public void setCannang(float cannang){
        this.cannang = cannang;
    }
}
