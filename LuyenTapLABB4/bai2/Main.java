package bai2;
public class Main{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bicycle b = new Bicycle(2,"xanh","thep, nhom, titan, carbon");
        Car c = new Car("xang dau","do","thep, nhua, nhom, vat lieu tong hop, thuy tinh, Magie");
        System.out.println("Xe dap");
        System.out.println("So banh xe: "+b.getSobanhxe());
        System.out.println("Mau sac: "+b.getColor());
        System.out.println("Chat lieu: "+b.getModel());
        System.out.println("\n");
        System.out.println("Xe oto");
        System.out.println("Nhien lieu: "+c.getNhienlieu());
        System.out.println("Mau sac: "+c.getColor());
        System.out.println("Chat lieu: "+c.getModel());
        v.run();
    }
}
