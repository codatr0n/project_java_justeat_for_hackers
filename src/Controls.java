import java.util.Scanner;

public class Controls {

    public static String getString(String s) {
        System.out.println(s + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInt(String s){
        while (true) try {
            return Integer.parseInt(getString(s));

        } catch (NumberFormatException e) {
            System.out.println("Husk det skal være et tal");
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    // format price method
    public static String fPrice(double price) {
        return String.format("%4.2f kr.", price);
    }

    public static void runMenu(Order myOrder) {
        Views.clear();
        Views.displayMenu(myOrder.getRestaurant());
        boolean ordering = true;
        while(ordering) {

            String choice = getString("Valg (tryk H for hjælp)");
            switch (choice.toLowerCase()) {
                case "q": // quit
                    ordering = false;
                    break;
                case "h": // help
                    Views.displayMenuOptions();
                    break;
                case "m": // see menu
                    Views.clear();
                    Views.displayMenu(myOrder.getRestaurant());
                    break;
                case "s": // view order
                    Views.clear();
                    Views.displayOrderDetails(myOrder);
                    break;
                case "f": // remove item from order
                    Views.clear();
                    Views.askDeleteItem(myOrder);
                    boolean deleting = true;
                    while (deleting) {
                        String remChoice = getString("Vælg et tal for at slette (0 = tilbage / fortryd)");
                        if (remChoice.equalsIgnoreCase("0")) { // break remove loop
                            deleting = false;
                            Views.clear();
                            Views.displayMenu(myOrder.getRestaurant());
                            break;
                        }
                        MenuItem res = myOrder.removeItem(remChoice);
                        if (res == null) { // invalid user input
                            Views.failedDeleteItem(remChoice);
                        } else { // delete item success
                            Views.clear();
                            Views.displayOrderDetails(myOrder);
                            Views.confirmDeleteItem(res);
                        }
                    }
                    break;
                case "b": // complete order
                    if (myOrder.getOrderedItems().size() == 0) {
                        Views.emptyOrder();
                    }
                    else {
                        Views.clear();
                        Views.displayOrderDetails(myOrder);
                        boolean answering = true;
                        while (answering) {
                            String finalize = Controls.getString("Bekræft og send bestilling? (ja/nej)");
                            if (finalize.equalsIgnoreCase("ja")) {
                                answering = false;
                                Views.finalizeOrder(myOrder);
                                ordering = false;
                            } else if (finalize.equalsIgnoreCase("nej")) {
                                answering = false;
                                Views.clear();
                                Views.displayMenu(myOrder.getRestaurant());
                            }
                        }
                    }
                    break;
                default:
                     if (isInteger(choice)) { // check for integer
                         int menuNumber = Integer.parseInt(choice);
                         if (myOrder.getRestaurant().isInMenu(menuNumber)) { // is selection in menu?
                             MenuItem result = myOrder.addItem(myOrder.getRestaurant().getMenu().get(menuNumber-1));
                             Views.confirmItemAdded(result);
                         }
                         else {
                             Views.notInMenu();;
                         }
                     }
            }
        }
    }
}
