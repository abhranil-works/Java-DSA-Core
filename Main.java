import java.util.Scanner;
  public class Main {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.println("Calculetor Menu: ");
      System.out.println("1: Addition or +");
      System.out.println("2: Subtraction or -");
      System.out.println("3: Multiplication or *");
      System.out.println("4: Division or /");
      System.out.println("5: Modulo & Remainder or %");

      System.out.print("Take Your Choice From These Options: ");
         int Choice = sc.nextInt();

         System.out.println("----------");

      System.out.print("Write Down Your First Number Here: ");
         int num1 = sc.nextInt();

         System.out.println("----------");

      System.out.print("Write Down Your Second Number Here: ");
         int num2 = sc.nextInt();

         System.out.println("========== RESULT ==========");

         switch(Choice) {
          case 1: 
           System.out.println("Result: " + (num1 + num2));
            break;

          case 2: 
           System.out.println("Result: " + (num1 - num2));
            break;
    
          case 3:  
           System.out.println("Result: " + (num1 * num2));
            break;

          case 4: 
           if(num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
           } else {
            System.out.println("Result: Can't Divided By 0");
           }
            break;

          case 5:
           if(num2 != 0) {
            System.out.println("Result: " + (num1 % num2));
           } else {
            System.out.println("Result: 0");
           }
            break;

          default: System.out.println("Result: Your Choice Is Incorret. Try Again!");

         }

         sc.close();

     }
  }
