package s3;

import javax.swing.*;

public class exercise4 {
    public static void main(String[] args) {
        double pay;
        pay = Integer.parseInt(JOptionPane.showInputDialog("cmoplete with the pay: "));

        if(pay >= 300) {
            pay = (pay * 0.80);
            JOptionPane.showMessageDialog(null, "the total with discount is: " + pay);
        }
        else {
            JOptionPane.showMessageDialog(null, "the total is: " + pay);
        }

        /*
        ALTERNATIVE

        float pay, discount;

        pay = Float.parseFloat(JOptionPane.showInputDialog("complete with the pay");

        if(pay >= 300){
        discount = pay * 0.20f;
        pay -= discount;
        JOptionPane.showMessageDialog(null, "the total with discount is: " + pay);
        }
        else{
        JOptionPane.showMessageDialog(null, "the total is: " + pay);
        }
        */
        }
    }
