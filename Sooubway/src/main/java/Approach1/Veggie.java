package Approach1;

public class Veggie extends Sandwich {
    public Veggie() {
        description = "Veggie";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}