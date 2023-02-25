package labb3;
public class tinhht {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.setpi(ht.getpi());
        ht.setduongkinh(20);
        ht.setbankinh(10);
        ht.setchuvi((float) (ht.getduongkinh()*ht.getpi()));
        ht.setdienTich((float)((float)(ht.getbankinh()*ht.getbankinh())*ht.getpi()));
        System.out.println("Chu vi hinh tron: "+ht.getchuvi());
        System.out.println("Dien tich hinh tron: "+ht.getdientich());
    }
}
