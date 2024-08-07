import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {

        //2D Array lists are lists inside of lists

        ArrayList<ArrayList<String>> ShoppingList = new ArrayList<>();

        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Orange");

        ArrayList<String> Meats = new ArrayList<>();
        Meats.add("Steak");
        Meats.add("Chicken");
        Meats.add("Pork");

        ArrayList<String> Drinks = new ArrayList<>();
        Drinks.add("Coke");
        Drinks.add("Fanta");
        Drinks.add("Water");

        ShoppingList.add(Fruits);
        ShoppingList.add(Meats);
        ShoppingList.add(Drinks);

        System.out.println(ShoppingList.get(0).get(1)); //use to navigate 2D list

    }
}
