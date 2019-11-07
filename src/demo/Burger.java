package demo;

import java.util.ArrayList;

public class Burger extends MenuItemAbs {

    private int cookingtime;
    private ArrayList<Sideorder> sideorders = new ArrayList<>();

    public Burger(String name, int price, String description) {
        super(name, price, description);
    }

    @Override
    public Boolean hasSideOrders() {
        if (this.sideorders.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void addSideorders(Sideorder sideorder) {
        this.sideorders.add(sideorder);
    }

    public String getType() {
        return null;
    }

    public int getCoockingTime() {
        return this.cookingtime;
    }

    public ArrayList<Sideorder> getSideOrders() {
        return this.sideorders;
    }

    public void setCookingtime(int cookingtime) {
        this.cookingtime = cookingtime;
    }
}
