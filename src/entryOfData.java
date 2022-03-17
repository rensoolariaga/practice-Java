// impórt the class for use in my class
import java.util.Scanner;

public class entryOfData {
    public static void main(String[] args) {
        /*
            Scanner ---> class let me save data sending to me about a input(System.in)
        */
        Scanner entry = new Scanner(System.in);

        int numberFromInput;

        System.out.println("Write a number please");

        // nextInt() ---> method to save the value of the int input in the var
        numberFromInput = entry.nextInt();
        System.out.println("The number is: " + numberFromInput);

        // running this code the console make me write a number to show after

        float floatNumberFromInput;

        System.out.println("Write a float number please");

        // nextInt() ---> method to save the value of the int input in the var
        floatNumberFromInput = entry.nextFloat();
        System.out.println("The number is: " + floatNumberFromInput);

        // running this code the console make me write a float number (with ,) to show after
        // with the type of data double it's the same but with entry.nextDouble()

        String stringVar;

        System.out.println("Write a string please");

        // next() ---> just save the first value before a space
        // nextLine() ---> save all the changes?

        stringVar = entry.nextLine();
        System.out.println("The string is: " + stringVar);

        char charVar;

        System.out.println("Write a string please");

        // charAt(0(indexToTake)) ---> select value of the index of the data entry for asign in the var
        charVar = entry.next().charAt(0);
        System.out.println("The character is: " + charVar);


    }
}
