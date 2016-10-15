/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_alt_final;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class AverageCost {
    public void getAverageCost()
    {
    int numItems = 0;
    double avgInvCost = 0;
    double average = 0.0, cost = 0.0, totValue = 0.0;
    int number = 0, sumItems = 0, quantity = 0;
    String item = "";
    Scanner sc = new Scanner(System.in);
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
    numItems = sumItems;
    avgInvCost = totValue / sumItems;
    average = totValue / sumItems;
    // end code block for inventory evaluation
    }
}
