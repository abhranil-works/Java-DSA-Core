// Stage 1:
//  import java.util.*;

//    public class Again {
//         public static void main (String[] args) {
//         //   Variable.
//         //   int a = 15;
//         //   int b = 16;
//         //   int sum = a % b;

//         //   System.out.println(sum);

//     }
// }

// Stage 2:

// import java.util.*;

//   public class Again {
//     public static void main (String[] args) {
//         //calculate:

//         int a = 10;
//         int b = 5;

//         int result = (a * b) / (a - b);
//         System.out.println(result);
//     }
//   }

//Stage 3:

// import java.util.Scanner;

//   public class Again {

//     // main Function start from here.
//      public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in); // Using Scanner here for getting inputs.
//         System.out.print("Enter The Value of A: ");
//         int a = sc.nextInt(); //input for A.
//         System.out.print("Enter The Value of B: ");
//         int b = sc.nextInt(); //input for B.

//         //All Type of Calculations.
//         int sum = a + b; 
//         int sub = a - b;
//         int mul = a * b;
//         int div = a / b;

//         System.out.print("\nThe Sum of A and B is: " + sum + "\nThe Sub of A and B is: " + sub + "\nThe Mul of A and B is: " + mul + "\nThe Div of A and B is: " + div); //Printing the result for all Type of Calculations.

//         sc.close(); //Closing the Scanner object to prevent memory leak.

//      }
//   }

// Stage 4:
// import java.util.Scanner;

//   public class Again {
//       //main function start from here.
//      public static void main (String[] args) {
//             Scanner sc = new Scanner (System.in);
//             System.out.println("Let's check your Adult level here....."); //Statement for checking the Adult Time.
//             System.out.print("Enter Your Age: ");
//             int age = sc.nextInt(); //Input of Age.

//             //if-else logic to check user's Adult Eligibility with minimum age requirement.
//             if (age >= 18) {
//                 System.out.println("Result: You are an Adult."); //Result of Adult Eligibility.
//             } else {
//                 System.out.println("Result: You are not an Adult."); //Result of Adult Ineligibility.
//             }

//             sc.close(); //Closing the Scanner object to prevent memory leak.
//      }
//   }

// Stage 5:
// import java.util.Scanner;

//   public class Again {
     
//     public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Let's check your input number is Even or Odd....."); //Statement for checking the Even or Odd.
//         System.out.print("Enter Your First Number: ");
//         int x = sc.nextInt(); //Input of First Number.
//         int result = x % 2; //Logic of Even or Odd.
       
//         //if-else logic for checking the user's input numbers are Even or Odd.
//         if (result == 0) {
//             System.out.println("Your Number is Even or 0."); //Result of Even Number.
//         } else {
//             System.out.println("Your Number is Odd or 1."); //Result of Odd Number.
//         }

//         sc.close(); //Closing the Scanner object to prevent memory leakage.
//     }

//   }

//6: Write a terminal-based Basic Operations Calculator with if-else.

// import java.util.Scanner;

//   public class Again {
//     //main function start from here.
//      public static void main (String[] args) {
//         Scanner sc = new Scanner (System.in);
//         //Calculator start from here.
//         System.out.println("Welcome on our calculator, here you get some instructions to use this calculator.....");
//         //Calculator using rules.
//         System.out.println("\nPress 1 for Addition."); //We Will use \n for creat a new extra speace line in every line.
//         System.out.println("\nPress 2 for Subtraction.");
//         System.out.println("\nPress 3 for Multiplication.");
//         System.out.println("\nPress 4 for Division.");
//         System.out.println("\nPress 5 for Modulo.");

//         System.out.println("\nNow, Choice your PRESS number."); //Let The User to Choose Their Decided Operation.
//         System.out.print("\nEnter Your Choiceable Press Number: ");
//         int choice = sc.nextInt(); //Input of User's Press Number.

//         //User's demanded Numbers for Calculation.
//         System.out.print("\nEnter The First Number: ");
//         double firstNumber = sc.nextDouble(); //Input of first number from user.
//         System.out.print("\nEnter The Second Number: ");
//         double secondNumber = sc.nextDouble(); //Input of second number from user.

//         //if-else and else-if logic for this calculator.
//         if (choice == 1) {
//             System.out.println("\nThe Result of Addition is: " + (firstNumber + secondNumber));

//         } else if (choice == 2) {
//             System.out.println("\nThe Result of Subtraction is: " + (firstNumber - secondNumber));

