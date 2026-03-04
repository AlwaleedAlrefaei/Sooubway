package Approach1;

public class ChickenWithRanch extends Chicken {
    public ChickenWithRanch() {
        description = "Chicken with Mayonnaise";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50;
    }
}