package effective.ch01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus status;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public boolean isPrime() {
        return prime;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public Product getProduct() {
        return product;
    }

    public OrderStatus getStatus() {
        return status;
    }

}