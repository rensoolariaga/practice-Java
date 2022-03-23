package s3;

import javax.swing.*;

public class exercise5 {
    public static void main(String[] args) {
        double salary;
        int workHours, payWorkHours = 16, payWorkExtraHours = 20;

        workHours = Integer.parseInt(JOptionPane.showInputDialog("complete with the amount of hours worked: "));

        if(workHours <= 40) {
            salary = workHours * payWorkHours;
            JOptionPane.showMessageDialog(null,"your salary is: " + salary);
        }
        else {
            salary = (40 * 16) + ((workHours - 40) * payWorkExtraHours);
            JOptionPane.showMessageDialog(null,"your salary with extra hours is: " + salary);
        }

        /*
        ALTERNATIVE

        int workedHours;
        float salary;

        workedHours = Integer.parseInt(JOptionPane.showInputDialog("complete with the worked hours: "));

        if(workedHours <= 40) {
        salary = workedHours * 16;
            JOptionPane.showMessageDialog(null,"your salary is: " + salary);
        }
        else {
        salary = (40 * 16) + ((workedHours - 40) * 20);
                    JOptionPane.showMessageDialog(null,"your salary with extra hours is: " + salary);

        }
        */
    }
}
