//1: Calculator Using If-Else ->

// import java.util.Scanner;
//   public class New {
//     public static void main (String[] args) {
//        Scanner sc = new Scanner (System.in);
//         System.out.println("Calculator Menu:" );
//         System.out.println("1: Addition or +");
//         System.out.println("2: Subtraction or -");
//         System.out.println("3: Multiplication or *");
//         System.out.println("4: Division or /");
//         System.out.println("5: Remainder or %");

//         System.out.print("Take Your Choice From These Options: ");
//         int choice = sc.nextInt();

//         System.out.println ("---------- ");

//         System.out.print ("Enter Your First Number Here: ");
//         double num1 = sc.nextDouble();

//         System.out.println ("----------");

//         System.out.print("Enter Your Second Number Here: ");
//         double num2 = sc.nextDouble();

//         System.out.println ("----------"); ");

//         if (choice == 1) {
//              System.out.println ("Result: " + (num1 + num2));
//         }
//        else if (choice == 2) {
//                System.out.println ("Result: " + (num1 - num2));
//         }
//        else if (choice == 3) {
//                System.out.println ("Result: " + (num1 * num2));
        
//         }
//        else if (choice == 4) {
//            if (num2 != 0) {
//                System.out.println ("Result: " + (num1 / num2));
            
//             } else { 
//                System.out.println ("Result: Can't Divied by 0");
//            }
//        }
//        else if (choice == 5) {
//            if (num2 != 0) {
//                System.out.println("Result: " + (num1 % num2));
//            } else {
//                System.out.println("Result: 0");
//            }
//        }
//         else {
//            System.out.println("Result: Your Choice Is Incorrect. Try Again!");
//        }

//        sc.close();
//      }
//  }


//2: Calculator Using Switch Case ->


// import java.util.Scanner;
//   public class New {
//     public static void main (String[] args) {
//        Scanner sc = new Scanner (System.in);
//         System.out.println("Calculator Menu:" );
//         System.out.println("1: Addition or +");
//         System.out.println("2: Subtraction or -");
//         System.out.println("3: Multiplication or *");
//         System.out.println("4: Division or /");
//         System.out.println("5: Remainder or %");

//         System.out.print("Take Your Choice From These Options: ");
//         int choice = sc.nextInt();

//         System.out.println ("---------- ");

//         System.out.print ("Enter Your First Number Here: ");
//         double num1 = sc.nextDouble();

//         System.out.println ("----------");

//         System.out.print("Enter Your Second Number Here: ");
//         double num2 = sc.nextDouble();

//         System.out.println ("----------"); ");

//         switch (choice) {
//            case 1: 
//            System.out.println ("Result: " + (num1 + num2));
//             break;

//            case 2: 
//            System.out.println("Result: " + (num1 - num2));
//            break;

//            case 3: 
//            System.out.println("Result: " + (num1 * num2));
//            break;

//             case 4: 
//              if (num2 != 0) {
//                System.out.println("Result: " + (num1 / num2));
                
//             } else {
//                System.out.println("Result: Can't Devied By 0! ");

//                }
//                break;

//                 case 5: 
//                 if (num2 != 0) {
//                    System.out.println("Result: " + (num1 % num2));
                    
//                } else {
//                    System.out.println("Result: 0");
//                }
//                break;

//            default: System.out.println("Result: Your Choice Is Incorrect. Try Again!");
//        }

//        sc.close();
//     }
//  }


//3: Multiplication Table Using For Loop ->


// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the value of n for your table number: ");
//         int n = sc.nextInt();

//         System.out.println("\nYour " + n + " Number Table is:");
//         System.out.println("----------------------");

//         for (int i = 1; i <= 10; i++) {
//             int mul = n * i;
//             System.out.println(n + " * " + i + " = " + mul);
//         }

//         sc.close();
//     }
// }


//4: Solied Rectangle Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows: ");
//       int r = sc.nextInt();

//       System.out.print("\nEnter the number of columns: ");
//       int c = sc.nextInt();

