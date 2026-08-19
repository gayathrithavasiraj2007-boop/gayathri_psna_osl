class Order {
    public int orderId;
    String orderStatus;

    public Order(int orderId){
        this.order = orderId;
    }

    public Order(int orderId, String orderStatus){
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

}
public class Main {
    static void main(){
        Order order = new Order(1);
        System.out.println("Order is : " order.orderId);

    }
}