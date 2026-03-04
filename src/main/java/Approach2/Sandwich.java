package Approach2;

public abstract class Sandwich {
    protected boolean chipotleSauce;
    protected boolean blueCheese;
    protected boolean garlicSauce;

    public abstract String getDescription();

    public double getPrice() {
        double total = 0.0;
        if (chipotleSauce) total += 0.75;
        if (blueCheese) total += 1.00;
        if (garlicSauce) total += 0.50;
        return total;
    }
}