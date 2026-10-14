package model;

import model.constants.Discount;

import java.util.Objects;

import static model.constants.Colour.RED;

public class Apple extends Food{
    private final String color;

    public Apple (int amount, double price, String color){
        super(amount, price,true);
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(color, RED)){
            return Discount.DISCOUNT_RED_APPLE;
        }
        return 0;
    }
}
