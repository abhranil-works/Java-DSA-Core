// import java.util.Scanner;

// public class Arrays {

//     public static void main (String[] args) {
//       Scanner sc = new Scanner (System.in);

//       int size = sc.nextInt();

//        int [] numbers = new int [size];
//       // int[] marks = {97, 98, 99, 100, 95};



//       // marks[0] = 97; //ENG
//       // marks[1] = 98; // ACCT
//       // marks[2] = 99; //CSTX
//       // marks[3] = 100; //ECON
//       // marks[4] = 95; //ENVS


//       // System.out.println(marks [0]);
//       // System.out.println(marks [1]);
//       // System.out.println(marks [2]);
//       // System.out.println(marks [3]);
//       // System.out.println(marks [4]);

//       for(int i = 0; i < size; i++) {
//         System.out.println(numbers[i]);
//       }

//       sc.close();
//     }
// }


//Qs. Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

  public class Arrays {

      public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Quantity of Array Index : ");
        
        //Here we let the user to choose their own limit of Arrays Indexs.
        int size = sc.nextInt();
        int[] numbers = new int [size];

        System.out.println("\nEnter The value of These Arrays : " );

        //We use this loop (for loop) for countinuous input acceptance from the user, till the indiex's limit.
        for(int i = 0; i < size; i++) {
         int value = sc.nextInt();

          numbers [i] = value; //This logic enter those values step by step and next to next on 'numbers' variable (arrayName).
        }

        System.out.print("\nNow, Select The Array Value which You Want to Find Out of Thats Index Number (Please, select any of these values' in limitation as you entered.) : ");

        int searchValue = sc.nextInt();

        System.out.println("\nSee Your Result: ");
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++) {
          //The logic of finding the Index value of 'X'.
          if (numbers[i] == searchValue) {
            System.out.println("X Found at Index : " + i);
            isFound = true; //if X Found.
            break; //Stop after getting X's Index value.
          } 
        }

        if (! isFound) {
          System.out.println("Sorry, your number is not in this array!");
        }

        sc.close(); //Closing the 'Scanner' object to prevent memory leakage.

      } 
    
  }