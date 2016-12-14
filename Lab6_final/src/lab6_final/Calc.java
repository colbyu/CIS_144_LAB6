
package lab6_final;

/**
 *
 * @author colby
 */
public class Calc {
    private double avgInvCost = 0;
    private int numItems = 0;
    
    private double average = 0.0, cost = 0.0, totValue = 0.0, invTax = 0.0;
    private int number = 0, sumItems = 0, quantity = 0, totItems = 0;
    
    private final double tax = .06;
    
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
        totValue += cost * quantity;
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
        sumItems += quantity;
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
    public int getTotItems()
    {
        totItems = number * quantity;
        return totItems;
    }
    
    public void setTotItems(int itemTot)
    {
        totItems = itemTot;
    }
    // below, we use these variables to perform our calculations
    
    public double computeAverage()
    {
    return (number * quantity) / cost;
    }
    
    public double computeInvTax()
    {
       invTax = computeAverage() * tax;
       return invTax;
    }
    

}