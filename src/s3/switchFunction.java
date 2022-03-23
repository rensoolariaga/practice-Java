package s3;

import javax.swing.*;

public class switchFunction {
    public static void main(String[] args) {
        int data;

        data = Integer.parseInt(JOptionPane.showInputDialog("complete with a number between 1 and 5: "));

        switch (data) {
            case 1: JOptionPane.showMessageDialog(null, "the number is 1");
            break;
            case 2: JOptionPane.showMessageDialog(null, "the number is 2");
                break;
            case 3: JOptionPane.showMessageDialog(null, "the number is 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "the number is 4");
                break;
            case 5: JOptionPane.showMessageDialog(null, "the number is 5");
                break;
            default: JOptionPane.showMessageDialog(null,"the number is over the range of 1 and 5");
                break;
        }
    }
}
