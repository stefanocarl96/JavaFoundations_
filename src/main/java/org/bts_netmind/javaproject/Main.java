package org.bts_netmind.javaproject;

import org.bts_netmind.javaproject.model.*;
import org.bts_netmind.javaproject.service.OrdersManager;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        OrdersManager ordersManager = new OrdersManager();
        List<Order> orders = ordersManager.readCSV("online-order-sample.csv");
        List<Dish> dishes = Dish.getDishes();

        System.out.println("All orders:\n" + ordersManager.getAllOrdersToString(orders));
        System.out.println("\nTotal number of orders:" + ordersManager.getNumberOrders(orders));
        System.out.println("\nOrder num.2:\n" + ordersManager.getOrder(orders, 1));
        System.out.println("\nDish num.3:\n" + ordersManager.getDish(dishes, 2));
        System.out.println("\nAll dishes:\n" + ordersManager.getAllDishToString(dishes));
        System.out.println("\nStarters:\n" + ordersManager.getDishesByType(dishes, "Starter"));
        System.out.println("\nVegetarian meals:\n" + ordersManager.getDishesByFeature(dishes, "vgd"));
        System.out.println("\nStats of Gluten Free:\n" + ordersManager.getStatsByDishType(dishes, "gfd"));
        System.out.println("\nStats of Tony Stark:\n" + ordersManager.getStatsByCustomer(orders,"Tony Stark"));


        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String customerName = scanner.nextLine();
        Menu menu = createDishesForMenu();
        System.out.println(menu.printMenu());
        System.out.println("Choose your starter");
        new Order(customerName, menu.getStarter(scanner.nextLine()));
        System.out.println("Choose your main");
        new Order(customerName, menu.getMain(scanner.nextLine()));
        System.out.println("Choose your dessert");
        new Order(customerName, menu.getDessert(scanner.nextLine()));

        ordersManager.writeCSV(Order.getOrders());
    }

    public static Menu createDishesForMenu() {
        Dish starter1 = new Starter("Tomato soup", true, true, false, true, "spoon");
        Dish starter2 = new Starter("French onion soup", false, true, false, true, "spoon");
        Dish starter3 = new Starter("Chicken salad", false, false, true, true, "regular cutlery");
        Dish main1 = new MainCourse("German sausage", false, false, false, true, "pork-warm wine");
        Dish main2 = new MainCourse("Paella", false, false, false, false, "pasta-red wine");
        Dish main3 = new MainCourse("Vegetable lasagna", false, true, false, true, "spinach-white wine");
        Dish dessert1 = new Dessert("Fruit salad", true, true, false, true, "100");
        Dish dessert2 = new Dessert("Chocolate cake", false, true, false, true, "250");
        Dish dessert3 = new Dessert("Cheese and biscuits", false, false, false, true, "150");

        List<Dish> starters = Arrays.asList(starter1, starter2, starter3);
        List<Dish> mains = Arrays.asList(main1, main2, main3);
        List<Dish> desserts = Arrays.asList(dessert1, dessert2, dessert3);

        Menu menu = new Menu();

        menu.setStarters(starters);
        menu.setMains(mains);
        menu.setDesserts(desserts);

        return menu;
    }
}
