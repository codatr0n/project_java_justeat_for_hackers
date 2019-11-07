import demo.Burger;
import demo.Sideorder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Restaurant> restaurants = Models.getRestaurants();

        Views.displayWelcome(restaurants);
        int restaurantChoice = Controls.getInt("Hvilken restaurant vil du bestille fra?");
        Order myOrder = new Order(restaurants.get(restaurantChoice-1));

        Controls.runMenu(myOrder);



        // EXAMPLES

//        // composition: replace restaurant arraylist for menuitems with object MenuCard
//        System.out.println(restaurants.get(2).menucard);
//
//
//        // creating a demo.Burger class by extending the demo.MenuItemAbs
//        Burger cheeseBurger = new Burger("Cheese Burger", 75, "Bøf, 3 skiver ost, pickles, ketchup, løg");
//        cheeseBurger.setType("Burger");
//
//        // Adding a sideorder to the newly created cheese burger
//        Sideorder fritter = new Sideorder("Pommes Fritter", 29, "Håndskårne, dobbelt fritterede, grove fritter");
//        fritter.setCookingtime(5);
//        cheeseBurger.addSideorders(fritter);
//
//        // demo output of cheese burger and fries
//        System.out.println(cheeseBurger.getName().toUpperCase() + " (" + Controls.fPrice(cheeseBurger.getPrice()) + ")");
//        System.out.println("Ingredienser: " + cheeseBurger.getDescription() + "\n");
//        if (cheeseBurger.hasSideOrders()) {
//            System.out.println("Vil du have tilkøbe en sideorder til din " + cheeseBurger.getName() + "?");
//            for (int i = 0; i < cheeseBurger.getSideOrders().size(); i++) {
//                String name = cheeseBurger.getSideOrders().get(i).getName();
//                double price = cheeseBurger.getSideOrders().get(i).getPrice();
//                String desc = cheeseBurger.getSideOrders().get(i).getDescription();
//                System.out.println((i+1) + ". " + name + " (" + Controls.fPrice(price) + ")\n   Beskrilvese: " + desc);
//            }
//        }
//


    }

}
