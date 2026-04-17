// 1: Factorial Print →

// import java.util.Scanner;

//   public class Functions {

//     public static int printFactorial(int number) {
//       if (number < 0) {
//         System.out.println("Invalid input!");

//         return -1;
//       }
      

//       int factorial = 1;
//       for (int i = number; i >= 1; i--) {
//         factorial = factorial * i;

        
//       }
        
      
//       return factorial;
      
//     }



//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Let's find the Factorial of a number!");
//       System.out.print("\nPlease enter a non-negative value/number: ");
//       int number = sc.nextInt();
//       int product = printFactorial(number);
//       if (product != -1) {
//         System.out.println("The Factorial of " + number + " is: " + product);
//       }

    
//       sc.close();
      

//     }

// }


// 2: calculateAverage of 3 Numbers →


// import java.util.Scanner;

//   public class Functions {
  

//     public static double calculateAverage(double a, double b, double c) {
//     double totalsum = a + b + c;
//     double average = totalsum/3;
//     return average;



//   }

//     public static void main(String[] args) {
//     Scanner sc = new Scanner (System.in);
//     System.out.print("Please, Enter The Value of a: ");
//     double a = sc.nextDouble();
//     System.out.print("\nPlease, Enter The Value of b: ");
//     double b = sc.nextDouble();
//     System.out.print("\nPlease, Enter The Value of c: ");
//     double c = sc.nextDouble();

//     double result = calculateAverage(a, b, c);
//     System.out.println("\nSee, Your Average is: " + result);

//     sc.close();



//   }
 
// } 


// 3: Sum of all odd numberes till n →


// import java.util.Scanner;

//   public class Functions {

//     public static int sumOfOddNumbers(int number) {
//       int sum = 0;
//       for(int i = 1; i <= number; i++) {
//         if(i % 2 != 0) {
//           sum = sum + i;
//         }
//       }

//       return sum;

//     }


//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Let's find out your sum of all odd numbers...");
//       System.out.print("\nEnter the value of Number here: ");
//       int number = sc.nextInt();
//       int result = sumOfOddNumbers(number);
//       System.out.println("\nThe Sum of All Odd Numbers is: " + result);

//       sc.close();
      

//     }

//   }



// 4: Find Greater Number from 2 Numbers →

// import java.util.Scanner;

//   public class Functions {

//      public static double findGreater(double a, double b) {
//         if(a > b) {
//           return a;
//         } else {
//           return b;
//         }

//      }




//       public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       System.out.println("Find Your Greater Number Between these 2 Numbers...");
//       System.out.print("\nPlease, Enter Your First Number (a): ");
//       double a = sc.nextDouble();
//       System.out.print("\nPlease, Enter Your Second Number (b): ");
//       double b = sc.nextDouble();
//       double greater = findGreater(a, b);
//       System.out.println("\nThe Greater Number is: " + greater);

//       sc.close();

//       }


//   }



// 5: calculateCircumference →

// import java.util.Scanner;

//   public class Functions {

//     public static double calculateCircumference(double radius) {
//       double circumference = 2 * Math.PI * radius;
//       return circumference;


//     } 


//     public static void main (String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Let's Calculate Circumference by Your Radius Value: ");
//       System.out.print("\nPlease, Enter The Value of Radius: ");
//       double radius = sc.nextDouble();
//       System.out.println("\nHere is Your Result: ");
//       System.out.println("-------------------------------------------");
//       System.out.println("           CIRCUMFERENCE RESULT            ");
//       System.out.println("-------------------------------------------");

//       double circumferencevalue = calculateCircumference(radius);
//       System.out.printf("   --------------> %.2f <--------------\n", circumferencevalue);



//     }
//   }



// Vote Eligibility →

// import java.util.Scanner;

//   public class Functions {
//     public static int checkVoteEligibility(int age) {
//       if (age >= 18) {
//         return age;
//       } else {
//         System.out.println("\nSorry, You are not Eligible for Voting Yet.");
//         return -1;
//       }

//     }

//     public static void main (String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Let's Check Your Vote Eligibility... ");
//       System.out.print("\nPlease enter your age here: ");
//       int age = sc.nextInt();
//       int eligibility = checkVoteEligibility(age);
//       if (eligibility != -1) {
//         System.out.println("\nCongratulations! You are Eligible for Voting.");
//       }

//       sc.close();


//     }

//   }



//6: Infinity loop:

// import java.util.Scanner;

