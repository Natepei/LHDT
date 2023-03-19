package bai2;
public class HocSinhChuyenToan extends HocSinh{
public HocSinhChuyenToan(String HoTen, int Lop, int Toan, int Ly, int Hoa) {
        super(HoTen, Lop, Toan, Ly, Hoa);
    }
    @Override
    public float DiemTB(){
        float TB = (((getToan()*2)+getLy()+getHoa())/4);
        return TB;
    }  
}
