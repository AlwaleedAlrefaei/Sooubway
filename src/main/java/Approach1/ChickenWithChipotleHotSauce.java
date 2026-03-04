package Approach1;

public class ChickenWithChipotleHotSauce extends Chicken {
    public ChickenWithChipotleHotSauce() {
        description = "Chicken with Mustard";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.30;
    }
}