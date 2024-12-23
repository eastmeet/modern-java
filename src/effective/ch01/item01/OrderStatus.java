package effective.ch01.item01;

import java.util.Arrays;
import java.util.EnumSet;

// 오로지 단 하나의 인스턴스만 생긴다.
public enum OrderStatus {
    PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        OrderStatus[] values = OrderStatus.values();
        Arrays.stream(values).forEach(System.out::println);

        Order order = new Order();
        // NPE 미발생
        if (order.getStatus() == OrderStatus.DELIVERED) {
            System.out.println("test");
        }

        // NPE 발생
        if (order.getStatus().equals(OrderStatus.DELIVERED)) {
            System.out.println("test");
        }

        // NPE 미발생
        if (OrderStatus.DELIVERED.equals(order.getStatus())) {
            System.out.println("test");
        }

    }

}