//         } else if (choice == 3) {
//             System.out.println("\nThe Result of Multiplication is: " + (firstNumber * secondNumber));

//         } else if (choice == 4) {
//             //Protect from error of division by zero.
//             if (secondNumber != 0) {
//                 System.out.println("\nThe Result of Division is: " + (firstNumber / secondNumber));
//             } else {
//                 System.out.println("\nThe Result of Division is: Error! Can't divide by zero."); //Error message for division by zero.
//             }
//             //Protect from error of modulo by zero.
//         } else if (choice == 5) {
//             if (secondNumber != 0) {
//                 System.out.println("\nThe Result of Modulo is: " + (firstNumber % secondNumber));
//             } else {
//                 System.out.println("\nThe Result of modulo is: Error! Can't modulo by zero."); //Error message for modulo by zero.
//             }
//         } else {
//             System.out.println("\nInvalid choice! Please choose a valid Press Number."); //Error message for Invalid Press Number.
//         }

//         sc.close(); //Closing the Scanner object to prevent memory leakage.

//      }
//   }


//7: Write a terminal-based Basic Operations Calculator with switch-case.

//  import java.util.Scanner;

//    public class Again {

//      public static void main (String[] args){
//          Scanner sc = new Scanner (System.in);
//         //Calculator start from here.
//         System.out.println("Welcome on our calculator, here you get some instructions to use this calculator.....");
//         //Calculator using rules.
//         System.out.println("\nPress 1 for Addition."); //We Will use \n for creat a new extra speace line in every line.
//         System.out.println("\nPress 2 for Subtraction.");
//         System.out.println("\nPress 3 for Multiplication.");
//         System.out.println("\nPress 4 for Division.");
//         System.out.println("\nPress 5 for Modulo.");

//         System.out.println("\nNow, Choice your PRESS number."); //Let The User to Choose Their Decided Operation.
//         System.out.print("\nEnter Your Choiceable Press Number: ");
//         int choice = sc.nextInt(); //Input of User's Press Number.

//         //User's demanded Numbers for Calculation.
//         System.out.print("\nEnter The First Number: ");
//         double firstNumber = sc.nextDouble(); //Input of first number from user.
//         System.out.print("\nEnter The Second Number: ");
//         double secondNumber = sc.nextDouble(); //Input of second number from user.

      //   //switch-case logic for this calculator.
      //   switch (choice) {
      //       case 1: 
      //           System.out.println("\nThe Result of Addition is: " + (firstNumber + secondNumber));
      //           break;
      //       case 2: 
      //           System.out.println("\nThe Result of Subtraction is: " + (firstNumber - secondNumber));
      //           break;
      //       case 3: 
      //           System.out.println("\nThe Result of Multiplication is: " + (firstNumber * secondNumber));
      //           break;
      //       case 4:
      //           //Protect from error of division by zero.
      //          if (secondNumber != 0) {
      //           System.out.println("\nThe Result of Division is: " + (firstNumber / secondNumber));
      //           } else {
      //               System.out.println("\nThe Result of Division is: Error! Can't divide by zero."); //Error message for division by zero.
      //           }
      //           break;
      //       case 5:
      //           //Protect from error of modulo by zero.
      //           if (secondNumber != 0) {
      //            System.out.println("\nThe Result of Modulo is: " + (firstNumber % secondNumber));
      //           } else {
      //               System.out.println("\nThe Result of modulo is: Error! Can't modulo by zero."); //Error message for modulo by zero.
      //           }
      //           break;
      //       default:
      //           System.out.println("\nInvalid choice! Please choose a valid Press Number."); //Error message for Invalid Press Number.


                
//         }

//         sc.close(); //Closing the Scanner object to prevent memory leakage.
//      }
//    }


// 8: for loop to print GSL.

// import java.util.*;

//   public class Again {
//      public static void main (String[] args) {  //name ++ is same as 'name = name + 1'.
//         for (int name = 1; name <= 100; name++) {
//             System.out.println(name + ": GSLegends"); //for loop start from here, and it will print GSL from 1 to 100.
//         }

//      }
//   }


//9: while loop to print GSL.

// import java.util.*;

//   public class Again {
//     public static void main (String[] args) {

//       int name = 1;

//       while (name <= 100) {
//          System.out.println(name + ": GSLegends");
//          name++;
//       }
//     }
//   }

// 10 : do-while loop to print GSL.

// import java.util.*;

//   public class Again {
//      public static void main (String[] args) {
//       int name = 1;
//       do {
//          System.out.println (name + ": GSLegends");
//          name++;
//       } while (name <= 101);
//       System.out.println("Loop ended");
//      }
//   }


