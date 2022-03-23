package s3;

import javax.swing.*;

public class exercise1 {
    public static void main(String[] args) {
        float multiplo;
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("complete with a number: "));

        if(number % 10 == 0) {
            JOptionPane.showMessageDialog(null, "the number is multiplo of 10: ");
        }
        else {
            JOptionPane.showMessageDialog(null, "the number is not multiplo of 10: ");
        }
    }
}
