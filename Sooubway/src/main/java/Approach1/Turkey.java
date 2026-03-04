package Approach1;

public class Turkey extends Sandwich {
    public Turkey() {
        description = "Turkey";
    }

    @Override
    public double getPrice() {
        return 5.50;
    }
}