package bai2;
public class maybay extends phuongtiendichuyen{
    public String loainhienlieu(){
        System.out.println("loai nhien lieu cua may bay");
        return null;
    }
    void catcanh(){
        System.out.println("cat canh");
    }
    void hacanh(){
        System.out.println("ha canh");
    }
    @Override
    public double layvantoc(){
        System.out.println("van toc may bay");
        return 0;
    }
}
