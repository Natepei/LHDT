package tuan3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail lineItems;
    private int count;
    public Order() {
    }
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public double calcTotalCharge(){
        OrderDetail o = new OrderDetail();
        for(count = 0; count <= 4; count++){
            int n = (int) o.calcTotalPrice();
            int sum = n + count;
            return sum;
        }
        return 0;
    }
    public int getOrderID() {
        return orderID;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public OrderDetail getLineItems() {
        return lineItems;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public void addLineItem(Product p, int x){
        List<Product> lineItems = new ArrayList<>();
        lineItems.add(x, p);
    }
    @Override
    public String toString() {
        return "Order|" + "orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count=" + count + '|';
    }
}
