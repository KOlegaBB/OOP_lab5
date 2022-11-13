import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket_1;
    private FlowerBucket flowerBucket_2;
    private FlowerBucket flowerBucket_3;
    private Store store;

    @BeforeEach
    public void init() {

        flowerBucket_1 = new FlowerBucket();
        flowerBucket_2 = new FlowerBucket();
        flowerBucket_3 = new FlowerBucket();
        store = new Store();
    }


    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket_1.add(flowerPack);
        Flower flower_2 = new Tulip();
        FlowerPack flowerPack_2 = new FlowerPack(flower_2, quantity);
        flowerBucket_2.add(flowerPack_2);
        store.add(flowerBucket_1);
        store.add(flowerBucket_2);
        flowerBucket_3.add(flowerPack);
        Assertions.assertEquals(flowerBucket_1, store.search(flowerBucket_3));
    }
}
