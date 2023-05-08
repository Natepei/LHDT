package tuan3;
import java.time.LocalDate;
public class main {
    public static void main(String[] args) {
        Order o = new Order();
        Product p1 = new Product("Nuoc tuong", "sp4 ", 8000);
        Product p2 = new Product("Gao       ", "sp1 ", 18000);
        Product p3 = new Product("Duong     ", "sp3 ", 10000);
        Product p4 = new Product("Gao       ", "sp1 ", 18000);
        OrderDetail od1 = new OrderDetail(10, p1);
        OrderDetail od2 = new OrderDetail( 5, p2);
        OrderDetail od3 = new OrderDetail( 1, p3);
        OrderDetail od4 = new OrderDetail( 1, p4);
        LocalDate date = LocalDate.parse("2015-09-10");
        System.out.println("Ma HD: 1");
        System.out.println("Ngay lap hoa don: " + date);
        System.out.println(" STT | Ma SP  |  Mo Ta      | Don gia | S Luong |  Thanh tien");
          System.out.println(" 1   |" + p1 +" " + od1 + " | " + od1.calcTotalPrice() + " VND ");
          System.out.println(" 2   |" + p2 + od2 + "  | " + od2.calcTotalPrice() + " VND ");
          System.out.println(" 3   |" + p3 + od3 + "  | " + od3.calcTotalPrice() + " VND ");
          System.out.println(" 4   |" + p4 + od4 + "  | " + od4.calcTotalPrice() + " VND ");
          int sum = (int) (od1.calcTotalPrice() + od2.calcTotalPrice() + od3.calcTotalPrice() + od4.calcTotalPrice());
          System.out.println("Tong tien thanh toan: " + sum + " VND");
    }
}
