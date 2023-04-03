package bai2;
public abstract class phuongtiendichuyen implements hangsanxuat{
    String loaiphuongtien;
    hangsanxuat HangSanXuat;
    public String laytenhangsanxuat(){
        return tenhangsanxuat;
    }
    void batdau(){
        System.out.println("bat dau");
    }
    void tangtoc(){
        System.out.println("tang toc");
    }
    void dunglai(){
        System.out.println("dung lai");
    }
    abstract double layvantoc();
}