// 11: Print the pattern of Soild Rectangle.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Solid Rectangle.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nEnter The Number of Columns: ");
//     int columns = sc.nextInt(); //Input of Columns Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Soild Rectangle.
//       for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol + " "); //Print the symbol with a space for better visibility.
//            }
//            System.out.println(); //Move to the next line after printing each row.

//       }
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

//12: Print the pattern of Hollow Rectangle.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Hollow Rectangle.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nEnter The Number of Columns: ");
//     int columns = sc.nextInt(); //Input of Columns Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Hollow Rectangle.
//       for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= columns; j++) {
//                if (i == 1 || j == 1 || i == rows || j == columns) {
//                     System.out.print(symbol + " "); //Print the symbol with a space for better visibility.
//                } else {
//                     System.out.print("  "); // Double space for the hollow part of the pattern.
//                }
//            }
//            System.out.println(); //Move to the next line after printing each row.

//       }
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }


// 13: Print the pattern of Halt Pyramid.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Half Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Half Pyramid.

//       for (int i = 1; i <= rows; i++) {
//           for (int j = 1; j <= i; j++) {
//                System.out.print(symbol + " "); //Print the symbol with a space for better visibility.
//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

// 14: Print the pattern of Inverted Half Pyramid.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Inverted Half Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Inverted Half Pyramid.

//       for (int i = rows; i >= 1; i--) {
//           for (int j = 1; j <= i; j++) {
//                System.out.print(symbol + " "); //Print the symbol with a space for better visibility.
//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

// 15: Print the pattern of Rotated Half Pyramid.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Rotated Half Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Rotated Half Pyramid.

//       for (int i = 1; i <= rows; i++) {
//          for (int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for the left side view maintenance to rotated the Half Pyramid to 180 degree.

//          }

//           for (int j = 1; j <= i; j++) {
//                System.out.print(symbol + " "); //Print the symbol with a space for better visibility.

//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

// 16: Print the pattern of Full Pyramid.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Numeric Half Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Numeric Half Pyramid.

//       for (int i = 1; i <= rows; i++) {
//           for (int j = 1; j <= i; j++) {
//                System.out.print(j + " "); //Print the number with a space for better visibility.
//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

// 17: Print the pattern of Numeric Half Pyramid.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Floyd's Half Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Floyd's Half Pyramid.

//     int number = 1; //Make it on a flow to continues number printing from Start to End of the pattern.
//       for (int i = 1; i <= rows; i++) {
//           for (int j = 1; j <= i; j++) {
//                System.out.print(number + " "); //Print the number with a space for better visibility.
//                number++; //Increment the number to make it flow for the next number in the pattern.
//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

// 18: Print the pattern of 0-1 Triangle.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of 0-1 Triangle.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of 0-1 Triangle.

//       for (int i = 1; i <= rows; i++) {
//           for (int j = 1; j <= i; j++) {
//                if ((i + j) % 2 == 0) {
//                   System.out.print("1 "); //Print 1 for Even number of i + j.
//                } else {
//                   System.out.print("0 "); //Print 0 for Odd number of i + j.
//                }
//           }

//           System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }

//19: Print the pattern of Butterfly.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Butterfly.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
    

//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Butterfly.
//       //Upper Body of Butterfly.
//       for(int i = 1; i <= rows; i++) {
//          //Upper Left Wing of Butterfly.
//             for(int j = 1; j <= i; j++) {
//                System.out.print(symbol + " ");

//             }

//          //Upper spaces between of Butterfly's wings.
//             for(int j = 1; j <= 2 * (rows - i); j++) {
//             System.out.print("  ");

//             }

//          //Upper right wing of Butterfly.
//             for(int j = 1; j<= i; j++) {
//             System.out.print(symbol + " ");

//             }

//          System.out.println(); //Move to the next line after printing each row.
         
//       }


//         //Lower Body of Butterfly.
//       for(int i = rows - 1; i >= 1; i--) {
//          //Lower Left Wing of Butterfly.
//             for(int j = 1; j <= i; j++) {
//                System.out.print(symbol + " ");
//             }

//          //Lower spaces between of Butterfly's wings.
//             for(int j = 1; j <= 2 * (rows - i); j++) {
//             System.out.print("  ");

//             }

//          //Lower right wing of Butterfly.
//             for(int j = 1; j<= i; j++) {
//             System.out.print(symbol + " ");

//             }

//          System.out.println(); //Move to the next line after printing each row.
         
