import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args) {

        // Prompt the user to enter their name and store it in a variable
        String name = JOptionPane.showInputDialog("Enter your name");

        // Display a message dialog with the entered name
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Prompt the user to enter their age and store it in a variable
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        // Display a message dialog with the entered age
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        JOptionPane.showMessageDialog(null, "Your height is " + height);

    }
}
