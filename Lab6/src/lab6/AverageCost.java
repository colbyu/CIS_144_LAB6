/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class AverageCost {
   private double average = 0.0, cost = 0.0, totValue = 0.0;
   private int number = 0, sumItems = 0, quantity = 0;
   
   double averageCost()
 {

   String item = "";
   // place method body statements below
    // begin code block for inventory evaluation
    Scanner sc = new Scanner(System.in);
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

