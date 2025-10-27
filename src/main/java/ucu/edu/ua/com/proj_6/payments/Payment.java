package ucu.edu.ua.com.proj_6.payments;

public interface Payment {
    boolean pay(double amount);
    
    String getPaymentMethod();
}