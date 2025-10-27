package ucu.edu.ua.com.proj_6.flower;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), PINK("#FFC0CB");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}