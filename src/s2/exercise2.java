package s2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        float salary;
        int hoursPerDay, daysOfWork;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete with the salary per hour: ");
        salary = entry.nextFloat();

        System.out.println("complete with the hours per day of work: ");
        hoursPerDay = entry.nextInt();

        System.out.println("complete with the days of work: ");
        daysOfWork = entry.nextInt();

        // multiply the vars
        double salaryOfEmployeePerWeek = hoursPerDay * daysOfWork * salary;

        System.out.println("the salary of the employee per week is: " + salaryOfEmployeePerWeek);
    }
}
