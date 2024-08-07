public class TwoDArrays {

    public static void main(String[] args) {

        // 2D array is a array of arrays

        String[][] cars = new String[3][3];

        cars[0][0]  = "Ford";
        cars[0][1] = "BMW";
        cars[0][2] = "Honda";
        cars[1][0]  = "Mustang";
        cars[1][1] = "Golf";
        cars[1][2] = "Redonde";
        cars[2][0]  = "Tesla";
        cars[2][1] = "Mini";
        cars[2][2] = "Audi";

        for( int i = 0; i<cars.length; i++ ) {
            System.out.println();
            for( int j = 0; j<cars[i].length; j++ ) {
                System.out.print(cars[i][j] + " ");
            }
        }

        String[][] colors = {
                            {"Red","Blue","Green"},
                            {"Yellow","Brown","Purple"}, // Seperated onto different lines for readability, can just be on one line
                            {"Grey","Black","White"}
                            };

        for( int i = 0; i<colors.length; i++ ) {
            System.out.println();
            for( int j = 0; j<colors[i].length; j++ ) {
                System.out.print(colors[i][j] + " ");
            }
        }


    }
}
