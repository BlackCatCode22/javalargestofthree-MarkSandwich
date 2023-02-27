/* LargestOfThree.java
 * References:
 *   https://www.w3schools.com/java/java_variables_print.asp
 * I already knew how to prompt users to enter integers and how to store them.
 * I used the reference above to find out how to print out integers added up rather than create a variable and then print that out.
 *
 * input: three integers from user to later on compare
 * processing: find the largest of the three integers
 * output: the largest of three integers, the sum of three integers
 */

import java.util.Scanner;

public class largestofThree {
    public static void main(String[] args) {
        System.out.println("The Largest Number of Three");

        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first integer.
        System.out.print("Please enter the first integer: ");

        // Input user reply to num1
        int num1 = Integer.parseInt(scanner.nextLine());

        // Prompt the user for the second integer.
        System.out.print("Please enter the second integer: ");

        // Input user reply to num2
        int num2 = Integer.parseInt(scanner.nextLine());

        // Prompt the user for the third integer.
        System.out.print("Please enter the third integer: ");

        // Input user reply to num3
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.print("The sum of " + num1 + ", " + num2 + " and " + num3 + " is: ");

        // Prints out the three entered numbers directly on a new line rather than save them to an integer and printing out said integer.
        System.out.println(num1 + num2 + num3);

        System.out.print("Between " + num1 + ", " + num2 + ", and " + num3 + ", the largest number you entered is: ");

        // Find the largest of three ints with decisions.
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1);
            }
            else {
                System.out.println(num2);
            }
        }
        else {
            if (num2 > num3) {
                System.out.println(num2);
            }
            else {
                System.out.println(num3);
            }
        }
    }
}
