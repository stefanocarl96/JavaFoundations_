package org.bts_netmind.javaproject.model;

public class MainCourse extends Dish {

    public MainCourse(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        super(dishName, glutenFree, vegetarian, halalMeat, seafoodFree, extras);
    }

    @Override
    public String toString() {
        String[] arr = extras.split("-");
        return super.toString() +"main course made of " + arr[0] + " and preferred drink " + arr[1];
    }
}