//       }

       
       
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }


// 20: Print the pattern of Hollow Rhombus.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Hollow Rhombus.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//      System.out.print("\nChoose your Symbol for printing the pattern: ");
//      char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Hollow Rhombus.

//       for(int i = 1; i <= rows; i++) {

//          //Left side spaces for Hollow Rhombus.
//          for(int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for better visibility of the pattern.
//          }

//          //Right side symbols for Hollow Rhombus.
//          for(int j = 1; j <= rows; j++) {
//                if(i == 1 || j == 1 || i == rows || j == rows) {
//                   System.out.print(symbol + " "); //Print the symbol with a space for better visibility.
//                } else {
//                   System.out.print("  "); //Print space for better visibility.
//                }
//          }

//          System.out.println();

//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }


// 21: Number Pyramid Pattern.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Number Pyramid.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Number Pyramid.

//       for(int i = 1; i <= rows; i++) {

//          //Left side spaces for Number Pyramid.
//          for(int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for better visibility of the pattern.
//          }

//          //Right side symbols for Number Pyramid.
//          for(int j = 1; j <= i; j++) {
//                System.out.print(i + "   "); //Print the number with a space for better visibility.
               
//          }

//          System.out.println();

//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }


// 22: Palindrome Number Pattern.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Palindromic.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Palindromic.

//       for(int i = 1; i <= rows; i++) {

//          //Left side space for Palindromic.
//          for(int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for better visibility of the pattern to make like pyramid.

//          }

//          //Palindromic number printing logic.
//          for(int j = i; j >= 1; j--) {
//             System.out.print(j + " "); //Print the number with a space for better visibility.

//          }

//          //Right side Palindromic number printing logic.
//          for(int j = 2; j <= i; j++) {
//             System.out.print(j + " "); //Print the number with a space for better visibility.

//          }

//          System.out.println(); //Move to the next line after printing each row.

//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }


// 23: Diamond Pattern.

// import java.util.Scanner;

//   public class Again {

//    //main function start from here.
//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print the pattern of Diamond.....");
//     System.out.print("\nEnter The Number of Rows: ");
//     int rows = sc.nextInt(); //Input of Rows Number.
//     System.out.print("\nChoose your Symbol for printing the pattern: ");
//     char symbol = sc.next().charAt(0); //Input of Symbol (@, #, $, * etc.) for printing the pattern.
//       System.out.println("\n");
//     //Nested "for Loop" for printing the pattern of Diamond.
//       for(int i = 1; i<= rows; i++) {

//          //upper shape's right spaces of the Diamond.
//          for(int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for better visibility of the Diamond pattern.

//          }

//          //upper shape of the Diamond.
//          for(int j = 1; j <= i; j++) {
//                System.out.print(symbol + "   "); //Print the number with a space for better visibility.

//          }


//          System.out.println(); //Move to the next line after printing each row.
//       }


//          for(int i = rows - 1; i >= 1; i--) {

//          //lower shape's right spaces of the Diamond.
//          for(int j = 1; j <= rows - i; j++) {
//                System.out.print("  "); //Double space for better visibility of the Diamond pattern.

//          }

//          //lower shape of the Diamond.
//          for(int j = 1; j <= i; j++) {
//                System.out.print(symbol + "   "); //Print the number with a space for better visibility.

//          }


//          System.out.println(); //Move to the next line after printing each row.
//       }
      
    
//       sc.close(); //Closing the scanner object to prevent memory leakage.

//     }

//   }






//-> Separate Functions start from here.

// 1: tasting the Separate Functions.

// import java.util.Scanner;

//   public class Again {


//    public static String printMyName (String name) {

//       return name; // This variable's input will go in "main" function to print that on Terminal.


//    }


//     public static void main (String[] args) {
//     Scanner sc = new Scanner (System.in); //input statement.
//     System.out.println("Let's print here your name.....");
//     System.out.print("Enter Your Name: ");
//     String name = sc.nextLine(); //Input of name.

//     String result = printMyName(name); //Calling the function to print the name.

//     System.out.println("\nYour Name Is: " + result); //Printing the name as result on Terminal.
    
//     sc.close();


//     }

//   }


// 2: calculate average of 3 numbers by given user.

// import java.util.Scanner;

//   public class Again {

//       //we use two functions here. First is "calculateAverage" and second is "main". But "Main" is always the first runer function.

//       public static double calculateAverage(double firstNumber, double secondNumber, double thirdNumber) {

