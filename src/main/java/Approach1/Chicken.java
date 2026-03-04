package Approach1;

public class Chicken extends Sandwich {
    public Chicken() {
        description = "Chicken";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}