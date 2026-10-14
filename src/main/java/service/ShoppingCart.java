package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double FullNetWorth(){
        double netWorth = 0;
        for (Food item : items) {
            netWorth += item.getPrice() * item.getAmount();
        }
        return netWorth;
    }

    public double DiscountNetWorth(){
        double netWorth = 0;
        for (Food item : items) {
            netWorth += item.getPrice() * item.getAmount() * ((100 - item.getDiscount()) / 100);
        }
        return netWorth;
    }

    public double VegeterianNetWorth(){
        double netWorth = 0;
        for (Food item : items) {
            if (item.isVegetarian()){
                netWorth += item.getPrice() * item.getAmount();
            }
        }
        return netWorth;
    }
}
