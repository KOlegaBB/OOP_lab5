package ua.edu.ucu.apps.demo.Flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
@RestController
public class FlowerController {
    @GetMapping(value = "/flower")
    public List<Flower> flower() {
        Flower flower_1 = new Rose();
        flower_1.setPrice(10);
        flower_1.setSepalLength(5);
        Flower flower_2 = new Tulip();
        flower_2.setPrice(8);
        flower_2.setSepalLength(3);
        Flower flower_3 = new Chamomile();
        flower_3.setPrice(5);
        flower_3.setSepalLength(12);
        List<Flower> flower_list = new ArrayList<>();
        flower_list.add(flower_1);
        flower_list.add(flower_2);
        flower_list.add(flower_3);
        return flower_list;
    }
}