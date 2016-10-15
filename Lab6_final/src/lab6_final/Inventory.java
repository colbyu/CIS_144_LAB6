
package lab6_final;
import java.util.Scanner;

public class Inventory 
    {
    static Scanner sc = new Scanner(System.in);
    static Calc calculator = new Calc();
    static DisplayMenu menu = new DisplayMenu();
    public static void main(String args[])
        {
        // begin local variable declaration / initialization zone
        char answer = 'Y';
        int number = 0;
        String item = "";
        // end local variable declaration / initialization zone
        menu.getMenu();
        while(answer == 'Y' || answer == 'y') 
            {
            // begin code block to display results
            System.out.printf("average cost: $%.2f\n", calculator.computeAverage());
            System.out.print("At a level of " + calculator.getTotItems() + " units, ");
            System.out.printf("the inventory tax is : $%.2f\n", calculator.computeInvTax());
            System.out.println("***************************");
            // end code block to display results
            // begin code block to perform additional program run 
            System.out.println("run again(Y or N)?");
            answer = sc.next().charAt(0);
            // end code block to perform additional program run 
            }
        System.out.println("***************************");
        // begin code block for inventory evaluation
        System.out.println("number of item types in the inventory ->");
        calculator.setNumber(sc.nextInt());
        for(int i = 1; i <= number; i++)
            {
            System.out.println("enter the item's description");
            item = sc.next();
            System.out.println("item description: " + item);
            System.out.println("enter item quantity");
            calculator.setQuantity(sc.nextInt());
            calculator.setSumItems(3);
            System.out.println("enter item cost");
            calculator.setCost(sc.nextDouble());
            }
        }
    }