//             double average = (firstNumber + secondNumber + thirdNumber) / 3; //The Logic of Getting 'Average' from That Three Numbers.

//             return average; //Transfer The 'Average' Value to "main" function's 'result' variable by This Return.



//       }


//       //"main" function's start from here.
//        public static void main (String[] args) {
//             Scanner sc = new Scanner (System.in); //Using Scanner Object for Getting Inputs from User.
//             System.out.println("Let's Print The Average of 3 Type Numbers....");
//             System.out.print("\nGive Us Your First Number Here: ");
//             double firstNumber = sc.nextDouble(); //First Number Input.
//             System.out.print("\nGive Us Your Second Number Here: ");
//             double secondNumber = sc.nextDouble(); //Second Number Input.
//             System.out.print("\nGive Us Your Third Number Here: ");
//             double thirdNumber = sc.nextDouble(); //Third Number Input.

//             double result = calculateAverage(firstNumber, secondNumber, thirdNumber); //This Value of 'result' Transferred from "calculateAverage" Function.

//             System.out.println("\nThe average of 3 Numbers is: " + result); //Final Output for User of 'result' Variable.


//             sc.close(); //Closing The Scanner Object to Prevent Memory Leakage.



//       }
//   }


// 3: Calculae The Sum of All Odd Numbers from 1 to N.

// import java.util.Scanner;

//   public class Again {

//             //we use two functions here. First is "calculateSumOfOdds" and second is "main". But "Main" is always the first runer function.

//        public static int calculateSumOfOdds(int n) {

//             int sum = 0; //We Make a Variable of 'sum' for using it in the 'for loop' to Calculate The Sum of All Odd Numbers from 1 to N.

//             for(int odd = 1; odd <= n; odd++) {
//                   if (odd % 2 == 1) {  //The Logic of Filtering The Odd Numbers by This 'if' Condition.
//                         sum = sum + odd; //The Logic of Calculating The Sum of All Odd Numbers by This 'sum' Variable.
                        
//                   } //Even We Can Use 'odd += 2 or odd = odd + 2', to Get This Same Result Instade of using 'if' Condition.

//             }

//                return sum; //Transfer The 'sum' value to 'main' Function's 'result' Variaable by This return.
//        }
               



//        public static void main (String[] args) {
//             Scanner sc = new Scanner (System.in);
//             System.out.println("Let's Calculate The Sum of All Odd Numbers by Given You!....");
//             System.out.print("\nEnter The Value of Number That You Want to Calculate the Sum of All Odd Numbers from 1 to That Number: ");
//             int n = sc.nextInt();

//             int result = calculateSumOfOdds(n); //This Value of 'result' Transferred from "calculateSumOfOdds" Function.

//             System.out.println("\nThe Sum of All Odd Numbers is: " + result); //The Final Output for The User.

//             sc.close(); //Closing The Scanner object to Prevent Memory Leakage.

//        }
//   }
 


// 4: Return The Greater of 2 Numbers Given by User.

// import java.util.Scanner;

//   public class Again {

//        //we use two functions here. First is "calculateSumOfOdds" and second is "main". But "Main" is always the first runer function.
//        public static double findGreater(double firstNumber, double secondNumber) {

//             //Using 'if-else' logic to find the greater number between the two numbers given by user.
//             if(firstNumber > secondNumber) {
                  
//               return firstNumber; //Transfer The 'firstNumber' value to 'main' Function's 'result' Variaable by This return.

//             } else {
                  
//                 return secondNumber; //Transfer The 'secondNumber' value to 'main' Function's 'result' Variaable by This return.

//             } 

//       }


//        public static void main (String[] args) {
//             Scanner sc = new Scanner (System.in);
//             System.out.println("Let's Find Your Greater Number Here.....");
//             System.out.print("\nEnter Your First Number: ");
//             double firstNumber = sc.nextDouble();
//             System.out.print("\nEnter Your Second Number: ");
//             double secondNumber = sc.nextDouble();

//             if (firstNumber == secondNumber) {
//                    System.out.println("\nYour Both Numbers are equal, Please Check and Try Again!"); //This is the logic for checking the equality of 2 numbers, it can help us to protect the whole code from "crash", if user give two equal numbers.

//             } else {

//                   double result = findGreater(firstNumber, secondNumber); // Transferred from "findGreater" function.
//                   System.out.println("\nYour Greater Number is: " + result);
//             }

            
            

//             sc.close(); //Closing the 'Scanner' object to prevent memory leakage.

//        }

// }   
  

// 5: Vote Eligibility Checker.

