package org.bts_netmind.javaproject.model;

public class Starter extends Dish {

    public Starter(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
    }

    @Override
    public String toString() {
        return super.toString() + "starter with " + extras + " needed";
    }

}
