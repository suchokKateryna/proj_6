package ucu.edu.ua.com.proj_6.flower;

import java.util.ArrayList;
import java.util.List;

import ucu.edu.ua.com.proj_6.delivery.Delivery;

public class Order {
    private List<Item> items;
    private Delivery delivery;
    
    public Order() {
        this.items = new ArrayList<>();
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    
    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        }
    }
}