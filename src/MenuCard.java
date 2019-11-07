import java.util.ArrayList;

public class MenuCard {

    private String name;
    public ArrayList<MenuItem> items;

    public MenuCard(String name) {
        this.name = name;
    }

    public MenuCard() {
        this.items = new ArrayList<MenuItem>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItems(MenuItem item) {
        items.add(item);
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

}
