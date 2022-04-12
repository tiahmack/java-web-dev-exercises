package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        if (radius <= 0){
            System.out.println("Must enter a positive number");
        }else{
            System.out.println(Circle.getArea(radius));
        }
        // System.out.println(3.14 * radius *radius);

    }
}

