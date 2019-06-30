package org.bts_netmind.javaproject.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Dish {

    protected String dishName;
    protected boolean glutenFree;
    protected boolean vegetarian;
    protected boolean halalMeat;
    protected boolean seafoodFree;
    protected String extras;
    private static List<Dish> dishes = new ArrayList<Dish>();

	public Dish() { }

    public Dish(String dishName, boolean glutenFree, boolean vegetarian, boolean halalMeat, boolean seafoodFree, String extras) {
        this.dishName = dishName;
        this.glutenFree = glutenFree;
        this.vegetarian = vegetarian;
        this.halalMeat = halalMeat;
        this.seafoodFree = seafoodFree;
        this.extras = extras;
        dishes.add(this);
    }

    public static List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getDishName() { return dishName; }
	public void setDishName(String dName) { this.dishName = dName; }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isHalalMeat() {
        return halalMeat;
    }

    public void setHalalMeat(boolean halalMeat) {
        this.halalMeat = halalMeat;
    }

    public boolean isSeafoodFree() {
        return seafoodFree;
    }

    public void setSeafoodFree(boolean seafoodFree) {
        this.seafoodFree = seafoodFree;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
	    String result = this.dishName + ", a ";
	    if (isGlutenFree()) {
	        result += "gluten free dish, ";
        }
        if (isVegetarian()) {
	        result += "vegetarian dish, ";
        }
        if (isHalalMeat()) {
            result += "halal meat dish, ";
        }
        if (isSeafoodFree()) {
            result += "seafood free dish, ";
        }

        return result;
    }
}
