package ua.edu.ucu.apps.demo.Item;

public class RibbonDecorator extends ItemDecorator {
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public double price() {
        return 40 + item.price();
    }

    public String getDescription(){
        return item.toString() + "with ribbon";
    }
}
