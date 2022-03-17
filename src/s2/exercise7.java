package s2;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        float weeks, days, hours;
        int totalHours;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the total hours: ");
        totalHours = entry.nextInt();

        // total hours divide the amount of hours * days of week
        weeks = (totalHours / (24 * 7));

        //  divide the total hours per hours per week and divide the result (rest) per the amount of hours per day
        days = ((totalHours % 168) / 24);

        // divide the rest of total hours per the hours per day
        hours = (totalHours % 24);

        System.out.println("the total hours are: " + totalHours);
        System.out.println("the total weeks are: " + weeks);
        System.out.println("the rest of days are: " + days);
        System.out.println("the rest of hours are: " + hours);
    }
}
