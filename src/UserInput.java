import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creating a scanner object

        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // This removes the slash n from the scanner which could cause you to skip the next question

        System.out.println("Please enter your food : ");
        String food = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your food is " + food);

        scanner.close();
    }
}
