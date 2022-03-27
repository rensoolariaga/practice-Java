package s3;

import javax.swing.*;

public class exercise14 {
    public static void main(String[] args) {
        int actions;
        float amountOfKg;

        amountOfKg = Float.parseFloat(JOptionPane.showInputDialog("complete with the amount of kg: "));

        actions = Integer.parseInt(JOptionPane.showInputDialog("choose the option: " +
                "1: hg" +
                "2: dag" +
                "3: g" +
                "4: dg" +
                "5: cg" +
                "6: mg"));

        switch(actions) {
            case 1:
                amountOfKg *= 10;
                JOptionPane.showMessageDialog(null,"the amount of kg in hg is: " + amountOfKg);
                break;
            case 2:
                amountOfKg *= 100;
                JOptionPane.showMessageDialog(null,"the amount of kg in dag is: " + amountOfKg);
                break;
            case 3:
                amountOfKg *= 1000;
                JOptionPane.showMessageDialog(null,"the amount of kg in g is: " + amountOfKg);
                break;
            case 4:
                amountOfKg *= 10000;
                JOptionPane.showMessageDialog(null,"the amount of kg in dg is: " + amountOfKg);
                break;
            case 5:
                amountOfKg *= 100000;
                JOptionPane.showMessageDialog(null,"the amount of kg in cg is: " + amountOfKg);
                break;
            case 6:
                amountOfKg *= 1000000;
                JOptionPane.showMessageDialog(null,"the amount of kg in mg is: " + amountOfKg);
                break;
            default:
                JOptionPane.showMessageDialog(null,"the amount income is not a function");
                break;
        }
    }
}
