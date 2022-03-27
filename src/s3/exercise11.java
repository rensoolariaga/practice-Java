package s3;

import javax.swing.*;

public class exercise11 {
    public static void main(String[] args) {
        int number1, number2;
        double sum, rSubstract, multiply, divide;
        char action;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("complete with the number1: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("complete with the number2: "));

        action = JOptionPane.showInputDialog("complete with the letter of the action: ").charAt(0);

        switch (action) {
            // the case char is with single quotes
            case 's':
                // because im not write the break, continue to the next case
            case 'S':
                sum = number1 + number2;
                JOptionPane.showMessageDialog(null, "the sum is: " + sum);
                break;
            case 'r':
            case 'R':
                rSubstract = number1 - number2;
                JOptionPane.showMessageDialog(null, "the substract is: " + rSubstract);
                break;
            case 'm':
            case 'M':
                multiply = number1 * number2;
                JOptionPane.showMessageDialog(null, "the multiply is: " + multiply);
                break;
            case 'd':
            case 'D':
                divide = number1 / number2;
                JOptionPane.showMessageDialog(null, "the divide is: " + divide);
                break;
            default:
                JOptionPane.showMessageDialog(null, "the letter income is not a function");
                break;

        }
    }
}
