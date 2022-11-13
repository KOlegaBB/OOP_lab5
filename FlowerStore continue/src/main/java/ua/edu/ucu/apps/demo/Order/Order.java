package ua.edu.ucu.apps.demo.Order;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Delivery.Delivery;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.Payment.Payment;
import ua.edu.ucu.apps.demo.User.User;

import java.util.ArrayList;
import java.util.List;


public class Order {
    @Getter
    private List<Item> items = new ArrayList<>();
    @Setter @Getter
    private Payment payment;
    @Setter @Getter
    private Delivery delivery;

    public double calculateTotalPrice(){
        double total_price = 0;
        for (Item item : items){
            total_price += item.price();
        }
        return total_price;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public void processOrder(User user){
        double price = calculateTotalPrice();
        payment.pay(price, user);
        delivery.deliver(items, user);
        for (Item item : items){
            removeItem(item);
        }
    }
}