//       System.out.println("\nHere is your Pattern: ");
//       System.out.println("----------------------");

//       // Pattern 1: Solid Rectangle ->
         
//           for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                     System.out.print("* ");
//                }
//                System.out.println();
               
//             }

//         sc.close();
//     }
// }


//5: Hollow Rectangle Pattern by using Nested For Loop ->

//  import java.util.Scanner;


// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Hollow Rectangle Pattern: ");
//       int r = sc.nextInt();

//       System.out.print("\nEnter the number of columns for your Hollow Rectangle Pattern: ");
//       int c = sc.nextInt();

//       System.out.println("\nHere is your Hollow Rectangle Pattern: ");
//       System.out.println("----------------------");

//       // Pattern 1: Hollow Rectangle ->
         
//           for (int i = 1; i <= r; i++) {
//             for (int j = 1; j <= c; j++) {
//                     if ( i == 1 || j == 1 || i == r || j == c ) {
//                         System.out.print("*"); 
//                     } else {
//                         System.out.print(" ");
//                     }
//                }
//                System.out.println();
               
//             }

//         sc.close();
//     }
// }


//6: Half Pyramid Pattern by using Nested For Loop ->


//     import java.util.Scanner;

//          public class Patterns {
//             public static void main (String args[]) {
//             Scanner sc = new Scanner (System.in);
//             System.out.print("Enter the number of rows for your Half Pyramid Pattern: ");
//             int r = sc.nextInt();


//             System.out.println("\nHere is your Half Pyramid Pattern: ");
//             System.out.println("----------------------");

         
//             for (int i = 1; i <= r; i++) {
//                 for (int j = 1; j <= i; j++) {
//                         System.out.print("* ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }


//7: Full Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Full Pyramid Pattern: ");
//       int r = sc.nextInt();


//       System.out.println("\nHere is your Full Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern 1: Half Pyramid ->
         
//             for (int i = 1; i <= r; i++) {
//                 for (int j = 1; j <= r - i; j++) {
//                     System.out.print(" ");
//                 }

//                 for (int j = 1; j <= i; j++) {
//                         System.out.print("* ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }


//8: 180 degree rotated Half Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your 180 degree rotated Half Pyramid Pattern: ");
//       int r = sc.nextInt();


//       System.out.println("\nHere is your 180 degree rotated Half Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Pyramids ->
         
//             for (int i = 1; i <= r; i++) {
//                 for (int j = 1; j <= r - i; j++) {
//                     System.out.print(" ");
//                 }

//                 for (int j = 1; j <= i; j++) {
//                         System.out.print("* ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }


//9: Inverted Half Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your 180 degree rotated Inverted Half Pyramid Pattern: ");
//       int r = sc.nextInt();


//       System.out.println("\nHere is your 180 degree rotated Inverted Half Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Pyramids ->
         
//             for (int i = r; i >= 1; i--) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("* ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }


//10: 180 degree rotated Inverted Half Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your 180 degree rotated Inverted Half Pyramid Pattern: ");
//       int r = sc.nextInt();


//       System.out.println("\nHere is your 180 degree rotated Inverted Half Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Pyramids ->
         
//             for (int i = r; i >= 1; i--) {
//                 for (int j = 1; j <= r - i; j++) {
//                     System.out.print(" ");
//                 }

//                 for (int j = 1; j <= i; j++) {
//                         System.out.print("* ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }

//11: Numeric Half Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your numeric Half Pyramid Pattern: ");
//       int r = sc.nextInt();


//       System.out.println("\nHere is your Numeric Half Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Pyramids ->
         
//             for (int i = 1; i <= r; i++) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print(j + " ");
//                 }

//                 System.out.println();
//             }

//         sc.close();
//     }
// }

//12: Numeric Inverted Half Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;
// public class patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your numeric Inverted Half Pyramid Pattern: ");
//       int r = sc.nextInt();
//         System.out.println("\nHere is your Numeric Inverted Half Pyramid Pattern: ");
//         System.out.println("----------------------");
//         // Pattern: Pyramids ->
           
