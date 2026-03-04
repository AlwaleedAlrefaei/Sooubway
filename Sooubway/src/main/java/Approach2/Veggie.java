package Approach2;

public class Veggie extends Sandwich {

    @Override
    public String getDescription() {
        return "Veggie Sandwich";
    }

    @Override
    public double getPrice() {
        return 4.50 + super.getPrice();
    }
}