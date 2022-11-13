package ua.edu.ucu.apps.demo.Item;

public class PaperDecorator extends ItemDecorator{
    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double price() {
        return 13 + item.price();
    }

    public String getDescription() {
        return item.toString() + "in paper";
    }
}
