package ucu.edu.ua.com.proj_6.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower() {

    }

    public Flower(final double sepalLength, final FlowerColor color, 
              final double price, final FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color != null ? color.toString() : "";
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public Object getFlowerType() {
        return this.flowerType;
    }

    public double getSepalLength() {
        return this.sepalLength;
    }

}