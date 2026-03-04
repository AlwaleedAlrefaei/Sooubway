package Approach1;

public class TurkeyWithGarlicSauce extends Turkey {
    public TurkeyWithGarlicSauce() {
        description = "Turkey with Garlic Sauce";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.65;
    }
}