package ucu.edu.ua.com.proj_6.delivery;

public abstract class DeliveryStrategy implements Delivery {

    public double delivery(double orderPrice){
        System.out.println("Delivery by DeliveryStrategy");
        if (orderPrice > 1000){
            return 0;
        }
        return 100;
    }
}
