package s2;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        float participationNote, firstPartial, secondPartial, finalExam;
        double finalNote;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the note of the participation: ");
        participationNote = entry.nextFloat();

        System.out.println("complete with the note of the first partial: ");
        firstPartial = entry.nextFloat();

        System.out.println("complete with the note of the second partial: ");
        secondPartial = entry.nextFloat();

        System.out.println("complete with the note of the final exam: ");
        finalExam = entry.nextFloat();

        finalNote = (participationNote * 0.1) + (firstPartial * 0.25) + (secondPartial * 0.25) + (finalExam * 0.4);

        /*
        ALTERNATIVE

        participationNote *= 0.1f;
        firstPartial *= 0.25f;
        secondPartial *= 0.25f;
        finalExam *= 0.4f;

        finalNote =  participationNote + firstPartial + secondPartial + finalExam;
        */

        System.out.println("the note of participation is: " + participationNote);
        System.out.println("the note of the first partial is: " + firstPartial);
        System.out.println("the note of the second partial is: " + secondPartial);
        System.out.println("the note of the final exam is: " + finalExam);
        System.out.println("the final note is: " + finalNote);
    }
}
