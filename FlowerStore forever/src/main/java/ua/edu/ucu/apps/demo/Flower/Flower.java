package ua.edu.ucu.apps.demo.Flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private String color;
    private double price;

    @Id
    @GeneratedValue
    private Long id;


    public String getColor() {
        return color;
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

