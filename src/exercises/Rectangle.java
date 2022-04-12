package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?: ");
        double length = input.nextFloat();
        System.out.println("What is the width of the rectangle?: ");
        double width = input.nextFloat();
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
