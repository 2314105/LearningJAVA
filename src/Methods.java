public class Methods {

    // Main method, the entry point of the application
    public static void main(String[] args) {
        // Define a name and age and call the hello method
        String name = "Josh";
        int age = 24;
        hello(name, age);

        // Define two integers x and y, then call the add method
        int x = 4;
        int y = 5;
        int u = 7;

        // Call the add method and store the result in z
        int z = add(x, y);
        int q = add(x, y, u);

        System.out.println(z);
        System.out.println(q);
    }

    // Method to add two integers and return the result, you can have them named the same but the paramertes need to be
    //diffrent, this is called method overload
    static int add(int x, int y) {
        int a = x + y;
        return a;  // Return the sum of x and y
    }

    static int add(int x, int y, int u) {
        int a = x + y + u;
        return a;  // Return the sum of x and y
    }

    // Method to print a greeting message with the provided name and age
    static void hello(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
