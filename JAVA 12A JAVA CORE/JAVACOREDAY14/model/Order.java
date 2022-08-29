package JAVACOREDAY14.model;

import java.util.List;

public class Order {
    List<OrderDetail> orderDetails;

    public Order(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

}
