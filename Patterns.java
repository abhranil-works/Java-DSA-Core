import java.util.Scanner;

  public class Patterns {
     
     
     public static int checkProfit(int income, int expense) {

           if(income > expense) {
               int profit = income - expense;
              
           }

           else if(income < expense) {
               int loss = expense - income;
               System.out.println("Unfortunately, you have incurred a loss of: " + loss);
          
           else {
                    System.out.println("Upps, Your income and expense are equal. No profit, no loss.");
               }

           

     }
     return profit;
}


     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Please enter the value of your today's income: ");
     int income = sc.nextInt();
     System.out.print("\nPlease enter the value of your today's expense cost: ");
     int expense = sc.nextInt();
     System.out.println("\nInstruction: You can find here about your today's profit or loss.");
     System.out.println("\nHere is Your Result: ");
     System.out.println("-------------------------------------------");
     System.out.println("                 RESULT                    ");
     System.out.println("-------------------------------------------");
     
     checkProfit(income, expense);
     int taxCost = 18%
     int Tax = (checkProfit - taxCost);
     System.out.println(Tax); 

     sc.close();

     }

  }



