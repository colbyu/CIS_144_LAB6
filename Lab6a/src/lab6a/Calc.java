/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6a;

/**
 *
 * @author colby
 */
public class Calc {
    private double avgInvCost = 0;
    private int numItems = 0;
    
    private double average = 0.0, cost = 0.0, totValue = 0.0;
    private int number = 0, sumItems = 0, quantity = 0;
    
    //set up variables to share with main:
    public int getNumItems()
    {
        return numItems;
    }
    
    public void setNumItems(int items)
    {
        numItems = items;
    }
    
    public double getAvgInvCost()
    {
        return avgInvCost;
    }
    
    public void setAvgInvCost(int avgCost)
    {
        avgInvCost = avgCost;
    }
    
     public double getAverage()
    {
        return average;
    }
    
    public void setAverage(double avg)
    {
        average = avg;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cst)
    {
        cost = cst;
    }
    
     public double getTotValue()
    {
        return totValue;
    }
    
    public void setTotValue(double valueTot)
    {
        totValue = valueTot;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int num)
    {
        number = num;
    }
    
    public int getSumItems()
    {
        return sumItems;
    }
    
    public void setSumItems(int itemSum)
    {
        sumItems = itemSum;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quant)
    {
        quantity = quant;
    }
    // below, we use these variables to perform our calculations
    public double computeTax()
    {
        double tax = 0;
       tax = avgInvCost * .06;
        return tax;
    }
    
    //public double computeTax()
    //{
     //   double tax = 0;
      // tax = avgInvCost * .06;
       // return tax;
    //}
}