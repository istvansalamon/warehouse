package database;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDatabase {
    private List<Order> orders;

    public OrderDatabase() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void updateOrder(Order updatedOrder) {
        for (Order order : orders) {
            if (order.getOrderId().equals(updatedOrder.getOrderId())) {
                order.setItems(updatedOrder.getItems());
                break;
            }
        }
    }

    public void deleteOrder(String orderId) {
        Order orderToRemove = null;
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                orderToRemove = order;
                break;
            }
        }
        if (orderToRemove != null) {
            orders.remove(orderToRemove);
        }
    }

    public List<Order> getOrders() {
        return orders;
    }
}
