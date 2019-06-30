package org.bts_netmind.javaproject.model;

import java.util.List;

public class Menu {

    private List<Dish> starters;
    private List<Dish> mains;
    private List<Dish> desserts;

    public Menu() {}

    public List<Dish> getStarters() {
        return starters;
    }

    public void setStarters(List<Dish> starters) {
        this.starters = starters;
    }

    public Dish getStarter(String starter) {
        for (Dish dish : starters) {
            if (dish.getDishName().contains(starter)) {
                return dish;
            }
        }

        return null;
    }

    public List<Dish> getMains() {
        return mains;
    }

    public void setMains(List<Dish> mains) {
        this.mains = mains;
    }

    public Dish getMain(String main) {
        for (Dish dish : mains) {
            if (dish.getDishName().contains(main)) {
                return dish;
            }
        }

        return null;
    }

    public List<Dish> getDesserts() {
        return desserts;
    }

    public void setDesserts(List<Dish> desserts) {
        this.desserts = desserts;
    }

    public Dish getDessert(String dessert) {
        for (Dish dish : desserts) {
            if (dish.getDishName().contains(dessert)) {
                return dish;
            }
        }

        return null;
    }

    public String printMenu() {
        String result = "Starters:\n";
        for (Dish starter : starters) {
            result += starter.getDishName() + "\n";
        }

        result += "\nMain courses:\n";
        for (Dish main : mains) {
            result += main.getDishName() + "\n";
        }

        result += "\nDesserts:\n";
        for (Dish dessert : desserts) {
            result += dessert.getDishName() + "\n";
        }

        return result;
    }
}
