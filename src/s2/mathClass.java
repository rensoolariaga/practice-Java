package s2;

public class mathClass {
    public static void main(String[] args) {

        // square root ---> the type of data of the var must be double
        double root = Math.sqrt(9);

        System.out.println("i'm the value of the square root: " + root);

        // alternative --> changing the double type to int type
        int rootWithInt = (int)Math.sqrt(9);

        // power
        double base = 5, exponent = 2;

        // the method pow of the class Match received two params, first the base and second the exponent
        double resultOfPower = Math.pow(base, exponent);

        System.out.println("i'm the result of power: " + resultOfPower);

        double roundNumber = 4.56;

        // the method round of math required what the type of data is long because i send to the param a double
        long resultOfRound = Math.round(roundNumber);

        // if i send in the param a float the type of data will be a int

        System.out.println("im the result of round: " + resultOfRound);

        // the random number will be result enter 1 and 0
        double randomNumber = Math.random();

        System.out.println("im the random number: " + randomNumber);


    }
}
