package demo;

import java.util.ArrayList;

public class Sideorder extends MenuItemAbs {

    private int cookingtime;

    public Sideorder(String name, int price, String description) {
        super(name, price, description);
    }

    @Override
    public Boolean hasSideOrders() {
        return false;
    }

    public int getCookingtime() {
        return cookingtime;
    }

    public void setCookingtime(int cookingtime) {
        this.cookingtime = cookingtime;
    }
}
