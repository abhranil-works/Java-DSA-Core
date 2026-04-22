//Qs. Find the Maximum and Minimum element in an Array or Find Extremes in an Array.


import java.util.Scanner;

  public class MaxMinArray { 
                                   //Using 'arr[]' for getting the all value of index and operands from index value's.
        public static void findMax(int arr[]) {

            int max = Integer.MIN_VALUE; //Initialing with the highest possible minimum value of integer.

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];  
                }
            }

            System.out.println("\nThe Maximum Value = " + max);


        }

        public static void findMin(int arr[]) {

            int min = Integer.MAX_VALUE; //initialing with the highest possible maximum value of integer.

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                
            }

            System.out.println("The Minimum Value = " + min);


        }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Let's Find The Maximum and Minimum Element From Your Given Values'... ");
        System.out.print("\nEnter The Size of Array Index : ");
        int size = sc.nextInt();
        int[] numbers = new int[size]; //Array Logic.

        System.out.println("\nEnter The value of Array Index : ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt(); //Using 'for loop' for receiving values as input size of Array Index.
        }

        System.out.println("Final Result: ");

       
        findMax(numbers);
        findMin(numbers);


        sc.close(); //Closing 'Scanner' object to prevent memory leaks.


    }

  }