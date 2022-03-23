package s3;

import javax.swing.*;

public class ternary {
    public static void main(String[] args) {
        int number;
        String message;

        number = Integer.parseInt(JOptionPane.showInputDialog("complete with a number"));

        // ternary
        message = (number % 2 == 0) ? "the number is par" : "the number is odd";
        JOptionPane.showMessageDialog(null,message);
    }
}
