package ua.edu.ucu.apps.demo.Flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(path = "/flower")
@RestController
public class FlowerController {
    @Autowired
    private FlowerService flower_service;

    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flower_service.addFlower(flower);
    }

    @GetMapping
    public List<Flower> getFlowers() {
        return flower_service.getFlowers();
    }


}