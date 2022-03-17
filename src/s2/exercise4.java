package s2;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
    float  cars;
    double percentagePerSales, salaryOfEmployee, totalcommissions, totalPriceOfCars;
    final int commission = 150, salary = 1000;
    int amountOfCarsSolds;
        Scanner entry = new Scanner(System.in);

        System.out.println("complete amout cars solds: ");
        amountOfCarsSolds = entry.nextInt();

        System.out.println("complete with the price of the cars: ");
        cars = entry.nextFloat();

        totalcommissions = (amountOfCarsSolds * commission);
        totalPriceOfCars = (amountOfCarsSolds * cars);

        percentagePerSales = (cars) * 0.05;
        salaryOfEmployee = salary + percentagePerSales + totalcommissions;

        System.out.println("the total of the commissions is: :" +totalcommissions);
        System.out.println("the total price of the cars is :" +totalPriceOfCars);
        System.out.println("the total percentage per sale is :" +percentagePerSales);
        System.out.println("the salary of the employee is :" +salaryOfEmployee);

    }
}
