package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.Delivery.*;
import ua.edu.ucu.apps.demo.Flower.*;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.User.User;

import java.util.ArrayList;
import java.util.List;

public class DeliveryTest {

    private DHLDeliveryStrategy dhl;
    private PostDeliveryStrategy post;

    @BeforeEach
    public void init() {

        dhl = new DHLDeliveryStrategy();
        post = new PostDeliveryStrategy();
    }

    @Test
    public void testDelivery() {
        User user = new User("Bob", 200);
        Flower flower_1 = new Rose();
        Flower flower_2 = new Tulip();
        Flower flower_3 = new Rose();
        List<Item> flower_list = new ArrayList<>();
        flower_list.add(flower_1);
        flower_list.add(flower_2);
        flower_list.add(flower_3);
        dhl.deliver(flower_list, user);
        Assertions.assertEquals(user.getMoney(), 185);
        post.deliver(flower_list, user);
        Assertions.assertEquals(user.getMoney(), 179);
    }
}
