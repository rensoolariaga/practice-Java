package s3;

import javax.swing.*;

public class exercise3 {
    public static void main(String[] args) {
        char letter;

        letter = JOptionPane.showInputDialog("complete with a word").charAt(0);

        // Character.isUpperCase --> method to comprobe mayuscle
        if(Character.isUpperCase(letter)) {
            JOptionPane.showMessageDialog(null, "the letter is capitals");
        }
        else {
            JOptionPane.showMessageDialog(null, "the letter is minuscule");
        }

    }
}
