package s2;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        float guillermo, juan, luis, totalOfDollars;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the amount of dollars of Guillermo:");
        guillermo = entry.nextFloat();

        // divide
        luis = guillermo / 2;

        // sum and divide
        juan = (guillermo + luis) / 2;

        totalOfDollars = guillermo + juan + luis;

        System.out.println("the amount of dollars of guillermo is: " + guillermo);
        System.out.println("the amount of dollars of juan is: " + juan);
        System.out.println("the amount of dollars of luis is: " + luis);
        System.out.println("the total of dollars is: " + totalOfDollars);

    }
}
