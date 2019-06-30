package org.bts_netmind.javaproject.model;

public class Dessert extends Dish {

    public Dessert(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
    }

    @Override
    public String toString() {
        return super.toString() + "dessert of " + extras + " calories";
    }
}
