package ucu.edu.ua.com.proj_6.payments;

public class CreditCardPaymentStrategy implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    
    public CreditCardPaymentStrategy(String cardNumber, String cardHolderName, 
                                   String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
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
        return "Credit Card";
    }
    
    public String getCardHolderName() {
        return cardHolderName;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }
}