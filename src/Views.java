import java.util.ArrayList;

public class Views {

    public static void clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static void displayWelcome(ArrayList<Restaurant> restaurants) {
        displayHeader("WELCOME TO JUST EAT FOR HACKERS");
        System.out.println("Vælg en restaurant:\n");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println("\t" + (i+1) + ") " + restaurants.get(i).getName());
        }
        System.out.print("\n");
    }

    private static void displayHeader(String str) {
        System.out.println("================================================================================");
        System.out.println(str);
        System.out.println("================================================================================");
    }

    // overloaded displayHeader method
    private static void displayHeader(String str, int width) {
        StringBuilder divider = new StringBuilder();
        for (int i = 0; i < width; i++) {
            divider.append("=");
        }
        System.out.println(divider);
        System.out.println(str);
        System.out.println(divider);
    }

    public static void displayMenu(Restaurant restaurant) {
        displayHeader(restaurant.getName().toUpperCase() + " (Menu)");

        for (int i = 0; i < restaurant.getMenu().size(); i++) {
            String name = restaurant.getMenu().get(i).getName();
            double price = restaurant.getMenu().get(i).getPrice();
            System.out.printf(i+1 + ". %-68s", name.toUpperCase());
            // System.out.printf("%4.2f kr.", restaurant.getMenu().get(i).getPrice());
            System.out.print(Controls.fPrice(price));
            System.out.print("\n");
            String description = lineBreak(restaurant.getMenu().get(i).getDescription(), 60);
            System.out.println(description);
            System.out.println("................................................................................");

        }
    }

    // utility method to insert line breaks in a long string
    private static String lineBreak(String str, int width) {
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while ((i = sb.indexOf(" ", i + width)) != -1) {
            sb.replace(i, i + 1, "\n");
        }
        return sb.toString();
    }

    public static void displayOrderDetails(Order myOrder) {
        displayHeader("Ordre number: " + myOrder.getOrderNumber(), 40);
        System.out.println("Dato: " + myOrder.getOrderDate());
        System.out.println("Restaurant: " + myOrder.getRestaurant().getName());
        System.out.println("\nBestilling:");
        for (int i = 0; i < myOrder.getOrderedItems().size(); i++) {
            String name = myOrder.getOrderedItems().get(i).getName();
            double price = myOrder.getOrderedItems().get(i).getPrice();

            System.out.printf(i+1 + ". %-28s", name);
            System.out.print(Controls.fPrice(price) + "\n");
        }
        System.out.println();
        double deliveryPrice = myOrder.getRestaurant().getDeliveryFee();
        System.out.printf("%-31s", "Levering: ");
        System.out.print(Controls.fPrice(deliveryPrice));
        System.out.println();
        displayHeader("Total: " + Controls.fPrice(myOrder.getOrderTotal()),40);
        System.out.println();
    }

    public static void finalizeOrder(Order myOrder) {
        System.out.println();
        System.out.println("Tak for din bestilling.");
        System.out.println("Leveringstiden er ca. " + myOrder.getRestaurant().getDeliveryTime() + " min.");
    }

    public static void displayMenuOptions() {
        System.out.println();
        System.out.println("[#] Skriv et tal for at tilføje til ordre");
        System.out.println("[M] Se menukort");
        System.out.println("[S] Se bestilling");
        System.out.println("[F] Fjern mad fra bestilling");
        System.out.println("[B] Afslut og send bestilling");
        System.out.println("[H] Hjælp - denne menu");
        System.out.println("[Q] Quit");
        System.out.println();
    }

    public static void confirmItemAdded(MenuItem item) {
        System.out.println(item.getName() + " er tilføjet til din bestilling\n");
    }

    public static void askDeleteItem(Order myOrder) {
        displayOrderDetails(myOrder);
        System.out.println("Hvilket nr. fra din bestilling vil du fjerne?");
    }

    public static void confirmDeleteItem(MenuItem item) {
        System.out.println(item.getName().toUpperCase() + " blev fjernet fra din bestilling\n");
    }

    public static void failedDeleteItem(String item) {
        System.out.println(item + " findes ikke i din bestilling. Prøv igen.");
    }

    public static void notInMenu() {
        System.out.println("Dit valg er ikke på restaurantens menukort\n");
    }

    public static void emptyOrder() {
        System.out.println("Du kan ikke sende en tom bestilling\n");
    }

}
