import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float number1, number2, substract, sum, multiply, division, rest;

        System.out.println("write two numbers");

        number1 = entry.nextFloat();
        number2 = entry.nextFloat();

        sum = number1 + number2;

        substract = number1 - number2;

        multiply = number1 * number2;

        division = number1 / number2;

        rest = number1 % number2;

        System.out.println("the sum result is: " + sum);
        System.out.println("the substract result is: "+ substract);
        System.out.println("the multiply result is: " + multiply);
        System.out.println("the division result is: " + division);
        System.out.println("the rest result is: " + rest);

    }

}
