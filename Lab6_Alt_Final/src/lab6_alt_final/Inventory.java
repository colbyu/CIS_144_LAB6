/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_alt_final;
import java.util.Scanner;
//Colby Underhill, Programmer
public class Inventory 
    {
    static int numItems = 0;
    static double avgInvCost = 0;
    static double averageCost = 0;
    static Scanner sc = new Scanner(System.in);
    static DisplayMenu menu = new DisplayMenu();
    static AverageCost average = new AverageCost();
    public static void main(String args[])
        {
        // begin local variable declaration / initialization zone
        char answer = 'Y';
        // end local variable declaration / initialization zone
        menu.getMenu();
        average.getAverageCost();
        while(answer == 'Y' || answer == 'y') 
            {
            // begin code block to display results
            System.out.printf("average cost: $%.2f\n", averageCost);
            System.out.print("At a level of " + numItems + " units, ");
          //  System.out.printf("the inventory tax is : $%.2f\n", computeTax);
            System.out.println("***************************");
            // end code block to display results
            // begin code block to perform additional program run 
            System.out.println("run again(Y or N)?");
            answer = sc.next().charAt(0);
            // end code block to perform additional program run 
            }
        System.out.println("***************************");
        
    }// end main() method
}