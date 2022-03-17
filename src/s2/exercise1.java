package s2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float note1, note2, note3, resultOfSum;

        System.out.println("write the three notes of the exams please: ");

        note1 = entry.nextFloat();
        note2 = entry.nextFloat();
        note3 = entry.nextFloat();

        resultOfSum = note1 + note2 + note3;

        // \n ---> jump of line
        System.out.println("\n im the result of sum with a jump of line: " + resultOfSum);
    }
}
