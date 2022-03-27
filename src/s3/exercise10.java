package s3;

import javax.swing.*;

public class exercise10 {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("complete with the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("complete with the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("complete with the year: "));

        if(year == 0) {
            JOptionPane.showMessageDialog(null,"the year cannot be 0");
        }
        else if((month == 2) && ((day > 0) && (day < 29))) {
            JOptionPane.showMessageDialog(null,"the date (dd/mm/yy) is: " + day + "/" + month + "/" + year);
        }
        //  || --> welcome to the operation or
        else if((month == 4 || month == 6 || month == 9 || month == 11) && ((day > 0) && (day < 31))) {
            JOptionPane.showMessageDialog(null,"the date (dd/mm/yy) is: " + day + "/" + month + "/" + year);
        }
        else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && ((day > 0) && (day < 32))) {
            JOptionPane.showMessageDialog(null,"the date (dd/mm/yy) is: " + day + "/" + month + "/" + year);
        }

        else {
            JOptionPane.showMessageDialog(null,"the date is incorrect");
        }
    }
}
