package s3;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class exercise13 {
    public static void main(String[] args) {
        final int initialBalance = 1000;
        float currentBalance, deposit, withdrawal;
        int actions;

        actions = Integer.parseInt(JOptionPane.showInputDialog("choose a option: "
        +"1: income money"
        +"2: withdrawal money"
        +"3: exit"));

        switch (actions) {
            case 1:
                deposit = Float.parseFloat(JOptionPane.showInputDialog("income the amount of money for the deposit: "));
                currentBalance = initialBalance + deposit;
                JOptionPane.showMessageDialog(null, "the amount of money in the balance is: " + currentBalance);
                break;
            case 2:
                withdrawal = Float.parseFloat(JOptionPane.showInputDialog("income the amount of money for the withdrawal: "));
                if(withdrawal > initialBalance) {
                    JOptionPane.showMessageDialog(null,"the amount of the withdrawal must be lower than: " + initialBalance);
                }
                else {
                    currentBalance = initialBalance - withdrawal;
                    JOptionPane.showMessageDialog(null, "the amount of money in the balance is: " + currentBalance);
                }
                break;
            case 3: break;
            default:
                JOptionPane.showMessageDialog(null, "the number income is not a function");
                break;
        }

    }
}
