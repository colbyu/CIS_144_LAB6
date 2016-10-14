/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6a;
import java.util.Scanner;
//Colby Underhill, Programmer
public class Inventory 
    {
    static Scanner sc = new Scanner(System.in);
    static Calc calculator = new Calc();
    public static void main(String args[])
        {
            char answer = 'Y';
            //DisplayMenu();
            while(answer == 'Y' || answer == 'y') 
            {
            int number = 0;
            String item = "";
            // begin code block for inventory evaluation
            System.out.println("number of item types in the inventory ->");
            calculator.setNumber(sc.nextInt());
            System.out.println("items " + calculator.getNumber());

            System.out.println("enter item quantity");
            calculator.setQuantity(sc.nextInt());
            System.out.println("quantity " + calculator.getQuantity());

            System.out.println("sumitems " + calculator.getSumItems());
            
            System.out.println("enter item cost");
            calculator.setCost(sc.nextDouble());
            System.out.println("cost " + calculator.getCost());
            
            System.out.println("totvalue " + calculator.getTotValue());
            }
            // begin code block to display results
            System.out.printf("average cost: $%.2f\n", calculator.computeAverage());
            
            System.out.print("At a level of " + calculator.getTotItems() + " units, ");
            
            System.out.printf("the inventory tax is : $%.2f\n", calculator.computeInvTax());
            System.out.println("***************************");
            // end code block to display results
            // begin code block to perform additional program run 

        }
}