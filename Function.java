// 1: Check Prime →


// import java.util.*;
//   public class Function {
//      public static boolean isPrime(int n) {
//          boolean prime = true;
          
//          if (n <= 1) {
//              prime = false;
//           }
          
          
//           for(int i = 2; i < n; i++) {
//              if(i / n == 0) {
//                  prime = false;
//              }
//          }
          
//          return prime;
//      }
      
      
      
      
//        public static void main(String[] args) {
//           Scanner sc = new Scanner (System.in);
//            System.out.println("Write down the value of n: ");
//           int n = sc.nextInt();
           
//            if(isPrime(n)) {
//               System.out.println("Prime");
//           } else {
//               System.out.println("Not Prime");
//           }
//         sc.close();
//       }
//  }


// 2: Table Print →


// import java.util.*;
//  public class Function {
//      public static void printTable(int n) {
         
//          for(int i = 1; i <= 10; i++) {
//            int table = n * i;
//              System.out.println(n + " * " + i + " = " + table);
//           }
        
//      }
      
      
      
      
//       public static void main (String[] args) {
//           Scanner sc = new Scanner(System.in);
//           System.out.print("Please, Send The Number Which You Wanna Know About That Table: ");
//            int n = sc.nextInt();
           
//           printTable(n);
         
//            sc.close();
//        }
//   }

// 3: Calculate Average →

// import java.util.*;
//   public class Function {
    
//     public static double calculateAverage (double a, double b, double c) {
//       double sum = a + b + c;
//       double average = sum / 3;
//       return average;
//     }
    
    
    
//      public static void main (String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Let's Calculate The Average. Remember, You Have Only Put 3 Numbers to Calculate Their Average: ");
//        System.out.print("Enter Your First Number Here: ");
//        double a = sc.nextDouble();
//        System.out.print("Enter Your Second Number Here: ");
//        double b = sc.nextDouble();
//        System.out.print("Enter Your third Number Here: ");
//        double c = sc.nextDouble();
       
//        double result = calculateAverage(a, b, c);
       
//        System.out.printf("The Average is: %.2f\n ", result);
//        System.out.println("Thanks For Using This Average Calculating System.... Have a Great Day!");
//         sc.close();
//     }
//   }

// 4: calculate odd sum ->

// import java.util.*;
//   public class Function {
//     public static int calculateOddSum(int n) {
//       int sum = 0;
//        for (int i = 1; i <= n; i++) {
//          if (i % 2 != 0) {  // i % 2 == 1;
//            sum = sum + i; //sum = sum + i;
           
//          }
//       }
//        return sum;
//      }
    
    
    
//      public static void main (String[] args) {
//       Scanner sc = new Scanner (System.in);
//        System.out.println("Do You Want To Calculate Sum of Among ODD Numbers?");
//        System.out.print("Let's Type Your Value of n Here: ");
//        int n = sc.nextInt();
       
//        int result = calculateOddSum(n);
//       System.out.print("The Sum of Your All of Odd Numbers = " + result);
//         sc.close();
//     }
//   }


// 5:\\ find the greater number from given 2 numbers->

// import java.util.*;
//   public class Function {
    
//     public static void findGreater (int a, int b) {
//       if (a > b) {
//         System.out.println("The Greater = " + a);
//      }
      
//       if (a < b) {
//         System.out.println("The Greater = " + b);
//       }
//    }
    
    
    
//     public static void main (String[] args) {
//      Scanner sc = new Scanner (System.in);
//       System.out.println("Find Your Greater Number Between These 2 Numbers...");
//       System.out.print("Type Here The Value of a: ");
//       int a = sc.nextInt();
//       System.out.print("Type Here The Value of b: ");
//       int b = sc.nextInt();
      
//       findGreater(a, b);
//         sc.close();
//      }
//   }


// 6: Calculate Circumference ->

// import java.util.*;
//  public class Function {
//    public static double calculateCircumference (double r) {
//      double c = 2 * (22.0 / 7.0) * r;
//        return c;
      
//     }
    
    
    
//      public static void main (String[] args) {
//       Scanner sc = new Scanner (System.in);
//        System.out.println("Let's Calculate Circumferences by Your r or radius Value: ");
//        System.out.print("Enter Your Value of r: ");
//        double r = sc.nextDouble();
//        double result = calculateCircumference(r);
//       System.out.printf("The Circumferences = %.2f ", result);
//        sc.close();
//      }
//   }


// 7: Vote Eligibility Check ->

// import java.util.*;
//   public class Function {
//     public static void voteEligibility (int age) {
      
//       if (age <= 0) {
//         System.out.println("Result: This Age Is Invalied!");
//      }     
      
//        else if (age >= 100) {
//        System.out.println("Result: This Age IS Not Possible In This Generation!");
//      }      
      
//      else if (age <= 18) {
//        System.out.println ("Result: Not Eligible.");
//      } else { 
//         System.out.println ("Result: Eligible.");
//      }
      
      
//      return;
//    }
    
    
    
//      public static void main (String[] args) {
//        System.out.println("Check Your Vote Eligibility...");
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Please, Type Here Your Age: ");
//        int age = sc.nextInt();
       
//        voteEligibility(age);
//     }
//  }


// 8: Infinity loop by using do-while condition ->

// import java.util.*;
//   public class Function {
//     public static void main (String[] args) {
//      do-while(condition)...
//      int i = 1;
//      do {
//       System.out.println(i);
//       i++;
//      } while(true);
     
//     }
//   }


// 9: Counter (positive, negitive nad zeros) ->

import java.util.*;
  public class Function {
   public static void counterPNZ () {
    Scanner sc = new Scanner (System.in);
    
    int positivecounter = 0, negativecounter = 0, zerocounter = 0;
    String choice;
    do {
          System.out.print("Enter your number: ");
          int n = sc.nextInt();    
            sc.nextLine();  // Consume the newline character after nextInt()
          
     
         if (n < 0) {
          negativecounter++;
         }
        
     else if (n > 0) {
         positivecounter++;
     } else {
         zerocounter++;
     }
     System.out.println ("If you want to be countinue our counter please type (y/yes): ");  
     choice = sc.nextLine();
     
     
    } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    
    
    
    System.out.println ("Your Result....");
    System.out.println ("The Positive Numbers Quantity: " + positivecounter);
    System.out.println("The Negative Numbers Quantity:  " + negativecounter);
    System.out.println("The Zero Number's Quantity: " + zerocounter);
    sc.close();
    
   }
   
   
    public static void main (String[] args) {
    System.out.println("Read It Carefully.......");
    System.out.println("Here we count about positive, negative and zeros.");
    System.out.println("That's mean: How much you have positive, negative and zero numbers?");
    System.out.println("Instructions:");
    System.out.println("1: If you type 'y' or 'yes'.... That's mean: You want to be countinue our counter. ");      
    System.out.println("2: If you type 'n' or 'no'.... That's mean: You don't want to be countinue our counter. Then our counter will be stop and it will give you your result. ");
    System.out.println("Alright, Let's Go!.....");
  
         
     counterPNZ();     
    }
  }
  

  
