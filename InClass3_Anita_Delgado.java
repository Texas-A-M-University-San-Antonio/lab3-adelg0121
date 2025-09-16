/**
 * Name: Anita Delgado
 * Date: 15 September 2025
 *  Purpose: InClass 3 - Calculate the volume and surface area of a cube based on user input
* This program demonstrates how to use Math.pow() in different calculations. 
 */

//Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_Anita_Delgado
{


    public static void main(String[] args) 
    {
        // delclare a Scanner to be used for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of the side of the cube:");
        Double sideLength = sc.nextDouble();

        // Calculate volume of the cube (side^3)
        Double volume = Math.pow(sideLength,3);

        // Calculate surface area of the cube (6*side^2)
        Double surfaceArea = 6 * Math.pow(sideLength,2);

        // Print the volume and surface area
        System.out.printf("The volume of the cube is %.2f%n", volume);
        System.out.printf("The surface area of the cube is %.2f%n", surfaceArea);
       
    }
}