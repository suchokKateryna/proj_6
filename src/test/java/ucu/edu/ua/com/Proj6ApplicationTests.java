package ucu.edu.ua.com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.com.proj_6.delivery.PostDelivery;
import ucu.edu.ua.com.proj_6.flower.Flower;
import ucu.edu.ua.com.proj_6.flower.FlowerColor;


class Proj6ApplicationTests {

	@Test
    void testDelivery() {
    	PostDelivery del = new PostDelivery();
        double deliveryCost = del.delivery(1200.0);
        
        assertEquals(20.0, deliveryCost, 0.001);
    }

	@Test
	void testFlower() {
		Flower flower = new Flower();
		flower.setColor(FlowerColor.BLUE);
		Flower flower2 = new Flower(12, FlowerColor.BLUE, 150.0, null);
		assertEquals(flower.getColor(), flower2.getColor());
	}

}

