package s3;

import javax.swing.*;

public class exercise7 {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("complete with the first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("complete with the second number: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("complete with the third number: "));

        if((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "order: " + num1 + "-" + num2 + "-" + num3);
        }
        else if((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "order: " + num1 + "-" + num3 + "-" + num2);
        }
        else if((num2 > num1) && (num1 > num3)){
            JOptionPane.showMessageDialog(null, "order: " + num2 + "-" + num1 + "-" + num3);
        }
        else if((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "order: " + num2 + "-" + num3 + "-" + num1);
        }
        else if((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "order: " + num3 + "-" + num1 + "-" + num2);
        }
        else {
            JOptionPane.showMessageDialog(null, "order: " + num3 + "-" + num2 + "-" + num1);
    }
    }
}
