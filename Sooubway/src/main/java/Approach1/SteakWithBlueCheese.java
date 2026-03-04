package Approach1;

public class SteakWithBlueCheese extends Steak {
    public SteakWithBlueCheese() {
        description = "Steak with Blue Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.00;
    }
}