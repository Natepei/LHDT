package tuan3;
class OrderDetail {
    private int quantity;
    private Product product;
    public OrderDetail() {
    }
    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    public double calcTotalPrice(){
        return quantity*product.getPrice();
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return " |      " + quantity;
    }
}
