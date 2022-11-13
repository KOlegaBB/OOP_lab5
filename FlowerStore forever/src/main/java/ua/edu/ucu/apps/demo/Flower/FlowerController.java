package ua.edu.ucu.apps.demo.Flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
@RestController
public class FlowerController {
    @Autowired
    private FlowerService flower_service;

    @PostMapping
    public void addFlower(Flower flower) {
        flower_service.addFlower(flower);
    }

    @GetMapping(value = "/flower")
    public List<Flower> getFlowers() {
        return flower_service.getFlowers();
    }


}