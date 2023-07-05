package model;

import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;

    public Order(String orderId, List<String> items) {
        this.orderId = orderId;
        this.items = items;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }


}
