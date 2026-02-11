package Week2_Assignment.Q7_Assignment2;

// Enum to represent order status
enum OrderStatus {
    PLACED("Order has been placed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
public class order{
    public static void main(String[] args) {

        OrderStatus order1 = OrderStatus.PLACED;
        OrderStatus order2 = OrderStatus.SHIPPED;
        OrderStatus order3 = OrderStatus.DELIVERED;
        OrderStatus order4 = OrderStatus.CANCELLED;

        System.out.println(order1.getMessage());
        System.out.println(order2.getMessage());
        System.out.println(order3.getMessage());
        System.out.println(order4.getMessage());
    }
}

