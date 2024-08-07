import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        // Arrays are used to store multiple values in a single value
        // All data types in the array have to be the same eg Int[] can only have numbers and String[] can only have ""

        String[] cars = new String[3];

        cars[0] = "Ford";
        cars[1] = "BMW";
        cars[2] = "Honda";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] colors = {"Red", "Blue", "Green", "Yellow", "Orange", "Violet"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        /*
        Array lists are arrays that can change size (You need to use the wrapper class when putting the method in the <>)
         */

        ArrayList<String> food = new ArrayList<String>();
        food.add("Egg");
        food.add("Bread");
        food.add("Cake");
        food.add("Chicken");

        food.set(0, "Sushi"); //Replaces element, in this case egg changes to sushi
        food.remove(1); //removes element, bread
        //food.clear(); // Clears the array

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }



    }

}
