package s3;

import javax.swing.*;

public class exercise2 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("complete with the first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("complete with the second number: "));

        if(num1 > num2) {
            JOptionPane.showMessageDialog(null,"the most bigg is: " + num1);
        }
        else if(num2 > num1) {
           JOptionPane.showMessageDialog(null,"the most bigg is: " + num2);
        }
        else {
            JOptionPane.showMessageDialog(null,"the numbers are equals");
        }

    }
}
