//1: Calculator Using If-Else ->

import java.util.Scanner;
  public class Repeat {
    public static void main (String[] args) {
       Scanner sc = new Scanner (System.in);
        //This all is some instructions for user.
        System.out.println("Calculator Menu:" );
        System.out.println("1: Addition or +");
        System.out.println("2: Subtraction or -");
        System.out.println("3: Multiplication or *");
        System.out.println("4: Division or /");
        System.out.println("5: Remainder or %");

        System.out.print("Take Your Choice From These Options: "); 
        int choice = sc.nextInt(); //It will take the number between 1 to 5 for user calculation choice.

        System.out.println ("---------- ");

        System.out.print ("Enter Your First Number Here: ");
        double num1 = sc.nextDouble();

        System.out.println ("----------");

        System.out.print("Enter Your Second Number Here: ");
        double num2 = sc.nextDouble();

        System.out.println ("----------");

        //Calculation logic with 'if-else' satement.
        if (choice == 1) {
             System.out.println ("Result: " + (num1 + num2)); //Choice 1 for Addition calculation.
        }
       else if (choice == 2) {
               System.out.println ("Result: " + (num1 - num2)); //Choice 2 for Substraction calculation.
        }
       else if (choice == 3) {
               System.out.println ("Result: " + (num1 * num2)); //Choice 3 for Multiplication calculation.
        
        }
       else if (choice == 4) {
           if (num2 != 0) {          // We use this logic for protecting the error of the calulation from Division.
               System.out.println ("Result: " + (num1 / num2));
            
            } else { 
               System.out.println ("Result: Can't Divied by 0");
           }
       }
       else if (choice == 5) {
           if (num2 != 0) {         // We use this logic for protecting the error of the calulation from Remainder.
               System.out.println("Result: " + (num1 % num2));
           } else {
               System.out.println("Result: 0");
           }
       }
        else {
           System.out.println("Result: Your Choice Is Incorrect. Try Again!"); //If user input, not found.
       }



       sc.close(); //Closing the 'Scanner' object to prevent memory leaks.


     }
 }