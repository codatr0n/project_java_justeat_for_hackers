public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String type = null;

    // constructor
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // overloaded constructor
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // overloaded constructor
    public MenuItem(String name, int price, String description, String type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        if (this.hasType()) {
            return this.name + " (" + this.type + ")";
        }
        return this.name;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public boolean hasType() {
        if (this.type != null) {
            return true;
        }
        return false;
    }
}