// import java.util.Scanner;

//   public class Again {

//       //we use two functions here. First is "voteEligibility" and second is "main". But "Main" is always the first runer function.
//        public static boolean voteEligibility (int age) {
//             //We use boolean data type to make it more easy for readibility and Understanding for the 'Developer', even it looks clean.
//             if (age > 18) {
//                   return true; // Transfer to "main" function's result variable for give that output to the user.
//             } else {
//                   return false; // Transfer to "main" function's result variable for give that output to the user.
//             }


//        }


//        public static void main (String[] args) {

//             Scanner sc = new Scanner (System.in);
//             System.out.println("Let's Check Your Vote Eligibility Here.....");
//             System.out.print("\nEnter Your Age: ");
//             int age = sc.nextInt(); //Age Input.

//             boolean result = voteEligibility(age); //Transferred from "voteEligibility" function.

//             if (result) {
//                   System.out.println("\nCongratulations! You are Eligible to Vote.");
//             } else { 
//                   System.out.println("\nSorry! You are Not Eligible to vote. Please Wait Until You Turn Over 18.");
//             }

//             sc.close(); //Closing the 'Scanner' object to prevent memory leakage.

//        }
//   }


// 6: Infinite loop by using "Do-While" loop.

// import java.util.Scanner;

//   public class Again {


//       public static void infiniteLoop(String name) {
//             int i = 1; //initialization of the "do-while" loop. 
//             do {
//                   System.out.println(i + ": " + name);
//                   i++; //i = i + 1; It's for updation for this condition by +1.
//             } while (true); //We make it's condition 'true', for run it to infinite times without any termination.

//       }



//       public static void main (String[] args) {

//             Scanner sc = new Scanner (System.in);
//             System.out.println("Let's Create an Infinite Loop for Your Future Company Name Here....");
//             System.out.print("\nEnter Your Company Name: ");
//             String name = sc.nextLine(); //Input of Company Name.
//             System.out.println("\n"); //We Using it For Maintaining The Space Between The Input and Output for User's Understanding.
//             infiniteLoop(name); //Calling The Function for "Exicution or Opperation" of that Function's Logic.

//             sc.close(); //Closing the 'Scanner' object to prevent memory leakage.


//       }
//   }


// 7: Counter of Positives, Negatives and Zeros.

import java.util.Scanner;

  public class Again {

      public static void counterPNZ() {
            Scanner sc = new Scanner (System.in);
            int positive = 0, negative = 0, zero = 0; //Usings these are all as Initializations.

            String choice;

            do {
            System.out.print("\nEnter Your Number: "); //This numbers given from users for counting their positive, negative and zero numbers quantity.
            double number = sc.nextDouble();
            sc.nextLine(); //We using it as a 'Buffer' for cleaning that "Return Key or Enter Key" from the RAM's Temporary Storage.

             //We use "do-while" condition to make it clean and fast for computer.

            if (number > 0) {

                  positive++;

            } else if (number < 0 ) { 

                  negative++;
             
            } else {

                  zero++;
            }

            System.out.println ("\nIf you want to be countinue our counter please type (y/yes): ");  
            choice = sc.nextLine();


            } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")); //We use this 'equalsIgnoreCase' for allow this code to recive any type of letters between "Capital" or "Small", e.g. y or Y even yes or Yes or again YES among. It is the only true condition, others are all false.

            System.out.println ("\nYour Result....");
            System.out.println ("\nThe Positive Numbers Quantity: " + positive);
            System.out.println("\nThe Negative Numbers Quantity:  " + negative);
            System.out.println("\nThe Zero Number's Quantity: " + zero);
            
            sc.close(); //closing the 'Scanner' object to prevent memory leakage.


      }
      
      
      
      
      public static void main (String[] args) {
            //Here we using this 'function(main)' to give the user his/her instructions for using our Counter.
            System.out.println("Read It Carefully.......");
            System.out.println("\nHere we count about positive, negative and zeros.");
            System.out.println("\nThat's mean: How much you have positive, negative and zero numbers?");
            System.out.println("\nInstructions:");
            System.out.println("\n1: If you type 'y' or 'yes'.... That's mean: You want to be countinue our counter. ");      
            System.out.println("\n2: If you type 'n' or 'no'.... That's mean: You don't want to be countinue our counter. Then our counter will be stop and it will give you, your result. ");
            System.out.println("\nAlright, Let's Go!.....");
  
         
         
            counterPNZ(); //We call this function for start to execute the opperation.
            //Thanks.

      }
  }

