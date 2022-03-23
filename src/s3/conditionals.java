package s3;

// import the JOptionPane === Scanenr
import javax.swing.*;

public class conditionals {
    public static void main(String[] args) {
        int number, data = 5;

        // Integer.parseInt() --> change the data to a string
        number = Integer.parseInt(JOptionPane.showInputDialog("complete with a number: "));

        /*
         == --> equal
         != --> not equal
         > --> greater than
         < --> is not greater than
         >= --> equal or greater
         <= --> equal or minor
        */

        /*
        // double ==, no triple
        if (number == data) {
            JOptionPane.showMessageDialog(null, "the number is 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"the number is not 5");
        }
        */

        /*
        // double !=, no triple
        if (number != data) {
            JOptionPane.showMessageDialog(null, "the number is not 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"the number is 5");
        }

         */

        // for greater only >
        if (number >= data) {
            JOptionPane.showMessageDialog(null, "the number is greater than 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"the number is not greater than 5");
        }


    }
}
