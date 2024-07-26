public class IfStatements {

    public static void main(String[] args) {

        int age = 10;

        if (age < 0) {
            System.out.println("You are not alive");
        }
        else if (age >= 1 && age <= 12) {
            System.out.println("You are a child");
        }
        else if (age >= 13 && age <= 18) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are an adult");
        }
    }

}