//               for (int i = r; i >= 1; i--) {
//                   for (int j = 1; j <= i; j++) {
//                       System.out.print(j + " ");
//                   }
  
//                   System.out.println();
//               }
  
//           sc.close();
//       }
// }   


//13: Floyd's Triangle Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Floyd's Triangle Pattern: ");
//       int n = sc.nextInt();

//       int number = 1;

//       System.out.println("\nHere is your Floyd's Triangle Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Triangle ->
         
//            for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();
//            }

//         sc.close();
//     }
// }


//14: 0-1 Triangle Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your 0-1 Triangle Pattern: ");
//       int n = sc.nextInt();

//       int number = 1;

//       System.out.println("\nHere is your 0-1 Triangle Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Triangle ->
         
//            for (int i = 1; i <= n; i++) {
//                 for (int j = 1; j <= i; j++) {
//                     if ((i + j) % 2 == 0 ) {
//                         System.out.print("1 ");
//                     } else {
//                         System.out.print("0 ");
//                     }

//                 }
//                 System.out.println();

//            }

//         sc.close();

//     }
// }


//15: Butterfly Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Butterfly Pattern: ");
//       int n = sc.nextInt();


//       System.out.println("\nHere is your Butterfly Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Butterfly ->
//          //Butterfly Upper Half Body
//          for (int i = 1; i <= n; i++) {
//               //Upper Left Wing:
//               for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//               }
//                 //Spaces between the Wings for Upper right wing:
//               for (int j = 1; j <= 2 * (n - i); j++) {
//                     System.out.print(" ");
//               }

//               //Upper right wing:
//               for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//               }

//                 System.out.println();
//          }


//            //Butterfly Lower Half Body
//          for (int i = n; i >= 1; i--) {
//               //Lower Left Wing:
//               for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//               }
//                 //Spaces between the Wings for Lower right wing:
//               for (int j = 1; j <= 2 * (n - i); j++) {
//                     System.out.print(" ");
//               }

//               //Lower right wing:
//               for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//               }

//                 System.out.println();
//          }

//         sc.close();

//     }
    
// }


// 16: Rhombus Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Rhombus Pattern: ");
//       int n = sc.nextInt();


//       System.out.println("\nHere is your Rhombus Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Rhombus ->
//             //outer loop for number of rows:
//         for (int i = 1; i <= n; i++) {
//             //inner loop for spaces (Rhombus):
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= n; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//         sc.close();

//     }
    
// }


// 17: Hollow Rhombus Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Hollow Rhombus Pattern: ");
//       int n = sc.nextInt();


//       System.out.println("\nHere is your Hollow Rhombus Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Rhombus ->
//             //outer loop for number of rows:
//         for (int i = 1; i <= n; i++) {
//             //inner loop for spaces (Rhombus):
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || j == 1 || i == n || j == n) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }

//         sc.close();

//     }
    
// }


// 18: Numeric Pyramid Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Numberic Pyramid Pattern: ");
//       int n = sc.nextInt();


//       System.out.println("\nHere is your Numberic Pyramid Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Pyramid ->
//          for (int i =  1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//              System.out.println();
//          }

//          sc.close();

//     }
    
// }


//19: Palindromic Pattern by using Nested For Loop ->


// import java.util.Scanner;

// public class Patterns {
//     public static void main (String args[]) {
//       Scanner sc = new Scanner (System.in);
//       System.out.print("Enter the number of rows for your Palindromic Pattern: ");
//       int n = sc.nextInt();


//       System.out.println("\nHere is your Palindromic Pattern: ");
//       System.out.println("----------------------");

//       // Pattern: Palindromic ->
//          for (int i =  1; i <= n; i++) {

//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }

//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//              System.out.println();
//          }

//         sc.close();

//     }
    
// }


//20: Rectangle Pattern by Using Nested For Loop with Separet Functions (Type 1) -> 


// import java.util.Scanner;

