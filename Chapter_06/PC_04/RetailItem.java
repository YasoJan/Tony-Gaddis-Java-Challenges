/**************************************************************************************************** 
* Author: Yasin Zahir

* RetailItem class

* 5/11/2026
*****************************************************************************************************/

public class RetailItem{
  private String description;
  private int unitsOnHand;
  private double price;

  public RetailItem(String description, int unitsOnHand, double price){
    this.description = description;
    this.unitsOnHand = unitsOnHand;
    this.price = price;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public void setUnitsOnHand(int unitsOnHand){
    this.unitsOnHand = unitsOnHand;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public String getDescription(){
    return description;
  }
  public int getUnitsOnHand(){
    return unitsOnHand;
  }
  public double getPrice(){
    return price;
  }
}

/*
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, 
and accessor methods that return the values in these fields. 
Once you have written the class, write a separate program that creates three RetailItem objects and stores the following data in them:
*/