package s3;

import javax.swing.*;

public class exercise9 {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("complete with the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("complete with the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("complete with the year: "));

        if((day > 0) && (day < 31)) {
            if((month > 0) && (month < 13)) {
                if(year != 0) {
                    JOptionPane.showMessageDialog(null, "the date (dd/mm/yy) is: " + day + "/" + month + "/" + year);
                }
                else {
                    JOptionPane.showMessageDialog(null, "the year must be not equal to 0");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "the moth must be lower than 13");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "the day must be lower than 31");
        }
    }
}
