// import JOptionPane for handler the input with emerging windows
import javax.swing.*;

public class entryAndOutputOfDataWithJOptionPane {
    public static void main(String[] args) {
        String stringVar;
        int intVar;
        char charVar;
        double doubleVar;

        // use the JOptionPane for asign a value to the var (string) with the emergering window
        stringVar = JOptionPane.showInputDialog("Write a string"); // return a string

        // Integer.paseInt() ---> because the JOptionPane return a string i change the type of data with the Interger method
        intVar = Integer.parseInt(JOptionPane.showInputDialog("Write a integer number"));

        charVar = JOptionPane.showInputDialog("Write a char string").charAt(0);

        // Double.parseDouble() ---> because the JOptionPane return a string i change the type of data with the Double method
        doubleVar = Double.parseDouble(JOptionPane.showInputDialog("Write a double number please: "));

        //  JOptionPane.showMessageDialog(parentComponent, message) --> for show the results after write them
        JOptionPane.showMessageDialog(null, "the string is: " + stringVar);
        JOptionPane.showMessageDialog(null, "the integer is: " + intVar);
        JOptionPane.showMessageDialog(null, "the char is: " + charVar);
        JOptionPane.showMessageDialog(null, "the double is: " + doubleVar);
    }
}
