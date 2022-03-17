package s2;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        double a, b, c, rooutSquareBody, root1, root2;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the param a: ");
        a = entry.nextDouble();

        System.out.println("complete with the param b: ");
        b = entry.nextDouble();

        System.out.println("complete with the param c: ");
        c = entry.nextDouble();

        rooutSquareBody = ((Math.pow(b, 2) - (4 * a * c)));
        root1 = ((-(b) + Math.sqrt(rooutSquareBody)) / (2 * a));
        root2 = ((-(b) - Math.sqrt(rooutSquareBody)) / (2 * a));

        /*
        ALTERNATIVE

        root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c) / (2 * a));
        root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c) / (2 * a));

        */

        System.out.println("the param a is: " + a);
        System.out.println("the param b is: " + b);
        System.out.println("the param c is: " + c);
        System.out.println("the root square body is: " + rooutSquareBody);
        System.out.println("the root 1 (+ root square) is: " + root1);
        System.out.println("the root 2 (- root square) is: " + root2);

    }
}
