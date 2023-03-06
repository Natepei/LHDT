package bai1;
public class Main{
    public static void main(String[] args){
        QuaCam c = new QuaCam(5,20000,"My",10,20);
        System.out.println("Qua cam");
        System.out.println("Can nang: "+c.getCannang()+"kg");
        System.out.println("Gia ban: "+c.getGiaban()+"VND");
        System.out.println("Nguon goc xuat xu: "+c.getNguongocxuatxu());
        System.out.println("Ngay nhap: "+c.getNgaynhap());
        System.out.println("So luong: "+c.getSoluong());
    }
}
