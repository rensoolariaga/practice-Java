public class incrementAndDecrement {
    public static void main(String[] args) {
        int x = 5;

        // increment
        x++; // equivalent to x += 1;

        // decrement
        x--; // equivalent to x -= 1;

        System.out.println("i'm the x value: " + x);

        int y = 5, z;

        z = y++;

        System.out.println("i'm the z value with the increment after the asign: " + z);
        // here we see the value of 5 because the increment it's after the asignation, if i print the value of y will be 6

        // if i want to increment the value of x increment, i increment before the asignation
        z = ++y;
        System.out.println("i'm the z value with the increment before the asign: " +z);

        // the same with the substract

    }
}
