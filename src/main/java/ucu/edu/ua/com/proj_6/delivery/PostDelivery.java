package ucu.edu.ua.com.proj_6.delivery;

public class PostDelivery extends DeliveryStrategy {

    @Override
    public double delivery(double orderPrice) {
        System.out.println("Delivery by PostDelivery");
        if (orderPrice < 1000) {
            return 50;
        }
        return 20;
    }

    @Override
    public double delivery() {
        return 50;
    }

}
