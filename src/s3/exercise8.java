package s3;

import javax.swing.*;

public class exercise8 {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("complete with a number: "));

        if(number < 10) {
            JOptionPane.showMessageDialog(null,"the number " + number + " has one number");
        }
        else if(number < 100) {
            JOptionPane.showMessageDialog(null,"the number " + number + " has two numbers");
        }
        else if(number < 1000) {
            JOptionPane.showMessageDialog(null,"the number " + number + " has three numbers");
        }
        else if(number < 10000) {
            JOptionPane.showMessageDialog(null,"the number " + number + " has four numbers");
        }
        else if(number < 100000) {
            JOptionPane.showMessageDialog(null,"the number " + number + " has five numbers");
        }

        }
    }

