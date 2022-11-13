package ua.edu.ucu.apps.demo.Item;

public class BasketDecorator {
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return 4 + item.price();
    }

    public String getDescription(){
        return item.toString() + "in basket";
    }
}
