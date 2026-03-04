package Approach1;

public class TunaWithMayonnaise extends Tuna {
    public TunaWithMayonnaise() {
        description = "Tuna with Mayonnaise";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50;
    }
}