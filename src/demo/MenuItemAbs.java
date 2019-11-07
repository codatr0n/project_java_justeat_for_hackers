package demo;

import java.util.ArrayList;

public abstract class MenuItemAbs {

    protected String name;
    protected double price;
    protected String description;
    protected String type;


    public MenuItemAbs(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public abstract Boolean hasSideOrders();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
