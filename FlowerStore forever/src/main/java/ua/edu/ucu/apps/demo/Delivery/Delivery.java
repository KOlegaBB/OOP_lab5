package ua.edu.ucu.apps.demo.Delivery;

import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.User.User;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items, User user);

}
