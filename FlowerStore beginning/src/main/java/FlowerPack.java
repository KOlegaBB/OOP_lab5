import lombok.Setter;
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice(){
        return flower.getPrice() * quantity;
    }
    @Override
    public boolean equals(Object other){
        if (other.getClass() != this.getClass())
            return false;
        return quantity == ((FlowerPack)other).quantity && flower.equals(((FlowerPack)other).flower);
    }
}