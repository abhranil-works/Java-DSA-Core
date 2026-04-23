// //1: Calculator Using If-Else ->

// import java.util.Scanner;
//   public class Repeat {
//     public static void main (String[] args) {
//        Scanner sc = new Scanner (System.in);
//         //This all is some instructions for user.
//         System.out.println("Calculator Menu:" );
//         System.out.println("1: Addition or +");
//         System.out.println("2: Subtraction or -");
//         System.out.println("3: Multiplication or *");
//         System.out.println("4: Division or /");
//         System.out.println("5: Remainder or %");

//         System.out.print("Take Your Choice From These Options: "); 
//         int choice = sc.nextInt(); //It will take the number between 1 to 5 for user calculation choice.

//         System.out.println ("---------- ");

//         System.out.print ("Enter Your First Number Here: ");
//         double num1 = sc.nextDouble();

//         System.out.println ("----------");

//         System.out.print("Enter Your Second Number Here: ");
//         double num2 = sc.nextDouble();

//         System.out.println ("----------");

//         //Calculation logic with 'if-else' satement.
//         if (choice == 1) {
//              System.out.println ("Result: " + (num1 + num2)); //Choice 1 for Addition calculation.
//         }
//        else if (choice == 2) {
//                System.out.println ("Result: " + (num1 - num2)); //Choice 2 for Substraction calculation.
//         }
//        else if (choice == 3) {
//                System.out.println ("Result: " + (num1 * num2)); //Choice 3 for Multiplication calculation.
        
//         }
//        else if (choice == 4) {
//            if (num2 != 0) {          // We use this logic for protecting the error of the calulation from Division.
//                System.out.println ("Result: " + (num1 / num2));
            
//             } else { 
//                System.out.println ("Result: Can't Divied by 0");
//            }
//        }
//        else if (choice == 5) {
//            if (num2 != 0) {         // We use this logic for protecting the error of the calulation from Remainder.
//                System.out.println("Result: " + (num1 % num2));
//            } else {
//                System.out.println("Result: 0");
//            }
//        }
//         else {
//            System.out.println("Result: Your Choice Is Incorrect. Try Again!"); //If user input, not found.
//        }



//        sc.close(); //Closing the 'Scanner' object to prevent memory leaks.


//      }
//  }

//2: Calculator Using Switch Case by two separate functions. One for 'switch-case' logic and second for basic user instructions & inputs ->

import java.util.Scanner;

  public class Repeat {

   public static void basicCalculator(int choice, double number1, double number2) {

      // We use 'Switch-Case' Logit for this besic calculator.

      switch (choice) {

         case 1: 
         System.out.println("\n Result: " + (number1 + number2));
          break;
         
         case 2: 
         System.out.println("\n Result: " + (number1 - number2));
          break;
          
         case 3: 
         System.out.println("\n Result: " + (number1 * number2));
          break;
          
         case 4: 
         if (number2 != 0) {   // We use this logic for protecting the error of the calulation from Division.
            System.out.println("\n Result: " + (number1 / number2));

         } else {
            System.out.println("\n Result: Can't Divided by 0");
         }
          break;
          

         case 5: 
         if (number2 != 0) {   // We use this logic for protecting the error of the calulation from Remainder.
            System.out.println("\n Result: " + (number1 % number2));

         } else {
            System.out.println("\n Result: Can't Divided by 0");
         }
          break;

         default: System.out.println("\n Result: Your Choice Is Incorrect. Try Again!"); // We use this logic for protecting the error of the calulation from incorrect choice.


      } 

   }


    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //This all is some instructions for user.
      System.out.println("Calculator Menu:");
      System.out.println("1: Addition or +");
      System.out.println("2: Substraction or -");
      System.out.println("3: Multiplication or *");
      System.out.println("4: Divison or /");
      System.out.println("5: Remainder or %");

      System.out.print("\n Enter the number you want to choose for calculation: ");
      int choice = sc.nextInt();

      System.out.print("\n Enter the first calculation value: ");
      double number1 = sc.nextDouble();

      System.out.print("\n Enter the second calculation value: ");
      double number2 = sc.nextDouble();


      basicCalculator(choice, number1, number2);

      sc.close(); //Closing the 'Scanner' object to prevent memory leaks.


    }

  }