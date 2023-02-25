package labb3;
public class tinhhv{
     public static void main(String[] args) {
        hinhvuong hv = new hinhvuong();
        hv.setcanh(15);
        hv.setchuvi(hv.getcanh()*4);
        hv.setdientich(hv.getcanh()*hv.getcanh());
        System.out.println("Chu vi hinh vuong: "+hv.getchuvi());
        System.out.println("Dien tich hinh vuong: "+hv.getdientich());
    }
}
