public class Variables {
    /*
    Types of Varibles, you need to innitiate before hand.
    Boolean
    Byte
    Short
    Int
    Long
    Float
    Double
    Char
    String
     */

    public static void main(String[] args) {
        int x; //decleration

        x = 123; //assignment

        int y = 123; //intialization
        float z = 3.14f; //have to put an f to say its a float
        double w = 3.14; //dont have to put an f at the end and is more accurate
        boolean t = true;
        char symbol = '@'; // only displays one character
        String name = "hello world";

        System.out.println(x);
        System.out.println(y);
        System.out.println("My number is: " +x);
        System.out.println("My number is: " +y);
        System.out.println("My number is: " +z);
        System.out.println("My number is: " +w);
        System.out.println("My number is: " +t);
        System.out.println("My number is: " +symbol);
        System.out.println("My number is: " +name);
        System.out.println("\n");


        //How to swap two variables

        String a = "Water";
        String b = "Earth";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


    }

}
