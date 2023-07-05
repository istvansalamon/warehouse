package service;

import database.OrderDatabase;
import model.Order;

import java.util.List;

public class OrderService {
    private OrderDatabase orderDatabase;

    public OrderService(OrderDatabase orderDatabase) {
        this.orderDatabase = orderDatabase;
    }

    public void addOrder(Order order) {
        orderDatabase.addOrder(order);
    }

    public void updateOrder(Order updatedOrder) {
        orderDatabase.updateOrder(updatedOrder);
    }

    public void deleteOrder(String orderId) {
        orderDatabase.deleteOrder(orderId);
    }

    public List<Order> getOrders() {
        return orderDatabase.getOrders();
    }
}
