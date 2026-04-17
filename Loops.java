import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n for your table number: ");
        int n = sc.nextInt();

        System.out.println("\nYour " + n + " Number Table is:");
        System.out.println("----------------------");

        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }

        sc.close();
    }
}




// 1: Using While Loop →
        //      i++ -> i = i + 1;
        //     int i = 0;
        //    while (i <= 10) {
        //   System.out.println(i + ": 1 4 3 8");
        //  i++; // i = i + 1;
        // } 
        
        
// 2: Sum of a number n →
             // System.out.print ("Enter The Value Of n:");
            // int n = sc.nextInt();
            // int sum = 0;
            // for (int i = 1; i <= n; i++) {
            //     sum = sum + i;
            // } 

            // System.out.println("----------");

            // System.out.println("The Sum of " + n + " number is: " + sum);
            // sc.close();