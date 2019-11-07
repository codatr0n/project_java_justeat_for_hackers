import java.util.ArrayList;

public class Restaurant {
    private String name;
    // public MenuCard menucard = new MenuCard();
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private double deliveryFee;
    private int deliveryTime;

    // constructor
    public Restaurant(String name) {
        this.name = name;
    }

    // overloaded constructor method
    public Restaurant(String name, double deliveryFee) {
        this.name = name;
        this.deliveryFee = deliveryFee;
    }

    // even more overloaded constructor method
    public Restaurant(String name, double deliveryFee, int deliveryTime) {
        this.name = name;
        this.deliveryFee = deliveryFee;
        this.deliveryTime = deliveryTime;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    // check if requested number is in restaurant menu
    public boolean isInMenu(int choice) {
        if (0 < choice && choice <= this.getMenu().size()) {
            return true;
        }
        return false;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public MenuItem addMenuItem(MenuItem item) {
        this.getMenu().add(item);
        return item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
