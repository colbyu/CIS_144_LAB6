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
    static int numItems = 0;
    static double avgInvCost = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
        {
        Calc calculator = new Calc();
        calculator.setNumItems(1);
        System.out.println(calculator.getNumItems());
        calculator.setAvgInvCost(2);
        System.out.println(calculator.getAvgInvCost());
        calculator.setAverage(3);
        System.out.println(calculator.getAverage());
        calculator.setCost(4);
        System.out.println(calculator.getCost());
        calculator.setTotValue(5);
        System.out.println(calculator.getTotValue());
        calculator.setNumber(6);
        System.out.println(calculator.getNumber());
        calculator.setSumItems(7);
        System.out.println(calculator.getSumItems());
        calculator.setQuantity(8);
        System.out.println(calculator.getQuantity());
        System.out.println(calculator.computeTax());
}// end class
}

