package ucu.edu.ua.com.proj_6.payments;

public class PayPalPaymentStrategy implements Payment {
    private String email;
    private String password;
    
    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount: " + amount);
            return false;
        }
        
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}