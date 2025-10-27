package ucu.edu.ua.com.proj_6.flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers = new ArrayList<>();

    public Store() {
    }

    public void addFlower(final Flower flower) {
        if (flower != null) {
            flowers.add(flower);
        }
    }

    public List<Flower> search(final Flower searchFlower) {
        List<Flower> matchingFlowers = new ArrayList<>();
        
        for (Flower flower : flowers) {
            if (matches(searchFlower, flower)) {
                matchingFlowers.add(flower);
            }
        }
        return matchingFlowers;
    }

    private boolean matches(final Flower searchFlower, final Flower inventoryFlower) {
        if (searchFlower.getFlowerType() != null 
            && searchFlower.getFlowerType() != inventoryFlower.getFlowerType()) {
            return false;
        }

        if (searchFlower.getColor() != null 
            && searchFlower.getColor() != inventoryFlower.getColor()) {
            return false;
        }

        if (searchFlower.getSepalLength() > 0 
            && Math.abs(searchFlower.getSepalLength() - inventoryFlower.getSepalLength()) > 0.001) {
            return false;
        }

        if (searchFlower.getPrice() > 0 
            && searchFlower.getPrice() != inventoryFlower.getPrice()) {
            return false;
        }

        return true;
    }
    public int getFlowerCount() {
        return flowers.size();
    }
    public boolean isEmpty() {
        return flowers.isEmpty();
    }
}