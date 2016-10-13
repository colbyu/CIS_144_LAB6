package lab6;
import java.util.Scanner;
 //Colby Underhill, Programmer
 public class Inventory 
 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[])
  {
   // begin local variable declaration / initialization zone
   char answer = 'Y'; 
   
   String item = "";
   // end local variable declaration / initialization zone
   // call a method
   displayMenu();

   
   while(answer == 'Y' || answer == 'y') 
   {

   
   // begin code block to display results
   System.out.printf("average cost: $%.2f\n", average);
   System.out.println("***************************");
   // end code block to display results
   
   // begin code block to perform additional program run 
   System.out.println("run again(Y or N)?");
   answer = sc.next().charAt(0);
   // end code block to perform additional program run 
  }
   System.out.println("***************************");
  }// end main() method 
  
 static void displayMenu()
 {
   // place method body statements below
// begin program menu
   System.out.println("");
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----Inventory Valuation---");
   System.out.println("***(Weighted Average Method)***");
   System.out.println(""); 
   System.out.println("");
   System.out.println("--------- M E N U ---------");
   System.out.println("");
   // end program menu
   
 }// end method

 static double averageCost()
 {
   double average = 0.0, cost = 0.0, totValue = 0.0;
   int number = 0, sumItems = 0, quantity = 0;
   String item = "";
   // place method body statements below
    // begin code block for inventory evaluation
    System.out.println("number of item types in the inventory ->");
    number = sc.nextInt();
   
    for(int i = 1; i <= number; i++)
    {
     System.out.println("enter the item's description");
     item = sc.next();
     System.out.println("item description: " + item);
     System.out.println("enter item quantity");
     quantity = sc.nextInt();
     sumItems += quantity;
     System.out.println("enter item cost");
     cost = sc.nextDouble();
     totValue += cost * quantity;
    }
    // outside the for() loop
    average = totValue / sumItems;
   // end code block for inventory evaluation
   return average;
 }//end method

}// end class


