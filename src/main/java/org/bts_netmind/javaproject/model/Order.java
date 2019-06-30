package org.bts_netmind.javaproject.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String customerName;
    private enum Type {st, mc, ds}
    private Type type;
    private Dish dish;
    private static List<Order> orders = new ArrayList<Order>();

    public Order (String customerName, String dishName, String type, boolean gfd, boolean vgd, boolean hmd, boolean sfd, String extras) {
        this.type = Type.valueOf(type);
        this.customerName = customerName;

        if (this.type == Type.st) {
            this.dish = new Starter(dishName, gfd, vgd, hmd, sfd, extras);
        } else if (this.type == Type.mc) {
            this.dish = new MainCourse(dishName, gfd, vgd, hmd, sfd, extras);
        } else if (this.type == Type.ds) {
            this.dish = new Dessert(dishName, gfd, vgd, hmd, sfd, extras);
        }

        orders.add(this);
    }

    public Order (String customerName, Dish dish) {
        this.customerName = customerName;
        this.dish = dish;
        if (dish.getClass().toString().contains("Starter")) {
            this.type = Type.st;
        } else if (dish.getClass().toString().contains("MainCourse")) {
            this.type = Type.mc;
        } else if (dish.getClass().toString().contains("Dessert")) {
            this.type = Type.ds;
        }
        orders.add(this);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static void setOrders(List<Order> orders) {
        Order.orders = orders;
    }

    @Override
    public String toString() {
        String result = customerName + " ordered " + this.dish.toString();
        return result;
    }
}
