package Approach2;

public class Turkey extends Sandwich {

    @Override
    public String getDescription() {
        return "Turkey Sandwich";
    }

    @Override
    public double getPrice() {
        return 5.75 + super.getPrice();
    }
}