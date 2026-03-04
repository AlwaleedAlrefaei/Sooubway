package Approach2;

public class Steak extends Sandwich {

    @Override
    public String getDescription() {
        return "Steak Sandwich";
    }

    @Override
    public double getPrice() {
        return 6.50 + super.getPrice();
    }
}