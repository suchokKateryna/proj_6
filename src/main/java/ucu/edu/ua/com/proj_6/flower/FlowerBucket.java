package ucu.edu.ua.com.proj_6.flower;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(final FlowerPack flowerPack) {
        if (flowerPack != null) {
            flowerPacks.add(flowerPack);
        }
    }

    public double getPrice() {
    double totalPrice = 0.0;
    for (FlowerPack pack : flowerPacks) {
        totalPrice += pack.getPrice();
    }
    return totalPrice;
}
}