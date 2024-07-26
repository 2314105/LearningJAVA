
public class LogicalOperators {

    public static void main(String[] args) {

        /*
        Logical operators connect two or more expressions
        && - and (both conditions must be true)
        || - or (both conditions must be true)
        ! = not (reverses boolean value of condition)
         */

        int temp = 25;

        if (temp > 30) {
            System.out.println("Its hot outside");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("Its warm");
        }
        else{
            System.out.println("Its cold");
        }

        String userInput = "R";

        if (userInput.equals("q") || userInput.equals("Q")) {
            System.out.println("You have Quit");
        }
        else if (userInput.equals("r") || userInput.equals("R")) {
            System.out.println("You have Restart");
        }



    }

}
