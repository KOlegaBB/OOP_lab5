package ua.edu.ucu.apps.demo.Flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;


@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    private double price;


    public String getColor() {
        return color.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass())
            return false;
        return sepalLength == ((Flower)other).sepalLength && color.equals(((Flower)other).color) &&
                price == ((Flower)other).price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "sepalLength=" + sepalLength +
                ", color=" + color +
                ", price=" + price +
                '}';
    }


    public double price() {
        return price;
    }
}

