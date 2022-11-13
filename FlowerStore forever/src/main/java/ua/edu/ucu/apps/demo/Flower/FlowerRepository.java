package ua.edu.ucu.apps.demo.Flower;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}