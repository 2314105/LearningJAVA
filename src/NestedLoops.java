import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        rows++;
        System.out.println("Enter the number of columns: ");
        cols = scanner.nextInt();
        cols++;
        System.out.println("Enter the symbol: ");
        symbol = scanner.next();

        for (int i = 1; i < rows; i++) {
            System.out.println();
            for (int j = 1; j < cols; j++) {
                System.out.print(symbol + " ");
            }
        }


    }

}
