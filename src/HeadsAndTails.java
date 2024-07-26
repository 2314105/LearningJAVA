import java.util.Random;

public class HeadsAndTails {

    public static void main(String[] args) {
        Random random = new Random();

        boolean x = random.nextBoolean();

        if (x == true) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
