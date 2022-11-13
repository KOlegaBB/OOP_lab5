package ua.edu.ucu.apps.demo.Delivery;

import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.User.User;

import java.util.List;

public class DHLDeliveryStrategy {
    public void deliver(List<Item> items, User user){
        for (Item item : items){
            user.addItem(item);
            user.setMoney(user.getMoney() - 5);
        }
    }
}
