package ua.edu.ucu.apps.demo.Flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flower_repository;

    public FlowerService(FlowerRepository flower_repository){
        this.flower_repository = flower_repository;
    }

    public void addFlower(Flower flower) {
        flower_repository.save(flower);
    }

    public List<Flower> getFlowers() {
        return flower_repository.findAll();
    }
}

