package ua.edu.ucu.apps.demo.Delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.Flower.Flower;
import ua.edu.ucu.apps.demo.Flower.Rose;
import ua.edu.ucu.apps.demo.Flower.Tulip;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.User.User;

import java.util.ArrayList;
import java.util.List;


@RequestMapping
@RestController
public class DeliveryController {
    @GetMapping(value = "/delivery")
    public String delivery() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        User user = new User("Bob", 200);
        Flower flower_1 = new Rose();
        Flower flower_2 = new Tulip();
        Flower flower_3 = new Rose();
        List<Item> flower_list = new ArrayList<>();
        flower_list.add(flower_1);
        flower_list.add(flower_2);
        flower_list.add(flower_3);
        dhl.deliver(flower_list, user);
        String message = "Bob have 200$. He deliver 3 items using DHl. Now he have: " + user.getMoney() + "\n";
        post.deliver(flower_list, user);
        message += "Then, he also deliver 3 items using Post. Now he have: " + user.getMoney();
        return message;
    }
}
