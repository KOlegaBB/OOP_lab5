package ua.edu.ucu.apps.demo.User;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;

import java.util.ArrayList;
import java.util.List;


public class User {
    @Setter
    @Getter
    double money;
    String name;
    List<Item> items = new ArrayList<>();

    public User(String name, double money){
        this.name = name;
        this.money = money;
    }
    public void addItem(Item item){
        items.add(item);
    }

}
