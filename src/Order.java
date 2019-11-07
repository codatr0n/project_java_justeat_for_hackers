import java.util.ArrayList;
import java.util.Date;

public class Order {

    private long orderNumber;
    private Date orderDate;
    private Restaurant restaurant = null;
    private ArrayList<MenuItem> orderedItems;

    public Order(Restaurant selectedRestaurant) {
        this.restaurant = selectedRestaurant;
        this.orderedItems = new ArrayList<>();
        this.orderDate = new Date();
        this.orderNumber = makeOrderNumber();
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public ArrayList<MenuItem> getOrderedItems() {
        return this.orderedItems;
    }

    private long makeOrderNumber() {
        long orderNumber = System.currentTimeMillis() / 1000L;
        return orderNumber;
    }

    public MenuItem addItem(MenuItem menuItem) {
        this.orderedItems.add(menuItem);
        return menuItem;
    }

    public MenuItem removeItem(String choice) {
        if (Controls.isInteger(choice)) {
            int menuNumber = Integer.parseInt(choice);

            if (isInOrder(menuNumber)) {
                MenuItem result = this.orderedItems.get(menuNumber-1);
                this.orderedItems.remove(menuNumber-1);
                return result;
            }
            else {
                return null;
            }
        }
        return null;
    }

    private boolean isInOrder(int choice) {
        if (0 < choice && choice <= this.orderedItems.size()) {
            return true;
        }
        return false;
    }

    public double getOrderTotal() {
        double total = 0;
        for (int i = 0; i < this.getOrderedItems().size(); i++) {
            total += this.getOrderedItems().get(i).getPrice();
        }
        total += this.getRestaurant().getDeliveryFee();
        return total;
    }

}
