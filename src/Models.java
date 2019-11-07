import java.util.ArrayList;

public class Models {

    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants.add(createRestaurant1());
        restaurants.add(createRestaurant2());
        restaurants.add(createRestaurant3());
        return restaurants;
    }

    // create restaurant using 1st constructor
    private static Restaurant createRestaurant1() {

        Restaurant restaurant = new Restaurant("Gastronomia");
        restaurant.setDeliveryFee(59.00);
        restaurant.setDeliveryTime(45);

        restaurant.addMenuItem(new MenuItem("Margherita", 48, "Tomat og ost"));
        restaurant.addMenuItem(new MenuItem("Capricciosa", 57, "Tomat, ost, Ital. kogt, skinke og champignon"));
        restaurant.addMenuItem(new MenuItem("Italiana", 58, "Tomat, ost, løg og kødsauce"));
        restaurant.addMenuItem(new MenuItem("Mexicana", 61, "Tomat, ost, løg, peberfrugt, chilisauce og kødsauce"));
        restaurant.addMenuItem(new MenuItem("Gorgonzola", 65, "Tomat, ost, gorgonzola og parmaskinke"));
        restaurant.addMenuItem(new MenuItem("Quattro Stagioni", 68, "Tomat, ost, champignon, rejer, skinke, artiskokker og paprika"));
        restaurant.addMenuItem(new MenuItem("Straccitella", 83, "Mozzarella, ost cream, brocoli, tomatskiver, kartofler, vitello og trøffelsauce"));

        return restaurant;
    }

    // create restaurant using overloaded constructor variation 1
    private static Restaurant createRestaurant2() {

        Restaurant restaurant = new Restaurant("Halifax", 49.00);
        restaurant.setDeliveryTime(35);

        restaurant.addMenuItem(new MenuItem("København", 75, "Bøf, chipotlemayo, cheddarost, syltede agurker, salat, tomat og salatløg", "Burger"));
        restaurant.addMenuItem(new MenuItem("Palermo", 78, "Bøf, bluecheese creme, bacon, semi-dried tomater, syltede rødløg og salatløg", "Burger"));
        restaurant.addMenuItem(new MenuItem("Lone Star", 79, "Bøf, BBQ-marinade, bacon, 2 x cheddarost, salat og salatløg", "Burger"));
        restaurant.addMenuItem(new MenuItem("Zihuatanejo", 81, "Bøf, guacamole, tomatsalsa, røde jalapenos, cheddarost, salat og salatløg", "Burger"));
        restaurant.addMenuItem(new MenuItem("Zürich", 83, "Bøf, aioli, rösti-top, chilistegte champignon, cheddarost, bacon, syltede rødløg, salat og kryddersmør", "Burger"));
        restaurant.addMenuItem(new MenuItem("Liverpool", 80, "Bøf, spejlæg, karamelliserede løg, Brooklyn-sauce, bacon, cheddarost, salat, syltede agurker, salatløg og purløg", "Burger"));
        restaurant.addMenuItem(new MenuItem("Nakskov", 77, "Bøf, ristede løg, cheddarost, bacon, sennep, syltede agurker, syltede rødbeder og remoulade", "Burger"));

        return restaurant;
    }

    // create restaurant using overloaded constructor variation 2
    private static Restaurant createRestaurant3() {

        Restaurant restaurant = new Restaurant("Taco Shop", 69.00, 50);

        restaurant.addMenuItem(new MenuItem("Tacos", 30, "Majstortilla, krydret hakket oksekød, salat, tomat, jalapenos, revet ost, totilla chips"));
        restaurant.addMenuItem(new MenuItem("Burritos", 53, "Hvedemelstortilla, kylling, revet ost, salat, tomat, løg, jalapenos, refried beans, salsa"));
        restaurant.addMenuItem(new MenuItem("Chimichanga", 67, "Friturestegt hvedemelstortilla med hakket oksekød, cheddarost, løg, ranchero sauce, creme fraiche."));
        restaurant.addMenuItem(new MenuItem("Quesadillas", 52, "Hvedemelstortilla med smeltet ost, tomat, løg, sorte oliven, jalapenos, ranchero sauce, creme fraiche."));
        restaurant.addMenuItem(new MenuItem("Chicken Nachos", 67, "Majstortillachips med kylling, smeltet cheddarost, løg, sorte oliven, tomat, jalapenos, creme fraiche, guacamole, salsa."));

        return restaurant;
    }
}