//   public class Patterns {
//         static Scanner sc = new Scanner(System.in);
//         static int r, c;


//        public static void patternPrint() {

//            for (int i = 1; i <= r; i++) {
//                for (int j = 1; j <= c; j++) {
//                 System.out.print("* ");
//              }

//             System.out.println();
//          }

//       }
  

       
//         public static void main(String[] args) {
//         System.out.print("Enter the number of rows for your rectangle pattern: ");
//          r = sc.nextInt();

//         System.out.print("\nEnter the number of columns for your rectangle pattern: ");
//          c = sc.nextInt();

//         System.out.println("Here is your Rectangle Pattern: ");
//         System.out.println("-------------------------------------------");
//         System.out.println("                 RESULT                    ");
//         System.out.println("-------------------------------------------");

//         Patternprint();

//         sc.close();
        
        
//     }
// }


// 21: Rectangle Pattern by Using Nested For Loop with Separet Functions (Type 2) ->


// import java.util.Scanner;

//   public class Patterns {
       

//        public static void patternPrint(int r, int c) {

//            for (int i = 1; i <= r; i++) {
//                for (int j = 1; j <= c; j++) {
//                 System.out.print("* ");
//              }

//             System.out.println();
//          }

//       }
  

       
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
        
//         System.out.print("Enter the number of rows for your rectangle pattern: ");
//          int r = sc.nextInt();

//         System.out.print("\nEnter the number of columns for your rectangle pattern: ");
//          int c = sc.nextInt();

//         System.out.println("Here is your Rectangle Pattern: ");
//         System.out.println("-------------------------------------------");
//         System.out.println("                 RESULT                    ");
//         System.out.println("-------------------------------------------");

//         Patternprint(r, c);

//         sc.close();
        
        
//     }
// }


// 22: Half Pyramid Pattern by Using Nested For Loop with User Choicable Element Recommendation ->


// import java.util.Scanner;

//   public class Patterns {
         
       
//    public static void patternPrint(int number, char character) {
          
//            for (int i = 1; i <= number; i++) {
//                 for (int j = 1; j <= i; j++) {
//                      System.out.print(character + " ");
//                 }
//                      System.out.println();
//            }

//       }
  

       
//         public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter the number for your Half Pyramid pattern: ");
//          int number = sc.nextInt();
//         System.out.println("\nInstruction: You can choose your choicable element for the pattern view (eg. a b c d.... # $ % &.....) ");
//         System.out.print("\nSo, Please enter your desired element here: ");
//          char character = sc.next().charAt(0);
//         System.out.println("Here is your Half Pyramid Pattern: ");
//         System.out.println("-------------------------------------------");
//         System.out.println("                 RESULT                    ");
//         System.out.println("-------------------------------------------");

//         patternPrint(number, character);

//         sc.close();
        
        
//     }
// }



//23: Diamond Pattern by Using Nested For Loop with User Choicable Element Recommendation ->

import java.util.Scanner;

 public class New {
     
     
     public static void patternPrint(int number, char character) {
          for(int i = 1; i <= number; i++) {
               for(int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
               }

               for(int j = 1; j <= i; j++) {
                    System.out.print(character + " ");
               }
               System.out.println();
           }

           for(int i = number - 1; i >= 1; i--) {
               for(int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
               }

               for(int j = 1; j <= i; j++) {
                    System.out.print(character + " ");
               }
               System.out.println();
           }


           return;

     }



          
     
     
     
     
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number for your Diamond Pattern: ");
     int number = sc.nextInt();
     System.out.println("\nInstruction: You can choose your choicable elemet for your pattern view (eg. a b c d.... # $ % &.....). ");
     System.out.print("\nSo, please enter your desired element here: ");
     char character = sc.next().charAt(0);
     System.out.println("\nHere is Your Diamond Pattern: ");
     System.out.println("-------------------------------------------");
     System.out.println("                 RESULT                    ");
     System.out.println("-------------------------------------------");

     patternPrint(number, character);

     sc.close();

     }

  }