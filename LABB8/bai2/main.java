package bai2;
public class main {
    public static void main(String[] args) {
        xedap xd = new xedap();
        xeoto oto = new xeoto();
        maybay mb = new maybay();
        System.out.println("---------------------");
        xd.layvantoc();
        System.out.println("---------------------");
        oto.layvantoc();
        oto.loainhienlieu(); 
        System.out.println("---------------------");
        mb.layvantoc();
        mb.loainhienlieu();
        mb.batdau();
        mb.catcanh();
        mb.dunglai();
    }
}
