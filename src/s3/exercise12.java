package s3;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class exercise12 {
    public static void main(String[] args) {
        int note;

        note = Integer.parseInt(JOptionPane.showInputDialog("complete with the note: "));

        if(note > 0 && note < 4) {
            JOptionPane.showMessageDialog(null,"the exam is disapproved");
        }
        else if(note > 3 && note < 6) {
            JOptionPane.showMessageDialog(null,"the exam is approved");
        }
        else if(note > 5 && note < 10) {
            JOptionPane.showMessageDialog(null,"the exam is outstanding");
        }
        else if(note == 10) {
            JOptionPane.showMessageDialog(null,"the exam is perfect");
        }
        else {
            JOptionPane.showMessageDialog(null,"the note must be a number in the range of 1 y 10");
        }
    }
}
