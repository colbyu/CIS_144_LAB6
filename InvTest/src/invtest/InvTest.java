/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invtest;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class InvTest {
static Calc calculator = new Calc();
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       System.out.println("number of item types in the inventory ->");
        calculator.setNumber(sc.nextInt());
        System.out.println("number  " + calculator.getNumber());
        
        System.out.println("enter item quantity");
            calculator.setQuantity(sc.nextInt());
            System.out.println("item quantity" + calculator.getQuantity());
            
            System.out.println("enter item cost");
            calculator.setCost(sc.nextDouble());
            
            System.out.println("total" + calculator.getTotItems());
        System.out.printf("average cost: $%.2f\n", calculator.computeAverage() );
    }
    
}
