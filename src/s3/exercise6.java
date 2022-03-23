package s3;

import javax.swing.*;

public class exercise6 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("complete with the first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("complete with the second number: "));

        if((num1 % 2 == 0) && (num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null,"the numbers are pairs");
        }
        else if ((num1 % 2 != 0) && (num2 % 2 != 0)) {
            JOptionPane.showMessageDialog(null,"the numbers are odds");
        }
        else {
            JOptionPane.showMessageDialog(null,"one number is par and the other number is odd");
        }
    }
}
