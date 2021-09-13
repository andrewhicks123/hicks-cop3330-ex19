/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner n = new Scanner(System.in);
        System.out.print( "What is your height in inches? " );
        double height = n.nextDouble();
        System.out.print("What is your weight in pounds? ");
        double weight = n.nextDouble();
        double bmi =  (weight / (height*weight)) * 703;
        System.out.println("Your BMI is " + bmi + ".");
        if(bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range. ");
        }
        if(bmi > 25){
            System.out.println("You are overweight. You should see your doctor. ");
        }
        if(bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor. ");
        }

    }
}
