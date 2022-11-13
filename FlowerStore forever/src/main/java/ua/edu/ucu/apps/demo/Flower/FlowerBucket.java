package ua.edu.ucu.apps.demo.Flower;

import lombok.Getter;
import ua.edu.ucu.apps.demo.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    @Getter
    private final List<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack flowers) {
        bucket.add(flowers);
    }

    public double price() {
        double price = 0;
        for (FlowerPack pack : bucket) {
            price += pack.getPrice();
        }
        return price;
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass())
            return false;
        for (FlowerPack pack_1 : ((FlowerBucket)other).getBucket()) {
            for (FlowerPack pack_2 : getBucket()) {
                if (!pack_1.equals(pack_2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
