public class StringMethods {

    public static void main(String[] args) {

        String name = "fosh     ";

        //name.equals("Josh"); // Returns a boolean value
        //boolean result = name.equals("Josh");

        //int result = name.length();

        //char result = name.charAt(0);

        //int result = name.indexOf("s"); // finds a letter and returns the position

        //boolean result = name.isEmpty(); // if variable is empty returns false

        //String result = name.toUpperCase();

        //String result = name.toLowerCase();

        //String result =  name.trim();

        //String result = name.replace("o", "a");

        String result = name.substring(0,1).toUpperCase() + name.substring(1); // capitilize the first letter


        System.out.println(result);



    }
}
