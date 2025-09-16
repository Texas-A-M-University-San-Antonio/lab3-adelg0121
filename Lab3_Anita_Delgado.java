/**
 * Name: Anita Delgado
 * Date: 16 September 2025
* Purpose: Lab 3 - Calculate compound interest for the value of a home over a period of time. 
* This program demonstrates the use of the Math.pow() method to include using numeric data types and operations.
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class Lab3_Anita_Delgado
{
    public static void main(String[] args) 
    {
        //declare a Scanner to be used for input
        Scanner input = new Scanner(System.in);

        //declare your FOUR variables
        double initialValue; //Initial value of home
        int elapsedYears; // Number of years elapsed
        double interestRate; // Annual interest rate (as a %)
        double finalValue; // Final value of the home after compound interest

        //prompt the user to input the initial value of the home
        System.out.print("Please enter the initial value of the home:");
        initialValue = input.nextDouble();

        //prompt the user to input the number of elapsed years
        System.out.print("Please enter the number of elapsed years:");
        elapsedYears = input.nextInt();

        //prompt the user to input the interest rate (as a %)
        System.out.print("Please enter the annual interest rate (in%):");
        interestRate = input.nextDouble();

        //convert the interest rate from a % to a decimal 
        interestRate = interestRate / 100;

        //calculate the final valueof the home using the formula for compound interest
        // A = P * (1 + r)^ t
        finalValue = initialValue * Math.pow(1 + interestRate, elapsedYears);

        //display the final value of the home to the user
        System.out.printf("The final value of the home after %d years is: $%.2f%n",elapsedYears, finalValue);

    }
}