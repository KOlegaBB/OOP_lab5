import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;

    public String getColor() {
        return color.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass())
            return false;
        return sepalLength == ((Flower)other).sepalLength && color.equals(((Flower)other).color) &&
                price == ((Flower)other).price;
    }
}