//   public class Functions {
//     public static void main (String[] args) {
//       do {
//         System.out.println("GSL: God App is Running......");



//       } while (true);
//     }
//   }



// 7: Positive counter, Negative counter and Zero counter →

// import java.util.Scanner;


//   public class Functions {
//     public static void counterPNZ() {
//       Scanner sc = new Scanner(System.in);
//       int positivenumbers = 0, negativenumbers = 0, zeronumbers = 0;
//       String choice;
//       do {
//             System.out.print("\nEnter your number: ");
//             int number = sc.nextInt();
//             sc.nextLine();

//             if (number > 0) {
//               positivenumbers++;
//             } else if (number < 0) {
//               negativenumbers++;
//             } else {
//               zeronumbers++;
//             }
//             System.out.print("\nGSL Database: Do you want to add more data? (y/n): ");
//             choice = sc.nextLine();


//       } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));

//       System.out.println ("\nYour Result....");
//       System.out.println ("\nThe Positive Numbers Quantity: " + positivenumbers);
//       System.out.println("\nThe Negative Numbers Quantity:  " + negativenumbers);
//       System.out.println("\nThe Zero Number's Quantity: " + zeronumbers);
      
//       sc.close();
    

//     }


//       public static void main(String[] args) {
//       System.out.println("Read It Carefully.......");
//       System.out.println("\nHere we count about positive, negative and zeros.");
//       System.out.println("\nThat's mean: How much you have positive, negative and zero numbers?");
//       System.out.println("\nInstructions:");
//       System.out.println("\n1: If you type 'y' or 'yes'.... That's mean: You want to be countinue our counter. ");      
//       System.out.println("\n2: If you type 'n' or 'no'.... That's mean: You don't want to be countinue our counter. Then our counter will be stop and it will give you your result. ");
//       System.out.println("\nAlright, Let's Go!.....");
  
         
//        counterPNZ();     

//     }

//   }



// 8: calculatePower →

// import java.util.Scanner;

//   public class Functions {
//     public static long calculatePower(int base, int power) {
//       long value = 1;
//       for(int i = 1; i <= power; i++) {
//         value = value * base;
//       }

//       return value;

//     }

//       public static void main (String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("You Can Calculate Power of Your base Number Here....");
//       System.out.print("\nPlease, Enter The Value of x Number: ");
//       int base = sc.nextInt();
//       System.out.print("\nPlease, Enter The Value of y Number: ");
//       int power = sc.nextInt();

//       long result = calculatePower(base, power);
//       System.out.println("\nHere is Your Result: " + result);


//       sc.close();      

//     }


//   }



// 9: Greatest Common Divisor (GCD) →

// import java.util.Scanner;

//   public class Functions {
//     public static int calculateGCD(int x, int y) {
//       int gcd = 1;
//       for (int i = 1; i <= x && i <= y; i++) {
//         if (x % i == 0 && y % i == 0) {
//           gcd = i;
//         }
//       }
//       return gcd;
//     }



//    public static void main (String [] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Let's Find Out Your Greatest Common Divisor (GCD)....");
//       System.out.print("\nPlease, enter the vallue of x: ");
//       int x = sc.nextInt();
//       System.out.print("\nPlease, enter the value of y: ");
//       int y = sc.nextInt();
//       int result = calculateGCD(x, y);
//       System.out.println("\nHere is Your GCD Result: " + result);

//       sc.close();



//     }

//   }



// 10: Fibonacci Series →

import java.util.Scanner;

  public class Functions { 
    public static void calculateFibonacci(int n) { 
      int a = 0, b = 1;     // Initialize the first two Fibonacci numbers
      int nextTerm;       
      if (n > 1) {      // Check if n is greater than 1 to generate the series
      System.out.print(a + " " + b + " "); 
      for(int i = 2; i < n; i++) { // Loop to generate the remaining terms
        nextTerm = a + b; 
        System.out.print(" " + nextTerm);  
        a = b;  
        b = nextTerm; 
      } 

     } else {
        System.out.println("Please enter a number greater than 1 to generate Fibonacci series."); 
     } 

    } 
      
  


    public static void main (String[] args) { // Main method starts here
      Scanner sc = new Scanner (System.in); // Create a Scanner object for user input
      System.out.print("To get your Fibonacci Series, Please enter the value of n: "); 
      int n = sc.nextInt(); 
      System.out.print("\nHere is Your Fibonacci Series Result: "); 
      calculateFibonacci(n); // Call the method to calculate Fibonacci series

      sc.close();

      
    } 
  } 