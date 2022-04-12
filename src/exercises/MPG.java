package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double milesDriven = input.nextFloat();
        System.out.println("What is the amount of gas consumed in gallons?");
        double gasConsumed = input.nextFloat();
        double milesPerGallon = milesDriven / gasConsumed;
        System.out.println("The miles per gallon is " + milesPerGallon);
    }
}
