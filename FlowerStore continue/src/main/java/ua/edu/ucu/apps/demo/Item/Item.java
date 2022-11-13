package ua.edu.ucu.apps.demo.Item;

import lombok.Getter;

abstract public class Item {
    @Getter
    private String description;

    abstract public double price();
}
