package Approach2;

public class Sooubway {

    public static void main(String[] args) {

        Sandwich chicken = new Chicken();
        System.out.println(
                chicken.getDescription() +
                        " $" + chicken.getPrice()
        );

        Sandwich steak = new Steak();
        System.out.println(
                steak.getDescription() +
                        " $" + steak.getPrice()
        );

        Sandwich tuna = new Tuna();
        System.out.println(
                tuna.getDescription() +
                        " $" + tuna.getPrice()
        );
    }
}