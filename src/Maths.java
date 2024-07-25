import java.util.Scanner;

public class Maths {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        /*
        Math.operators can be used with:
        min
        max
        abs
        sqrt
        round
        ceil --rounds up
        floor --rounds down
         */

        double z = Math.min(x, y);
        System.out.println(z);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is : "+c);

        scanner.close();

    }

}
