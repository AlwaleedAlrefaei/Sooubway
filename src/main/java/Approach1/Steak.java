package Approach1;


public class Steak extends Sandwich {
    public Steak() {
        description = "Steak";
    }

    @Override
    public double getPrice() {
        return 6.50;
    }
}