package Approach1;

public class VeggieWithFeta extends Veggie {
    public VeggieWithFeta() {
        description = "Veggie with Feta Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.75;
    }
}