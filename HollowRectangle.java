  import java.util.Scanner;

  public class HollowRectangle {


    public static void printPattern(int rowCount, int colCount, String symbol) {

        //Using Nested 'for-loop' for the pattern logic.

        if (rowCount > 0 && colCount > 0) { //Using 'if-else' to protect from negative values', which can instantly terminat the loop.
        //Outer loop.
        for(int i = 1; i <= rowCount; i++) {
            //inner loop.
            for(int j = 1; j <= colCount; j++) {
                if (i == 1 || j == 1 || i == rowCount || j == colCount) {   //Logic of Hollow Rectangle pattern by using 'if-else' statement. It is for edge side printing.
                    System.out.print(symbol + " ");

                } else {

                    System.out.print("  "); //It is for Hollow part printing.
                }
                

            }

            System.out.println(); //Spaces as rows for inner symbol printing.
        }

    } else {

        System.out.println(" Your Inputs (Row and Column) do not match our condition. Please enter values greater than 0.");
    }


    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Print a Hollow Rectangle Pattern.");
        System.out.print("\n Enter The Row Number (Without Decimal): ");
        int rowCount = sc.nextInt();
        System.out.print("\n Enter The Column Number (Without Decimal): ");
        int colCount = sc.nextInt();

        sc.nextLine(); //Using it as a 'Buffer' for cleaning the 'Enter or Return' key (that is a String) to protect the 'symbol input' space.

        System.out.print("\n Enter the symbol (e.g. @, #, *, A,a etc.) you want to show in you pattern: ");
        String symbol = sc.nextLine();

        System.out.println(" Result:____________\n");

        printPattern(rowCount, colCount, symbol);
        

        sc.close(); //Closing the 'Scanner' object to prevent memory leaks.
          
      }
  }