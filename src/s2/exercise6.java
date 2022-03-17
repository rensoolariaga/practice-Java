package s2;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        float a, b;
        double result;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the first number: ");
        a = entry.nextFloat();

        System.out.println("complete with the second number: ");
        b = entry.nextFloat();

        result = (Math.pow(a, 2) + (2 * (a * b)) + (Math.pow(b, 2)));

        /*
        ALTERNATIVE

        result = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);
        */
        System.out.println("the first number is: " + a);
        System.out.println("the second number is: " + b);
        System.out.println("the result of the sum of squares: " + result);

    }
}
