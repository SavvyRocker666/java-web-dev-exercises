package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

// Write a class, Area, that prompts the user for the radius of a circle and then calculate its area and print the result.
// calculate using A=pi*r*r

public class Area {
    public static void main(String[] args) {
        double radius;
        //double area = 0;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
if (!input.hasNextDouble()){
    System.out.println("Please enter a positive number");
}else {
    radius = input.nextDouble();
    input.close();
    int status;
    System.exit(status:2);
}

if (input.hasNextDouble());
        radius = input.nextDouble();
        input.close();


       // radius = input.nextDouble();
       if (radius >= 0) {
            System.out.println("The area of a circle of radius " +radius+" is: "+Circle.getArea(radius));
        }else {
           System.out.println("Please enter a positive number");
       }
        //else {
            //System.out.println("Please enter a positive number");

        }



    }




// Add a second Java file to your program to delegate the area calculation away from the printing task.
//
//Add a new class in your studios.areaofacircle package called Circle.
//
//Create a method called getArea inside of Circle that takes a Double radius as its only parameter and returns another Double, the result of the area calculation.
//
//public static Double getArea(Double radius) {
//  return 3.14 * radius * radius;
//}
//Back in Area, replace your area calculation line with a call to Circle.getArea().

//Add validation to your program. If the user enters a negative number? a non-numeric character? the empty string? Print an error message and quit. You’ll need to peek ahead to learn about conditional syntax in Java.
//Extend your program further by using a while or do-while loop, so that when the user enters a negative number they are re-prompted.